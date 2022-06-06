#! /bin/bash

echo "pid is $$"
while (( count < 10 ))
do
    sleep 3
    ((count++))
    echo $count

done
exit 0


# hello(){
#     echo "Hello"
# }
# readonly -f hello
# readonly -f 

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# hello ()
# {
#     echo "Hello"
# }
# declare -fr hello

# var=30
# readonly var
# var=50
# echo $var 


# function print(){
#     echo enter your city
#     read city
#     name=$1
#     echo "the name is $name and city is $city"

# }

# name=kiran
# echo the name is $name 

# print max

# echo "foo"

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# the name is kiran
# enter your city
# kalamboli
# the name is max and city is kalamboli
# foo
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$


# function print(){

#     name=$1
#     echo "the name is $name"
# }

# print max

# echo "foo"

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# the name is max
# foo

# function print(){

#     echo $1 $2 $3
# }

# quit(){
#     exit
# }

# print kiran akshay pranit 

# echo "quit function will exit the code"

# quit 

# function Hello(){

#     echo "Hello"
# }

# quit(){
#     exit
# }

# Hello

# echo "quit function will exit the code"

# quit 

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Hello
# quit function will exit the code

# for ((i = 1; i <= 10; i++)); 
#do
#     if [ $i -eq 3 -o $i -eq 6 ]; 
#     then
#         continue
#     fi
#     echo "$i"
# done

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# 1
# 2
# 4
# 5
# 7
# 8
# 9
# 10

# select name in mark tom john ben
# do
#     case $name in
#     mark )
#         echo $name is selected;;
#     tom )
#         echo $name is selected;;
#     john )
#         echo $name is selected;;
#     ben )
#         echo $name is selected;;
#     *)
#         echo Please provide the no between 1 to 4;;
#     esac
# done

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# 1) mark
# 2) tom
# 3) john
# 4) ben
# #? mark
# Please provide the no between 1 to 4
# #? 1
# mark is selected
# #?

# for item in *
# do
#     if [ -d $item ]
#     then
#         echo "$item is direcotry"
#     else
#         echo "$item is file"
#     fi

# done

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# basics.sh is file
# dir is direcotry
# file is file
# hello.sh is file
# test is file
# test.sh is file

# for command in ls pwd date cal
# do
#     echo "----------------$command----------------"
#     $command
# done

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# ----------------ls----------------
# basics.sh  dir  file  hello.sh  test  test.sh
# ----------------pwd----------------
# /mnt/c/cdac/shell/PL
# ----------------date----------------
# Mon Mar 21 16:00:54 IST 2022
# ----------------cal----------------
#      March 2022
# Su Mo Tu We Th Fr Sa
#        1  2  3  4  5
#  6  7  8  9 10 11 12
# 13 14 15 16 17 18 19
# 20 21 22 23 24 25 26
# 27 28 29 30 31

# echo $BASH_VERSION

# for i in {1..10..2} #start..end..increment
# do
#     echo $i
# done

# for i in {1..10}
# do
#     echo $i
# done

# for i in 1 2 3 4 5
# do
#     echo $i
# done

# while IFS=' ' read -r line
# do
#     echo $line
# done < hello.sh

# cat hello.sh | while read p
# do
#     echo $p
# done

# while read p
# do
#     echo $p
# done < hello.sh

# n=1
# while (( $n < 11 ))
# do
#     echo  -e " $n  \c "
#     ((n++))
#     # sleep 1
#     # gnome-terminal &
# done

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
#  1   2   3   4   5   6   7   8   9   10  kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$

# os=('Ubantu' 'Windows' 'Kali')

# os[3]='mac'
# unset os[2]
# echo ${os[@]}
# echo ${os[1]}
# echo ${!os[@]}
# echo ${#os[@]}
# echo $@

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh command line arguiments in array for with index for first word starting from 1
# Ubantu Windows Kali mac
# Windows
# 0 1 2 3
# 4
# command line arguiments in array for with index for first word starting from 1
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$

# echo -e "Enter some character : \c"
# read value

# case $value in
#     [a-z] )
#         echo "Enter value is in small case";;
#     [A-Z] )
#         echo "Enter value is in Upper case";;
#     [0-9] )
#         echo "Enter value is in the ange of 0-9";;
#     ?)
#         echo "Enter value is special character";;
#     *)
#         echo "Unknown letter";;
# esac

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh van
# Enter some character : A
# Enter value is in small case
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh van
# Enter some character : 5
# Enter value is in the ange of 0-9
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh van
# Enter some character : $
# Enter value is special character
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh van
# Enter some character : a
# Enter value is in small case
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$

# veh=$1

# case $veh in
# "car" )
#     echo "Rent of the $veh is 100 dollar";;
# "van" )
#     echo "Rent of the $veh is 80 dollar";;
# "bicycle" )
#     echo "Rent of the $veh is 10 dollar";;
# "truck" )
#     echo "Rent of the $veh is 150 dollar";;
# * )
# echo "Please enter car, van, byclce or truck to know its rent cost";;

# esac

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Please enter car, van, byclce or truck to know its rent cost
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh van
# Rent of the van is 80 dollar
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$

# a=10.4
# b=5

# echo "$a + $b" | bc
# echo "$a - $b" | bc
# echo "$a * $b" | bc
# echo "scale=5; $a / $b" | bc
# echo "$a % $b" | bc

# echo "scale=5; sqrt($a)" | bc -l
# echo "scale=5; $b^2" | bc -l

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# 15.4
# 5.4
# 52.0
# 2.08000
# .4
# 3.22490
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$

# echo (  $a + $b ) | bc
# echo (  $a - $b ) | bc
# echo ( $a / $b )  | bc
# echo (  $a * $b ) | bc
# echo (  $a % $b ) | bc

# echo $(( a + b )) | bc
# echo $(( a - b )) | bc
# echo $(( a / b )) | bc
# echo $(( a * b )) | bc
# echo $(( a % b )) | bc

# expr: non-integer argument

# expr: non-integer argument

# expr: non-integer argument

# expr: syntax error

# expr: non-integer argument

# ./basics.sh: line 14: 10.4: syntax error: invalid arithmetic operator (error token is ".4")
# ./basics.sh: line 15: 10.4: syntax error: invalid arithmetic operator (error token is ".4")
# ./basics.sh: line 16: 10.4: syntax error: invalid arithmetic operator (error token is ".4")
# ./basics.sh: line 17: 10.4: syntax error: invalid arithmetic operator (error token is ".4")
# ./basics.sh: line 18: 10.4: syntax error: invalid arithmetic operator (error token is ".4")

# a=10
# b=5
# echo $( expr  $a + $b )
# echo $( expr  $a - $b )
# echo $( expr $a / $b )
# echo $( expr  $a * $b )
# echo $( expr  $a % $b )

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# 15
# 5
# 2
# expr: syntax error

# 0

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# 15
# 5
# 2
# 50
# 0

# echo "Enter your age"
# read age

# if [ $age -gt 18 ] || [] $age -gt 30 ]
# then
#     echo "Valid age"
# else
#     echo "Invalid"
# fi

# echo "Enter your age"
# read age

# if [[ $age -gt 18 || $age -gt 30 ]]
# then
#     echo "Valid age"
# else
#     echo "Invalid"
# fi

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter your age
# 35
# Valid age
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter your age
# 17
# Invalid
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$

# echo "Enter your age"
# read age

# if [[ $age -gt 18 && $age -lt 30 ]]
# then
#     echo "Valid age"
# else
#     echo "Invalid"
# fi

# echo "Enter your age"
# read age

# if [ $age -gt 18 ] && [ $age -lt 30 ]
# then
#     echo "Valid age"
# else
#     echo "Invalid"
# fi

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter your age
# 35
# Invalid
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter your age
# 20
# Valid age

# echo -e "Enter the file name : \c"
# read file
# if [ -f $file ]
# then
#     if [ -w $file ]
#     then
#         echo "Write your code and press Ctrl + D to exit"
#         cat >> $file
#     else
#         echo "File do not have write permission"
#     fi
# else
#     echo "$file f ile not exist"
# fi

# echo -e "Enter the file name : \c"
# read file
# if [ -r $file ]
# then
#     echo "read perission"
# else
#     echo "no read permission"
# fi

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter the file name : test
# read perission

# echo -e "Enter the file name : \c"
# read file
# if [ -s $file ]
# then
#     echo "not empty"
# else
#     echo "file is empty"
# fi

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter the file name : test
# file is empty

# echo -e "Enter the file name : \c"
# read file
# if [ -d $file ]
# then
#     echo "dir found"
# else
#     echo "Not found"
# fi

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter the file name : dir
# dir found

# echo -e "Enter the file name : \c"
# read file
# if [ -f $file ]
# then
#     echo "file found"
# else
#     echo "Not found"
# fi

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter the file name : file
# file found

# echo -e "Enter the file name : \c"
# read file
# if [ -e $file ]
# then
#     echo "file found"
# else
#     echo "Not found"
# fi

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter the file name : file
# file found

# count=10
# if [ $count -eq 4 ]
# then
#     echo "Its ture condition"
# else
#     echo "Its false"
# fi

# args=("$@")

# echo $#
# echo $@

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh arg1 arg2 arg3
# 3
# arg1 arg2 arg3

# args=("$@")

# echo ${args[0]} ${args[2]} ${args[3]}

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh arg1 arg2 arg3
# arg1 arg3

# echo $0 $1 $2 $3

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh arg1 arg2 arg3
# ./basics.sh arg1 arg2 arg3

# echo Enter your name
# read
# echo Your name is $REPLY

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter your name
# kIRAN yADAV
# Your name is kIRAN yADAV

# echo Enter the names
# read -a names
# echo Array_elements ${names[0]} ${names[2]}

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# Enter the names
# Reading is good habit
# Array_elements Reading good

# echo enter names
# read name1 name2 name3
# echo Names: $name1 $name2 $name3
# read name
# echo Names: $name
# echo $name3

#kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
#enter names
#KIRAN AKSHAY PRANIT
#Names: KIRAN AKSHAY PRANIT
#KIRAN AKSHAY PRANIT
#Names: KIRAN AKSHAY PRANIT
#PRANIT

# read -p 'username :' username
# echo $username
# read -sp 'Password : ' Password
# echo $Password

# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$ ./basics.sh
# username :kiran
# kiran
# Password : welcome
# kiran_512@LAPTOP-TG43J350:/mnt/c/cdac/shell/PL$
