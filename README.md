# Java

### version
* java version "1.8.0_241"   
* java(TM) SE Runtime Environment (build 1.8.0_241-b07)   
* java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)

### Camel Case 
- 단어가 합쳐진 부분마다 맨 처음 글자를 대문자로 표기하는 방법

### 참고
- 클래스 이름은 무조건 대문자로 

### JAVA SE (Standard Edition)
* 주로 Local Machine에서 돌아간다
* 보편적으로 쓰이는 자바 API집합체(패키지)이다.
* 기초적인 타입부터 네트워킹,보안,데이터베이스 처리, 그래픽 사용자 인터페이스 개발과 XML파싱에 이르는 고수준의 클래스들을 모두 다룰 수 있다.
* Eclipse IDE for java Developers

### Java EE (Enterprise Edition)
* Java SE 플랫폼을 기반으로 그 위에 탑재된다.
* 서버 측 개발을 위한 플랫폼
* 대규모, 다계층, 확장성, 신뢰성, 보안 네트워킹 어플리케이션의 개발과 실행을 위한 API 및 환경 을 제공하고 있다.
* Eclipse IDE for Enterprise Java Developers

### 객체 지향 프로그래밍
* 객체를 정의하고 객체 간 협력을 프로그래밍 하는 것을 말한다.

### 절차 지향 프로그래밍
* 순서대로 일어나는 일을 시간 순으로 프로그래밍 하는 것을 말한다.

### JVM에서 객체가 실행되는 순서
* JVM에서 main method 탐색 -> 객체 접촉 -> 현재 디렉토리에서 해당 객체의 클래스 탐색 -> 다른 디렉토리에 있으면 import -> 해당 디렉토리의 클래스를 찾아 해석한다. -> 그 후 클래스의 구성요소들을 메모리에 올린다 -> 구성요소에 접근하여 필드에 값을 할당하거나 메소드를 호출 -> 종료

### 객체 생성 원리
* Stack에 특정 객체 공간 생성 <값의 여부 파악 X>
* Heap 객체의 구성요소가 생성 <묵시적 초기화 : field에 default가 저장> 주소 할당
* Stack 특정객체 공간에 주소 값 저장
* Stack -> Heap 주소 참조 

### 생성자와 메소드와의 차이
* 생성자는 클래스 명과 동일하게 정의해야 한다.
* 생성자 앞에는 접근자만 올 수 있다.
* 반환값이 없으므로 void나 자료형 작성 X

### Garbage Collector

# 00 (jre,jdk,jvm)

* range jdk > jre > jvm
* jvm(Java Virutal Machine)
  * 자바 가상머신의 줄임말로 자바프로그램 등을 컴파일하여 만들어진 바이트코드를 실행해주는 가상 머신이다.
  * 자바 애플리케이션을 클래스 로더를 통해 읽어 들여 자바 API와 함께 실행하는 것이다. (jvm의 설정을 구성한 다음 설정 사항에 따라 실행 중에 프로그램 소스를 관리한다.)
  * JVM은 JAVA와 OS사이에서 중개자 역할을 수행하여 JAVA가 OS에 구애받지 않고 재사용을 가능하게 해준다.
  * 메모리관리, Garbage collection 
  * .class 파일을 os에 맞는 machine code로 변환(인터프리터 & JIT 컴파일러)

* jre(Java Runtime Environment)
  * JRE는 JVM 이 자바 프로그램을 동작시킬 때 필요한 라이브러리 파일들과 기타 파일들을 가지고 있다. (JVM+라이브러리)

* jdk(Java Development Kit
  * JDK는 JRE + 개발을 위해 필요한 도구(javac, java등)들을 포함한다.
  * Java 기반 Application 개발을 위해 다운로드 하는 소프트웨어 패키지이다.
  * JDK는 컴파일러와 클래스 라이브러리를 포함하는, 자바 플랫폼 사양서의 구현이다
  * JDK를 설치하면 실행파일의 압축인 JRE가 설치되고 그안에 가상환경인 JVM이 존재한다.
  * 컴파일 단계 
    * 1) A.java(원시 소스 코드) -> compile.exe(syntax확인) -> A.class(실행파일<바이트코드>) 실행단계 
    * 2) Class file loader -> byte code generator->interpreter -> 실행
* .java -> (javac) -> .class -> (jvm) -> process

* Byte코드와 Binary 코드의 차이  
  * Byte 코드는 jvm 같은 가상 머신이 이해 할 수 있는 코드
  * Binary 코드는 CPU가 이해 할 수 있는 코드

#01_JavaHello
=============

* HelloWorld만 출력하는 코드는 다른 말을 출력시 코드를 수정해야 하므로 유지보수성, 재사용성이 낮은 코드이다.

#02_GreetOOP
============

* 필드
  * 필드는 객체가 가지는 속성을 나타내는 말이다(객체의 정보 > 상태)
* 메소드
  * 객체가 동작하는 기능
 
#03_DataType
===============
* 변수
  * 객체의 속성, 값이 저장되는 공간, DataType+변수명  
  * 변수 선언의 위치에 따라 전역변수와 지역변수로 나뉘어 불린다.
    * 전역변수 : 말그대로 전체에서 어디서든 호출하면 사용할수 있는 변수는 전역변수
    * 지역변수 : 특정한 구역({ })안에 생성되어 그 지역에만 사용할수 있는 변수는 지역변수라고 생각하면 된다.   
    * 필드와 로컬변수의 이름이 같을때, 구분하기 위해서 this를 사용한다.
* 함수
  * 객체의 기능, 메소드 정의 (선언부, 구현부), 함수명은 자세하게
* 클래스
  * 객체의 속성과 기능을 코드로 구현한것, main 메소드를 포함하는 클래스는 Test Class
* 패키지
  * 서로 비슷한 기능을 가지는 클래스끼리 묶어놓는 역활 , 소스코드 맨 처음 선언, 모두 소문자, 패키지에는 컴파일된 .class파일이 들어있다.    
#04_JavaDoc
==============
* JavaDoc
  * 자바코드에서 API 문서를 -> HTML 형식으로 생성
  * javadoc tags 참조
   
* // 싱글 주석
* /* 멀티 주석
* /** 사용자(?) 주석

#05_Constructor
==================

* 생성자
  * 객체가 생성될때마다 구동(호출)되는 것.
* 기본 생성자
  * 인자값 없고
  * {}안에서 아무런 동작도 하지 않는 생성자. 
* has a 관계(포함관계)
  * 어떤 클래스 A가 또 다른 클래스인 B가 가진 기능을 사용하고 싶을때 B 클래스를 포함하면 B 클래스의 기능을 사용할 수 있다.    
    
#06_Operator
===============
* Scanner
  * 실행시 키보드로 입력된 값을 받도록 해주는 기능을 가지고 있는 클래스
  * nextInt() 공백을 기준으로 데이타를 반환한다.
  * nextLine() 한 라인을 기준으로 데이타를 반환한다.
  * next() 고백을 기준으로 데이타를 반환한다.
* 증감연산자
  * 증감 연산자는 변수 앞에 사용할 수도 있고 뒤에 사용할 수도 있습니다. 여기서 증감 연산자만 단독으로 사용했을 때는 큰 차이가 없지만, 연산자를 사용한 뒤 다른 변수에 할당할 때는 위치에 따라 큰   차이가 있습니다.

#07_Condition
=============
* 제어문
  * 1) if / if~else /else : 조건을 만족할때만 문장을 수행하도록 제어하는 문장.
  * 2) switch : 해당하는 Case의 문장을 실행하도록 제어한다.
* /참고/ 객체 생성 --> 메모리에 올라간다. --> 사용가능 but static한 성질을 이용하면 객체를 생성하지 않고 사용가능
 
#08_Encapsulationyd
=============
* 캡슐화
  * 캡슐화(영어: encapsulation)는 객체 지향 프로그래밍에서 다음 2가지 측면이 있다: 객체의 속성(data fields)과 행위(메서드, methods)를 하나로 묶고, 실제 구현 내용 일부를 외부에 감추어 은닉한다. 
  * 다른 클래스에서 직접적으로 접근 할 수 없도록 필드 앞에 private 지정한다.
  * 클래스의 필드에 접근은 setter()/getter() 한다. // setter,getter 다른 클래스에서도 서로 접근할 수 있도록 Public
   
