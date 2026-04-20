import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = cartService1.viewCart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.java.CartData.getItems()\" because \"this.cartData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass2 = cartService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        main.java.CartData cartData0 = new main.java.CartData();
        java.lang.Class<?> wildcardClass1 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.lang.Class<?> wildcardClass3 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass4 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("");
        java.lang.Class<?> wildcardClass4 = cartService1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Item name cannot be empty." + "'", str3, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = cartService1.addToCart("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.java.CartData.addItem(String)\" because \"this.cartData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass6 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass7 = cartService6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("");
        java.lang.Class<?> wildcardClass8 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = cartService1.viewCart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.java.CartData.getItems()\" because \"this.cartData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Item name cannot be empty." + "'", str3, "Item name cannot be empty.");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass7 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass2 = cartService1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.lang.String str11 = cartService5.addToCart("hi! added to cart.");
        java.lang.Class<?> wildcardClass12 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.Class<?> wildcardClass7 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass2 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass5 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.lang.Class<?> wildcardClass2 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass5 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass5 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartService5.viewCart();
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.Class<?> wildcardClass4 = cartService1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
        java.lang.Class<?> wildcardClass12 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.lang.Class<?> wildcardClass4 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("");
        java.lang.String str5 = cartService1.addToCart("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList6 = cartService1.viewCart();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.java.CartData.getItems()\" because \"this.cartData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Item name cannot be empty." + "'", str3, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
        java.lang.Class<?> wildcardClass15 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.lang.Class<?> wildcardClass6 = cartService1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass5 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.lang.Class<?> wildcardClass5 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart.");
        java.lang.Class<?> wildcardClass13 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass7 = cartService6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartService3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("");
        java.lang.Class<?> wildcardClass10 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartService4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart." + "'", str7, "hi! added to cart.");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass5 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        java.lang.String str13 = cartService8.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart." + "'", str13, "hi! added to cart.");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.lang.Class<?> wildcardClass6 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass5 = cartService4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService6.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        java.lang.Class<?> wildcardClass14 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.Class<?> wildcardClass13 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.lang.String str7 = cartService1.addToCart("");
        java.lang.String str9 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass7 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass4 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartService2.viewCart();
        java.lang.Class<?> wildcardClass4 = cartService2.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass7 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass7 = cartService6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.String str7 = cartService3.addToCart("hi!");
        java.lang.Class<?> wildcardClass8 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart." + "'", str7, "hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService6.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.String str10 = cartService7.addToCart("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService7.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass5 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi!");
        java.lang.String str11 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.Class<?> wildcardClass15 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        java.lang.String str13 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass5 = cartService1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        java.lang.String str16 = cartService4.addToCart("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty." + "'", str16, "Item name cannot be empty.");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService6.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass7 = cartService6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartService4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str17 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        java.lang.String str17 = cartService5.addToCart("");
        java.lang.Class<?> wildcardClass18 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty." + "'", str13, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty." + "'", str17, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.lang.Class<?> wildcardClass15 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass13 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        java.lang.String str16 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart." + "'", str10, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str16, "Item name cannot be empty. added to cart. added to cart.");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        java.lang.String str15 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("");
        java.lang.String str5 = cartService1.addToCart("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.java.CartData.addItem(String)\" because \"this.cartData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Item name cannot be empty." + "'", str3, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.util.List<java.lang.String> strList18 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass19 = cartService5.getClass();
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
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        java.lang.String str8 = cartService4.addToCart("hi!");
        java.lang.Class<?> wildcardClass9 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.lang.String str4 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str6 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartService1.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str4, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        java.lang.Class<?> wildcardClass15 = cartService5.getClass();
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
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.lang.Class<?> wildcardClass13 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass10 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass5 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        java.lang.String str16 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.lang.String str5 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.lang.String str16 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.util.List<java.lang.String> strList7 = cartService1.viewCart();
        java.lang.String str9 = cartService1.addToCart("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart." + "'", str9, "Item name cannot be empty. added to cart.");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass6 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.lang.String str12 = cartService4.addToCart("hi!");
        java.util.List<java.lang.String> strList13 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart." + "'", str12, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass7 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi!");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.String str12 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.lang.String str7 = cartService3.addToCart("hi!");
        java.lang.String str9 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart." + "'", str7, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        main.java.CartData cartData0 = null;
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.java.CartData.addItem(String)\" because \"this.cartData\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str14 = cartService4.addToCart("Item name cannot be empty. added to cart.");
        java.lang.Class<?> wildcardClass15 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str11 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.util.List<java.lang.String> strList6 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass4 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi!");
        java.lang.String str11 = cartService6.addToCart("hi!");
        java.lang.String str13 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart." + "'", str11, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService3.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi!");
        java.lang.Class<?> wildcardClass7 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart." + "'", str6, "hi! added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.lang.String str17 = cartService5.addToCart("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart." + "'", str15, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty." + "'", str17, "Item name cannot be empty.");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("");
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList10 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        java.lang.String str17 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi!");
        java.lang.String str11 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.lang.Class<?> wildcardClass15 = cartService14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService4.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.Class<?> wildcardClass16 = cartService13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart." + "'", str10, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartService5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.lang.Class<?> wildcardClass15 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList14 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        java.lang.Class<?> wildcardClass15 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str13 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService4.viewCart();
        java.lang.String str13 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str14 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.lang.Class<?> wildcardClass17 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass12 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty." + "'", str7, "Item name cannot be empty.");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.util.List<java.lang.String> strList7 = cartService4.viewCart();
        java.lang.String str9 = cartService4.addToCart("hi! added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.lang.Class<?> wildcardClass3 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        java.lang.String str15 = cartService13.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        java.lang.String str17 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass7 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.lang.Class<?> wildcardClass7 = strList6.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService1.viewCart();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.util.List<java.lang.String> strList15 = cartService12.viewCart();
        java.lang.String str17 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str10 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.String str9 = cartService5.addToCart("");
        java.lang.Class<?> wildcardClass10 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty." + "'", str9, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        java.lang.Class<?> wildcardClass16 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartService9.viewCart();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty.");
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService5.viewCart();
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.String str15 = cartService13.addToCart("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart.");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        java.lang.String str13 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        java.lang.String str14 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        java.util.List<java.lang.String> strList13 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService7.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.util.List<java.lang.String> strList7 = cartService1.viewCart();
        java.util.List<java.lang.String> strList8 = cartService1.viewCart();
        java.util.List<java.lang.String> strList9 = cartService1.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService5.addToCart("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass4 = cartService3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.util.List<java.lang.String> strList17 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Item name cannot be empty. added to cart." + "'", str16, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        java.lang.Class<?> wildcardClass15 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart." + "'", str10, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart." + "'", str12, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.lang.String str13 = cartService10.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        java.lang.String str16 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass9 = cartService4.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str6, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        java.lang.Class<?> wildcardClass6 = strList5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartService1.viewCart();
        java.util.List<java.lang.String> strList3 = cartService1.viewCart();
        java.lang.String str5 = cartService1.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.lang.String str10 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.util.List<java.lang.String> strList18 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("hi!");
        java.lang.String str10 = cartService5.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.lang.Class<?> wildcardClass16 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        java.util.List<java.lang.String> strList17 = cartService16.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("hi!");
        java.lang.String str11 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str9 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass10 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass10 = cartService9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart.");
        java.lang.String str14 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass15 = strList14.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass8 = cartService3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi!");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        java.lang.String str12 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart." + "'", str9, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.String str12 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList13 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.lang.Class<?> wildcardClass16 = strList15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty." + "'", str13, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartService7.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("");
        java.lang.String str8 = cartService3.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.lang.String str17 = cartService15.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.Class<?> wildcardClass18 = cartService16.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        java.util.List<java.lang.String> strList17 = cartService12.viewCart();
        java.lang.Class<?> wildcardClass18 = cartService12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.lang.String str3 = cartService1.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList4 = cartService1.viewCart();
        java.util.List<java.lang.String> strList5 = cartService1.viewCart();
        java.util.List<java.lang.String> strList6 = cartService1.viewCart();
        java.lang.String str8 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str10 = cartService1.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService1.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! added to cart. added to cart." + "'", str3, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        java.lang.Class<?> wildcardClass5 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList9 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty." + "'", str8, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.util.List<java.lang.String> strList13 = cartService10.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        cartData0.addItem("hi!");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        java.lang.String str18 = cartService16.addToCart("Item name cannot be empty.");
        java.lang.Class<?> wildcardClass19 = cartService16.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart." + "'", str18, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.util.List<java.lang.String> strList5 = cartService3.viewCart();
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.lang.Class<?> wildcardClass7 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        java.util.List<java.lang.String> strList15 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.Class<?> wildcardClass19 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        java.lang.String str16 = cartService14.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str16, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartService8.viewCart();
        java.lang.String str11 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart.");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.String str13 = cartService11.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        java.lang.Class<?> wildcardClass20 = cartService16.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str19, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.String str10 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService7.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.Class<?> wildcardClass19 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty.");
        java.lang.Class<?> wildcardClass10 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart." + "'", str9, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        java.lang.Class<?> wildcardClass11 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("hi!");
        java.util.List<java.lang.String> strList6 = cartService3.viewCart();
        java.lang.String str8 = cartService3.addToCart("");
        java.lang.String str10 = cartService3.addToCart("Item name cannot be empty.");
        java.lang.String str12 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! added to cart." + "'", str5, "hi! added to cart.");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty." + "'", str8, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart." + "'", str10, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.Class<?> wildcardClass8 = cartService6.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart.");
        java.lang.String str12 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList13 = cartService8.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass3 = cartService2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        java.lang.Class<?> wildcardClass15 = cartService14.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        java.util.List<java.lang.String> strList13 = cartService9.viewCart();
        java.lang.Class<?> wildcardClass14 = strList13.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.lang.Class<?> wildcardClass12 = strList11.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartService6.viewCart();
        java.lang.String str9 = cartService6.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService6.viewCart();
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        java.util.List<java.lang.String> strList14 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.String str13 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("hi! added to cart.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.lang.String str18 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("Item name cannot be empty.");
        java.lang.String str8 = cartService4.addToCart("hi! added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.util.List<java.lang.String> strList10 = cartService4.viewCart();
        java.lang.Class<?> wildcardClass11 = strList10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty. added to cart." + "'", str6, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        java.lang.Class<?> wildcardClass10 = strList9.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList3 = cartService2.viewCart();
        java.util.List<java.lang.String> strList4 = cartService2.viewCart();
        java.util.List<java.lang.String> strList5 = cartService2.viewCart();
        java.lang.Class<?> wildcardClass6 = cartService2.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.lang.Class<?> wildcardClass16 = cartService15.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        main.java.CartService cartService2 = new main.java.CartService(cartData0);
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass5 = strList4.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.Class<?> wildcardClass14 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        java.lang.Class<?> wildcardClass16 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty." + "'", str13, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.lang.String str6 = cartService4.addToCart("");
        java.lang.String str8 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList9 = cartService4.viewCart();
        java.lang.String str11 = cartService4.addToCart("hi!");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart." + "'", str11, "hi! added to cart.");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.util.List<java.lang.String> strList7 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.lang.String str15 = cartService13.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList11 = cartService10.viewCart();
        java.lang.String str13 = cartService10.addToCart("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        java.lang.String str15 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty." + "'", str13, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        java.lang.String str18 = cartService4.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Item name cannot be empty." + "'", str6, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty." + "'", str14, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart." + "'", str18, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass11 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList14 = cartService13.viewCart();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.lang.String str15 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartService3.viewCart();
        java.lang.String str6 = cartService3.addToCart("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList7 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str6, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("");
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList18 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList18);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.Class<?> wildcardClass13 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart.");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("Item name cannot be empty.");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        java.lang.Class<?> wildcardClass13 = strList12.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass9 = cartService8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.lang.Class<?> wildcardClass18 = cartService5.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart." + "'", str8, "Item name cannot be empty. added to cart.");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! added to cart. added to cart." + "'", str11, "hi! added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str13, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        java.util.List<java.lang.String> strList13 = cartService12.viewCart();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartService7.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService7.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("hi!");
        java.lang.String str10 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart." + "'", str8, "hi! added to cart.");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList11 = cartData0.getItems();
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.String str14 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str14, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        cartData0.addItem("hi!");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart.");
        java.lang.String str9 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass11 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty." + "'", str5, "Item name cannot be empty.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.util.List<java.lang.String> strList10 = cartService7.viewCart();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.String str9 = cartService7.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str11 = cartService7.addToCart("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str9, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty." + "'", str11, "Item name cannot be empty.");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        main.java.CartService cartService10 = new main.java.CartService(cartData0);
        java.lang.String str12 = cartService10.addToCart("");
        java.lang.Class<?> wildcardClass13 = cartService10.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty." + "'", str12, "Item name cannot be empty.");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        cartData0.addItem("hi!");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartService11.viewCart();
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.Class<?> wildcardClass12 = cartService11.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.String str17 = cartService12.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str15, "hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str17, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartData0.getItems();
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass8 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList12 = cartData0.getItems();
        main.java.CartService cartService13 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        cartData0.addItem("");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService9 = new main.java.CartService(cartData0);
        java.lang.String str11 = cartService9.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str13 = cartService9.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str11, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str13, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("");
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList9 = cartData0.getItems();
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService12 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass13 = cartData0.getClass();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.lang.String str7 = cartService5.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService5.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        main.java.CartService cartService16 = new main.java.CartService(cartData0);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("");
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        cartData0.addItem("hi!");
        java.util.List<java.lang.String> strList7 = cartData0.getItems();
        main.java.CartService cartService8 = new main.java.CartService(cartData0);
        java.lang.String str10 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.lang.String str12 = cartService8.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str10, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str12, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        main.java.CartData cartData0 = new main.java.CartData();
        java.util.List<java.lang.String> strList1 = cartData0.getItems();
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass4 = cartService3.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList6 = cartService5.viewCart();
        java.lang.String str8 = cartService5.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList4 = cartData0.getItems();
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        main.java.CartService cartService7 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList8 = cartData0.getItems();
        java.lang.Class<?> wildcardClass9 = strList8.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        java.lang.String str5 = cartService3.addToCart("Item name cannot be empty. added to cart. added to cart.");
        java.lang.String str7 = cartService3.addToCart("hi! added to cart. added to cart. added to cart. added to cart. added to cart.");
        java.util.List<java.lang.String> strList8 = cartService3.viewCart();
        java.lang.Class<?> wildcardClass9 = cartService3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart." + "'", str5, "Item name cannot be empty. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str7, "hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        main.java.CartData cartData0 = new main.java.CartData();
        cartData0.addItem("");
        java.util.List<java.lang.String> strList3 = cartData0.getItems();
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList5 = cartData0.getItems();
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        java.lang.String str8 = cartService6.addToCart("Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart." + "'", str8, "Item name cannot be empty. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        main.java.CartService cartService4 = new main.java.CartService(cartData0);
        main.java.CartService cartService5 = new main.java.CartService(cartData0);
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        main.java.CartService cartService11 = new main.java.CartService(cartData0);
        java.lang.Class<?> wildcardClass12 = cartData0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        main.java.CartData cartData0 = new main.java.CartData();
        main.java.CartService cartService1 = new main.java.CartService(cartData0);
        java.util.List<java.lang.String> strList2 = cartData0.getItems();
        main.java.CartService cartService3 = new main.java.CartService(cartData0);
        cartData0.addItem("hi! added to cart.");
        main.java.CartService cartService6 = new main.java.CartService(cartData0);
        cartData0.addItem("Item name cannot be empty.");
        cartData0.addItem("hi! added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart. added to cart.");
        org.junit.Assert.assertNotNull(strList2);
    }
}

