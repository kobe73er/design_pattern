public class TestEnemyAttackers {

	public static void main(String[] args) {

		EnemyRobot fredTheRobot = new EnemyRobot();

		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);

		System.out.println("The Robot with Adapter---->");

		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();

	}

}