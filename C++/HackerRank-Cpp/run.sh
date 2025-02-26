#!/bin/bash

if [ -z "$1" ]; then
    echo "Uso: ./run.sh <caminho_do_arquivo.cpp>"
    exit 1
fi

g++ "$1" -o output
./output
rm output

