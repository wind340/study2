#정수 13이 홀수인지 짝수인지 판별하는 방법
# a = int(input("숫자를 넣어주세요"))
# if a%2 == 0:
#     print("짝수입니다.")
# else :
#     print("홀수입니다")

#홍길동 주민번호 881120-1073834
#생년월일 추출해보자
# ss = '881120-1073834'
# birth = ss[:6]
# print("생년월일은:",birth)

#커피자판기 만들기 남은 커피가 있으면 판매->
# coffee = 10
# money = 300
# while True:
#     a=int(input("돈을 넣어주세요"))
#     if a == 300:
#         print("커피를 판매합니다")
#         coffee -=1
#     elif a < 300:
#         print("돈이 부족합니다")
#     elif a > 300:
#         print("커피를 판매합니다.")
#         coffee -=1
#         print("잔돈",a-300,"를 반환합니다.")       
#     print("남은 커피양은 {}개입니다".format(coffee))
#     if coffee == 0:
#         print("커피가 소진되어 영업을 종료합니다")
#         break


#   continue를 만나면 다시 계속반복됨
# a=0
# while a<10:
#     a+=1
#     if a%2 ==0: continue
#     print(a)
# 위 예제는 컨티뉴를 활용하여 10보다 작은 홀수를 찍어내게됨


#Quiz 5명의 학생점수에서 60점이 넘으면 합격 아니면 불합격
# score = [90,70,50,40,80]
# n=0
# for num in score:
#     n += 1
#     if num > 60:
#         print(n,'번 학생은 합격')
#     else:
#         print(n,'번 학생은 불합격')

#합격한 학생들만 찍어라.
# score = [90,70,50,40,80]
# n=0
# for i in score:
#     n +=1
#     if i<60: continue
#     print("%d 번 학생은 합격입니다" %n)

#range함수와 for문
#range(시작, 미만)
# add = 0
# for i in range(1,11):
#     add += i
#     print(add)

#for문과 range를 이용해서 구구단 표시하기
# for i in range(2,10):
#     for j in range(1,10):
#         print(i*j,'',end='')
#     print()

#List comprehension(리스트 내포)
#for문을 사용해서 1부터 100까지의 자연수중 짝수의 합을 계산하세요
# sum1=0
# for i in range(1,101):
#     if i%2 ==0:
#         sum1+=i
# print(sum1)

#while을 사용해서 아래 그림을 표시하세요.
# a = 1
# while a<6:
#     print('*'*a)
#     a+=1

#for문으로 학생들의성적합계를 내시오
# sum=0
# score = [70,60,55,75,95,90,80,80,85,100]
# for i in score:
#     sum+=int(i)
# print(sum/len(score))

#함수정의
#입력한 값을 다 합산하여 반환하여라. 단 값이 몇개인지 알수없음
# def add_sum(*args):
#     result = 0
#     for i in args:
#         result = result+i
#     return result
# print(add_sum(1,2,3,4,5))

#숫자를 입력받고 그 숫자가 홀수인지 짝수인지 판별하는 함수를 만들어라.
# def hj(a):
#     if a%2==0:
#         print("짝수")
#     else:
#         print("홀수")
# hj(int(input))

#입력으로 들어오는 모든수의 평균을 계산하는 함수
# def avg(*args):
#     result=0
#     for i in args:
#         result+=i
#     return result/len(args)

# print(avg(1,2,3,4,5,6))

# 입력했을때 매개변수를 선택하여 계산하는 함수
# def number(choice, *args):
#     if choice == "add":
#         sum=0
#         for i in args:
#             sum += i
#         return sum
    
#     elif choice =="mul":
#         result=1
#         for i in args:
#             result *= i
#         return result

#     elif choice =="avg":
#         sum=0
#         for i in args:
#             sum += i
#         return sum/len(args)

# print(number('add',1,2,3,4,5))
# print(number('mul',1,2,3,4,5))
# print(number('avg',1,2,3,4,5))

#두 수를 입력받아 합계를 게산하는 방법
# first_num= int(input("첫번째 숫자: "))
# second_num = int(input("두번째 숫자: "))
# sum_num = first_num+second_num
# print("두 수의 합은 {} 입니다".format(sum_num))

#계산기

# result = 0
# def add(num):
#     global result
#     result += num
#     return result

# print(add(3))
# print(add(4))
# print(add(5))

#10 미만의 자연수 3과5의 배수를 구하면 3,5,6,9이고 이들의 합은 23이다.
# 1000미만의 자연수의 3과 5의 배수의 총합을 구하세요.
# sum=0
# for i in range(1,1000):
#     if i%3 ==0 or i%5==0:     #and를 쓰게되면 i에 3의배수5의배수 중복값이 들어온다.
#         sum+=i
# print(sum)

# #피보나치 수열    이런수열은 함수를 외우는게 이득이다.
# def fibo(n):
#     a, b = 1, 0     #a는1이고 b는 0이고 
#     while a<n:
#         a , b = a+b , a
#         print(a , end=' ')
# fibo(10)

# n의 자리수를 나타내어라.
# n= input("알고싶은 자리수를 입력하세요")
# print(n,'의 자리수는 ',len(n),'입니다')


# def pp(a):
#     s = ''
#     for i in a:
#         s+= i +','
#     s = s[:-1]
#     print(s)

# pp(['홍길동','이몽룡','성춘향'])
# 위 예제를 조인을 이용하여 코드를 줄여라
# def pp(a):
#     print(', '.join(a))

# print(pp(['홍길동','이몽룡','성춘향']))

# a = input("입력하세요")

# if a.isalpha():
#     print("알파벳으로만 구성되있습니다.")
# if a.istitle():
#     print("첫글자가 대문자 입니다")
# if a.isupper():
#     print("대문자로만 구성되있습니다")
# if a.islower():
#     print("소문자로만 구성되있습니다")


#복습퀴즈. a와b를 더한 값을 출력하는 add(a,b)만드시오
# def add(a,b):
#     print(a+b)

# bts = ['RM','슈가','지민','진','정국','뷔','제이홉']
# for i in range(len(bts)):
#     name = bts[i]
#     print('{}번: {}'.format(i+1,name))

# from collections import namedtuple
# bts = ['RM','슈가','지민','진','정국','뷔','제이홉']
# for i,name in enumerate(bts):
#     print('{}번: {}'.format(i+1,name))


# ages = {'Tod':35, 'Jane':23, 'Paul':62}
# for i in ages:
#     print('{}의 나이는 {}입니다'.format(i,ages[i]))
# for i,j in ages.items():
#     print('{}의 나이는 {}입니다'.format(i,j))
# for a in ages.items():
#     print('{}의 나이는 {}입니다'.format(*a))
    
    
# test= {
#     "이름": "테스트",
#     "나이": 25,
#     "성별": "여",
#     "주소": "서울특별시 양천구 목동",
#     "특기": ["농구", "도술"],
#     "가족관계": {"#": 2, "아버지": "홍판서", "어머니": "춘섬"},
#     "회사": "경기 수원시 팔달구 우만동"
#  }
# for i,j in test.items():
# 	print(i,j)


# # 함수의 반환값으로 튜플
# list =[1,2,3,4,5]
# for i,v in enumerate(list):
#     print('{}번째값 :{}'.format(i,v))
# list =[1,2,3,4,5]
# for a in enumerate(list):
#     print('{}번째값 :{}'.format(*a))

#어떤 학교에 1반과 2반이 있다 classrooms라는 리스트를 만드렁 
#그중 190이상인 학생이 있으면 그반의 이름을 출력하고 프로그램종료

# classrooms ={'1반':[162,175,198,137,146,199],'2반':[165,177,175,160,191]}
# for cl,hieght in classrooms.items():
#     for hieghts in hieght:
#         if hieghts >= 190:
#             print('{}에 190이 넘는 학생이 있습니다'.format(cl))
#             break

#조건 제시법으로 1부터 100사이에 있는 8의 배수를 원소로 갖는 리스트
# print([i for i in range(1,101) if i%8==0])

#딕셔너리의 조건 제시법
#students = ['임진영','김정철','강은미','정준식','김성현']
#for num , name in enumerate(students):
#    print("{}번의 이름은 {}입니다".format(num+1, name))
#위의 내용을 딕셔너리로 만든다
# student_dict = {str(num+1)+'번': name    for num , name in enumerate(students)}
# print(student_dict)

#zip함수!
#score_dic = {student:score for i,j in zip(students,scores)}
#socre_dic 딕셔너리에 student: score로 된 튜플값이 들어간다.

import datetime
now = datetime.datetime.now()  #마이크로 초까지 찍어낸다.
# # ndatetime = datetime.datetime(2021,9,9,2,45,56,97325) #시간 지정을 해줄수도 있다.
# # print(nowtime-ndatetime)    #날짜계산도 가능하다
# # print(nowtime.year)

# if 0< nowtime.hour <12:
#     print("현재시각은 {}시로 오전입니다.".format(nowtime.hour))
# else:
#     print("현재시각은 {}시로 오후입니다.".format(nowtime.hour))


#봄 3-5 여름 6-8 가을 9-11 겨울12-2 출력하라
# a = now.month
# if 2< a <6:
#     print('봄입니다')
# elif 5< a <9:
#     print('여름입니다')
# elif 8< a <12:
#     print('가을입니다')
# elif a ==12 or a<=2:
#     print('겨울입니다')


# 어떤 숫자를 입력 받아서 홀수와 짝수를 판단하라, 단 % // / 사용금지
# a=input('정수를 입력하세요')
# if int(a[-1]) in "02468":
#     print('짝수')
# else:
#     print('홀수')

# #사용자에게 출생년도를 입력받아 띠를 출력하라
#person = int (input("출생년도를 입력하세요"))
# if person%12 == 0:
#     print('원숭이띠입니다.')
# elif person%12 == 1:
#     print('닭띠입니다.')
# elif person%12 == 2:
#     print('개띠입니다.')
# elif person%12 == 3:
#     print('돼지띠입니다.')
# elif person%12 == 4:
#     print('쥐띠입니다.')
# elif person%12 == 5:
#     print('소띠입니다.')
# elif person%12 == 6:
#     print('범띠입니다.')
# elif person%12 == 7:
#     print('토끼띠입니다.')
# elif person%12 == 8:
#     print('용띠입니다.')
# elif person%12 == 9:
#     print('뱀띠입니다.')
# elif person%12 == 10:
#     print('말띠입니다.')
# elif person%12 == 11:
#     print('양띠입니다.')
#★★★★아래의 방법으로 더 쉽고 간결하게 해결가능 ★★★★★★
#list= ['원숭이','닭','개','돼지','쥐','소','범','토끼','용','뱀','말']
#print(list[person%12])
#리스트에 있는 항목의 글자수 세기
#for i in list:
#    print(i,len(i)

#for문과 while문을 쓰지 않고 입력받은 수의 합을 구하시오
# def sum(n):
#     return n*(n+1)//2
# print(sum(10))
#람다로 표현한다면
# add = lambda n : n*(n+1)/2
# print(add(10))
