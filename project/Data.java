package project;

public class Data {
	public static final int DATA_SIZE = 2048;
	private int[] data = new int[DATA_SIZE];
	private int changedIndex = -1;
	
	public int getData(int index) {
		if (index < 0 || index > DATA_SIZE - 1) throw new MemoryAccessException("Illegal access to data memory index" + index);
		return data[index];
	}
	
	public int[] getData() {
		return data;
	}
	
	public void setData(int index, int value) {
		if (index < 0 || index > DATA_SIZE - 1) throw new MemoryAccessException("Illegal access to data memory index" + index);
		changedIndex = index;
		data[index] = value;
	}
	
	public int getChangedIndex() {
		return changedIndex;
	}
	
	public void clearData(int start, int end) {
		for(int i = start; i < end; i++) {
			data[i] = 0;
		}
		changedIndex = -1;
	}
}
