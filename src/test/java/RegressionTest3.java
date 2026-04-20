import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.String str19 = cartService17.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList20 = cartService17.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.String str10 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService7.addToCart("");
        java.util.List<java.lang.String> strList13 = cartService7.viewCart();
        java.lang.String str15 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        main.java.CartService cartService19 = new main.java.CartService(cartData0);
        java.lang.String str21 = cartService19.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService6.addToCart("hi! added to cart. added to cart.");
        java.lang.String str13 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService6.addToCart("Item name cannot be empty.");
        java.lang.String str17 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart." + "'", str15, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        java.lang.String str12 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str14 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        java.lang.String str17 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        java.lang.String str18 = cartService16.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList19 = cartService16.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService12.viewCart();
        java.lang.String str17 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.util.List<java.lang.String> strList13 = cartService11.viewCart();
        java.lang.String str15 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        cartData0.addItem("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        java.lang.String str10 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart.");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass17 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        cartData0.addItem("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass13 = cartService12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        java.lang.String str19 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart." + "'", str11, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty." + "'", str17, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty.");
        java.lang.String str12 = cartService8.addToCart("Item name cannot be empty.");
        java.lang.String str14 = cartService8.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList15 = cartService8.viewCart();
        java.lang.String str17 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService8.addToCart("");
        java.lang.String str21 = cartService8.addToCart("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart." + "'", str10, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty." + "'", str19, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str21, "hi! added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.String str12 = cartService3.addToCart("");
        java.lang.String str14 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        java.util.List<java.lang.String> strList15 = cartService13.viewCart();
        java.util.List<java.lang.String> strList16 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList20 = cartData0.getItems();
        main.java.CartService cartService21 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.lang.String str16 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str18 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str20 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        java.lang.String str19 = cartService17.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.util.List<java.lang.String> strList12 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str17 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartService2.viewCart();
        java.util.List<java.lang.String> strList4 = cartService2.viewCart();
        java.util.List<java.lang.String> strList5 = cartService2.viewCart();
        java.util.List<java.lang.String> strList6 = cartService2.viewCart();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        java.lang.String str20 = cartService18.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        java.lang.String str16 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str18 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart." + "'", str16, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        java.lang.String str16 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartService5.viewCart();
        java.lang.String str19 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str21 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str21, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        java.util.List<java.lang.String> strList15 = cartService11.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService11.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass13 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.java.CartData.addItem(String)\" because \"this.cartData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Item name cannot be empty." + "'", str3, "Item name cannot be empty.");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        java.lang.Class<?> wildcardClass17 = cartService15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        java.util.List<java.lang.String> strList19 = cartService5.viewCart();
        java.util.List<java.lang.String> strList20 = cartService5.viewCart();
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
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.lang.String str14 = cartService11.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService11.addToCart("");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty." + "'", str16, "Item name cannot be empty.");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
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
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        java.lang.String str16 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str18 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList19 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.String str9 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        java.lang.String str19 = cartService16.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList20 = cartService16.viewCart();
        java.util.List<java.lang.String> strList21 = cartService16.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartService11.viewCart();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService21 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        cartData0.addItem("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.lang.String str13 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass14 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        java.util.List<java.lang.String> strList20 = cartData0.getItems();
        java.util.List<java.lang.String> strList21 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartService2.viewCart();
        java.lang.String str5 = cartService2.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str7 = cartService2.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        java.lang.String str17 = cartService15.addToCart("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart.");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        java.lang.Class<?> wildcardClass20 = cartService18.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        java.util.List<java.lang.String> strList15 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.String str12 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass18 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService8.viewCart();
        java.util.List<java.lang.String> strList13 = cartService8.viewCart();
        java.lang.String str15 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        cartData0.addItem("");
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartService9.viewCart();
        java.lang.String str14 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartService9.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
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
        java.lang.String str16 = cartService14.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.util.List<java.lang.String> strList13 = cartService11.viewCart();
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        java.util.List<java.lang.String> strList15 = cartService11.viewCart();
        java.util.List<java.lang.String> strList16 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.util.List<java.lang.String> strList15 = cartService14.viewCart();
        java.lang.String str17 = cartService14.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartService14.viewCart();
        java.lang.Class<?> wildcardClass19 = cartService14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.String str10 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService3.viewCart();
        java.util.List<java.lang.String> strList12 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass18 = cartService17.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        java.util.List<java.lang.String> strList16 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        java.util.List<java.lang.String> strList15 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
        cartData0.addItem("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        java.lang.String str16 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("");
        java.util.List<java.lang.String> strList15 = cartService4.viewCart();
        java.util.List<java.lang.String> strList16 = cartService4.viewCart();
        java.lang.String str18 = cartService4.addToCart("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty." + "'", str14, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty." + "'", str18, "Item name cannot be empty.");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        java.util.List<java.lang.String> strList15 = cartService14.viewCart();
        java.util.List<java.lang.String> strList16 = cartService14.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.String str19 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService12.viewCart();
        java.lang.String str17 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        java.lang.String str15 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartService5.viewCart();
        java.lang.String str18 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart.");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.lang.String str16 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str18 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str20 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        java.lang.String str12 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.lang.String str11 = cartService5.addToCart("hi! added to cart.");
        java.lang.String str13 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass14 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        main.java.CartService cartService19 = new main.java.CartService(cartData0);
        main.java.CartService cartService20 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList21 = cartService20.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartService3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("");
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.String str12 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass13 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.String str17 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
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
        java.util.List<java.lang.String> strList14 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        java.util.List<java.lang.String> strList16 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass17 = strList16.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        java.lang.String str15 = cartService13.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty.");
        java.lang.String str14 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass17 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.util.List<java.lang.String> strList12 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        java.util.List<java.lang.String> strList19 = cartService5.viewCart();
        java.lang.String str21 = cartService5.addToCart("");
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
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Item name cannot be empty." + "'", str21, "Item name cannot be empty.");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.String str10 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService7.addToCart("");
        java.lang.String str14 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        java.lang.String str17 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService6.addToCart("hi! added to cart. added to cart.");
        java.lang.String str12 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList20 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        java.lang.String str16 = cartService11.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty." + "'", str16, "Item name cannot be empty.");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        java.lang.String str17 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass18 = cartService15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList18 = cartService17.viewCart();
        java.util.List<java.lang.String> strList19 = cartService17.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.util.List<java.lang.String> strList7 = cartService1.viewCart();
        java.util.List<java.lang.String> strList8 = cartService1.viewCart();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.String str15 = cartService13.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        java.util.List<java.lang.String> strList13 = cartService4.viewCart();
        java.util.List<java.lang.String> strList14 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        cartData0.addItem("");
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService11.viewCart();
        java.lang.String str16 = cartService11.addToCart("hi!");
        java.lang.String str18 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart." + "'", str16, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService20 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList21 = cartService20.viewCart();
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty.");
        java.lang.String str12 = cartService8.addToCart("Item name cannot be empty.");
        java.lang.String str14 = cartService8.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList15 = cartService8.viewCart();
        java.lang.String str17 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartService8.viewCart();
        java.util.List<java.lang.String> strList19 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart." + "'", str10, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        java.lang.String str10 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.lang.String str7 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.lang.String str16 = cartService14.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartService14.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService8.viewCart();
        java.lang.String str17 = cartService8.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart." + "'", str17, "hi! added to cart.");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        java.util.List<java.lang.String> strList9 = cartService6.viewCart();
        java.util.List<java.lang.String> strList10 = cartService6.viewCart();
        java.util.List<java.lang.String> strList11 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        java.util.List<java.lang.String> strList9 = cartService6.viewCart();
        java.lang.String str11 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.String str9 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        java.lang.String str12 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList19 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi! added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService11.addToCart("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart." + "'", str15, "Item name cannot be empty. added to cart.");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi!");
        java.util.List<java.lang.String> strList10 = cartService6.viewCart();
        java.lang.String str12 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        java.lang.Class<?> wildcardClass21 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService8.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty." + "'", str16, "Item name cannot be empty.");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.lang.Class<?> wildcardClass12 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str4, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        java.lang.Class<?> wildcardClass18 = cartService5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass21 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartService12.viewCart();
        java.util.List<java.lang.String> strList18 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.String str12 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str5, "hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass18 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass13 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        java.lang.String str12 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        java.lang.String str17 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.lang.String str7 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList8 = cartService1.viewCart();
        java.util.List<java.lang.String> strList9 = cartService1.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        java.util.List<java.lang.String> strList16 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart." + "'", str14, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService6.viewCart();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.String str10 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
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
        java.lang.Class<?> wildcardClass18 = cartService15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        java.lang.String str17 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        java.util.List<java.lang.String> strList13 = cartService4.viewCart();
        java.lang.String str15 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartService9.viewCart();
        java.lang.String str14 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str18 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList20 = cartData0.getItems();
        main.java.CartService cartService21 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList22 = cartService21.viewCart();
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList22);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        java.lang.String str17 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
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
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        java.util.List<java.lang.String> strList14 = cartService12.viewCart();
        java.lang.String str16 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        main.java.CartService cartService19 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        java.util.List<java.lang.String> strList15 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        java.util.List<java.lang.String> strList18 = cartService17.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi!");
        java.lang.String str11 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.util.List<java.lang.String> strList13 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        java.lang.Class<?> wildcardClass21 = cartService5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass17 = cartService16.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty.");
        java.lang.String str14 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService22 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }
}

