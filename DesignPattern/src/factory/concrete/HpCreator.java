package factory.concrete;

import java.util.Date;

import factory.framework.Item;
import factory.framework.ItemCreator;

public class HpCreator extends ItemCreator{

	@Override
	protected void requestItemInfo() {
		System.out.println("데이터베이스에서 회복 물약의 정보를 가져옵니다");
	}

	@Override
	protected void createItemLog() {
		System.out.println("회복 물약을 새로 생성했습니다"+ new Date());
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
