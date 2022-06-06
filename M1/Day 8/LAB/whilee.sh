#i/bin/sh

a=11
while [ $a -gt 10 ]
do
	echo $a
	a= `expr $a - 1`
done

