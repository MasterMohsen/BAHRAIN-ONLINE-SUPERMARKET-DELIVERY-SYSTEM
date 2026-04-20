import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass17 = cartService16.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.util.List<java.lang.String> strList8 = cartService4.viewCart();
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass13 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.lang.String str6 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService1.addToCart("Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
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
        java.lang.String str16 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        java.lang.String str13 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.lang.String str15 = cartService13.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.String str10 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty." + "'", str13, "Item name cannot be empty.");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService6.viewCart();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.String str12 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        java.lang.String str17 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartService5.viewCart();
        java.lang.String str20 = cartService5.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart." + "'", str15, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Item name cannot be empty." + "'", str20, "Item name cannot be empty.");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        java.util.List<java.lang.String> strList11 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService11.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList16 = cartService11.viewCart();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart." + "'", str15, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService10.viewCart();
        java.util.List<java.lang.String> strList16 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass6 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        java.lang.String str17 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList20 = cartService5.viewCart();
        java.lang.String str22 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str22, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("");
        java.lang.String str10 = cartService3.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList11 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty." + "'", str8, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart." + "'", str10, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.lang.Class<?> wildcardClass20 = cartService5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartService9.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.util.List<java.lang.String> strList8 = cartService4.viewCart();
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.lang.String str11 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService1.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        java.lang.Class<?> wildcardClass20 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
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
        java.util.List<java.lang.String> strList17 = cartService15.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.String str13 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService8.viewCart();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        java.lang.String str14 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        java.lang.String str17 = cartService5.addToCart("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart." + "'", str17, "Item name cannot be empty. added to cart.");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.lang.Class<?> wildcardClass9 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService8.addToCart("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.String str12 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.String str11 = cartService3.addToCart("");
        java.lang.String str13 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty." + "'", str11, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi!");
        java.lang.String str11 = cartService6.addToCart("hi!");
        java.lang.Class<?> wildcardClass12 = cartService6.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart." + "'", str11, "hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        java.util.List<java.lang.String> strList17 = cartService16.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.Class<?> wildcardClass14 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart." + "'", str13, "hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.String str12 = cartService7.addToCart("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart.");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("");
        java.lang.String str5 = cartService1.addToCart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.java.CartData.addItem(String)\" because \"this.cartData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Item name cannot be empty." + "'", str3, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.lang.String str18 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.String str7 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.String str10 = cartService3.addToCart("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart." + "'", str7, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty." + "'", str10, "Item name cannot be empty.");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.String str10 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("");
        java.lang.String str8 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.lang.String str11 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart.");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        java.lang.String str16 = cartService13.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        java.lang.String str17 = cartService10.addToCart("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart." + "'", str14, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService3.addToCart("Item name cannot be empty.");
        java.lang.Class<?> wildcardClass12 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart." + "'", str11, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass13 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.lang.String str7 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList8 = cartService1.viewCart();
        java.lang.String str10 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.util.List<java.lang.String> strList13 = cartService10.viewCart();
        java.lang.String str15 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList16 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        java.lang.Class<?> wildcardClass14 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        java.lang.String str14 = cartService12.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart." + "'", str14, "hi! added to cart.");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        java.lang.Class<?> wildcardClass12 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        java.lang.Class<?> wildcardClass13 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart." + "'", str9, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("hi!");
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart." + "'", str14, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.lang.Class<?> wildcardClass4 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        java.lang.String str19 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        java.lang.String str18 = cartService12.addToCart("");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty." + "'", str18, "Item name cannot be empty.");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.lang.String str16 = cartService14.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart." + "'", str16, "hi! added to cart.");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str16 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str18 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList19 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("");
        java.lang.String str8 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.util.List<java.lang.String> strList16 = cartService13.viewCart();
        java.lang.Class<?> wildcardClass17 = cartService13.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        java.util.List<java.lang.String> strList13 = cartService10.viewCart();
        java.lang.String str15 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.lang.String str17 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass19 = strList18.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart." + "'", str15, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty." + "'", str13, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        java.lang.String str13 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.lang.String str14 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart." + "'", str9, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.util.List<java.lang.String> strList10 = cartService8.viewCart();
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.String str17 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart." + "'", str14, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.lang.Class<?> wildcardClass6 = cartService1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService1.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        java.lang.String str13 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass7 = cartService6.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService6.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart." + "'", str10, "hi! added to cart.");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.util.List<java.lang.String> strList10 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str11 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass14 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        java.util.List<java.lang.String> strList14 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService19 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass20 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        java.lang.String str13 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        java.lang.Class<?> wildcardClass17 = cartService14.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        java.lang.String str10 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.String str9 = cartService5.addToCart("");
        java.lang.String str11 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        java.lang.String str14 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        java.lang.Class<?> wildcardClass13 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        java.lang.String str15 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        java.lang.Class<?> wildcardClass13 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.lang.String str11 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService1.viewCart();
        java.lang.String str9 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        main.java.CartService cartService17 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass18 = cartService17.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
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
        java.util.List<java.lang.String> strList15 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.Class<?> wildcardClass10 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi!");
        java.lang.String str11 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService7.addToCart("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.util.List<java.lang.String> strList12 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        java.lang.String str18 = cartService14.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str20 = cartService14.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str20, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.lang.String str17 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart." + "'", str11, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        java.lang.String str17 = cartService14.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        main.java.CartService cartService20 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList19);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService4.addToCart("hi! added to cart. added to cart.");
        java.lang.String str16 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartService2.viewCart();
        java.util.List<java.lang.String> strList4 = cartService2.viewCart();
        java.util.List<java.lang.String> strList5 = cartService2.viewCart();
        java.lang.String str7 = cartService2.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        java.util.List<java.lang.String> strList17 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        java.util.List<java.lang.String> strList9 = cartService6.viewCart();
        java.lang.String str11 = cartService6.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList12 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        java.lang.String str15 = cartService5.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart." + "'", str15, "hi! added to cart.");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        java.util.List<java.lang.String> strList15 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService18 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart.");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartService9.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        java.util.List<java.lang.String> strList12 = cartService8.viewCart();
        java.lang.String str14 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.lang.Class<?> wildcardClass20 = cartService16.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        java.lang.String str13 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        java.lang.Class<?> wildcardClass18 = strList17.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.String str7 = cartService3.addToCart("hi!");
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart." + "'", str7, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService3.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList13 = cartService5.viewCart();
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass7 = cartService6.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService20 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.lang.String str22 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str22, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        java.lang.String str14 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        java.util.List<java.lang.String> strList14 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.Class<?> wildcardClass15 = cartService14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        java.lang.String str18 = cartService14.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str20 = cartService14.addToCart("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Item name cannot be empty." + "'", str20, "Item name cannot be empty.");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        java.lang.String str19 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str21 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str21, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        java.lang.String str17 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str19 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList20 = cartService5.viewCart();
        java.util.List<java.lang.String> strList21 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart.");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.lang.String str7 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        java.lang.Class<?> wildcardClass16 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart." + "'", str11, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        java.lang.Class<?> wildcardClass15 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        java.lang.String str15 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        java.util.List<java.lang.String> strList13 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.String str12 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        java.lang.String str18 = cartService15.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass19 = cartService15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.lang.String str16 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList17 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty." + "'", str16, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str15 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.lang.String str14 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart." + "'", str11, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartService9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.util.List<java.lang.String> strList13 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.String str19 = cartService17.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.util.List<java.lang.String> strList20 = cartService16.viewCart();
        java.util.List<java.lang.String> strList21 = cartService16.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass16 = cartService15.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        java.lang.Class<?> wildcardClass21 = cartService20.getClass();
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.lang.String str4 = cartService2.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService2.addToCart("Item name cannot be empty. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartService2.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.String str7 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        cartData0.addItem("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.lang.String str22 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str22, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        java.util.List<java.lang.String> strList16 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass17 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        java.lang.Class<?> wildcardClass13 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        main.java.CartService cartService14 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.String str13 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService6.addToCart("hi! added to cart. added to cart.");
        java.lang.String str12 = cartService6.addToCart("hi! added to cart. added to cart.");
        java.lang.String str14 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartService9.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService8.viewCart();
        java.lang.String str14 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartService8.viewCart();
        java.lang.Class<?> wildcardClass16 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartService15.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("");
        java.lang.String str8 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.lang.String str11 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService1.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.util.List<java.lang.String> strList8 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart." + "'", str11, "hi! added to cart.");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService9.viewCart();
        java.util.List<java.lang.String> strList13 = cartService9.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        java.lang.Class<?> wildcardClass16 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService1.viewCart();
        java.lang.String str9 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        main.java.CartService cartService15 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList16 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        cartData0.addItem("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartService9.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        java.lang.String str12 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }
}

