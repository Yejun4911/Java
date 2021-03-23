Java
====

java version "1.8.0_241"   
java(TM) SE Runtime Environment (build 1.8.0_241-b07)   
java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)

# Camel Case 
- 단어가 합쳐진 부분마다 맨 처음 글자를 대문자로 표기하는 방법


#00 (jre,jdk,jvm)
=================

* range jdk > jre > jvm
- - - 
* jvm(Java Virutal Machine)
  * 자바 가상머신의 줄임말로 자바프로그램 등을 컴파일하여 만들어진 바이트코드를 실행해주는 가상 머신이다.
  * 자바 애플리케이션을 클래스 로더를 통해 읽어 들여 자바 API와 함께 실행하는 것이다.
  * JVM은 JAVA와 OS사이에서 중개자 역할을 수행하여 JAVA가 OS에 구애받지 않고 재사용을 가능하게 해준다.
  * 메모리관리, Garbage collection 

* jre(Java Runtime Environment)
  * JRE는 JVM 이 자바 프로그램을 동작시킬 때 필요한 라이브러리 파일들과 기타 파일들을 가지고 있다

* jdk(Java Development Kit
  * JDK는 JRE + 개발을 위해 필요한 도구(javac, java등)들을 포함한다.
