# ✏️ 기능 목록

###  - 로또 구입 금액을 입력 요청하기

###  - 로또 구입 금액 입력 받기

###  - 구매한 로또 수량 및 번호를 오름차순으로 출력

###  - 당첨 번호 입력 요청 하기 

###  - 당첨 번호 입력 받기

###  - 보너스 번호 입력 요청하기

###  - 자동차의 전진 또는 정지 여부를 결정하기 위해 임의의 정수 입력받기

###  - 보너스 번호 입력 받기

###  - 수익률 출력하기

###  - 잘못된 입력에 대한 예외상황 정의하기

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# 세부 구현 계획
 
#### AppConfig : 로또 프로그램에 사용되는 클래스들의 의존성 주입을 담당

#### Amount, Condition, ErrorMessage, LottoGrade : 로또 프로그램에서 사용되는 값들을 ENUM으로 정의함 

#### LottoController : 로또 프로그램의 전반적인 흐름을 제어

#### InputHandler : 입력과 관련된 값들의 전반적인 처리를 담당

#### InputParser : 입력값을 변환함

#### InputValidator : 입력값을 검증함

#### LottoNumberGenerator : 로또 번호를 생성함

#### LottoResultAggregator : 로또 결과에 대한 통계값을 추출함

#### MatcherUtil : 정규식 검증을 담당

#### ReturnOnInvestmentCalculator : 수익률 계산을 담당함

#### WinningNumberParser : 입력받은 당첨 번호를 정수로 변환함

#### WinningNumberSeparator : 입력받은 당첨번호를 구분자를 기준으로 분리함

#### InputView : 입력요청과 관련된 메시지 출력을 담당함

#### OutputView : 로또 프로그램의 진행상황을 메시지로 출력함

#### BonusNumber : 보너스 번호를 담고 있는 객체

#### Lotto : 당첨번호를 담고 있는 객체

#### LottoDrawResult : 당첨번호와 보너스번호에 대한 정보를 담고 있는 객체

#### LottoPurchaseDetatils : 사용자의 로또 구매금액과 로또 발행수량에 대한 정보를 담고 있는 객체


   



    



