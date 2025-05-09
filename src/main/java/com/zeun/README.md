
## ✅ \[지은밴드 요구사항]

### 1. 개요

* 지은밴드는 다양한 포지션의 **밴드 멤버(Musician)** 들로 구성된다.
* 모든 밴드 멤버는 공통적으로 `이름(name)`과 `파트(part)` 속성을 가진다.
* 멤버들은 `Musician` 추상 클래스를 상속받아 구현되며, **모든 인스턴스는 `Musician` 타입으로 관리**된다.
* 모든 멤버는 `perform()` 메서드를 통해 자신의 역할을 수행하며, 이 메서드는 **각 포지션에 맞게 다르게 동작**한다 (→ 다형성).

---

### 2. 클래스 설계

#### ▶️ `Musician` (추상 클래스)

* 공통 속성: `name`, `part`
* 공통 메서드: `abstract void perform();`
* getter/setter 메서드를 통해 속성 접근

#### ▶️ 세부 포지션

* `Vocalist`
  * 역할: 노래


* `Guitarist`
  * 추가 속성: `numberOfLines` (줄 수)
  * 역할: 노래, 악기 연주


* `Drummer`
  * 역할: 악기 연주


* `Keyboardist`
  * 역할: 악기 연주

---

### 3. 인터페이스 설계

* `interface Singable`
  * `void sing();` 노래하기

* `interface Playable`
  * `void playInstrument();` 악기 연주하기