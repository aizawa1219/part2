package chapter10_2;

public class Rate1 implements RateIntf {

	@Override
	public double taxRate(int gaku) {
		return gaku>100 ? 0.1 : 0.05;  //所得額が100より大なら0.1,それ以外は0.05
	}

}
