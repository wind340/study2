package factory.framework;

public abstract class ItemCreator {
	
	//팩토리 메소드
	public Item create() {
		
		Item item;
		requestItemInfo();
		item = createItem();
		createItemLog();
		
		return item;
	}
	
	//아이템 생성전에 DB에서 아이템 정보 요청
	abstract protected void requestItemInfo();
	//아이템 생성후 아이템 복제 불법 방지
	abstract protected void createItemLog();
	//아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}
