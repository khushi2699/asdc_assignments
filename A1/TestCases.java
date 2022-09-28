public class TestCases {
    public void executeTests() {

        UserTest ut = new UserTest();
        System.out.println();
        ut.loginUnknownUserTest();
        System.out.println();
        ut.loginIncorrectPasswordTest();
        System.out.println();
        ut.loginSuccessTest();
        System.out.println();

        MainScreenTest mst = new MainScreenTest();

        BasketTest bt = new BasketTest();
        bt.testRemoveItem();
        System.out.println();
        bt.testRemoveItemBadInput();
        System.out.println();
        bt.testRemoveEmptyBasket();
        System.out.println();
        bt.showBasketTest();
        System.out.println();
        bt.showBasketTestEmptyBasket();

        MenuTest menuT = new MenuTest();
        menuT.testMenuDisplay();
        System.out.println();
        menuT.testMenuDisplayEmptyBucket();

        PaymentTest pt = new PaymentTest();
        pt.validateCardNumberUnderRangeTest();
        System.out.println();
        pt.validateCardNumberAboveRangeTest();
        System.out.println();
        pt.validateCardNumberTest();
        System.out.println();
        pt.validateExpiryTest();
        System.out.println();
        pt.validateExpiryAboveRange();
        System.out.println();
        pt.validateExpiryBelowRange();
        System.out.println();
        pt.validateCSVTest();
        System.out.println();
        pt.validateCSVAboveRangeTest();
        System.out.println();
        pt.validateCSVBelowRangeTest();
        System.out.println();

        ShoppingBasketTest sBT = new ShoppingBasketTest();
        sBT.addItemsToBasketTest();
        System.out.println();
        sBT.getCalculateTotalPriceTest();
    }
}
