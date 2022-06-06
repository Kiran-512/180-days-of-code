#i/bin/sh

echo "Enter the number"

read n

if [ `expr $n%2` -eq 0 ]
then
	echo "Its even  number"
else
	echo "No, Its an odd number"
fi

