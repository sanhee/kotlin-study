package ch3_함수_정의와_호출

class User(val id: Int, val name: String, val address: String)

/*
    사용자의 필드를 검증할 때, 필요한 여러 경우를 하나씩 처리하는 검증 메소드
 */
fun saveUser(user: User){
    if(user.name.isEmpty()){
        throw IllegalArgumentException("Can't save user ${user.id}: empty Name")
    }
    if(user.address.isEmpty()){
        throw IllegalArgumentException("Can't save user ${user.id}: empty Address")
    }
    // user를 데이터베이스에 저장한다.
}

/*
    로컬 함수를 사용해 코드 중복 줄이기
    - User객체를 로컬 함수에게 하나하나 전달해야 한다는 아쉬운 점이 있음.
 */

fun saveUser2(user: User){
    fun validate(user: User, value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

/*
    로컬 함수에서 바깥 함수의 파라미터 접근하기
    - 로컬 함수는 자신이 속한 바깥 함수의 모든 파라미터와 변수를 사용할 수 있다.
 */

fun saveUser3(user: User){
    fun validate(value: String, fieldName: String){
        if(value.isEmpty()){
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}

/*
    검증 로직을 확장 함수로 추출하기
 */


fun User.validateBeforeSave(){
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${this.id}: empty $fieldName")
        }
    }
    validate(this.name, "Name")
    validate(this.address, "Address")
}

fun saveUser4(user: User){
    user.validateBeforeSave()
}
