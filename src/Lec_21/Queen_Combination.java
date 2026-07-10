package Lec_21;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int tq = 2;
		
		boolean[] board = new boolean[n];
		Combination(board, tq, "", 0, 0); //idx ki jgah 0 pass kiya first time 0 pe hi bithana hai
	}
	public static void Combination(boolean [] board, int tq, String ans, int qpsf, int idx) { //idx btayega har frame m loop kha se start karna hai
//		base case
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
//		idx btayega is frame m loop kha se start kare
//		beginning m idx = 0 hai toh 0 se start hoga loop
//		idx sirf loop ka start bta rha hai
		for(int i = idx; i < board.length; i++) {
			if(board[i]== false) { //
				board[i] = true; //ith index pe bithaya hai toh niche recursion m i+1 se 
//				recursion m pass karenge ki agr ith index pe bithai hai queen toh agli frame m i+1 se baithe...
//				agr 0 pe bithaya hai toh agli frame m 1 pe baithe...agr 1 pe bithaya hai toh agle frame m 2 pe baithe...
				Combination(board, tq, ans + "b" + i + "q" + qpsf, qpsf + 1, i+1); //i bta rha hai agle frame m loop kha se start kar rahe hai
				board[i] = false; //UNDO
			}
		}
	}
}

// call tree
//Combination(idx=0)
//
//│
//├── place at 0
//│      Combination(idx=1)
//│      ├── place at 1  -> print
//│      ├── place at 2  -> print
//│      └── place at 3  -> print
//│
//├── place at 1
//│      Combination(idx=2)
//│      ├── place at 2 -> print
//│      └── place at 3 -> print
//│
//├── place at 2
//│      Combination(idx=3)
//│      └── place at 3 -> print
//│
//└── place at 3
//       Combination(idx=4)
//       (nothing)

//**Approach (5 points):**
//
//1. **`idx` batata hai loop kahan se start hoga**
//
//   * Har recursive call me loop `idx` se start hota hai.
//   * Pehli call me `idx = 0`, isliye loop `0` se start hota hai.
//
//2. **`i` current queen ki position hai**
//
//   * Jab loop me `i` aata hai, hum queen ko `board[i]` par place karte hain.
//
//   ```java
//   board[i] = true;
//   ```
//
//3. **`i + 1` next recursive call ko pass karte hain**
//
//   * Agar queen index `i` par baithi hai, to agli queen sirf uske baad wale indices par hi baith sakti hai.
//
//   ```java
//   Combination(board, tq, ans, qpsf + 1, i + 1);
//   ```
//
//   * Example: Queen `1` par baithi hai → next call `idx = 2` se start hogi.
//
//4. **Isse duplicate combinations nahi bante**
//
//   * Hum `(0,1)` generate karte hain.
//   * Lekin `(1,0)` kabhi generate nahi hota, kyunki `1` choose karne ke baad loop `2` se start hota hai, `0` par wapas nahi ja sakta.
//
//5. **Backtracking se doosri possibilities check karte hain**
//
//   * Recursive call ke baad queen hata dete hain:
//
//   ```java
//   board[i] = false;
//   ```
//
//   * Fir loop ka next `i` try hota hai aur baaki combinations generate hote hain.
//
//### Yaad rakhne ki trick
//
//* **`idx` = "Loop kahan se start karna hai."**
//* **`i` = "Current queen kahan baithi hai."**
//* **`i + 1` = "Agli queen current position ke baad hi baithegi."**
//
//Yahi combination approach ka main idea hai.

