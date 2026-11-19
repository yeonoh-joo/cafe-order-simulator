# ☕ 카페 주문 시뮬레이터

카페 키오스크처럼 메뉴 선택부터 옵션, 장바구니, 포인트, 결제, 영수증까지 이어지는 주문 흐름을 구현한 안드로이드 앱입니다. 모바일앱개발응용 수업의 개인 과제입니다.

- **개발 시기**: 2025.11
- **개발 환경**: Android Studio, Java
- **구성**: 한 개의 Activity에서 `ViewFlipper`로 화면을 전환

> ⚠️ 저작권 문제로 **메뉴 이미지와 배경음악은 저장소에 포함하지 않았습니다.** 실행하려면 [실행 방법](#실행-방법)을 참고해 직접 넣어야 합니다.

## 주문 흐름

메뉴 선택 → 옵션 선택 → 장바구니 → 포장/매장 → 포인트 → 결제 수단 → 영수증

## 주요 기능

**메뉴와 옵션**
- 커피 4종(아메리카노, 카푸치노, 라떼, 모카), 핫/아이스, 사이즈, 농도, 얼음량, 휘핑 선택
- 사이즈(Large +400원, Venti +700원)와 샷 추가(+300원) 금액을 합산해 실시간 표시
- 핫 음료는 얼음 선택 차단, 필수 옵션을 선택하지 않으면 안내 후 진행 제한

**장바구니**
- 최대 5건, 수량 조절과 삭제
- 포장/매장 선택

**포인트와 결제**
- 전화번호 기준 포인트 적립(결제 금액의 2%)과 사용(500P 이상부터)
- 전화번호는 일부를 `****`로 가려서 표시
- 결제 수단 선택 후 영수증 출력
- 배경음악 재생(`MediaPlayer`), 안내 메시지는 `Toast`로 표시

## 폴더 구성

```
cafe-order-simulator
├── app
│   ├── build.gradle.kts
│   └── src/main
│       ├── AndroidManifest.xml
│       ├── java/com/example/day1103_assignment
│       │   └── MainActivity.java   # 화면 전환, 옵션 처리, 장바구니·포인트 로직
│       └── res
│           ├── layout/activity_main.xml
│           ├── drawable/           # 메뉴 이미지 (저장소에 미포함)
│           ├── raw/                # 배경음악 (저장소에 미포함)
│           └── values/strings.xml
├── gradle
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew, gradlew.bat
└── LICENSE
```

## 실행 방법

1. 저장소를 내려받아 Android Studio에서 폴더를 엽니다(Open). Gradle Sync가 끝나면 `local.properties`는 자동으로 만들어집니다.
2. 아래 리소스를 직접 준비해 넣습니다. 파일명이 다르면 빌드되지 않습니다.
   - `app/src/main/res/raw/cafemusic.mp3`: 배경음악 (`raw` 폴더가 없으면 `res` 아래에 새로 만듭니다)
   - `app/src/main/res/drawable/`: 메뉴 이미지 22개
3. 에뮬레이터나 기기에서 실행합니다.

<details>
<summary>필요한 이미지 파일명</summary>

규칙: `{hot|ice}` + `{ame|cappu|latte|moch}` + `{in|out}`(매장/포장) + `{whip}`(휘핑)

```
hotamein.jpg  hotcappuin.jpg  hotlattein.jpg  hotmochain.jpg
hotcoffeeinwhip.jpg  hotcoffeeout.jpg
iceamein.jpg  iceameinwhip.jpg  iceameout.png  iceameoutwhip.png
icecappuin.jpg  icecappuinwhip.jpg  icecappuout.png  icecappuoutwhip.png
icelattein.jpg  icelatteinwhip.png  icelatteout.png  icelatteoutwhip.png
icemochain.jpg  icemochainwhip.jpg  icemochaout.png  icemochaoutwhip.png
```

확장자(jpg/png)는 달라도 되고, 확장자를 뺀 파일명만 같으면 됩니다.
</details>

## 한계와 개선할 점

- `MainActivity.java` 한 파일에 약 1,300줄이 모여 있고, 장바구니 항목마다 변수가 반복됩니다. 클래스와 리스트 구조로 분리해야 합니다.
- 포인트와 전화번호는 앱이 실행되는 동안 메모리에만 저장되어, 앱을 종료하면 사라집니다. SQLite나 SharedPreferences로 저장하도록 바꿀 수 있습니다.
- 일부 조건문에서 문자열을 `==`, `!=`로 비교하고 있어 `equals()`로 고쳐야 합니다.

## 라이선스

- **소스 코드**: MIT License ([LICENSE](LICENSE))
- **메뉴 이미지·배경음악**: 저장소에 포함하지 않았으며, MIT 라이선스는 이 파일들에 적용되지 않습니다.
