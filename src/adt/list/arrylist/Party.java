package adt.list.arrylist;

//外部类，聚会
class Party {

	public void puffBall() {// 吹气球方法
		class Ball {// 内部类，气球

			public void puff() {
				System.out.println("气球膨胀了");
			}
		}
//创建内部类对象，调用 puff 方法
		new Ball().puff();
	}


	public static void main(String[] args) {
//创建外部类对象
		Party p = new Party();
//调用外部类中的 puffBall 方法
		p.puffBall();
	}

}