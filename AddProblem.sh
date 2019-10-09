mkdir "$1"

touch "$1"/"$1.txt"
touch "$1"/"solution.txt"

mkdir "$1"/java
mkdir "$1"/python

touch "$1"/java/"$1.java"
touch "$1"/java/"$1Test.java"
touch "$1"/python/"$1.py"

echo -e "public class $1 {\n}" >> "$1"/java/"$1.java"
echo -e "public class $1Test {\n\tpublic static void main(String[] args) {\n\n\t}\n}" >> "$1"/java/"$1Test.java"

echo -e "def $1:\n\t" >> "$1"/python/"$1.py"
