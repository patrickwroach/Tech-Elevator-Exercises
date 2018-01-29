package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*String getTypeOfFruit()
 * int getPiecesOfFruitLeft()
 * public boolean pickFruit(int numberOfPieces)
 * 
 */

public class FruitTreeTest {
	private FruitTree tree;
	@Before
	public void setup() {
		tree = new FruitTree("Apple", 20);
	}
	
	
	@Test
	public void get_type_of_fruit() {
		//arrange
		//act
		//assert
		Assert.assertEquals("Tree should be apple", "Apple", tree.getTypeOfFruit());
	}
	
	@Test
	public void get_pieces_of_fruit_left() {
		//arrange
		//act
		//assert
		Assert.assertEquals("Tree should have 20 pieces of fruit", 20, tree.getPiecesOfFruitLeft());
	}
	
	public void get_pieces_of_fruit() {
		//arrange
		//act
		tree.pickFruit(5);
		//assert
		Assert.assertEquals("Tree should have 15 pieces of fruit left", 15, tree.getPiecesOfFruitLeft());
	}
	
	public void get_pieces_of_fruit_too_many_fruit() {
		//arrange
		//act
		//assert
		Assert.assertFalse("Tree should not have enough fruit to be picked", tree.pickFruit(25));
	}
	
	
	
	
}
