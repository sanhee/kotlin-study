package ch5_람다로_프로그래밍


/*
    아래 clicks는 항상 0을 반환.
    - 이유
      : clicks가 반환된 이후에 비동기 함수 실행이 되므로,
        이 함수를 제대로 구현하려면 클릭 횟수를 세는 카운터 변수를 함수의 내부가 아니라
        클래스의 프로퍼티나 전역 프로퍼티 등의 위치로 빼내서 변수 변화를 살펴볼 수 있게 해야함.
 */
/*
fun tryToCountButtonClicks(button: Button): Int {
    var clicks = 0
    button.onClick { clicks++ }
    return clicks
}
 */