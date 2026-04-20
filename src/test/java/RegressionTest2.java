import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList12 = cartService3.viewCart();
        java.lang.String str14 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart." + "'", str11, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass18 = cartService17.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.lang.String str11 = cartService5.addToCart("hi! added to cart.");
        java.lang.String str13 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str15 = cartService5.addToCart("hi!");
        java.lang.String str17 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart." + "'", str15, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.lang.String str11 = cartService5.addToCart("hi! added to cart.");
        java.lang.String str13 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        java.util.List<java.lang.String> strList16 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass17 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.util.List<java.lang.String> strList12 = cartService10.viewCart();
        java.util.List<java.lang.String> strList13 = cartService10.viewCart();
        java.lang.String str15 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        java.lang.String str18 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList19 = cartService15.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService6.viewCart();
        java.util.List<java.lang.String> strList14 = cartService6.viewCart();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.String str17 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.String str10 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService7.addToCart("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList17 = cartService16.viewCart();
        java.lang.String str19 = cartService16.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str21 = cartService16.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str23 = cartService16.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.String str13 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        java.lang.String str17 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.util.List<java.lang.String> strList8 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService5.addToCart("hi! added to cart. added to cart.");
        java.lang.String str13 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        java.lang.String str18 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi!");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService3.addToCart("Item name cannot be empty.");
        java.lang.String str13 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str17 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList18 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart." + "'", str11, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty." + "'", str17, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart." + "'", str9, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.String str9 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        main.java.CartService cartService19 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService1.addToCart("Item name cannot be empty.");
        java.lang.String str12 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart." + "'", str10, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("");
        java.lang.String str11 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService6.viewCart();
        java.lang.String str14 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService6.viewCart();
        java.lang.String str17 = cartService6.addToCart("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService8.viewCart();
        java.util.List<java.lang.String> strList13 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService5.addToCart("hi!");
        java.util.List<java.lang.String> strList18 = cartService5.viewCart();
        java.lang.String str20 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList21 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart." + "'", str17, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.util.List<java.lang.String> strList12 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi!");
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart." + "'", str13, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.lang.String str11 = cartService5.addToCart("hi! added to cart.");
        java.lang.String str13 = cartService5.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        java.lang.String str16 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass16 = cartService15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        java.lang.String str15 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass16 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        java.lang.Class<?> wildcardClass19 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str4, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.lang.Class<?> wildcardClass6 = cartService1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.String str15 = cartService13.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.lang.String str16 = cartService14.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str18 = cartService14.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList19 = cartService14.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        java.lang.Class<?> wildcardClass18 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList18 = cartService17.viewCart();
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService10.viewCart();
        java.lang.String str15 = cartService10.addToCart("hi! added to cart.");
        java.lang.String str17 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.String str12 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        java.util.List<java.lang.String> strList11 = cartService9.viewCart();
        java.lang.String str13 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass14 = cartService9.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty." + "'", str8, "Item name cannot be empty.");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService20 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList21 = cartService20.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList19 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.lang.String str11 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService19 = new main.java.CartService(cartData0);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.String str12 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService6.addToCart("hi! added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartService6.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        java.util.List<java.lang.String> strList15 = cartService11.viewCart();
        java.lang.String str17 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartService5.viewCart();
        java.lang.String str18 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str20 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("");
        java.lang.String str11 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty." + "'", str13, "Item name cannot be empty.");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.lang.String str18 = cartService16.addToCart("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart." + "'", str18, "Item name cannot be empty. added to cart.");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService7.viewCart();
        java.lang.String str16 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass14 = cartService13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("");
        java.lang.String str11 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList20 = cartService5.viewCart();
        java.util.List<java.lang.String> strList21 = cartService5.viewCart();
        java.lang.String str23 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str25 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str25, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.String str17 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService15.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty." + "'", str19, "Item name cannot be empty.");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.String str17 = cartService15.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty." + "'", str17, "Item name cannot be empty.");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("");
        java.lang.Class<?> wildcardClass9 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty." + "'", str8, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.lang.String str13 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService10.viewCart();
        java.lang.String str16 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass17 = cartService16.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.lang.String str16 = cartService14.addToCart("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartService14.viewCart();
        java.lang.Class<?> wildcardClass18 = cartService14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        java.util.List<java.lang.String> strList17 = cartService15.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.lang.String str11 = cartService5.addToCart("hi! added to cart.");
        java.lang.String str13 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        java.lang.String str17 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass18 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService7.viewCart();
        java.util.List<java.lang.String> strList13 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.lang.String str16 = cartService14.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList17 = cartService16.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList19 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.util.List<java.lang.String> strList12 = cartService10.viewCart();
        java.lang.String str14 = cartService10.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList15 = cartService10.viewCart();
        java.lang.String str17 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart." + "'", str14, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        java.lang.Class<?> wildcardClass18 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        java.util.List<java.lang.String> strList11 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.String str10 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass19 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService3.addToCart("Item name cannot be empty.");
        java.lang.String str13 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart." + "'", str11, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi!");
        java.lang.String str11 = cartService6.addToCart("hi!");
        java.lang.String str13 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart." + "'", str11, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList19 = cartService18.viewCart();
        java.lang.String str21 = cartService18.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass6 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.String str13 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.util.List<java.lang.String> strList10 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        java.util.List<java.lang.String> strList14 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList19 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.String str9 = cartService5.addToCart("");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("hi!");
        java.util.List<java.lang.String> strList17 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart." + "'", str16, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.String str17 = cartService15.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str19 = cartService15.addToCart("Item name cannot be empty.");
        java.lang.String str21 = cartService15.addToCart("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart." + "'", str19, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Item name cannot be empty." + "'", str21, "Item name cannot be empty.");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.Class<?> wildcardClass10 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.String str12 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.String str14 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart." + "'", str9, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        java.lang.String str8 = cartService4.addToCart("hi!");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService5.addToCart("");
        java.util.List<java.lang.String> strList18 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty." + "'", str17, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.String str10 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.String str12 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList20 = cartData0.getItems();
        java.util.List<java.lang.String> strList21 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList19 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.lang.String str13 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService7.viewCart();
        java.util.List<java.lang.String> strList13 = cartService7.viewCart();
        java.util.List<java.lang.String> strList14 = cartService7.viewCart();
        java.util.List<java.lang.String> strList15 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        java.lang.String str15 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService1.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService7.viewCart();
        java.util.List<java.lang.String> strList13 = cartService7.viewCart();
        java.util.List<java.lang.String> strList14 = cartService7.viewCart();
        java.util.List<java.lang.String> strList15 = cartService7.viewCart();
        java.util.List<java.lang.String> strList16 = cartService7.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.lang.Class<?> wildcardClass5 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService4.viewCart();
        java.lang.String str17 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        java.lang.String str18 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi!");
        java.lang.String str11 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.lang.String str7 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService1.addToCart("hi!");
        java.lang.String str11 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        java.lang.String str12 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService9.viewCart();
        java.lang.String str17 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService5.addToCart("hi!");
        java.util.List<java.lang.String> strList18 = cartService5.viewCart();
        java.util.List<java.lang.String> strList19 = cartService5.viewCart();
        java.lang.String str21 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart." + "'", str17, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass17 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService4.viewCart();
        java.lang.String str17 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService3.addToCart("Item name cannot be empty.");
        java.lang.String str13 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str17 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass18 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart." + "'", str11, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.util.List<java.lang.String> strList8 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.String str15 = cartService13.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService13.addToCart("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart." + "'", str17, "Item name cannot be empty. added to cart.");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService5.addToCart("hi!");
        java.lang.String str19 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList20 = cartService5.viewCart();
        java.util.List<java.lang.String> strList21 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart." + "'", str17, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass18 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.lang.Class<?> wildcardClass4 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        java.lang.String str10 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList19 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.lang.String str14 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService8.addToCart("");
        java.lang.Class<?> wildcardClass15 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty." + "'", str14, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.String str15 = cartService13.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService13.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass18 = cartService13.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass18 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.String str13 = cartService5.addToCart("");
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        java.util.List<java.lang.String> strList16 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass17 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty." + "'", str13, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass7 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.String str9 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        java.util.List<java.lang.String> strList12 = cartService4.viewCart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty.");
        java.lang.String str11 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart." + "'", str9, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        java.lang.String str13 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList15 = cartService14.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.String str15 = cartService13.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty." + "'", str15, "Item name cannot be empty.");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        java.lang.String str8 = cartService4.addToCart("hi!");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.lang.String str11 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.lang.String str12 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass6 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty." + "'", str14, "Item name cannot be empty.");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.String str10 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("Item name cannot be empty. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.String str17 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartService15.viewCart();
        java.lang.String str20 = cartService15.addToCart("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Item name cannot be empty. added to cart." + "'", str20, "Item name cannot be empty. added to cart.");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.String str17 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass13 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        main.java.CartService cartService20 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        java.util.List<java.lang.String> strList17 = cartService15.viewCart();
        java.lang.String str19 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass15 = cartService14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.String str15 = cartService13.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService13.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList20 = cartService5.viewCart();
        java.util.List<java.lang.String> strList21 = cartService5.viewCart();
        java.lang.String str23 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str23, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        java.lang.String str19 = cartService17.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass13 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList17 = cartService16.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty." + "'", str16, "Item name cannot be empty.");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.String str13 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        java.lang.String str16 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService19 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }
}

