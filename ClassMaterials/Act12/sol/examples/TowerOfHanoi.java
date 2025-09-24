//package examples;
///**
// * Using a recursive algorithm to print instructions to solve the Tower of Hanoi problem.
// *
// *
// * @author Jason Yoder (inspired by Matt Boutell)
// *
// */
//public class TowerOfHanoi {
//	// Play with this website:  https://www.mathsisfun.com/games/towerofhanoi.html
//	// We can write a recursive method to print instructions
//	// for what to move where to solve the problem
//	//
//	//            1
//	//           222
//	//          33333
//	//         4444444
//	//        555555555
//	//       66666666666
//	//      7777777777777
//	//     888888888888888
//	//     _______________     _______________     _______________
//	//       left stack          middle stack        right stack
//	public static void main(String[] args) {
//
//		// move stack of 8 disks, from the left to the right stack
//		moveTower(8, "left stack", "middle stack", "right stack");
//	}
//
//
//	/**
//	 *
//	 *  Our goal is to implement this algorithm:
//	 *
//	 *  If there is only 1 disk to move, then:
//	 *  	1. Move it from its source to destination
//	 *
//	 *  Otherwise:
//	 * 		1. Move n-1 disks (tower)  from source to the spare
//	 *  	2. Move the disk  (bottom) from source to dest
//	 *  	3. Move n-1 disks (tower)  from spare  to dest
//	 *
//	 */
//	public static void moveTower( int diskNumber, String source, String spare, String dest) {
//		if (diskNumber == 1) {
//			System.out.println("Move disk #" + diskNumber + " from " + source + " to " + dest );
//		} else {
//			moveTower( diskNumber-1, source, dest, spare);
//			System.out.println("Move disk #" + diskNumber + " from " + source + " to " + dest );
//			moveTower( diskNumber-1, spare, source, dest );
//		}
//	}
//
//}
