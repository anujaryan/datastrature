package searching;

public class DataSet {

	int[] data;
	int Numberoftry;

	public DataSet(int size) {
		data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = i;
		}
		Numberoftry = 0;
	}

	public int getSize() {
		return data.length;
	}
}
