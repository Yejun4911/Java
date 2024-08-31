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
* JVM의 Garbarge Collector 가 더이상 사용되지 않는 인스턴스를 찾아 메모리에서 삭제하는 행위를 하게 된다.
* Garbage Collection는 Garbage Collector가 Heap 영역의 메모리를 JVM이 판단해 더이상 사용되지 않는 인스턴스는 자동으로 할당 된 메모리를 삭제하는 역할을 하는 행위이다.

### FQCN
* 클래스가 속한 전체 패키지명을 포함한 이름을 말한다.

### Anonymous inner class 
* new 뒤에 Comparator가 와서 comparator가 객체 생성을 한 것처럼 보인다. 하지만 Comparator은 인터페이스고, 인터페이스는 객체 생성 할 수 없다.
* 익명의 클래스가 Comparator 인터페이스를 구현한 채로 생성되어 객체를 만든 것이다.
* 단 하나의 추상 클래스 또는 단 하나의 인터페이스를 바로 생성할 수 있음
* 인터페이스나 추상 클래스 자료형으로 변수를 선언한 후, 익명 내부 클래스를 생성해 변수에 대입할 수 있음
* 인터페이스와 추상 클래스 내부의 모든 추상 메소드를 반드시 오버라이딩 해야 함
* inner class 
  * 클래스 내부에 작성하는 클래스
  * 내부 클래스는 외부 클래스의 접근 제어자에 상관 없이 멤버변수, 메소드에 접근 가능
  * 외부 클래스에서 내부 클래스에 접근하기 위해서는 내부 클래스 객체를 생성해야 함  

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
* transient 키워드
  * 객체의 Filed 중 노출하면 위험한 정보에 해당 하는 값들을 transient 키워드를 필드 앞에 지정한다. 
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
* 접근 제한자 (public,private,pretected)

#09_Looping
===========
* 반복문 
  * 반복문의 문법은 몇가지가 있다. 각각의 구문은 서로 대체 가능하기 때문에 상황과 취향에 따라서 선택해서 사용하면 된다.
  * 1)for 2)while -> 비교 : 반복의 횟수를 모를 때 while 사용
  * continue : 반복문 지속 break: 반복문 빠져 나간다

#10_Array,11_Array_ClassType,12_Array_MarketOutlet
==========
* 배열
  * 배열이란 자료형의 종류가 아닌 자료형의 집합을 의미한다. 
* 배열의 특징
  * Resizing 불가능, 배열은 객체, Resizing은 안되지만 사이즈가 다른 배열의 데이터를 복사 사용 할수는 있다. System.arrycopy()
* 클래스도 배열로 가능 !

#13_inheritance ~ #16_Polymorphism
===============
* 상속
  * 부모가 가진 모든것을 자식에게 물려주는 것
  * RelationShop
    * IS-A 관계 <Vertical>
    * HAS A 관계 <Horizontal>
    
* Virtual Method Invocation은 상속관계에서 오버라이딩된 동일한 이름의 method가 충돌했을 때 실행타임 시점의 메소드가 컴파일 타임 시점의 메소드보다 우선적으로 실행된다.
  * Ex) Parent의 getName()을 Children이 오버라이딩 한 상태일 경우 Parent p = new Chlidren() 으로 객체를 생성했을 때 p.getName(); 과 같이 메소드를 사용하면 Parent의 메소드를 사용할지   Children의 메소드를 사용할 지 혼돈이 된다. JVM은 컴파일 시점인 Parent의 method를 사용하지 않고 실행타임 시점인 Children의 method를 사용한다. 이것을  Virtual Method Invocation 라고 부른다.
* 클래스 상속을 위해서는 extends 라는 키워드를 사용한다.
* 부모 Class
  * 자식들의 공통적인 성질을 일반적인 성질로 가지고 있는 클래스 Super
* 자식 Class
  * 부모 Class로 부터 모든 것을 물려받고 자기 자신만의 멤버를 추가하는 Class  
* Overriding
  * 상속의 관계에 있는 클래스 간에 하위 클래스가 상위 클래스와 '완전 동일한 메소드'를 덮어쓴다는 의미이다
  * 메소드 선언부는 모두 일치해야 한다.
  * 구현부는 반드시 달라야한다.
* Overrloding
  * 오버로딩은 생성자/메소드 오버로딩이 존재한다.
    * 생성자 오버로딩 : 필수 정보만으로 객체를 생성 할 수 있도록 한것이 생성자 오버로딩
    * 메소드 오버로딩 : 클래스 내에 사용하려는 이름과 같은 이름의 메소드가 있어도 매개 변수의 개수 또는 타입이 다르면, 동일한 이름을 사용해 메소드를 정의 할 수 있는 것
* Polymorphism
  * 부모의 타입으로 여러 개의 자식 객체들을 생성 하는 것 
* Object Casting
  * 부모클래스에 존재하지 않는, 자식에서 만들어진 메소드이기 때문에 부모변수로 접급하면 안되고 자식 클래스 변수앞에 casting해 자식메소드에 접근한다.
* Collection
  * 동종간의 집합체 : 같은 Class의 객체끼리 집합
  * 이종간의 집합체 : 폴리모피즘을 통해 다른 Class의 객체와 함께 집합을 이룬다 <효율성 높음>

#17_Static ~ #20_Abstract
==========
* Static
  * 객체생성과정 없이 메모리에 올라간다.
  * 지역변수로는 선언 불가능
  * Class File Loader 과정에서 메모리에 올라간다.
  * Static한 성질의 필드는 생성된 객체들에서 서로 공유
  * static 블락 안 this 사용 불가
  * static,final 종종 같이 씀
* final
  * final 키워드는 엔티티를 한 번만 할당합니다. 즉, 두 번 이상 할당하려 할 때 컴파일 오류가 발생하여 확인이 가능합니다.
  * 상수지정 기능가능
  * 상속금지 기능가능
  * 오버라이딩 금지 기능 가능
* interface
  * 사용자와 작성자 간의 contract이다
  * 필드 X, Abstract Method로 구성 자식에게 Template 제공
  * implements사용 -> 오버라이딩
  * 구성요소
    * static final, public abstract
  * 다중상속 허용 X 
    * Virtual Method invocation 때문에 문제가 생긴다.
    * 코드의 불안정성 야기
  * Interface(미완의 설계도) -> Abstract Class(부분적인 미완의 설계도) -> Class(설계도) ( >순으로 구체화 )
  * Abstract Class의 용도
    * 추상클래스(Abstract Class)는 인터페이스의 역할도 하면서 뭔가 구현체도 가지고 있는 자바의 돌연변이 같은 클래스이다. 혹자는 추상클래스는 인터페이스로 대체하는것이 좋은 디자인이라고도 얘기한다.    

#21_CollectionAPI~22_CollectionAPI
===================================
* Collection : 여러 원소들을 담을 수 있는 자료구조 
  * Interface Hierarchy 
  * Set -> HashSet : Colection 다음으로 원시적이며 순서를 가지지 않으며 중복이 되지 않는다.
  * List-> ArrayList,Vector,LinkedList : 시작점과 끝점을 가지면서 환원형으로 자료를 저장, 원시적이지 않은 자료형으로 순서가 존재하며 중복이 가능하다. 
    * ArrayList 순차적, 내부적 index, 객체로 이루어져 있으며, 여러개의 값이 merge 되어 있다. 이를 정렬하기 위해서는 어떤 값으로 정렬 할 것인지 정해줘야 하는때 이때 사용하는 것이 Comparable, Comparator
      * Comparable : compareTo 메소드만 존재, 정렬 수행시 기본적으로 적용되는 정렬 기준이 되는 메소드를 정의 하는 인터페이스
      * Comparator : vo파일을 건드리지 않아도 되고 implements 할 필요도 없다. 즉 overdding 필요 없음, 정렬 가능한 클래스들의 기본 정렬 기준과 다르게 정렬 하고 싶을때  
    * LinkedList 비순차적, 데이터 추가, 삭제 용이 
    * Vector, arrayList 차이 : Vector -> Synchronized 처리로 인해 무거워짐 / ArrayList -> Synchronized를 사용자가 하도록 유도
  * Queue : 알고리즘에서 사용
* Map : Collection의 child가 아니며 독자적이며 set,list와 다른 저장 방법을 사용 <Key,value>함께 저장하며 순서가 없고 Key 는 Unique
  * HashTable 과 HashMap 차이
    * HashTable  : Synchronized 처리로 인해 무거워짐
    * HashMap : Synchronized를 사용자가 하도록 유도
* Properties 클래스
  * MAP 계열의 컬렉션 프레임워크와 비슷하게 동작하는 파일, "Key = Value" 형태로 된 "파일이름.properties" 파일 또는 Xml 파일, key를 주면 Value를 반환하는 기능을 가짐, DB의 연결정보 등을 저장해두는 용도로 많이 쓰임
  * Enum(열거형) 클래스나 MAP 컬렉션 API와 비슷한 개념의 파일 버전입니다. 코드를 건들이지 않고도 정보를 변경할 수 있다는 강점이 있습니다.
* Enumeration/ Iterator/ ListIterator 
  * Enumertation 인터페이스는 Collection 프레임워크가 만들어기 전, Iterator의 이전 버전이다. 
  * 가능하면 Enumeration 대신 Iteration를 사용을 권장하고 있다.
  * iterator/Listlterator -> Java초기에 개발된 Enumeration의 확장이 lterator,lteraotr를 상속받고 메소드를 추가한 것이 Listlterator
* Generic
  * 제네릭 타입을 사용함으로써 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있기 때문입니다. 자바 컴파일러는 코드에서 잘못 사용된 타입 때문에 발생하는 문제점을 제거하기 위해 제네릭 코드에 대해 강한 타입 체크를 합니다. 
  * 사용법
    * 제네릭 타입은 타입을 파라미터로 가지는 클래스와 인터페이스를 말합니다. 제네릭 타입은 클래스 또는 인터페이스 이름 뒤에 < > 부호가 붙고 사이에 타입 파라미터가 위치합니다.   

#23_Exception
==============
* Exception
  * Exception은 프로그래밍 과정 중 발생하는 예기치 못한 상황을 의미힌다.
  * 예외는 메소드 블럭안에서 line별로 발생
  * Throwable > Exception, Error
    * Exception : 개발자가 예외상황 컨트롤 가능
    * Error : 개발자의 영역이 아님
  * Exception > RuntimeException, IOException
    * RuntimeException : 컴파일러가 에러를 인식하지 않고 실행시 에러가 발생한다. // ArrayIndexOutofBoundsException,NullPointerException,ArithmeticException,NegativeArraySizeException
    * IOException : 컴파일러가 에러를 인식한다, 입력과 출력, 코드 작성 시 예외가 발생하기 때문에 코드를 작성할 때 예ㅖ외를 발생 시켜야한다. // IOException,FileNotFoundException,EOFException
    * UserException : 직접 예외 Class를 만들어 사용한다, 강력한 제어문으로 이용 (Exception을 상속 받아 사용)
  * Exception Keyword
    * try catch : try블록에는 예외가 발생 할 수 있는 코드가 위치하고, catch블록은 발생한 예외를 잡아 예외처리를 한다, 
    * finally : 예외 발생 여부와 상관없이 무조건 실행 // 실행되지 않는 경우 -> finally block 안에서 또 다른 예외가 발생하는 경우, finally block을 실행 도중 PC 전원이 꺼지는 경우
  * throws
    * 발생할 예외를 던진다. 던져진 예외는 그 메소드를 호출한 곳에 날아가서 터진다. // main도 exception을 throws를 사용할 수 있고 JVM으로 던져진다.
  * throw
    * 고의적으로 예외를 발생 시키는 키워드

#24_Thread
==========

* Process : 실행 중인 프로그램
* Thread : Process 내에서 진행되는 세부적인 작업 단위
* Multi-tasking : time-sliced 방식으로 우선순위를 가지고 동작한다.
  * Multi-processing
  * Multi-threading => 한 프로세스 내에서 자원을 공유하므로 문제가 발생할 수 있다. 
* Thread 종류
  * 데몬 Thread : 작업 Thread를 호출, main : 프로세스 안에는 하나의 데몬 Thread가 존재한다
  * 작업 Thread : Thread extends, Runnable implements 통해 작업 클래스를 생성
* Thread 작성법
  * Thread 상속 받아 사용
  * Runnable interface이므로 다중 상속 가능
  * Thread를 작동 시킬때는 run()이 아닌, start()를 사용 JVM이 그 thread의 run()을 호출한다.
* Thread 작동 순서
  * start() 호출한다. <runnable 상태가 됨>
  * Queue stack(대기열)에 올라간다. 
  * Queue stack에 있는 객체 중 priority가 제일 높은 것부터 cpu에 올라감 < 하나만 가능> -> JVM이 run()을 내부적으로 호출
  * run()가 다 끝난 thread는 메모리에서 자동으로 내려오고 CPU를 반환함(Death)
    * 실행중인 thread의 상태를 조정할 때는 sleep(),yield(),join()을 사용한다.
    * sleep()은 try~catch로 감싸 주어야한다.
    * stop()은 사용하지 않는다. 실행이 끝나면 자동종료되는데 stop을 사용하면 강제 종료된다.
    * start()는 개발자가 호출, run()은 JVM의 scheduler가 내부적으로 호출
* Thread를 사용하면 작업을 병렬적으로 처리할 수있다.
* Thread 간의 자원 공유
  * process의 데이터를 여러 thread에서 서로 공유한다.
* Synchronized
  * 자원을 공유한 상황에서 하나의 Thread가 일을 완전히 마치기 전에 다른 Thread에게 제어권을 뺏겨 버리면 문제가 발생
  * 하나의 Thread가 일을 마치기 전에 다른 Thread로 인해 자원의 값이 변경된다.
  * Sychronized : 공유하는 자원에 Lock, 공유자원에 접근하는 Tread는 Lock을 쥐고 일을 처리하게 되고 그 동안 공유 자원은 잠겨진다 , 나머지는 waiting 상태로 기다린다 , 첫번째 Thread의 run()이 끝나면 자동으로 Lock해제되고 lock은 원래 위치에 반환된다, Waiting 하고 있던 Thread 중 priority가 제일 높은 Thread가 다시 반환 된 lock을 쥐고 일을 수행한다.
  * Method 방식 권장 Method에 synchronized 키워드를 붙여 사용
* Deadlock
  * 동기화 처리된 2개 이상의 Thread에서 정작 자신이 가진 Lock을 반환하지 않으면서 상대 Thread의 Lock이 해제 되기만을 기다리는 교착 상태를 말한다.
  * 원인 : Thread간의 Communication의 부재
  * 해결 : Wait(), notify()
# 25_Steam
==========

* Stream
  * 데이터의 흐름
  * Source : 데이터의 근원, Sink : 데이터의 종착지 , Stream : 데이터가 흘러가는 관
  * FIFO, 단방향 구조, node 계열과 ,filter 계열로 나뉜다.
  * Byte 계열
    * 입력-> InputStream 출력 -> OutputStream
  * Character 계열
    * 입력 -> Reader 출력 -> Writer
  * File 계열
  * Object Stream 계열
    * 객체를 입,출력할 수 있는 Stream(보조 Stream) 
  * 데이터의 흐름 
    * 기본스트림(node) -> Source와 Sink 직접 연결
    * 보조스트림(filter) -> 또 다른 Stream에 연결
    * 보조 Stream 사용 이유: 보조 Stream에 있는 Powerful한 기능 사용이 가능하다. (Stream과 Stream이 wrapping되면 Stream이 겹쳐지는 부분, Buffer 공간이 생긴다. 그 공간에서 데이터를 이 가능하다)
  * Stream 코드 작성 패턴
    * 입력,출력 스트림을 한꺼번에 생성
    * 반복문 안에서 데이터를 전부 다 읽는다
    * 반복문 안에서 읽어 들인 데이터를 Sink 방향으로 전부 다 출력한다.  
  * Class Path , 출력용 파일 
    * class path system : class path system이 src를 자동으로 만든다. 자바파일 src 밑에 넣어지지만, 일반 파일은 자동으로 src 아래 저장되지 않아  파일을 src 하위에 만들어 주었다면 파일을 호출할때 src 경로를 명시해 주어야 한다.
    * 출력용 파일 :  Stream이 생성될 때 명시해 놓은 디렉토리가 존재한다면 해당 파일을 만들고 그곳에 출력을 한다 
  * 문자 기반의 출력용 Stream일 경우 데이터를 file에 뿌릴 때 한 라인씩/ 한 글자씩 뿌리지 않는다. Stream을 통해서 읽어들인 내용을 특정 buffer 공간에 쌓아놓은 후 어느정도 쌓이면 한번에 파일에 뿌린다. 이때 자투리 데이터카 출력이 되지 않는 상황이 발생한다. .close()를 사용하면 남아있는 데이터를 다 뿌리고 Stream을 닫는다. .flush()를 사용해 기다리지 않고 auto flushing 기능을 통해 데이터를 뿌려줄 수 도 있다

# 27~28_Socket
===============
* Client: Server에 서비스를 요청(request)
* Server: Client가 요청한 서비스를 처리, 처리한 결과를 다시 응답(response)
* Server
  * Socket 생성, Client의 socket 리턴, 입력 Stream
* Client
  * Socket 생성 , 출력 Stream 생성 , Stream 패턴
* 하나의 통신 단위 : request&response 까지 --> 클라이언트는 서베에게 request 한 후 response 할 때 까지 blocking 상태로 머물러 있다.    
