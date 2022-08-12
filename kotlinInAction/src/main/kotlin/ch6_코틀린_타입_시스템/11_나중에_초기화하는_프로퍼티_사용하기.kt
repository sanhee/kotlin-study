package ch6_코틀린_타입_시스템

/*
    코틀린에서는 일반적으로 생성자에서 모든 프로퍼티를 초기화 해야한다.
    - 객체 인스턴스를 일단 생성하고, 나중에 초기화하는 프레임워크(Junit @Before..., Spring DI)이 있다.
    - 하지만, 코틀린에서는 null이 될 수 없는 프로퍼티를 생성자안에서 초기화하지 않고, 다른 특별한 메소드에서 초기화할 수 없다.
      - final field이므로 생성과 동시에 초기화가 이뤄져야한다.

    - 이를 해결하기 위해 코틀린은 late-initialized 를 제공한다.
    - 이 변경자를 프로퍼티에 붙이면 객체가 생성되고, 나중에 초기화를 할 수 있다.
    - late-initialized 하기 위해서 프로퍼티는 항상 변경 가능한 var 이어야 한다.
 */

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {
    //@Autowired
    private lateinit var myService: MyService // 초기화하지 않고 null이 될 수 없는 프로퍼티를 선언한다.

    //@Test
    fun testAction(){
        //AssertThat(myService.performAction()).isEqualsTo("foo")
    }
}

