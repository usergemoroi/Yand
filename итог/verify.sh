#!/bin/bash

echo "========================================="
echo "SignatureKiller v2.0 - File Verification"
echo "========================================="
echo ""

SUCCESS=0
WARNINGS=0
ERRORS=0

# Colors
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
RED='\033[0;31m'
NC='\033[0m' # No Color

check_file() {
    local file=$1
    local expected_size=$2
    local expected_type=$3
    
    echo -n "Checking $file... "
    
    if [ ! -f "$file" ]; then
        echo -e "${RED}✗ NOT FOUND${NC}"
        ((ERRORS++))
        return 1
    fi
    
    local actual_size=$(stat -f%z "$file" 2>/dev/null || stat -c%s "$file" 2>/dev/null)
    local actual_type=$(file -b "$file")
    
    if [[ "$actual_type" != *"$expected_type"* ]]; then
        echo -e "${RED}✗ WRONG TYPE${NC}"
        echo "  Expected: $expected_type"
        echo "  Got: $actual_type"
        ((ERRORS++))
        return 1
    fi
    
    if [ "$expected_size" != "any" ]; then
        local min_size=$((expected_size * 9 / 10))  # 90% of expected
        local max_size=$((expected_size * 11 / 10))  # 110% of expected
        
        if [ $actual_size -lt $min_size ] || [ $actual_size -gt $max_size ]; then
            echo -e "${YELLOW}⚠ SIZE WARNING${NC}"
            echo "  Expected: ~$expected_size bytes"
            echo "  Got: $actual_size bytes"
            ((WARNINGS++))
        else
            echo -e "${GREEN}✓ OK${NC} ($actual_size bytes)"
            ((SUCCESS++))
        fi
    else
        echo -e "${GREEN}✓ OK${NC} ($actual_size bytes)"
        ((SUCCESS++))
    fi
}

echo "=== Binary Files ==="
echo ""

check_file "libSignatureKiller.so" 21504 "ELF 64-bit"
check_file "classes8.dex" 9437184 "Dalvik dex"
check_file "classes9.dex" 2097152 "Dalvik dex"

echo ""
echo "=== Documentation Files ==="
echo ""

check_file "README.md" "any" "text"
check_file "INSTALLATION.md" "any" "text"
check_file "TECHNICAL_SPECS.md" "any" "text"
check_file "CHANGELOG.md" "any" "text"
check_file "verify.sh" "any" "script"

echo ""
echo "=== Detailed Analysis ==="
echo ""

if [ -f "libSignatureKiller.so" ]; then
    echo "📦 libSignatureKiller.so:"
    file libSignatureKiller.so
    ls -lh libSignatureKiller.so
    if command -v readelf &> /dev/null; then
        echo "  Architecture: $(readelf -h libSignatureKiller.so 2>/dev/null | grep Machine | awk '{print $2}')"
    fi
    echo ""
fi

if [ -f "classes8.dex" ]; then
    echo "📦 classes8.dex:"
    file classes8.dex
    ls -lh classes8.dex
    echo "  Size: $(du -h classes8.dex | cut -f1)"
    echo ""
fi

if [ -f "classes9.dex" ]; then
    echo "📦 classes9.dex:"
    file classes9.dex
    ls -lh classes9.dex
    echo "  Size: $(du -h classes9.dex | cut -f1)"
    echo ""
fi

echo "========================================="
echo "Verification Summary"
echo "========================================="
echo ""
echo -e "${GREEN}Success: $SUCCESS${NC}"
echo -e "${YELLOW}Warnings: $WARNINGS${NC}"
echo -e "${RED}Errors: $ERRORS${NC}"
echo ""

if [ $ERRORS -eq 0 ]; then
    echo -e "${GREEN}✓ All files verified successfully!${NC}"
    echo ""
    echo "Ready for deployment! 🚀"
    echo ""
    echo "Next steps:"
    echo "  1. Read README.md for usage instructions"
    echo "  2. Check INSTALLATION.md for installation guide"
    echo "  3. Review TECHNICAL_SPECS.md for details"
    exit 0
else
    echo -e "${RED}✗ Verification failed with $ERRORS errors${NC}"
    echo ""
    echo "Please rebuild the project or check file integrity."
    exit 1
fi
