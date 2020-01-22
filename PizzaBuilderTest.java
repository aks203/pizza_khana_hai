public class PizzaBuilderTest {
 
    @Test
    public void shouldBuildThinCrustChickenPizza(){
        Pizza pizza = new PizzaBuilder().withCrust(Crust.THIN).withTopping(Topping.CHICKEN).withSize(Size.LARGE).build();
        assertEquals(Topping.CHICKEN,pizza.getTopping());
        assertEquals(Size.LARGE,pizza.getSize());
        assertEquals(Crust.THIN,pizza.getCrust());
        assertEquals(265.0,pizza.getTotalPrice(),0);
    }
}