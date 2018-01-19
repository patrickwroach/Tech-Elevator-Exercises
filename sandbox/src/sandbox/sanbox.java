package sandbox;

public class sanbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums = new int[] {1,2,3,4,100,6,7,8};

for (int i = 0; i < nums.length; i++) {
	if (nums[i] == 4) {
		i = i + 1;
		continue;
	}
	System.out.println(nums[i]);
	}
}
	}

