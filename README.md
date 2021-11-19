# kotlin-blackjack

## 1단계 - 코틀린 DSL

---
## 2단계 - 블랙잭

### 기능 요구사항
블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

- 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.

### 기능 리스트 
 - [x] 참여자를 입력 받는다.
 - [x] 카드를 참여자에게 준다.
 - [x] 카드를 더 받을지 여부를 입력 받는다.
 - [x] 참여자의 총 카드 숫자가 21을 넘지 않아야 카드를 더 받을 수 있다.
 - [x] 게임 종료 후, 참여자들의 카드와 총 숫자를 계산한다.
