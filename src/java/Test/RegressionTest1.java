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
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getStreet();
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        java.lang.String str29 = order28.getOrderId();
        java.util.List<example.model.CartItem> cartItemList30 = order28.getItems();
        example.model.Order order33 = new example.model.Order("ORD-1775916890225", address19, cartItemList30, (double) (byte) -1, "");
        example.model.Address address34 = order33.getAddress();
        java.lang.String str35 = address34.getFullName();
        java.lang.String str36 = address34.getFullName();
        java.lang.String str37 = address34.getPhone();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "1) test0501(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916933806" + "'", str29, "ORD-1775916933806");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.lang.String str14 = order12.getOrderId();
        example.model.Address address15 = order12.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
// flaky "2) test0502(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916933838" + "'", str14, "ORD-1775916933838");
        org.junit.Assert.assertNull(address15);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        example.model.Address address6 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        java.lang.String str7 = address6.getPhone();
        example.model.Address address14 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address16 = null;
        example.model.Address address18 = null;
        example.model.CartItem[] cartItemArray19 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList20 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList20, cartItemArray19);
        example.model.Order order24 = new example.model.Order("", address18, (java.util.List<example.model.CartItem>) cartItemList20, 1.0d, "");
        example.model.Order order27 = new example.model.Order("ORD-1775916886212", address16, (java.util.List<example.model.CartItem>) cartItemList20, 1.0d, "ORD-1775916886040");
        example.model.Order order30 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address14, (java.util.List<example.model.CartItem>) cartItemList20, (double) (short) 0, "ORD-1775916903429");
        example.model.Order order33 = new example.model.Order("ORD-1775916909184", address6, (java.util.List<example.model.CartItem>) cartItemList20, (double) (byte) 1, "ORD-1775916903519");
        example.service.OrderService.printReceipt(order33);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916897292" + "'", str7, "ORD-1775916897292");
        org.junit.Assert.assertNotNull(cartItemArray19);
        org.junit.Assert.assertArrayEquals(cartItemArray19, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(order30);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        int int10 = cartItem9.getQuantity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.getPhone();
        java.lang.String str20 = address18.getStreet();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        example.model.Address address5 = new example.model.Address("ORD-1775916907064", "", "\ud83d\udcde PAID", "", "ORD-1775916923344");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916926466");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        example.service.OrderService.printReceipt(order13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity((int) (byte) 1);
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.Product product15 = cartItem14.getProduct();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(product15);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getStreet();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getStreet();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = new example.model.Order("ORD-1775916894811", address7, (java.util.List<example.model.CartItem>) cartItemList16, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address27 = order26.getAddress();
        java.lang.String str28 = address27.toString();
        example.model.Address address35 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str36 = address35.getCountry();
        java.lang.String str37 = address35.getStreet();
        example.model.Address address39 = null;
        example.model.Address address41 = null;
        example.model.CartItem[] cartItemArray42 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList43 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList43, cartItemArray42);
        example.model.Order order47 = new example.model.Order("", address41, (java.util.List<example.model.CartItem>) cartItemList43, 1.0d, "");
        example.model.Order order50 = new example.model.Order("ORD-1775916886212", address39, (java.util.List<example.model.CartItem>) cartItemList43, 1.0d, "ORD-1775916886040");
        example.model.Order order53 = new example.model.Order("ORD-1775916893369", address35, (java.util.List<example.model.CartItem>) cartItemList43, (double) 52, "2026-04-11 17:14:52");
        example.model.Order order56 = new example.model.Order("ORD-1775916921154", address27, (java.util.List<example.model.CartItem>) cartItemList43, (double) (short) 10, "ORD-1775916907064");
        double double57 = order56.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(address27);
// flaky "3) test0511(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916886212" + "'", str36, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray42);
        org.junit.Assert.assertArrayEquals(cartItemArray42, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        example.service.CartService.removeProduct("ORD-1775916894406");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getOrderId();
        double double12 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "4) test0513(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916934573" + "'", str8, "ORD-1775916934573");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "1) test0513(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916934573" + "'", str11, "ORD-1775916934573");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:48", "2026-04-11 17:15:03", "2026-04-11 17:14:52", (double) 100L);
        double double5 = product4.getPrice();
        double double6 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        java.lang.String str13 = order7.getStatus();
        java.lang.String str14 = order7.getCreatedAt();
        java.lang.String str15 = order7.getCustomerEmail();
        example.model.Address address16 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "5) test0515(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916934665" + "'", str8, "ORD-1775916934665");
// flaky "2) test0515(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916934665" + "'", str9, "ORD-1775916934665");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
// flaky "1) test0515(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:34" + "'", str14, "2026-04-11 17:15:34");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(address16);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        int int7 = cartItem6.getQuantity();
        double double8 = cartItem6.getSubtotal();
        example.model.Product product9 = cartItem6.getProduct();
        java.lang.String str10 = product9.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address23 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str24 = address23.getStreet();
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = example.service.OrderService.createOrder("ORD-1775916887036", address23, (java.util.List<example.model.CartItem>) cartItemList26, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order33 = new example.model.Order("2026-04-11 17:14:48", address16, (java.util.List<example.model.CartItem>) cartItemList26, 0.0d, "ORD-1775916900332");
        example.model.Order order36 = new example.model.Order("ORD-1775916896848", address6, (java.util.List<example.model.CartItem>) cartItemList26, (double) (-1), "ORD-1775916927832");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916886212" + "'", str24, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(order30);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.Address address12 = null;
        example.model.CartItem[] cartItemArray13 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList14 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList14, cartItemArray13);
        example.model.Order order18 = new example.model.Order("", address12, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "");
        example.model.Order order21 = new example.model.Order("ORD-1775916886212", address10, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "ORD-1775916886040");
        example.model.Order order24 = new example.model.Order("ORD-1775916893369", address6, (java.util.List<example.model.CartItem>) cartItemList14, (double) 52, "2026-04-11 17:14:52");
        java.lang.String str25 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getPhone();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getPhone();
        java.lang.String str11 = address7.getFullName();
        java.lang.String str12 = address7.getFullName();
        java.lang.String str13 = address7.getPhone();
        example.model.Address address15 = null;
        example.model.CartItem[] cartItemArray16 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList17 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList17, cartItemArray16);
        example.model.Order order21 = new example.model.Order("", address15, (java.util.List<example.model.CartItem>) cartItemList17, 1.0d, "");
        java.lang.String str22 = order21.getOrderId();
        java.util.List<example.model.CartItem> cartItemList23 = order21.getItems();
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916896848", address7, cartItemList23, (double) 97, "2026-04-11 17:14:50  x1  = $-1.00");
        java.lang.String str27 = address7.toString();
        example.model.Address address34 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str35 = address34.getStreet();
        example.model.CartItem[] cartItemArray36 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList37 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList37, cartItemArray36);
        example.model.Order order41 = example.service.OrderService.createOrder("ORD-1775916887036", address34, (java.util.List<example.model.CartItem>) cartItemList37, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str42 = order41.getStatus();
        example.service.OrderService.printReceipt(order41);
        java.lang.String str44 = order41.getStatus();
        java.util.List<example.model.CartItem> cartItemList45 = order41.getItems();
        example.model.Order order48 = example.service.OrderService.createOrder("ORD-1775916905708", address7, cartItemList45, (double) (byte) 1, "ORD-1775916904907");
        java.lang.String str49 = address7.getFullName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886212" + "'", str13, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray16);
        org.junit.Assert.assertArrayEquals(cartItemArray16, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "6) test0519(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916935107" + "'", str22, "ORD-1775916935107");
        org.junit.Assert.assertNotNull(cartItemList23);
        org.junit.Assert.assertNotNull(order26);
// flaky "3) test0519(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str27, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916886212" + "'", str35, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray36);
        org.junit.Assert.assertArrayEquals(cartItemArray36, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(order41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PAID" + "'", str42, "PAID");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PAID" + "'", str44, "PAID");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        cartItem6.setQuantity((int) 'a');
        java.lang.String str9 = cartItem6.toString();
        example.model.Product product10 = cartItem6.getProduct();
        example.model.Product product11 = cartItem6.getProduct();
        java.lang.String str12 = product11.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749    x97  = $97.00" + "'", str9, "ORD-1775916890749    x97  = $97.00");
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str12, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.service.CartService.addProduct(product4, 0);
        example.service.CartService.addProduct(product4, (int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:15:10", "ORD-1775916905708", "ORD-1775916888257", "2026-04-11 17:14:56", "ORD-1775916895316");
        java.lang.String str6 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:15:10" + "'", str6, "2026-04-11 17:15:10");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getStreet();
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        java.lang.String str29 = order28.getOrderId();
        java.util.List<example.model.CartItem> cartItemList30 = order28.getItems();
        example.model.Order order33 = new example.model.Order("ORD-1775916890225", address19, cartItemList30, (double) (byte) -1, "");
        java.lang.String str34 = order33.getOrderId();
        java.lang.String str35 = order33.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "7) test0524(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916935354" + "'", str29, "ORD-1775916935354");
        org.junit.Assert.assertNotNull(cartItemList30);
// flaky "4) test0524(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916935354" + "'", str34, "ORD-1775916935354");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PAID" + "'", str35, "PAID");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.getId();
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, 52);
        cartItem10.setQuantity(10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890749" + "'", str6, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916889515" + "'", str8, "ORD-1775916889515");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        java.lang.String str5 = product4.getId();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916891615" + "'", str5, "ORD-1775916891615");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892828" + "'", str6, "ORD-1775916892828");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892828" + "'", str7, "ORD-1775916892828");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        example.model.Product product0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.service.CartService.addProduct(product0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        example.service.CartService.removeProduct("ORD-1775916912894");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        cartItem6.setQuantity((int) 'a');
        java.lang.String str9 = cartItem6.toString();
        int int10 = cartItem6.getQuantity();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749    x97  = $97.00" + "'", str9, "ORD-1775916890749    x97  = $97.00");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916890142");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        example.model.Product product9 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "8) test0532(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916935656" + "'", str8, "ORD-1775916935656");
// flaky "5) test0532(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916935656" + "'", str9, "ORD-1775916935656");
        org.junit.Assert.assertNull(address10);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:15:02", "ORD-1775916914723", "ORD-1775916905829", (double) 52);
        java.lang.String str5 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:15:02" + "'", str5, "2026-04-11 17:15:02");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        java.lang.String str13 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "9) test0534(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916935720" + "'", str8, "ORD-1775916935720");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "6) test0534(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:35" + "'", str11, "2026-04-11 17:15:35");
        org.junit.Assert.assertNotNull(cartItemList12);
// flaky "2) test0534(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916935720" + "'", str13, "ORD-1775916935720");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        example.model.Product product4 = new example.model.Product("ORD-1775916907467", "ORD-1775916917204", "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)", (double) ' ');
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getStreet();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getStreet();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = new example.model.Order("ORD-1775916894811", address7, (java.util.List<example.model.CartItem>) cartItemList16, (double) 1.0f, "ORD-1775916894327");
        java.lang.String str27 = address7.getStreet();
        java.lang.String str28 = address7.toString();
        example.model.Address address37 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str38 = address37.getCountry();
        java.lang.String str39 = address37.getStreet();
        java.util.List<example.model.CartItem> cartItemList40 = example.service.CartService.getCart();
        example.model.Order order43 = new example.model.Order("ORD-1775916887934", address37, cartItemList40, (double) 97, "ORD-1775916889159");
        example.model.Address address50 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str51 = address50.getStreet();
        example.model.CartItem[] cartItemArray52 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList53 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList53, cartItemArray52);
        example.model.Order order57 = example.service.OrderService.createOrder("ORD-1775916887036", address50, (java.util.List<example.model.CartItem>) cartItemList53, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order60 = new example.model.Order("ORD-1775916894327", address37, (java.util.List<example.model.CartItem>) cartItemList53, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address67 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str68 = address67.getCountry();
        java.lang.String str69 = address67.getStreet();
        example.model.Address address71 = null;
        example.model.CartItem[] cartItemArray72 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList73 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList73, cartItemArray72);
        example.model.Order order77 = new example.model.Order("", address71, (java.util.List<example.model.CartItem>) cartItemList73, 1.0d, "");
        example.model.Order order80 = example.service.OrderService.createOrder("ORD-1775916888151", address67, (java.util.List<example.model.CartItem>) cartItemList73, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order83 = new example.model.Order("ORD-1775916887934", address37, (java.util.List<example.model.CartItem>) cartItemList73, (double) 100, "ORD-1775916892053");
        example.model.Order order86 = example.service.OrderService.createOrder("ORD-1775916901311", address7, (java.util.List<example.model.CartItem>) cartItemList73, (double) 1, "ORD-1775916912855");
        java.lang.String str87 = address7.getCountry();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
// flaky "10) test0536(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916886212" + "'", str38, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList40);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ORD-1775916886212" + "'", str51, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray52);
        org.junit.Assert.assertArrayEquals(cartItemArray52, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(order57);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ORD-1775916886212" + "'", str68, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ORD-1775916886212" + "'", str69, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray72);
        org.junit.Assert.assertArrayEquals(cartItemArray72, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(order80);
        org.junit.Assert.assertNotNull(order86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ORD-1775916886212" + "'", str87, "ORD-1775916886212");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        java.lang.String str19 = order17.getPaymentIntentId();
        example.service.OrderService.printReceipt(order17);
        java.lang.String str21 = order17.getPaymentIntentId();
        example.model.Address address22 = order17.getAddress();
        java.lang.String str23 = address22.getStreet();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(address22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getFullName();
        java.lang.String str11 = address6.getFullName();
        java.lang.String str12 = address6.getPhone();
        example.model.Address address20 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str21 = address20.getStreet();
        java.lang.String str22 = address20.getFullName();
        java.lang.String str23 = address20.getStreet();
        example.model.Address address25 = null;
        example.model.Address address27 = null;
        example.model.CartItem[] cartItemArray28 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList29 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList29, cartItemArray28);
        example.model.Order order33 = new example.model.Order("", address27, (java.util.List<example.model.CartItem>) cartItemList29, 1.0d, "");
        example.model.Order order36 = new example.model.Order("ORD-1775916886212", address25, (java.util.List<example.model.CartItem>) cartItemList29, 1.0d, "ORD-1775916886040");
        example.model.Order order39 = new example.model.Order("ORD-1775916894811", address20, (java.util.List<example.model.CartItem>) cartItemList29, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address40 = order39.getAddress();
        java.lang.String str41 = address40.getPhone();
        example.model.Address address49 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str50 = address49.getPhone();
        java.lang.String str51 = address49.getFullName();
        java.lang.String str52 = address49.getPhone();
        example.model.Address address59 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str60 = address59.getCountry();
        java.lang.String str61 = address59.getStreet();
        example.model.Address address63 = null;
        example.model.CartItem[] cartItemArray64 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList65 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList65, cartItemArray64);
        example.model.Order order69 = new example.model.Order("", address63, (java.util.List<example.model.CartItem>) cartItemList65, 1.0d, "");
        example.model.Order order72 = example.service.OrderService.createOrder("ORD-1775916888151", address59, (java.util.List<example.model.CartItem>) cartItemList65, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order75 = example.service.OrderService.createOrder("ORD-1775916887228", address49, (java.util.List<example.model.CartItem>) cartItemList65, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address77 = null;
        example.model.CartItem[] cartItemArray78 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList79 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList79, cartItemArray78);
        example.model.Order order83 = new example.model.Order("", address77, (java.util.List<example.model.CartItem>) cartItemList79, 1.0d, "");
        java.lang.String str84 = order83.getOrderId();
        java.lang.String str85 = order83.getOrderId();
        java.util.List<example.model.CartItem> cartItemList86 = order83.getItems();
        example.model.Order order89 = example.service.OrderService.createOrder("ORD-1775916891135", address49, cartItemList86, (double) 0L, "ORD-1775916886040");
        example.model.Order order92 = new example.model.Order("ORD-1775916894406", address40, cartItemList86, (double) 'a', "ORD-1775916905114");
        java.util.List<example.model.CartItem> cartItemList93 = order92.getItems();
        example.model.Order order96 = example.service.OrderService.createOrder("ORD-1775916904159", address6, cartItemList93, (double) (byte) -1, "ORD-1775916914931");
        java.lang.String str97 = order96.getOrderId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916886212" + "'", str12, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray28);
        org.junit.Assert.assertArrayEquals(cartItemArray28, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(address40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ORD-1775916886212" + "'", str41, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916886212" + "'", str50, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ORD-1775916886212" + "'", str52, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ORD-1775916886212" + "'", str60, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ORD-1775916886212" + "'", str61, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray64);
        org.junit.Assert.assertArrayEquals(cartItemArray64, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(order72);
        org.junit.Assert.assertNotNull(order75);
        org.junit.Assert.assertNotNull(cartItemArray78);
        org.junit.Assert.assertArrayEquals(cartItemArray78, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
// flaky "11) test0538(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ORD-1775916935853" + "'", str84, "ORD-1775916935853");
// flaky "7) test0538(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str85 + "' != '" + "ORD-1775916935853" + "'", str85, "ORD-1775916935853");
        org.junit.Assert.assertNotNull(cartItemList86);
        org.junit.Assert.assertNotNull(order89);
        org.junit.Assert.assertNotNull(cartItemList93);
        org.junit.Assert.assertNotNull(order96);
// flaky "3) test0538(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str97 + "' != '" + "ORD-1775916935853" + "'", str97, "ORD-1775916935853");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        example.model.Address address6 = new example.model.Address("ORD-1775916886212", "ORD-1775916909947", "ORD-1775916902074", "2026-04-11 17:14:51", "ORD-1775916892904");
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = new example.model.Order("2026-04-11 17:14:47", address15, (java.util.List<example.model.CartItem>) cartItemList19, (double) (-1.0f), "");
        example.model.Address address27 = order26.getAddress();
        java.lang.String str28 = address27.getStreet();
        example.model.Address address30 = null;
        example.model.CartItem[] cartItemArray31 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList32 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList32, cartItemArray31);
        example.model.Order order36 = new example.model.Order("", address30, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "");
        java.lang.String str37 = order36.getOrderId();
        java.util.List<example.model.CartItem> cartItemList38 = order36.getItems();
        example.model.Order order41 = new example.model.Order("ORD-1775916890225", address27, cartItemList38, (double) (byte) -1, "");
        example.model.Address address43 = null;
        example.model.Address address45 = null;
        example.model.CartItem[] cartItemArray46 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList47 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList47, cartItemArray46);
        example.model.Order order51 = new example.model.Order("", address45, (java.util.List<example.model.CartItem>) cartItemList47, 1.0d, "");
        example.model.Order order54 = new example.model.Order("ORD-1775916886212", address43, (java.util.List<example.model.CartItem>) cartItemList47, 1.0d, "ORD-1775916886040");
        java.lang.String str55 = order54.getPaymentIntentId();
        double double56 = order54.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList57 = order54.getItems();
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916899981", address27, cartItemList57, (double) 1, "ORD-1775916889159");
        example.model.Order order63 = new example.model.Order("ORD-1775916898608", address6, cartItemList57, (double) 1, "2026-04-11 17:15:02");
        double double64 = order63.getTotalAmount();
        java.lang.String str65 = order63.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "12) test0539(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916935890" + "'", str37, "ORD-1775916935890");
        org.junit.Assert.assertNotNull(cartItemList38);
        org.junit.Assert.assertNotNull(cartItemArray46);
        org.junit.Assert.assertArrayEquals(cartItemArray46, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916886040" + "'", str55, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList57);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 1.0d + "'", double64 == 1.0d);
// flaky "8) test0539(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "2026-04-11 17:15:35" + "'", str65, "2026-04-11 17:15:35");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getId();
        example.service.CartService.addProduct(product4, (int) ' ');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916888257" + "'", str7, "ORD-1775916888257");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        java.lang.String str9 = product8.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916889515" + "'", str9, "ORD-1775916889515");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916893211");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        example.model.Product product4 = new example.model.Product("ORD-1775916888578", "2026-04-11 17:14:55", "ORD-1775916891772", 35.0d);
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.toString();
        java.lang.String str7 = product4.getName();
        java.lang.String str8 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)" + "'", str5, "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)" + "'", str6, "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:55" + "'", str7, "2026-04-11 17:14:55");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)" + "'", str8, "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        java.lang.String str19 = order17.getPaymentIntentId();
        example.service.OrderService.printReceipt(order17);
        java.lang.String str21 = order17.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PAID" + "'", str21, "PAID");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
        java.lang.String str11 = order7.getCustomerEmail();
        double double12 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "13) test0545(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916936275" + "'", str8, "ORD-1775916936275");
// flaky "9) test0545(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916936275" + "'", str9, "ORD-1775916936275");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        example.model.Product product4 = new example.model.Product("ORD-1775916905596", "ORD-1775916908948", "", (double) 100.0f);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        example.model.Product product9 = cartItem2.getProduct();
        example.model.Product product10 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertNull(product10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        java.lang.String str13 = order7.getStatus();
        java.lang.String str14 = order7.getCreatedAt();
        java.lang.String str15 = order7.getCustomerEmail();
        java.lang.String str16 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "14) test0548(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916936421" + "'", str8, "ORD-1775916936421");
// flaky "10) test0548(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916936421" + "'", str9, "ORD-1775916936421");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
// flaky "4) test0548(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:36" + "'", str14, "2026-04-11 17:15:36");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        int int9 = cartItem8.getQuantity();
        cartItem8.setQuantity((int) (byte) 10);
        double double12 = cartItem8.getSubtotal();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        example.service.CartService.removeProduct("ORD-1775916933088");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        java.lang.String str19 = address7.getPhone();
        example.model.Address address21 = null;
        example.model.CartItem[] cartItemArray22 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList23 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList23, cartItemArray22);
        example.model.Order order27 = new example.model.Order("", address21, (java.util.List<example.model.CartItem>) cartItemList23, 1.0d, "");
        example.model.Order order30 = example.service.OrderService.createOrder("ORD-1775916889159", address7, (java.util.List<example.model.CartItem>) cartItemList23, (double) 1, "2026-04-11 17:14:52");
        java.lang.String str31 = order30.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order30);
// flaky "15) test0551(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2026-04-11 17:15:36" + "'", str31, "2026-04-11 17:15:36");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        example.model.Address address5 = new example.model.Address("ORD-1775916911090", "ORD-1775916905654", "ORD-1775916916999", "ORD-1775916936116", "ORD-1775916893323");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916894811", address6, (java.util.List<example.model.CartItem>) cartItemList15, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address26 = order25.getAddress();
        java.util.List<example.model.CartItem> cartItemList27 = order25.getItems();
        double double28 = order25.getTotalAmount();
        java.lang.String str29 = order25.getStatus();
        java.util.List<example.model.CartItem> cartItemList30 = order25.getItems();
        java.lang.String str31 = order25.getOrderId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertNotNull(cartItemList27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PAID" + "'", str29, "PAID");
        org.junit.Assert.assertNotNull(cartItemList30);
// flaky "16) test0553(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916936773" + "'", str31, "ORD-1775916936773");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        java.lang.String str13 = product4.getDescription();
        java.lang.String str14 = product4.getId();
        example.model.CartItem cartItem16 = new example.model.CartItem(product4, 1);
        example.model.Product product17 = cartItem16.getProduct();
        cartItem16.setQuantity(0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertNotNull(product17);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = product4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde ORD-1775916886212] 2026-04-11 17:14:50  - $1.00  (ORD-1775916889693)", "ORD-1775916935853", "ORD-1775916903429", 1.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        example.model.Address address9 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str10 = address9.getPhone();
        java.lang.String str11 = address9.getFullName();
        java.lang.String str12 = address9.getPhone();
        example.model.Address address19 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str20 = address19.getCountry();
        java.lang.String str21 = address19.getStreet();
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = example.service.OrderService.createOrder("ORD-1775916888151", address19, (java.util.List<example.model.CartItem>) cartItemList25, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order35 = example.service.OrderService.createOrder("ORD-1775916887228", address9, (java.util.List<example.model.CartItem>) cartItemList25, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address37 = null;
        example.model.CartItem[] cartItemArray38 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList39 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList39, cartItemArray38);
        example.model.Order order43 = new example.model.Order("", address37, (java.util.List<example.model.CartItem>) cartItemList39, 1.0d, "");
        java.lang.String str44 = order43.getOrderId();
        java.lang.String str45 = order43.getOrderId();
        java.util.List<example.model.CartItem> cartItemList46 = order43.getItems();
        example.model.Order order49 = example.service.OrderService.createOrder("ORD-1775916891135", address9, cartItemList46, (double) 0L, "ORD-1775916886040");
        example.model.Address address57 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address59 = null;
        example.model.CartItem[] cartItemArray60 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList61 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList61, cartItemArray60);
        example.model.Order order65 = new example.model.Order("", address59, (java.util.List<example.model.CartItem>) cartItemList61, 1.0d, "");
        example.model.Order order68 = new example.model.Order("2026-04-11 17:14:47", address57, (java.util.List<example.model.CartItem>) cartItemList61, (double) (-1.0f), "");
        example.model.Address address69 = order68.getAddress();
        java.lang.String str70 = address69.getStreet();
        example.model.Address address72 = null;
        example.model.CartItem[] cartItemArray73 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList74 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList74, cartItemArray73);
        example.model.Order order78 = new example.model.Order("", address72, (java.util.List<example.model.CartItem>) cartItemList74, 1.0d, "");
        java.lang.String str79 = order78.getOrderId();
        java.util.List<example.model.CartItem> cartItemList80 = order78.getItems();
        example.model.Order order83 = new example.model.Order("ORD-1775916890225", address69, cartItemList80, (double) (byte) -1, "");
        example.model.Order order86 = new example.model.Order("", address9, cartItemList80, (double) 0L, "ORD-1775916887494");
        example.model.Address address88 = null;
        example.model.CartItem[] cartItemArray89 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList90 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList90, cartItemArray89);
        example.model.Order order94 = new example.model.Order("", address88, (java.util.List<example.model.CartItem>) cartItemList90, 1.0d, "");
        example.model.Order order97 = new example.model.Order("ORD-1775916894246", address9, (java.util.List<example.model.CartItem>) cartItemList90, (double) (byte) 10, "ORD-1775916895316");
        example.model.Address address98 = order97.getAddress();
        java.lang.String str99 = address98.getPhone();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916886212" + "'", str12, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(order32);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertNotNull(cartItemArray38);
        org.junit.Assert.assertArrayEquals(cartItemArray38, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "17) test0557(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916936937" + "'", str44, "ORD-1775916936937");
// flaky "11) test0557(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916936937" + "'", str45, "ORD-1775916936937");
        org.junit.Assert.assertNotNull(cartItemList46);
        org.junit.Assert.assertNotNull(order49);
        org.junit.Assert.assertNotNull(cartItemArray60);
        org.junit.Assert.assertArrayEquals(cartItemArray60, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(address69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ORD-1775916886212" + "'", str70, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray73);
        org.junit.Assert.assertArrayEquals(cartItemArray73, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
// flaky "5) test0557(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916936937" + "'", str79, "ORD-1775916936937");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(address98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "ORD-1775916886212" + "'", str99, "ORD-1775916886212");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        example.model.Product product12 = cartItem9.getProduct();
        cartItem9.setQuantity((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertNotNull(product12);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = product4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916901033");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = cartItem2.getClass();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        java.lang.String str5 = product4.getId();
        java.lang.String str6 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) 10);
        java.lang.String str9 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916892568" + "'", str5, "ORD-1775916892568");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)" + "'", str6, "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916891335" + "'", str9, "ORD-1775916891335");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
        double double11 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "18) test0563(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916937270" + "'", str8, "ORD-1775916937270");
// flaky "12) test0563(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916937270" + "'", str9, "ORD-1775916937270");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        example.model.Address address9 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str10 = address9.getPhone();
        java.lang.String str11 = address9.getFullName();
        java.lang.String str12 = address9.getPhone();
        example.model.Address address19 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str20 = address19.getCountry();
        java.lang.String str21 = address19.getStreet();
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = example.service.OrderService.createOrder("ORD-1775916888151", address19, (java.util.List<example.model.CartItem>) cartItemList25, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order35 = example.service.OrderService.createOrder("ORD-1775916887228", address9, (java.util.List<example.model.CartItem>) cartItemList25, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address37 = null;
        example.model.CartItem[] cartItemArray38 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList39 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList39, cartItemArray38);
        example.model.Order order43 = new example.model.Order("", address37, (java.util.List<example.model.CartItem>) cartItemList39, 1.0d, "");
        java.lang.String str44 = order43.getOrderId();
        java.lang.String str45 = order43.getOrderId();
        java.util.List<example.model.CartItem> cartItemList46 = order43.getItems();
        example.model.Order order49 = example.service.OrderService.createOrder("ORD-1775916891135", address9, cartItemList46, (double) 0L, "ORD-1775916886040");
        example.model.Address address57 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address59 = null;
        example.model.CartItem[] cartItemArray60 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList61 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList61, cartItemArray60);
        example.model.Order order65 = new example.model.Order("", address59, (java.util.List<example.model.CartItem>) cartItemList61, 1.0d, "");
        example.model.Order order68 = new example.model.Order("2026-04-11 17:14:47", address57, (java.util.List<example.model.CartItem>) cartItemList61, (double) (-1.0f), "");
        example.model.Address address69 = order68.getAddress();
        java.lang.String str70 = address69.getStreet();
        example.model.Address address72 = null;
        example.model.CartItem[] cartItemArray73 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList74 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList74, cartItemArray73);
        example.model.Order order78 = new example.model.Order("", address72, (java.util.List<example.model.CartItem>) cartItemList74, 1.0d, "");
        java.lang.String str79 = order78.getOrderId();
        java.util.List<example.model.CartItem> cartItemList80 = order78.getItems();
        example.model.Order order83 = new example.model.Order("ORD-1775916890225", address69, cartItemList80, (double) (byte) -1, "");
        example.model.Order order86 = new example.model.Order("", address9, cartItemList80, (double) 0L, "ORD-1775916887494");
        example.model.Address address88 = null;
        example.model.CartItem[] cartItemArray89 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList90 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList90, cartItemArray89);
        example.model.Order order94 = new example.model.Order("", address88, (java.util.List<example.model.CartItem>) cartItemList90, 1.0d, "");
        example.model.Order order97 = new example.model.Order("ORD-1775916894246", address9, (java.util.List<example.model.CartItem>) cartItemList90, (double) (byte) 10, "ORD-1775916895316");
        example.model.Address address98 = order97.getAddress();
        java.lang.String str99 = order97.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916886212" + "'", str12, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(order32);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertNotNull(cartItemArray38);
        org.junit.Assert.assertArrayEquals(cartItemArray38, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "19) test0564(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916937364" + "'", str44, "ORD-1775916937364");
// flaky "13) test0564(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916937364" + "'", str45, "ORD-1775916937364");
        org.junit.Assert.assertNotNull(cartItemList46);
        org.junit.Assert.assertNotNull(order49);
        org.junit.Assert.assertNotNull(cartItemArray60);
        org.junit.Assert.assertArrayEquals(cartItemArray60, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(address69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ORD-1775916886212" + "'", str70, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray73);
        org.junit.Assert.assertArrayEquals(cartItemArray73, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
// flaky "6) test0564(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916937364" + "'", str79, "ORD-1775916937364");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(address98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "PAID" + "'", str99, "PAID");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916894327");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        example.model.Product product5 = cartItem2.getProduct();
        example.model.Product product6 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getCountry();
        java.lang.String str10 = address8.getStreet();
        java.util.List<example.model.CartItem> cartItemList11 = example.service.CartService.getCart();
        example.model.Order order14 = new example.model.Order("ORD-1775916887934", address8, cartItemList11, (double) 97, "ORD-1775916889159");
        example.model.Address address21 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str22 = address21.getStreet();
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916887036", address21, (java.util.List<example.model.CartItem>) cartItemList24, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order31 = new example.model.Order("ORD-1775916894327", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address38 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str39 = address38.getCountry();
        java.lang.String str40 = address38.getStreet();
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        example.model.Order order51 = example.service.OrderService.createOrder("ORD-1775916888151", address38, (java.util.List<example.model.CartItem>) cartItemList44, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order54 = new example.model.Order("ORD-1775916887934", address8, (java.util.List<example.model.CartItem>) cartItemList44, (double) 100, "ORD-1775916892053");
        java.lang.String str55 = address8.getFullName();
        java.lang.String str56 = address8.getStreet();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order28);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(order51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886212" + "'", str56, "ORD-1775916886212");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        example.model.Product product12 = cartItem9.getProduct();
        example.service.CartService.addProduct(product12, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertNotNull(product12);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        double double11 = product4.getPrice();
        java.lang.String str12 = product4.getId();
        java.lang.String str13 = product4.getId();
        double double14 = product4.getPrice();
        java.lang.String str15 = product4.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916888257" + "'", str13, "ORD-1775916888257");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:14:50" + "'", str15, "2026-04-11 17:14:50");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str17 = address16.getCountry();
        java.lang.String str18 = address16.getStreet();
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916888151", address16, (java.util.List<example.model.CartItem>) cartItemList22, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order32 = example.service.OrderService.createOrder("ORD-1775916887228", address6, (java.util.List<example.model.CartItem>) cartItemList22, (double) (byte) 1, "2026-04-11 17:14:49");
        java.lang.String str33 = address6.toString();
        java.lang.String str34 = address6.getPhone();
        java.lang.String str35 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertNotNull(order32);
// flaky "20) test0570(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str33, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916886212" + "'", str34, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        example.model.Address address5 = new example.model.Address("ORD-1775916907784", "ORD-1775916887611", "ORD-1775916915800", "ORD-1775916886212", "ORD-1775916934258");
        java.lang.String str6 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        example.model.Product product10 = cartItem8.getProduct();
        int int11 = cartItem8.getQuantity();
        double double12 = cartItem8.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str16 = address15.getStreet();
        java.lang.String str17 = address15.getCountry();
        java.lang.String str18 = address15.getPhone();
        java.lang.String str19 = address15.getFullName();
        example.model.Address address26 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str27 = address26.getCountry();
        java.lang.String str28 = address26.getStreet();
        java.util.List<example.model.CartItem> cartItemList29 = example.service.CartService.getCart();
        example.model.Order order32 = new example.model.Order("ORD-1775916887934", address26, cartItemList29, (double) 97, "ORD-1775916889159");
        example.model.Order order35 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address15, cartItemList29, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order38 = new example.model.Order("ORD-1775916895909", address6, cartItemList29, (double) 'a', "ORD-1775916887934");
        example.model.Address address39 = order38.getAddress();
        java.lang.String str40 = order38.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList29);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertNotNull(address39);
// flaky "21) test0573(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2026-04-11 17:15:37" + "'", str40, "2026-04-11 17:15:37");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.lang.String str14 = order12.getPaymentIntentId();
        double double15 = order12.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList16 = order12.getItems();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886040" + "'", str14, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList16);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        java.lang.String str13 = order7.getCreatedAt();
        java.lang.String str14 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "22) test0575(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916937840" + "'", str8, "ORD-1775916937840");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "14) test0575(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916937840" + "'", str11, "ORD-1775916937840");
        org.junit.Assert.assertNotNull(cartItemList12);
// flaky "7) test0575(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:37" + "'", str13, "2026-04-11 17:15:37");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        example.service.CartService.removeProduct("ORD-1775916911372");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str17 = address16.getCountry();
        java.lang.String str18 = address16.getStreet();
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916888151", address16, (java.util.List<example.model.CartItem>) cartItemList22, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order32 = example.service.OrderService.createOrder("ORD-1775916887228", address6, (java.util.List<example.model.CartItem>) cartItemList22, (double) (byte) 1, "2026-04-11 17:14:49");
        java.lang.String str33 = order32.getOrderId();
        java.lang.String str34 = order32.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertNotNull(order32);
// flaky "23) test0577(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916937974" + "'", str33, "ORD-1775916937974");
// flaky "15) test0577(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2026-04-11 17:15:37" + "'", str34, "2026-04-11 17:15:37");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getFullName();
        java.lang.String str11 = address6.getFullName();
        java.lang.String str12 = address6.getPhone();
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        java.lang.String str21 = order20.getOrderId();
        java.util.List<example.model.CartItem> cartItemList22 = order20.getItems();
        example.model.Order order25 = example.service.OrderService.createOrder("ORD-1775916896848", address6, cartItemList22, (double) 97, "2026-04-11 17:14:50  x1  = $-1.00");
        java.lang.String str26 = address6.toString();
        java.lang.String str27 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916886212" + "'", str12, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "24) test0578(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916938037" + "'", str21, "ORD-1775916938037");
        org.junit.Assert.assertNotNull(cartItemList22);
        org.junit.Assert.assertNotNull(order25);
// flaky "16) test0578(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str26, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        java.lang.String str13 = product4.getDescription();
        java.lang.String str14 = product4.getId();
        java.lang.String str15 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        example.model.Address address5 = new example.model.Address("ORD-1775916887036", "ORD-1775916936773", "ORD-1775916936937", "ORD-1775916905596", "ORD-1775916935354");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, 0);
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 0);
        double double13 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        java.lang.String str15 = order13.getOrderId();
        example.model.Address address16 = order13.getAddress();
        example.model.Address address17 = order13.getAddress();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
// flaky "25) test0582(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916938275" + "'", str15, "ORD-1775916938275");
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(address17);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        example.service.CartService.addProduct(product4, 52);
        java.lang.String str9 = product4.getId();
        java.lang.String str10 = product4.getName();
        java.lang.String str11 = product4.toString();
        java.lang.Class<?> wildcardClass12 = product4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916889515" + "'", str9, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749" + "'", str10, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str11, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        example.model.Product product4 = new example.model.Product("ORD-1775916897371", "ORD-1775916892568", "ORD-1775916893369", (double) 10);
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916897371] ORD-1775916892568    - $10.00  (ORD-1775916893369)" + "'", str5, "[ORD-1775916897371] ORD-1775916892568    - $10.00  (ORD-1775916893369)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916893369" + "'", str6, "ORD-1775916893369");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.Address address12 = null;
        example.model.CartItem[] cartItemArray13 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList14 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList14, cartItemArray13);
        example.model.Order order18 = new example.model.Order("", address12, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "");
        example.model.Order order21 = new example.model.Order("ORD-1775916886212", address10, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "ORD-1775916886040");
        example.model.Order order24 = new example.model.Order("ORD-1775916893369", address6, (java.util.List<example.model.CartItem>) cartItemList14, (double) 52, "2026-04-11 17:14:52");
        java.lang.String str25 = address6.getPhone();
        java.lang.String str26 = address6.getCity();
        java.lang.String str27 = address6.getCountry();
        java.lang.String str28 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
// flaky "26) test0585(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        example.model.Address address7 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str8 = address7.getFullName();
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = example.service.OrderService.createOrder("ORD-1775916903896", address7, (java.util.List<example.model.CartItem>) cartItemList12, (double) 0L, "ORD-1775916904159");
        example.model.Address address26 = new example.model.Address("ORD-1775916906473", "ORD-1775916897371", "ORD-1775916888578", "ORD-1775916898989", "2026-04-11 17:15:03");
        example.model.Address address28 = null;
        example.model.CartItem[] cartItemArray29 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList30 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList30, cartItemArray29);
        example.model.Order order34 = new example.model.Order("", address28, (java.util.List<example.model.CartItem>) cartItemList30, 1.0d, "");
        java.lang.String str35 = order34.getOrderId();
        example.model.Address address36 = order34.getAddress();
        java.lang.String str37 = order34.getCreatedAt();
        java.lang.String str38 = order34.getCreatedAt();
        example.model.Address address39 = order34.getAddress();
        java.lang.String str40 = order34.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList41 = order34.getItems();
        example.model.Order order44 = new example.model.Order("2026-04-11 17:14:49", address26, cartItemList41, (double) '4', "ORD-1775916900020");
        example.model.Order order47 = new example.model.Order("ORD-1775916918123", address7, cartItemList41, (double) (byte) -1, "ORD-1775916906793");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916892121" + "'", str8, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
        org.junit.Assert.assertNotNull(cartItemArray29);
        org.junit.Assert.assertArrayEquals(cartItemArray29, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky "27) test0586(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916938489" + "'", str35, "ORD-1775916938489");
        org.junit.Assert.assertNull(address36);
// flaky "17) test0586(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2026-04-11 17:15:38" + "'", str37, "2026-04-11 17:15:38");
// flaky "8) test0586(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2026-04-11 17:15:38" + "'", str38, "2026-04-11 17:15:38");
        org.junit.Assert.assertNull(address39);
// flaky "1) test0586(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "2026-04-11 17:15:38" + "'", str40, "2026-04-11 17:15:38");
        org.junit.Assert.assertNotNull(cartItemList41);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        java.lang.String str14 = order7.getCustomerEmail();
        java.lang.String str15 = order7.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "28) test0587(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916938536" + "'", str8, "ORD-1775916938536");
        org.junit.Assert.assertNull(address9);
// flaky "18) test0587(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:38" + "'", str10, "2026-04-11 17:15:38");
// flaky "9) test0587(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:38" + "'", str11, "2026-04-11 17:15:38");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) 10);
        int int7 = cartItem6.getQuantity();
        int int8 = cartItem6.getQuantity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        double double11 = order7.getTotalAmount();
        java.lang.String str12 = order7.getCreatedAt();
        double double13 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "29) test0589(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916938616" + "'", str8, "ORD-1775916938616");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
// flaky "19) test0589(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:15:38" + "'", str12, "2026-04-11 17:15:38");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getStatus();
        java.lang.String str13 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "30) test0590(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916938704" + "'", str8, "ORD-1775916938704");
// flaky "20) test0590(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916938704" + "'", str9, "ORD-1775916938704");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916894811", address6, (java.util.List<example.model.CartItem>) cartItemList15, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address26 = order25.getAddress();
        java.lang.String str27 = address26.toString();
        java.lang.String str28 = address26.getFullName();
        java.lang.String str29 = address26.getPhone();
        java.lang.String str30 = address26.getCity();
        java.lang.String str31 = address26.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
// flaky "31) test0591(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str27, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 1);
        example.model.Product product6 = cartItem2.getProduct();
        java.lang.Class<?> wildcardClass7 = cartItem2.getClass();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        example.model.Product product4 = new example.model.Product("ORD-1775916891335", "ORD-1775916893211", "ORD-1775916892121", (double) 100.0f);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.toString();
        java.lang.String str7 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916892121" + "'", str5, "ORD-1775916892121");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ORD-1775916891335] ORD-1775916893211    - $100.00  (ORD-1775916892121)" + "'", str6, "[ORD-1775916891335] ORD-1775916893211    - $100.00  (ORD-1775916892121)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916893211" + "'", str7, "ORD-1775916893211");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        int int7 = cartItem6.getQuantity();
        double double8 = cartItem6.getSubtotal();
        int int9 = cartItem6.getQuantity();
        java.lang.String str10 = cartItem6.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str10, "ORD-1775916890749    x1  = $1.00");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getFullName();
        example.model.Address address17 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str18 = address17.getCountry();
        java.lang.String str19 = address17.getStreet();
        java.util.List<example.model.CartItem> cartItemList20 = example.service.CartService.getCart();
        example.model.Order order23 = new example.model.Order("ORD-1775916887934", address17, cartItemList20, (double) 97, "ORD-1775916889159");
        example.model.Order order26 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address6, cartItemList20, (double) '#', "2026-04-11 17:14:48");
        java.lang.String str27 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        java.lang.String str8 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916891335" + "'", str8, "ORD-1775916891335");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        example.model.Address address21 = null;
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = new example.model.Order("ORD-1775916886212", address21, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "ORD-1775916886040");
        example.model.Order order35 = new example.model.Order("ORD-1775916892053", address19, (java.util.List<example.model.CartItem>) cartItemList25, (double) 10, "ORD-1775916887494");
        java.lang.String str36 = order35.getOrderId();
        double double37 = order35.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "32) test0597(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916939080" + "'", str36, "ORD-1775916939080");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getPhone();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getPhone();
        java.lang.String str11 = address7.toString();
        example.model.Address address13 = null;
        example.model.Address address15 = null;
        example.model.CartItem[] cartItemArray16 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList17 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList17, cartItemArray16);
        example.model.Order order21 = new example.model.Order("", address15, (java.util.List<example.model.CartItem>) cartItemList17, 1.0d, "");
        example.model.Order order24 = new example.model.Order("ORD-1775916886212", address13, (java.util.List<example.model.CartItem>) cartItemList17, 1.0d, "ORD-1775916886040");
        example.model.Order order27 = example.service.OrderService.createOrder("ORD-1775916889159", address7, (java.util.List<example.model.CartItem>) cartItemList17, (double) 100L, "ORD-1775916887611");
        java.lang.String str28 = address7.getCountry();
        java.lang.String str29 = address7.getPhone();
        java.lang.String str30 = address7.getPhone();
        java.lang.String str31 = address7.getFullName();
        example.model.Address address33 = null;
        example.model.CartItem[] cartItemArray34 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList35 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList35, cartItemArray34);
        example.model.Order order39 = new example.model.Order("", address33, (java.util.List<example.model.CartItem>) cartItemList35, 1.0d, "");
        java.lang.String str40 = order39.getOrderId();
        example.model.Address address41 = order39.getAddress();
        java.lang.String str42 = order39.getCreatedAt();
        java.lang.String str43 = order39.getCreatedAt();
        example.model.Address address44 = order39.getAddress();
        double double45 = order39.getTotalAmount();
        java.lang.String str46 = order39.getPaymentIntentId();
        example.model.Address address47 = order39.getAddress();
        java.util.List<example.model.CartItem> cartItemList48 = order39.getItems();
        example.model.Order order51 = example.service.OrderService.createOrder("ORD-1775916915941", address7, cartItemList48, (double) 97, "ORD-1775916932519");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
// flaky "33) test0598(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str11, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray16);
        org.junit.Assert.assertArrayEquals(cartItemArray16, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(cartItemArray34);
        org.junit.Assert.assertArrayEquals(cartItemArray34, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "21) test0598(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916939114" + "'", str40, "ORD-1775916939114");
        org.junit.Assert.assertNull(address41);
// flaky "10) test0598(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2026-04-11 17:15:39" + "'", str42, "2026-04-11 17:15:39");
// flaky "2) test0598(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2026-04-11 17:15:39" + "'", str43, "2026-04-11 17:15:39");
        org.junit.Assert.assertNull(address44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(address47);
        org.junit.Assert.assertNotNull(cartItemList48);
        org.junit.Assert.assertNotNull(order51);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) (byte) 10);
        double double13 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "34) test0600(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916939206" + "'", str8, "ORD-1775916939206");
        org.junit.Assert.assertNull(address9);
// flaky "22) test0600(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:39" + "'", str10, "2026-04-11 17:15:39");
// flaky "11) test0600(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:39" + "'", str11, "2026-04-11 17:15:39");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str11 = product4.getName();
        java.lang.String str12 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:50" + "'", str11, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:52", "ORD-1775916897292", "ORD-1775916894246", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        example.service.CartService.addProduct(product4, 10);
        example.service.CartService.addProduct(product4, (int) (byte) 1);
        java.lang.String str10 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916894246" + "'", str5, "ORD-1775916894246");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:52" + "'", str10, "2026-04-11 17:14:52");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) '4');
        java.lang.String str15 = product4.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916888257" + "'", str15, "ORD-1775916888257");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList11 = order7.getItems();
        java.lang.String str12 = order7.getPaymentIntentId();
        java.lang.String str13 = order7.getCustomerEmail();
        java.lang.String str14 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "35) test0604(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916939408" + "'", str8, "ORD-1775916939408");
        org.junit.Assert.assertNull(address9);
// flaky "23) test0604(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:39" + "'", str10, "2026-04-11 17:15:39");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "12) test0604(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:39" + "'", str14, "2026-04-11 17:15:39");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916889159", address6, (java.util.List<example.model.CartItem>) cartItemList16, (double) 100L, "ORD-1775916887611");
        java.lang.String str27 = order26.getOrderId();
        java.lang.String str28 = order26.getOrderId();
        example.service.OrderService.printReceipt(order26);
        java.lang.String str30 = order26.getOrderId();
        java.lang.String str31 = order26.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "36) test0605(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "24) test0605(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916939467" + "'", str27, "ORD-1775916939467");
// flaky "13) test0605(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916939467" + "'", str28, "ORD-1775916939467");
// flaky "3) test0605(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916939467" + "'", str30, "ORD-1775916939467");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916887611" + "'", str31, "ORD-1775916887611");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        example.model.Address address5 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str6 = address5.getFullName();
        java.lang.String str7 = address5.getStreet();
        java.lang.String str8 = address5.getCountry();
        java.lang.String str9 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892121" + "'", str6, "ORD-1775916892121");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916891938" + "'", str7, "ORD-1775916891938");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-04-11 17:14:53" + "'", str8, "2026-04-11 17:14:53");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916892121" + "'", str9, "ORD-1775916892121");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getCountry();
        java.lang.String str9 = address7.getStreet();
        java.util.List<example.model.CartItem> cartItemList10 = example.service.CartService.getCart();
        example.model.Order order13 = new example.model.Order("ORD-1775916887934", address7, cartItemList10, (double) 97, "ORD-1775916889159");
        example.model.Address address21 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str22 = address21.getCountry();
        java.lang.String str23 = address21.getStreet();
        java.util.List<example.model.CartItem> cartItemList24 = example.service.CartService.getCart();
        example.model.Order order27 = new example.model.Order("ORD-1775916887934", address21, cartItemList24, (double) 97, "ORD-1775916889159");
        example.model.Address address34 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str35 = address34.getStreet();
        example.model.CartItem[] cartItemArray36 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList37 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList37, cartItemArray36);
        example.model.Order order41 = example.service.OrderService.createOrder("ORD-1775916887036", address34, (java.util.List<example.model.CartItem>) cartItemList37, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order44 = new example.model.Order("ORD-1775916894327", address21, (java.util.List<example.model.CartItem>) cartItemList37, (double) (short) -1, "ORD-1775916892828");
        example.model.Order order47 = example.service.OrderService.createOrder("2026-04-11 17:15:06", address7, (java.util.List<example.model.CartItem>) cartItemList37, 0.0d, "ORD-1775916910414");
        java.lang.String str48 = order47.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916886212" + "'", str35, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray36);
        org.junit.Assert.assertArrayEquals(cartItemArray36, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(order41);
        org.junit.Assert.assertNotNull(order47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2026-04-11 17:15:06" + "'", str48, "2026-04-11 17:15:06");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        int int7 = cartItem6.getQuantity();
        cartItem6.setQuantity((-1));
        int int10 = cartItem6.getQuantity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = example.service.OrderService.createOrder("ORD-1775916888151", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) ' ', "2026-04-11 17:14:48");
        java.lang.String str20 = address6.getCountry();
        java.lang.String str21 = address6.getCity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        example.model.Address address5 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.getFullName();
// flaky "37) test0610(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916897292" + "'", str6, "\ud83d\udcde ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886040" + "'", str7, "ORD-1775916886040");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        example.model.Product product4 = new example.model.Product("ORD-1775916932618", "ORD-1775916933715", "ORD-1775916911372", (double) (short) 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) -1);
        int int7 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getPhone();
        java.lang.String str11 = address6.getCity();
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        java.lang.String str20 = order19.getOrderId();
        example.model.Address address21 = order19.getAddress();
        java.lang.String str22 = order19.getStatus();
        java.lang.String str23 = order19.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList24 = order19.getItems();
        example.model.Order order27 = example.service.OrderService.createOrder("ORD-1775916928800", address6, cartItemList24, (double) 10.0f, "ORD-1775916921769");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "38) test0613(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916939825" + "'", str20, "ORD-1775916939825");
        org.junit.Assert.assertNull(address21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PAID" + "'", str22, "PAID");
// flaky "25) test0613(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2026-04-11 17:15:39" + "'", str23, "2026-04-11 17:15:39");
        org.junit.Assert.assertNotNull(cartItemList24);
        org.junit.Assert.assertNotNull(order27);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916933152");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        example.model.Product product4 = new example.model.Product("ORD-1775916920328", "ORD-1775916898186", "ORD-1775916896888", (double) 1L);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        example.model.Address address9 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str10 = address9.getCountry();
        java.lang.String str11 = address9.getStreet();
        java.util.List<example.model.CartItem> cartItemList12 = example.service.CartService.getCart();
        example.model.Order order15 = new example.model.Order("ORD-1775916887934", address9, cartItemList12, (double) 97, "ORD-1775916889159");
        example.model.Address address22 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str23 = address22.getStreet();
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916887036", address22, (java.util.List<example.model.CartItem>) cartItemList25, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order32 = new example.model.Order("ORD-1775916894327", address9, (java.util.List<example.model.CartItem>) cartItemList25, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address39 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str40 = address39.getCountry();
        java.lang.String str41 = address39.getStreet();
        example.model.Address address43 = null;
        example.model.CartItem[] cartItemArray44 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList45 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList45, cartItemArray44);
        example.model.Order order49 = new example.model.Order("", address43, (java.util.List<example.model.CartItem>) cartItemList45, 1.0d, "");
        example.model.Order order52 = example.service.OrderService.createOrder("ORD-1775916888151", address39, (java.util.List<example.model.CartItem>) cartItemList45, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order55 = new example.model.Order("ORD-1775916887934", address9, (java.util.List<example.model.CartItem>) cartItemList45, (double) 100, "ORD-1775916892053");
        java.lang.String str56 = address9.getStreet();
        example.model.Address address58 = null;
        example.model.Address address60 = null;
        example.model.CartItem[] cartItemArray61 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList62 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList62, cartItemArray61);
        example.model.Order order66 = new example.model.Order("", address60, (java.util.List<example.model.CartItem>) cartItemList62, 1.0d, "");
        example.model.Order order69 = new example.model.Order("ORD-1775916886212", address58, (java.util.List<example.model.CartItem>) cartItemList62, 1.0d, "ORD-1775916886040");
        java.lang.String str70 = order69.getPaymentIntentId();
        double double71 = order69.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList72 = order69.getItems();
        example.model.Order order75 = new example.model.Order("2026-04-11 17:14:47", address9, cartItemList72, (double) (short) 1, "ORD-1775916892828");
        java.lang.String str76 = address9.getCity();
        java.lang.String str77 = address9.getCity();
        java.lang.String str78 = address9.getCity();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ORD-1775916886212" + "'", str41, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray44);
        org.junit.Assert.assertArrayEquals(cartItemArray44, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(order52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886212" + "'", str56, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray61);
        org.junit.Assert.assertArrayEquals(cartItemArray61, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ORD-1775916886040" + "'", str70, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getCountry();
        java.lang.String str10 = address8.getStreet();
        java.util.List<example.model.CartItem> cartItemList11 = example.service.CartService.getCart();
        example.model.Order order14 = new example.model.Order("ORD-1775916887934", address8, cartItemList11, (double) 97, "ORD-1775916889159");
        example.model.Address address21 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str22 = address21.getStreet();
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916887036", address21, (java.util.List<example.model.CartItem>) cartItemList24, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order31 = new example.model.Order("ORD-1775916894327", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address38 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str39 = address38.getCountry();
        java.lang.String str40 = address38.getStreet();
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        example.model.Order order51 = example.service.OrderService.createOrder("ORD-1775916888151", address38, (java.util.List<example.model.CartItem>) cartItemList44, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order54 = new example.model.Order("ORD-1775916887934", address8, (java.util.List<example.model.CartItem>) cartItemList44, (double) 100, "ORD-1775916892053");
        double double55 = order54.getTotalAmount();
        java.lang.String str56 = order54.getStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order28);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(order51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PAID" + "'", str56, "PAID");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        example.service.CartService.removeProduct("ORD-1775916911624");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916889159", address6, (java.util.List<example.model.CartItem>) cartItemList16, (double) 100L, "ORD-1775916887611");
        example.service.OrderService.printReceipt(order26);
        java.lang.String str28 = order26.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "39) test0620(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "26) test0620(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2026-04-11 17:15:40" + "'", str28, "2026-04-11 17:15:40");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        double double9 = product4.getPrice();
        java.lang.String str10 = product4.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("ORD-1775916886212", address8, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "ORD-1775916886040");
        example.model.Order order22 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) (short) 0, "ORD-1775916903429");
        java.lang.String str23 = address6.toString();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order22);
// flaky "40) test0622(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str23, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        java.lang.String str9 = product4.toString();
        java.lang.Class<?> wildcardClass10 = product4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        example.model.Product product4 = new example.model.Product("ORD-1775916905596", "ORD-1775916894406", "ORD-1775916904664", (double) '#');
        example.service.CartService.addProduct(product4, (int) (short) 100);
        java.lang.String str7 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916905596" + "'", str7, "ORD-1775916905596");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916889159", address6, (java.util.List<example.model.CartItem>) cartItemList16, (double) 100L, "ORD-1775916887611");
        java.lang.String str27 = address6.getCountry();
        java.lang.String str28 = address6.getPhone();
        java.lang.String str29 = address6.getCity();
        java.lang.String str30 = address6.getStreet();
        java.lang.String str31 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "41) test0625(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
// flaky "27) test0625(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str31, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916923527");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        java.lang.String str10 = order7.getPaymentIntentId();
        java.lang.String str11 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "42) test0627(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916940688" + "'", str8, "ORD-1775916940688");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "28) test0627(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916940688" + "'", str11, "ORD-1775916940688");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getCity();
        java.lang.String str9 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        example.model.Address address5 = new example.model.Address("ORD-1775916927176", "ORD-1775916896848", "2026-04-11 17:15:35", "ORD-1775916903979", "ORD-1775916934573");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = cartItem6.toString();
        int int8 = cartItem6.getQuantity();
        double double9 = cartItem6.getSubtotal();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str7, "ORD-1775916890749    x1  = $1.00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        example.service.CartService.removeProduct("ORD-1775916915644");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        double double9 = cartItem8.getSubtotal();
        java.lang.String str10 = cartItem8.toString();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    x100  = $100.00" + "'", str10, "ORD-1775916890749    x100  = $100.00");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        java.lang.String str13 = product4.getDescription();
        java.lang.String str14 = product4.getId();
        example.model.CartItem cartItem16 = new example.model.CartItem(product4, 1);
        example.model.Product product17 = cartItem16.getProduct();
        java.lang.Class<?> wildcardClass18 = cartItem16.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertNotNull(product17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getStatus();
        example.model.Address address11 = order7.getAddress();
        java.lang.String str12 = order7.getOrderId();
        java.lang.String str13 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "43) test0635(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916941042" + "'", str8, "ORD-1775916941042");
// flaky "29) test0635(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916941042" + "'", str9, "ORD-1775916941042");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertNull(address11);
// flaky "14) test0635(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916941042" + "'", str12, "ORD-1775916941042");
// flaky "4) test0635(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:41" + "'", str13, "2026-04-11 17:15:41");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        double double12 = order7.getTotalAmount();
        double double13 = order7.getTotalAmount();
        java.lang.String str14 = order7.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList15 = order7.getItems();
        java.lang.String str16 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "44) test0637(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916941130" + "'", str8, "ORD-1775916941130");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "30) test0637(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:41" + "'", str11, "2026-04-11 17:15:41");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(cartItemList15);
// flaky "15) test0637(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-04-11 17:15:41" + "'", str16, "2026-04-11 17:15:41");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        example.model.Product product4 = new example.model.Product("ORD-1775916925054", "ORD-1775916907850", "ORD-1775916928912", (double) (short) 10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getCountry();
        java.lang.String str9 = address7.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916893369", address7, (java.util.List<example.model.CartItem>) cartItemList15, (double) 52, "2026-04-11 17:14:52");
        java.lang.String str26 = address7.getPhone();
        example.model.Address address33 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str34 = address33.getStreet();
        java.lang.String str35 = address33.getFullName();
        java.lang.String str36 = address33.getStreet();
        example.model.Address address38 = null;
        example.model.Address address40 = null;
        example.model.CartItem[] cartItemArray41 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList42 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList42, cartItemArray41);
        example.model.Order order46 = new example.model.Order("", address40, (java.util.List<example.model.CartItem>) cartItemList42, 1.0d, "");
        example.model.Order order49 = new example.model.Order("ORD-1775916886212", address38, (java.util.List<example.model.CartItem>) cartItemList42, 1.0d, "ORD-1775916886040");
        example.model.Order order52 = new example.model.Order("ORD-1775916894811", address33, (java.util.List<example.model.CartItem>) cartItemList42, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address53 = order52.getAddress();
        java.util.List<example.model.CartItem> cartItemList54 = order52.getItems();
        double double55 = order52.getTotalAmount();
        java.lang.String str56 = order52.getStatus();
        java.util.List<example.model.CartItem> cartItemList57 = order52.getItems();
        example.model.Order order60 = new example.model.Order("2026-04-11 17:15:38", address7, cartItemList57, (double) (byte) -1, "2026-04-11 17:15:07");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916886212" + "'", str26, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916886212" + "'", str34, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916886212" + "'", str36, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray41);
        org.junit.Assert.assertArrayEquals(cartItemArray41, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(address53);
        org.junit.Assert.assertNotNull(cartItemList54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PAID" + "'", str56, "PAID");
        org.junit.Assert.assertNotNull(cartItemList57);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        java.lang.String str9 = product4.getId();
        example.service.CartService.addProduct(product4, 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916892568" + "'", str9, "ORD-1775916892568");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.util.List<example.model.CartItem> cartItemList14 = order13.getItems();
        java.lang.String str15 = order13.getStatus();
        double double16 = order13.getTotalAmount();
        example.service.OrderService.printReceipt(order13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(cartItemList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        example.service.OrderService.printReceipt(order13);
        java.lang.String str16 = order13.getStatus();
        example.model.Address address17 = order13.getAddress();
        java.lang.String str18 = order13.getOrderId();
        double double19 = order13.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PAID" + "'", str16, "PAID");
        org.junit.Assert.assertNotNull(address17);
// flaky "45) test0642(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916941576" + "'", str18, "ORD-1775916941576");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        double double8 = product4.getPrice();
        java.lang.String str9 = product4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916892568" + "'", str9, "ORD-1775916892568");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        example.model.Address address13 = order7.getAddress();
        java.lang.String str14 = order7.getCreatedAt();
        java.lang.String str15 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "46) test0645(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916941776" + "'", str8, "ORD-1775916941776");
// flaky "31) test0645(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916941776" + "'", str9, "ORD-1775916941776");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(address13);
// flaky "16) test0645(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:41" + "'", str14, "2026-04-11 17:15:41");
// flaky "5) test0645(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916941776" + "'", str15, "ORD-1775916941776");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str16 = address15.getStreet();
        java.lang.String str17 = address15.getCountry();
        java.lang.String str18 = address15.getPhone();
        java.lang.String str19 = address15.getFullName();
        example.model.Address address26 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str27 = address26.getCountry();
        java.lang.String str28 = address26.getStreet();
        java.util.List<example.model.CartItem> cartItemList29 = example.service.CartService.getCart();
        example.model.Order order32 = new example.model.Order("ORD-1775916887934", address26, cartItemList29, (double) 97, "ORD-1775916889159");
        example.model.Order order35 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address15, cartItemList29, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order38 = new example.model.Order("ORD-1775916895909", address6, cartItemList29, (double) 'a', "ORD-1775916887934");
        java.lang.String str39 = address6.getCity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList29);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        double double12 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        java.lang.Class<?> wildcardClass14 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "47) test0647(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916941960" + "'", str8, "ORD-1775916941960");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "32) test0647(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:41" + "'", str11, "2026-04-11 17:15:41");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        example.service.CartService.removeProduct("ORD-1775916934706");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.Address address12 = null;
        example.model.CartItem[] cartItemArray13 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList14 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList14, cartItemArray13);
        example.model.Order order18 = new example.model.Order("", address12, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "");
        example.model.Order order21 = new example.model.Order("ORD-1775916886212", address10, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "ORD-1775916886040");
        example.model.Order order24 = new example.model.Order("ORD-1775916893369", address6, (java.util.List<example.model.CartItem>) cartItemList14, (double) 52, "2026-04-11 17:14:52");
        java.lang.String str25 = address6.getPhone();
        java.lang.String str26 = address6.getCity();
        java.lang.String str27 = address6.getCountry();
        java.lang.String str28 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        example.model.Product product4 = new example.model.Product("ORD-1775916911314", "ORD-1775916889693", "ORD-1775916905007", 100.0d);
        example.service.CartService.addProduct(product4, (int) (short) 100);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        example.model.Address address6 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        java.lang.String str7 = address6.getPhone();
        example.model.Address address14 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address16 = null;
        example.model.Address address18 = null;
        example.model.CartItem[] cartItemArray19 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList20 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList20, cartItemArray19);
        example.model.Order order24 = new example.model.Order("", address18, (java.util.List<example.model.CartItem>) cartItemList20, 1.0d, "");
        example.model.Order order27 = new example.model.Order("ORD-1775916886212", address16, (java.util.List<example.model.CartItem>) cartItemList20, 1.0d, "ORD-1775916886040");
        example.model.Order order30 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address14, (java.util.List<example.model.CartItem>) cartItemList20, (double) (short) 0, "ORD-1775916903429");
        example.model.Order order33 = new example.model.Order("ORD-1775916909184", address6, (java.util.List<example.model.CartItem>) cartItemList20, (double) (byte) 1, "ORD-1775916903519");
        double double34 = order33.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916897292" + "'", str7, "ORD-1775916897292");
        org.junit.Assert.assertNotNull(cartItemArray19);
        org.junit.Assert.assertArrayEquals(cartItemArray19, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(order30);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        example.model.Product product4 = new example.model.Product("ORD-1775916932352", "ORD-1775916911090", "ORD-1775916930720", (double) 100.0f);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        int int13 = cartItem12.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        double double12 = order7.getTotalAmount();
        java.lang.String str13 = order7.getStatus();
        java.util.List<example.model.CartItem> cartItemList14 = order7.getItems();
        java.lang.String str15 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "48) test0654(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916942436" + "'", str8, "ORD-1775916942436");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "33) test0654(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:42" + "'", str11, "2026-04-11 17:15:42");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
        org.junit.Assert.assertNotNull(cartItemList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        java.lang.Class<?> wildcardClass5 = product4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        example.model.Product product4 = new example.model.Product("ORD-1775916921769", "2026-04-11 17:14:50  x1  = $-1.00", "ORD-1775916899397", (double) 52);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        java.lang.String str14 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "49) test0657(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916942507" + "'", str8, "ORD-1775916942507");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "34) test0657(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:42" + "'", str11, "2026-04-11 17:15:42");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
// flaky "17) test0657(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:42" + "'", str14, "2026-04-11 17:15:42");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getPaymentIntentId();
        java.lang.String str13 = order7.getStatus();
        java.lang.String str14 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "50) test0658(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916942541" + "'", str8, "ORD-1775916942541");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "35) test0658(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:42" + "'", str11, "2026-04-11 17:15:42");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
// flaky "18) test0658(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:42" + "'", str14, "2026-04-11 17:15:42");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.getId();
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, 52);
        int int11 = cartItem10.getQuantity();
        java.lang.String str12 = cartItem10.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890749" + "'", str6, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916889515" + "'", str8, "ORD-1775916889515");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916890749    x52  = $52.00" + "'", str12, "ORD-1775916890749    x52  = $52.00");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        example.model.Product product5 = cartItem2.getProduct();
        cartItem2.setQuantity(52);
        int int8 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("2026-04-11 17:14:47", address8, (java.util.List<example.model.CartItem>) cartItemList12, (double) (-1.0f), "");
        java.lang.String str20 = address8.getPhone();
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        example.model.Order order31 = example.service.OrderService.createOrder("ORD-1775916889159", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) 1, "2026-04-11 17:14:52");
        java.lang.String str32 = address8.getPhone();
        example.model.Product product33 = null;
        example.model.CartItem cartItem35 = new example.model.CartItem(product33, (int) (short) 1);
        example.model.Product product36 = cartItem35.getProduct();
        example.model.Product product37 = cartItem35.getProduct();
        cartItem35.setQuantity((int) (short) -1);
        int int40 = cartItem35.getQuantity();
        example.model.Product product41 = null;
        example.model.CartItem cartItem43 = new example.model.CartItem(product41, (int) 'a');
        example.model.Product product44 = cartItem43.getProduct();
        int int45 = cartItem43.getQuantity();
        cartItem43.setQuantity((int) 'a');
        example.model.Product product48 = null;
        example.model.CartItem cartItem50 = new example.model.CartItem(product48, (int) (short) 1);
        example.model.Product product51 = cartItem50.getProduct();
        example.model.Product product52 = cartItem50.getProduct();
        example.model.Product product53 = null;
        example.model.CartItem cartItem55 = new example.model.CartItem(product53, (int) (short) 1);
        example.model.Product product56 = cartItem55.getProduct();
        cartItem55.setQuantity((int) (short) 1);
        example.model.Product product59 = null;
        example.model.CartItem cartItem61 = new example.model.CartItem(product59, (int) 'a');
        example.model.Product product62 = cartItem61.getProduct();
        int int63 = cartItem61.getQuantity();
        example.model.CartItem[] cartItemArray64 = new example.model.CartItem[] { cartItem35, cartItem43, cartItem50, cartItem55, cartItem61 };
        java.util.ArrayList<example.model.CartItem> cartItemList65 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList65, cartItemArray64);
        example.model.Order order69 = new example.model.Order("ORD-1775916886687", address8, (java.util.List<example.model.CartItem>) cartItemList65, (double) 97, "hi!");
        java.lang.String str70 = address8.getStreet();
        java.lang.String str71 = address8.toString();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916886212" + "'", str32, "ORD-1775916886212");
        org.junit.Assert.assertNull(product36);
        org.junit.Assert.assertNull(product37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(product44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNull(product51);
        org.junit.Assert.assertNull(product52);
        org.junit.Assert.assertNull(product56);
        org.junit.Assert.assertNull(product62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(cartItemArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "ORD-1775916886212" + "'", str70, "ORD-1775916886212");
// flaky "51) test0661(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str71, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) 'a');
        double double13 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        java.lang.String str19 = order17.getPaymentIntentId();
        example.service.OrderService.printReceipt(order17);
        java.lang.String str21 = order17.getPaymentIntentId();
        java.lang.String str22 = order17.getPaymentIntentId();
        double double23 = order17.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        cartItem6.setQuantity(0);
        java.lang.String str9 = cartItem6.toString();
        java.lang.String str10 = cartItem6.toString();
// flaky "52) test0664(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749    str9  = $0.00" + "'", str9, "ORD-1775916890749    str9  = $0.00");
// flaky "36) test0664(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    str10  = $0.00" + "'", str10, "ORD-1775916890749    str10  = $0.00");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        java.lang.String str10 = order7.getPaymentIntentId();
        java.lang.String str11 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "53) test0665(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916942889" + "'", str8, "ORD-1775916942889");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getCountry();
        java.lang.String str10 = address8.getStreet();
        java.util.List<example.model.CartItem> cartItemList11 = example.service.CartService.getCart();
        example.model.Order order14 = new example.model.Order("ORD-1775916887934", address8, cartItemList11, (double) 97, "ORD-1775916889159");
        example.model.Address address21 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str22 = address21.getStreet();
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916887036", address21, (java.util.List<example.model.CartItem>) cartItemList24, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order31 = new example.model.Order("ORD-1775916894327", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address38 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str39 = address38.getCountry();
        java.lang.String str40 = address38.getStreet();
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        example.model.Order order51 = example.service.OrderService.createOrder("ORD-1775916888151", address38, (java.util.List<example.model.CartItem>) cartItemList44, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order54 = new example.model.Order("ORD-1775916887934", address8, (java.util.List<example.model.CartItem>) cartItemList44, (double) 100, "ORD-1775916892053");
        java.lang.String str55 = order54.getCreatedAt();
        java.lang.String str56 = order54.getOrderId();
        example.model.Address address57 = order54.getAddress();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order28);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(order51);
// flaky "54) test0666(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2026-04-11 17:15:43" + "'", str55, "2026-04-11 17:15:43");
// flaky "37) test0666(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916943010" + "'", str56, "ORD-1775916943010");
        org.junit.Assert.assertNotNull(address57);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) '#');
        example.model.Product product13 = cartItem12.getProduct();
        int int14 = cartItem12.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(product13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        java.lang.String str10 = address6.getStreet();
        example.model.Address address17 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str18 = address17.getPhone();
        java.lang.String str19 = address17.getFullName();
        java.lang.String str20 = address17.getPhone();
        java.lang.String str21 = address17.toString();
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = new example.model.Order("ORD-1775916899079", address17, (java.util.List<example.model.CartItem>) cartItemList25, (double) 0.0f, "ORD-1775916887828");
        example.model.Order order35 = new example.model.Order("ORD-1775916887611", address6, (java.util.List<example.model.CartItem>) cartItemList25, (-35.0d), "ORD-1775916887611");
        java.lang.String str36 = order35.getPaymentIntentId();
        java.lang.String str37 = order35.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
// flaky "55) test0668(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916887611" + "'", str36, "ORD-1775916887611");
// flaky "38) test0668(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2026-04-11 17:15:43" + "'", str37, "2026-04-11 17:15:43");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, 52);
        int int10 = cartItem9.getQuantity();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890749" + "'", str6, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getFullName();
        java.lang.String str11 = address6.getFullName();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str19 = address18.getCountry();
        example.model.Address address26 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str27 = address26.getStreet();
        java.lang.String str28 = address26.getCountry();
        java.lang.String str29 = address26.getPhone();
        example.model.Address address38 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address40 = null;
        example.model.CartItem[] cartItemArray41 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList42 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList42, cartItemArray41);
        example.model.Order order46 = new example.model.Order("", address40, (java.util.List<example.model.CartItem>) cartItemList42, 1.0d, "");
        example.model.Order order49 = new example.model.Order("2026-04-11 17:14:47", address38, (java.util.List<example.model.CartItem>) cartItemList42, (double) (-1.0f), "");
        example.model.Address address50 = order49.getAddress();
        example.model.Address address52 = null;
        example.model.Address address54 = null;
        example.model.CartItem[] cartItemArray55 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList56 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList56, cartItemArray55);
        example.model.Order order60 = new example.model.Order("", address54, (java.util.List<example.model.CartItem>) cartItemList56, 1.0d, "");
        example.model.Order order63 = new example.model.Order("ORD-1775916886212", address52, (java.util.List<example.model.CartItem>) cartItemList56, 1.0d, "ORD-1775916886040");
        example.model.Order order66 = new example.model.Order("ORD-1775916892053", address50, (java.util.List<example.model.CartItem>) cartItemList56, (double) 10, "ORD-1775916887494");
        example.model.Address address68 = null;
        example.model.CartItem[] cartItemArray69 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList70 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList70, cartItemArray69);
        example.model.Order order74 = new example.model.Order("", address68, (java.util.List<example.model.CartItem>) cartItemList70, 1.0d, "");
        example.model.Order order77 = example.service.OrderService.createOrder("ORD-1775916892053", address50, (java.util.List<example.model.CartItem>) cartItemList70, 0.0d, "2026-04-11 17:14:52");
        example.model.Order order80 = example.service.OrderService.createOrder("ORD-1775916894406", address26, (java.util.List<example.model.CartItem>) cartItemList70, 35.0d, "ORD-1775916888578");
        example.model.Order order83 = example.service.OrderService.createOrder("ORD-1775916893477", address18, (java.util.List<example.model.CartItem>) cartItemList70, (double) 0, "ORD-1775916888257");
        example.model.Order order86 = new example.model.Order("", address6, (java.util.List<example.model.CartItem>) cartItemList70, (double) 0L, "[ORD-1775916898186] ORD-1775916893477    - $35.00  (ORD-1775916905829)");
        java.lang.String str87 = order86.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray41);
        org.junit.Assert.assertArrayEquals(cartItemArray41, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(address50);
        org.junit.Assert.assertNotNull(cartItemArray55);
        org.junit.Assert.assertArrayEquals(cartItemArray55, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cartItemArray69);
        org.junit.Assert.assertArrayEquals(cartItemArray69, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(order77);
        org.junit.Assert.assertNotNull(order80);
        org.junit.Assert.assertNotNull(order83);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "PAID" + "'", str87, "PAID");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        java.lang.String str13 = order7.getCreatedAt();
        java.lang.String str14 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "56) test0671(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916943260" + "'", str8, "ORD-1775916943260");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "39) test0671(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916943260" + "'", str11, "ORD-1775916943260");
        org.junit.Assert.assertNotNull(cartItemList12);
// flaky "19) test0671(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:43" + "'", str13, "2026-04-11 17:15:43");
// flaky "6) test0671(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916943260" + "'", str14, "ORD-1775916943260");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        example.model.Address address5 = new example.model.Address("ORD-1775916905829", "ORD-1775916934386", "ORD-1775916936275", "", "ORD-1775916904907");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        cartItem8.setQuantity((int) ' ');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        java.lang.String str10 = cartItem9.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    x-1  = $-1.00" + "'", str10, "ORD-1775916890749    x-1  = $-1.00");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        example.model.Address address5 = new example.model.Address("ORD-1775916891335", "ORD-1775916927345", "2026-04-11 17:14:52", "ORD-1775916911372", "ORD-1775916895446");
        java.lang.String str6 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:52" + "'", str6, "2026-04-11 17:14:52");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        example.model.Product product4 = new example.model.Product("ORD-1775916891335", "ORD-1775916893211", "ORD-1775916892121", (double) 100.0f);
        java.lang.String str5 = product4.getDescription();
        example.model.CartItem cartItem7 = new example.model.CartItem(product4, 10);
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916892121" + "'", str5, "ORD-1775916892121");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916891335" + "'", str8, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916893211" + "'", str9, "ORD-1775916893211");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        example.model.Address address6 = new example.model.Address("ORD-1775916889515", "ORD-1775916886687", "2026-04-11 17:14:48", "PAID", "ORD-1775916887036");
        java.lang.String str7 = address6.toString();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address18 = null;
        example.model.CartItem[] cartItemArray19 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList20 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList20, cartItemArray19);
        example.model.Order order24 = new example.model.Order("", address18, (java.util.List<example.model.CartItem>) cartItemList20, 1.0d, "");
        example.model.Order order27 = new example.model.Order("2026-04-11 17:14:47", address16, (java.util.List<example.model.CartItem>) cartItemList20, (double) (-1.0f), "");
        example.model.Address address28 = order27.getAddress();
        java.lang.String str29 = address28.getStreet();
        example.model.Address address31 = null;
        example.model.CartItem[] cartItemArray32 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList33 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList33, cartItemArray32);
        example.model.Order order37 = new example.model.Order("", address31, (java.util.List<example.model.CartItem>) cartItemList33, 1.0d, "");
        java.lang.String str38 = order37.getOrderId();
        java.util.List<example.model.CartItem> cartItemList39 = order37.getItems();
        example.model.Order order42 = new example.model.Order("ORD-1775916890225", address28, cartItemList39, (double) (byte) -1, "");
        example.model.Address address44 = null;
        example.model.Address address46 = null;
        example.model.CartItem[] cartItemArray47 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList48 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList48, cartItemArray47);
        example.model.Order order52 = new example.model.Order("", address46, (java.util.List<example.model.CartItem>) cartItemList48, 1.0d, "");
        example.model.Order order55 = new example.model.Order("ORD-1775916886212", address44, (java.util.List<example.model.CartItem>) cartItemList48, 1.0d, "ORD-1775916886040");
        java.lang.String str56 = order55.getPaymentIntentId();
        double double57 = order55.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList58 = order55.getItems();
        example.model.Order order61 = example.service.OrderService.createOrder("ORD-1775916899981", address28, cartItemList58, (double) 1, "ORD-1775916889159");
        example.service.OrderService.printReceipt(order61);
        java.util.List<example.model.CartItem> cartItemList63 = order61.getItems();
        example.model.Order order66 = example.service.OrderService.createOrder("", address6, cartItemList63, (double) 52, "ORD-1775916930904");
// flaky "57) test0677(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916887036" + "'", str7, "\ud83d\udcde ORD-1775916887036");
        org.junit.Assert.assertNotNull(cartItemArray19);
        org.junit.Assert.assertArrayEquals(cartItemArray19, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(address28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray32);
        org.junit.Assert.assertArrayEquals(cartItemArray32, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "40) test0677(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916943643" + "'", str38, "ORD-1775916943643");
        org.junit.Assert.assertNotNull(cartItemList39);
        org.junit.Assert.assertNotNull(cartItemArray47);
        org.junit.Assert.assertArrayEquals(cartItemArray47, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886040" + "'", str56, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList58);
        org.junit.Assert.assertNotNull(order61);
        org.junit.Assert.assertNotNull(cartItemList63);
        org.junit.Assert.assertNotNull(order66);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getStatus();
        example.model.Address address13 = order7.getAddress();
        example.model.Address address14 = order7.getAddress();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "58) test0678(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916943693" + "'", str8, "ORD-1775916943693");
// flaky "41) test0678(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916943693" + "'", str9, "ORD-1775916943693");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNull(address14);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address27 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address29 = null;
        example.model.CartItem[] cartItemArray30 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList31 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList31, cartItemArray30);
        example.model.Order order35 = new example.model.Order("", address29, (java.util.List<example.model.CartItem>) cartItemList31, 1.0d, "");
        example.model.Order order38 = new example.model.Order("2026-04-11 17:14:47", address27, (java.util.List<example.model.CartItem>) cartItemList31, (double) (-1.0f), "");
        example.model.Address address39 = order38.getAddress();
        java.lang.String str40 = address39.getStreet();
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        java.lang.String str49 = order48.getOrderId();
        java.util.List<example.model.CartItem> cartItemList50 = order48.getItems();
        example.model.Order order53 = new example.model.Order("ORD-1775916890225", address39, cartItemList50, (double) (byte) -1, "");
        example.model.Address address55 = null;
        example.model.Address address57 = null;
        example.model.CartItem[] cartItemArray58 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList59 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList59, cartItemArray58);
        example.model.Order order63 = new example.model.Order("", address57, (java.util.List<example.model.CartItem>) cartItemList59, 1.0d, "");
        example.model.Order order66 = new example.model.Order("ORD-1775916886212", address55, (java.util.List<example.model.CartItem>) cartItemList59, 1.0d, "ORD-1775916886040");
        java.lang.String str67 = order66.getPaymentIntentId();
        double double68 = order66.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList69 = order66.getItems();
        example.model.Order order72 = example.service.OrderService.createOrder("ORD-1775916899981", address39, cartItemList69, (double) 1, "ORD-1775916889159");
        example.model.Order order75 = example.service.OrderService.createOrder("ORD-1775916933715", address7, cartItemList69, (double) 0, "ORD-1775916926920");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cartItemArray30);
        org.junit.Assert.assertArrayEquals(cartItemArray30, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(address39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky "59) test0679(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ORD-1775916943727" + "'", str49, "ORD-1775916943727");
        org.junit.Assert.assertNotNull(cartItemList50);
        org.junit.Assert.assertNotNull(cartItemArray58);
        org.junit.Assert.assertArrayEquals(cartItemArray58, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ORD-1775916886040" + "'", str67, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 1.0d + "'", double68 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList69);
        org.junit.Assert.assertNotNull(order72);
        org.junit.Assert.assertNotNull(order75);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        example.model.Product product4 = new example.model.Product("ORD-1775916905596", "ORD-1775916894406", "ORD-1775916904664", (double) '#');
        example.service.CartService.addProduct(product4, (int) (short) 100);
        java.lang.String str7 = product4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916894406" + "'", str7, "ORD-1775916894406");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        example.service.CartService.removeProduct("ORD-1775916916958");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        example.model.Address address5 = new example.model.Address("ORD-1775916918328", "ORD-1775916903519", "ORD-1775916900332", "ORD-1775916892827", "ORD-1775916932519");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        int int7 = cartItem6.getQuantity();
        double double8 = cartItem6.getSubtotal();
        int int9 = cartItem6.getQuantity();
        example.model.Product product10 = cartItem6.getProduct();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(product10);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getStreet();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getStreet();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = new example.model.Order("ORD-1775916894811", address7, (java.util.List<example.model.CartItem>) cartItemList16, (double) 1.0f, "ORD-1775916894327");
        java.lang.String str27 = address7.getCity();
        example.model.Address address29 = null;
        example.model.Address address31 = null;
        example.model.CartItem[] cartItemArray32 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList33 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList33, cartItemArray32);
        example.model.Order order37 = new example.model.Order("", address31, (java.util.List<example.model.CartItem>) cartItemList33, 1.0d, "");
        example.model.Order order40 = new example.model.Order("ORD-1775916886212", address29, (java.util.List<example.model.CartItem>) cartItemList33, 1.0d, "ORD-1775916886040");
        example.model.Order order43 = new example.model.Order("", address7, (java.util.List<example.model.CartItem>) cartItemList33, (double) (byte) -1, "2026-04-11 17:14:50");
        java.lang.String str44 = address7.toString();
        java.lang.String str45 = address7.getStreet();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray32);
        org.junit.Assert.assertArrayEquals(cartItemArray32, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky "60) test0684(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str44, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916886212" + "'", str45, "ORD-1775916886212");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str16 = address15.getStreet();
        java.lang.String str17 = address15.getCountry();
        java.lang.String str18 = address15.getPhone();
        java.lang.String str19 = address15.getFullName();
        example.model.Address address26 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str27 = address26.getCountry();
        java.lang.String str28 = address26.getStreet();
        java.util.List<example.model.CartItem> cartItemList29 = example.service.CartService.getCart();
        example.model.Order order32 = new example.model.Order("ORD-1775916887934", address26, cartItemList29, (double) 97, "ORD-1775916889159");
        example.model.Order order35 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address15, cartItemList29, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order38 = new example.model.Order("ORD-1775916895909", address6, cartItemList29, (double) 'a', "ORD-1775916887934");
        java.lang.String str39 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList29);
        org.junit.Assert.assertNotNull(order35);
// flaky "61) test0685(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str39, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.getId();
        example.service.CartService.addProduct(product4, 97);
        example.service.CartService.addProduct(product4, 52);
        example.service.CartService.addProduct(product4, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        example.model.Product product7 = cartItem6.getProduct();
        org.junit.Assert.assertNotNull(product7);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916894811", address6, (java.util.List<example.model.CartItem>) cartItemList15, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address26 = order25.getAddress();
        java.util.List<example.model.CartItem> cartItemList27 = order25.getItems();
        java.lang.String str28 = order25.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertNotNull(cartItemList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "PAID" + "'", str28, "PAID");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        example.model.Address address12 = order7.getAddress();
        java.lang.String str13 = order7.getCreatedAt();
        java.lang.String str14 = order7.getCustomerEmail();
        java.lang.String str15 = order7.getStatus();
        java.util.List<example.model.CartItem> cartItemList16 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "62) test0689(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916944503" + "'", str8, "ORD-1775916944503");
        org.junit.Assert.assertNull(address9);
// flaky "42) test0689(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:44" + "'", str10, "2026-04-11 17:15:44");
// flaky "20) test0689(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:44" + "'", str11, "2026-04-11 17:15:44");
        org.junit.Assert.assertNull(address12);
// flaky "7) test0689(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:44" + "'", str13, "2026-04-11 17:15:44");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
        org.junit.Assert.assertNotNull(cartItemList16);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:15:33");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        example.model.Product product4 = new example.model.Product("ORD-1775916888578", "2026-04-11 17:14:55", "ORD-1775916891772", 35.0d);
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.toString();
        double double7 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)" + "'", str5, "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)" + "'", str6, "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getPhone();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getPhone();
        java.lang.String str11 = address7.toString();
        example.model.Address address13 = null;
        example.model.Address address15 = null;
        example.model.CartItem[] cartItemArray16 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList17 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList17, cartItemArray16);
        example.model.Order order21 = new example.model.Order("", address15, (java.util.List<example.model.CartItem>) cartItemList17, 1.0d, "");
        example.model.Order order24 = new example.model.Order("ORD-1775916886212", address13, (java.util.List<example.model.CartItem>) cartItemList17, 1.0d, "ORD-1775916886040");
        example.model.Order order27 = example.service.OrderService.createOrder("ORD-1775916889159", address7, (java.util.List<example.model.CartItem>) cartItemList17, (double) 100L, "ORD-1775916887611");
        java.lang.String str28 = address7.getCountry();
        java.lang.String str29 = address7.getPhone();
        example.model.Address address36 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str37 = address36.getStreet();
        java.lang.String str38 = address36.getCountry();
        java.lang.String str39 = address36.getPhone();
        java.lang.String str40 = address36.getFullName();
        example.model.Address address47 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str48 = address47.getCountry();
        java.lang.String str49 = address47.getStreet();
        java.util.List<example.model.CartItem> cartItemList50 = example.service.CartService.getCart();
        example.model.Order order53 = new example.model.Order("ORD-1775916887934", address47, cartItemList50, (double) 97, "ORD-1775916889159");
        example.model.Order order56 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address36, cartItemList50, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order59 = example.service.OrderService.createOrder("2026-04-11 17:14:48", address7, cartItemList50, (double) 97, "\ud83d\udcde PAID");
        java.lang.String str60 = address7.getCity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
// flaky "63) test0692(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str11, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray16);
        org.junit.Assert.assertArrayEquals(cartItemArray16, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916886212" + "'", str38, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ORD-1775916886212" + "'", str48, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ORD-1775916886212" + "'", str49, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList50);
        org.junit.Assert.assertNotNull(order56);
        org.junit.Assert.assertNotNull(order59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        example.model.Product product4 = new example.model.Product("ORD-1775916908981", "ORD-1775916936116", "ORD-1775916906901", (double) (byte) -1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        example.service.CartService.removeProduct("ORD-1775916908948");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getCountry();
        java.lang.String str9 = address7.getStreet();
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        example.model.Order order20 = example.service.OrderService.createOrder("ORD-1775916888151", address7, (java.util.List<example.model.CartItem>) cartItemList13, (double) ' ', "2026-04-11 17:14:48");
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        java.lang.String str29 = order28.getOrderId();
        java.util.List<example.model.CartItem> cartItemList30 = order28.getItems();
        example.model.Address address31 = order28.getAddress();
        java.lang.String str32 = order28.getCreatedAt();
        double double33 = order28.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList34 = order28.getItems();
        example.model.Order order37 = example.service.OrderService.createOrder("2026-04-11 17:15:15", address7, cartItemList34, 0.0d, "ORD-1775916904299");
        double double38 = order37.getTotalAmount();
        java.lang.String str39 = order37.getCustomerEmail();
        java.lang.String str40 = order37.getOrderId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(order20);
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "64) test0695(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916944819" + "'", str29, "ORD-1775916944819");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNull(address31);
// flaky "43) test0695(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2026-04-11 17:15:44" + "'", str32, "2026-04-11 17:15:44");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList34);
        org.junit.Assert.assertNotNull(order37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2026-04-11 17:15:15" + "'", str39, "2026-04-11 17:15:15");
// flaky "21) test0695(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916944819" + "'", str40, "ORD-1775916944819");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde ORD-1775916886212", "2026-04-11 17:14:50", "ORD-1775916889693", 1.0d);
        java.lang.String str5 = product4.getId();
        double double6 = product4.getPrice();
        java.lang.String str7 = product4.toString();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str5, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "65) test0697(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916886212] 2026-04-11 17:14:50  - $1.00  (ORD-1775916889693)" + "'", str7, "\ud83d\udcde ORD-1775916886212] 2026-04-11 17:14:50  - $1.00  (ORD-1775916889693)");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        example.model.Product product11 = cartItem2.getProduct();
        example.model.Product product12 = cartItem2.getProduct();
        cartItem2.setQuantity(10);
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
        java.util.List<example.model.CartItem> cartItemList11 = order7.getItems();
        java.lang.String str12 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "66) test0699(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916944975" + "'", str8, "ORD-1775916944975");
// flaky "44) test0699(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916944975" + "'", str9, "ORD-1775916944975");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertNotNull(cartItemList11);
// flaky "22) test0699(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916944975" + "'", str12, "ORD-1775916944975");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        int int7 = cartItem6.getQuantity();
        double double8 = cartItem6.getSubtotal();
        example.model.Product product9 = cartItem6.getProduct();
        double double10 = cartItem6.getSubtotal();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getId();
        example.service.CartService.addProduct(product4, 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916888257" + "'", str7, "ORD-1775916888257");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        example.model.Address address5 = new example.model.Address("ORD-1775916921496", "2026-04-11 17:15:13", "ORD-1775916941776", "ORD-1775916933452", "ORD-1775916936937");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        java.lang.String str18 = order17.getOrderId();
        java.util.List<example.model.CartItem> cartItemList19 = order17.getItems();
        example.model.Order order22 = example.service.OrderService.createOrder("ORD-1775916887934", address6, cartItemList19, (double) '4', "ORD-1775916886212");
        java.lang.String str23 = address6.getPhone();
        java.lang.String str24 = address6.getPhone();
        java.lang.String str25 = address6.getCountry();
        java.lang.String str26 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "67) test0703(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916945153" + "'", str18, "ORD-1775916945153");
        org.junit.Assert.assertNotNull(cartItemList19);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916886212" + "'", str24, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916886212" + "'", str26, "ORD-1775916886212");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916889159", address6, (java.util.List<example.model.CartItem>) cartItemList16, (double) 100L, "ORD-1775916887611");
        example.model.Address address27 = order26.getAddress();
        java.lang.String str28 = order26.getOrderId();
        java.lang.String str29 = order26.getCustomerEmail();
        java.lang.String str30 = order26.getPaymentIntentId();
        java.lang.String str31 = order26.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "68) test0704(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertNotNull(address27);
// flaky "45) test0704(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916945185" + "'", str28, "ORD-1775916945185");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916889159" + "'", str29, "ORD-1775916889159");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916887611" + "'", str30, "ORD-1775916887611");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916889159" + "'", str31, "ORD-1775916889159");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getPhone();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getPhone();
        example.model.Address address17 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str18 = address17.getCountry();
        java.lang.String str19 = address17.getStreet();
        example.model.Address address21 = null;
        example.model.CartItem[] cartItemArray22 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList23 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList23, cartItemArray22);
        example.model.Order order27 = new example.model.Order("", address21, (java.util.List<example.model.CartItem>) cartItemList23, 1.0d, "");
        example.model.Order order30 = example.service.OrderService.createOrder("ORD-1775916888151", address17, (java.util.List<example.model.CartItem>) cartItemList23, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order33 = example.service.OrderService.createOrder("ORD-1775916887228", address7, (java.util.List<example.model.CartItem>) cartItemList23, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address40 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str41 = address40.getStreet();
        java.lang.String str42 = address40.getCountry();
        example.model.Address address49 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str50 = address49.getStreet();
        java.lang.String str51 = address49.getCountry();
        java.lang.String str52 = address49.getPhone();
        java.lang.String str53 = address49.getFullName();
        example.model.Address address60 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str61 = address60.getCountry();
        java.lang.String str62 = address60.getStreet();
        java.util.List<example.model.CartItem> cartItemList63 = example.service.CartService.getCart();
        example.model.Order order66 = new example.model.Order("ORD-1775916887934", address60, cartItemList63, (double) 97, "ORD-1775916889159");
        example.model.Order order69 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address49, cartItemList63, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order72 = new example.model.Order("ORD-1775916895909", address40, cartItemList63, (double) 'a', "ORD-1775916887934");
        example.model.Order order75 = example.service.OrderService.createOrder("ORD-1775916891722", address7, cartItemList63, (double) (short) -1, "ORD-1775916893211");
        java.lang.String str76 = address7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order30);
        org.junit.Assert.assertNotNull(order33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ORD-1775916886212" + "'", str41, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ORD-1775916886212" + "'", str42, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916886212" + "'", str50, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ORD-1775916886212" + "'", str51, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ORD-1775916886212" + "'", str52, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ORD-1775916886212" + "'", str61, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ORD-1775916886212" + "'", str62, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList63);
        org.junit.Assert.assertNotNull(order69);
        org.junit.Assert.assertNotNull(order75);
// flaky "69) test0706(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str76, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getOrderId();
        java.lang.String str12 = order7.getStatus();
        java.lang.String str13 = order7.getCreatedAt();
        java.lang.String str14 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "70) test0707(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916945308" + "'", str8, "ORD-1775916945308");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "46) test0707(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916945308" + "'", str11, "ORD-1775916945308");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
// flaky "23) test0707(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:45" + "'", str13, "2026-04-11 17:15:45");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        example.model.Address address5 = new example.model.Address("ORD-1775916907784", "ORD-1775916887611", "ORD-1775916915800", "ORD-1775916886212", "ORD-1775916934258");
        java.lang.String str6 = address5.getCity();
        java.lang.String str7 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916915800" + "'", str6, "ORD-1775916915800");
// flaky "71) test0708(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916934258" + "'", str7, "\ud83d\udcde ORD-1775916934258");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getCountry();
        java.lang.String str10 = address8.getStreet();
        java.util.List<example.model.CartItem> cartItemList11 = example.service.CartService.getCart();
        example.model.Order order14 = new example.model.Order("ORD-1775916887934", address8, cartItemList11, (double) 97, "ORD-1775916889159");
        example.model.Address address21 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str22 = address21.getStreet();
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916887036", address21, (java.util.List<example.model.CartItem>) cartItemList24, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order31 = new example.model.Order("ORD-1775916894327", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address38 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str39 = address38.getCountry();
        java.lang.String str40 = address38.getStreet();
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        example.model.Order order51 = example.service.OrderService.createOrder("ORD-1775916888151", address38, (java.util.List<example.model.CartItem>) cartItemList44, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order54 = new example.model.Order("ORD-1775916887934", address8, (java.util.List<example.model.CartItem>) cartItemList44, (double) 100, "ORD-1775916892053");
        java.lang.String str55 = order54.getCreatedAt();
        java.lang.String str56 = order54.getOrderId();
        java.lang.Class<?> wildcardClass57 = order54.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order28);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(order51);
// flaky "72) test0709(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2026-04-11 17:15:45" + "'", str55, "2026-04-11 17:15:45");
// flaky "47) test0709(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916945411" + "'", str56, "ORD-1775916945411");
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916889159", address6, (java.util.List<example.model.CartItem>) cartItemList16, (double) 100L, "ORD-1775916887611");
        java.lang.String str27 = address6.getFullName();
        java.lang.String str28 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "73) test0710(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity((int) '4');
        example.model.Product product13 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:14:51", "ORD-1775916892828", "ORD-1775916908981", "ORD-1775916927602", "ORD-1775916912855");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        double double11 = product4.getPrice();
        java.lang.String str12 = product4.getId();
        java.lang.String str13 = product4.getId();
        java.lang.Class<?> wildcardClass14 = product4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916888257" + "'", str13, "ORD-1775916888257");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        example.model.Address address6 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        example.model.Address address13 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str14 = address13.getStreet();
        java.lang.String str15 = address13.getFullName();
        java.lang.String str16 = address13.getStreet();
        example.model.Address address18 = null;
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = new example.model.Order("ORD-1775916886212", address18, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "ORD-1775916886040");
        example.model.Order order32 = new example.model.Order("ORD-1775916894811", address13, (java.util.List<example.model.CartItem>) cartItemList22, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address33 = order32.getAddress();
        java.util.List<example.model.CartItem> cartItemList34 = order32.getItems();
        example.model.Order order37 = example.service.OrderService.createOrder("", address6, cartItemList34, (double) 100L, "ORD-1775916912778");
        java.lang.String str38 = address6.getCity();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886212" + "'", str14, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(address33);
        org.junit.Assert.assertNotNull(cartItemList34);
        org.junit.Assert.assertNotNull(order37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916902864" + "'", str38, "ORD-1775916902864");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        example.model.Address address5 = new example.model.Address("ORD-1775916907604", "ORD-1775916887934", "ORD-1775916907189", "ORD-1775916904860", "ORD-1775916905654");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) 1);
        int int7 = cartItem6.getQuantity();
        cartItem6.setQuantity((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.getPhone();
        java.lang.String str20 = address18.toString();
        java.lang.String str21 = address18.toString();
        java.lang.String str22 = address18.getFullName();
        java.lang.String str23 = address18.toString();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
// flaky "74) test0717(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
// flaky "48) test0717(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
// flaky "24) test0717(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str23, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str16 = address15.getCountry();
        java.lang.String str17 = address15.getStreet();
        java.util.List<example.model.CartItem> cartItemList18 = example.service.CartService.getCart();
        example.model.Order order21 = new example.model.Order("ORD-1775916887934", address15, cartItemList18, (double) 97, "ORD-1775916889159");
        example.model.Address address28 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str29 = address28.getStreet();
        example.model.CartItem[] cartItemArray30 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList31 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList31, cartItemArray30);
        example.model.Order order35 = example.service.OrderService.createOrder("ORD-1775916887036", address28, (java.util.List<example.model.CartItem>) cartItemList31, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order38 = new example.model.Order("ORD-1775916894327", address15, (java.util.List<example.model.CartItem>) cartItemList31, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address45 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str46 = address45.getCountry();
        java.lang.String str47 = address45.getStreet();
        example.model.Address address49 = null;
        example.model.CartItem[] cartItemArray50 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList51 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList51, cartItemArray50);
        example.model.Order order55 = new example.model.Order("", address49, (java.util.List<example.model.CartItem>) cartItemList51, 1.0d, "");
        example.model.Order order58 = example.service.OrderService.createOrder("ORD-1775916888151", address45, (java.util.List<example.model.CartItem>) cartItemList51, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order61 = new example.model.Order("ORD-1775916887934", address15, (java.util.List<example.model.CartItem>) cartItemList51, (double) 100, "ORD-1775916892053");
        example.model.Order order64 = example.service.OrderService.createOrder("2026-04-11 17:15:00", address6, (java.util.List<example.model.CartItem>) cartItemList51, (-35.0d), "\ud83d\udcde PAID");
        java.lang.String str65 = address6.toString();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList18);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray30);
        org.junit.Assert.assertArrayEquals(cartItemArray30, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ORD-1775916886212" + "'", str46, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ORD-1775916886212" + "'", str47, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray50);
        org.junit.Assert.assertArrayEquals(cartItemArray50, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(order58);
        org.junit.Assert.assertNotNull(order64);
// flaky "75) test0718(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\ud83d\udcde " + "'", str65, "\ud83d\udcde ");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        example.model.Address address12 = order7.getAddress();
        double double13 = order7.getTotalAmount();
        java.lang.String str14 = order7.getPaymentIntentId();
        example.model.Address address15 = order7.getAddress();
        java.util.List<example.model.CartItem> cartItemList16 = order7.getItems();
        java.lang.String str17 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "76) test0719(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916945893" + "'", str8, "ORD-1775916945893");
        org.junit.Assert.assertNull(address9);
// flaky "49) test0719(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:45" + "'", str10, "2026-04-11 17:15:45");
// flaky "25) test0719(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:45" + "'", str11, "2026-04-11 17:15:45");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertNotNull(cartItemList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        java.lang.String str5 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916888257" + "'", str5, "ORD-1775916888257");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("2026-04-11 17:14:47", address8, (java.util.List<example.model.CartItem>) cartItemList12, (double) (-1.0f), "");
        example.model.Address address20 = order19.getAddress();
        java.lang.String str21 = address20.getStreet();
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        java.lang.String str30 = order29.getOrderId();
        java.util.List<example.model.CartItem> cartItemList31 = order29.getItems();
        example.model.Order order34 = new example.model.Order("ORD-1775916890225", address20, cartItemList31, (double) (byte) -1, "");
        example.model.Address address36 = null;
        example.model.Address address38 = null;
        example.model.CartItem[] cartItemArray39 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList40 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList40, cartItemArray39);
        example.model.Order order44 = new example.model.Order("", address38, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "");
        example.model.Order order47 = new example.model.Order("ORD-1775916886212", address36, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "ORD-1775916886040");
        java.lang.String str48 = order47.getPaymentIntentId();
        double double49 = order47.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList50 = order47.getItems();
        example.model.Order order53 = example.service.OrderService.createOrder("ORD-1775916899981", address20, cartItemList50, (double) 1, "ORD-1775916889159");
        java.lang.String str54 = address20.getCity();
        java.lang.String str55 = address20.getCountry();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "77) test0721(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916946010" + "'", str30, "ORD-1775916946010");
        org.junit.Assert.assertNotNull(cartItemList31);
        org.junit.Assert.assertNotNull(cartItemArray39);
        org.junit.Assert.assertArrayEquals(cartItemArray39, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ORD-1775916886040" + "'", str48, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList50);
        org.junit.Assert.assertNotNull(order53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916886212" + "'", str55, "ORD-1775916886212");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        example.model.Product product5 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product5);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        java.lang.String str13 = product4.getDescription();
        java.lang.String str14 = product4.getId();
        example.model.CartItem cartItem16 = new example.model.CartItem(product4, 1);
        example.model.Product product17 = cartItem16.getProduct();
        example.model.Product product18 = cartItem16.getProduct();
        java.lang.Class<?> wildcardClass19 = product18.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertNotNull(product17);
        org.junit.Assert.assertNotNull(product18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.getId();
        java.lang.String str11 = product4.getName();
        double double12 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916890749" + "'", str11, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        example.model.Address address6 = new example.model.Address("ORD-1775916895446", "ORD-1775916922856", "ORD-1775916898820", "ORD-1775916921154", "ORD-1775916895177");
        example.model.Address address14 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str15 = address14.getStreet();
        java.lang.String str16 = address14.getFullName();
        java.lang.String str17 = address14.getStreet();
        example.model.Address address19 = null;
        example.model.Address address21 = null;
        example.model.CartItem[] cartItemArray22 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList23 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList23, cartItemArray22);
        example.model.Order order27 = new example.model.Order("", address21, (java.util.List<example.model.CartItem>) cartItemList23, 1.0d, "");
        example.model.Order order30 = new example.model.Order("ORD-1775916886212", address19, (java.util.List<example.model.CartItem>) cartItemList23, 1.0d, "ORD-1775916886040");
        example.model.Order order33 = new example.model.Order("ORD-1775916894811", address14, (java.util.List<example.model.CartItem>) cartItemList23, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address34 = order33.getAddress();
        java.lang.String str35 = address34.getPhone();
        example.model.Address address43 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str44 = address43.getPhone();
        java.lang.String str45 = address43.getFullName();
        java.lang.String str46 = address43.getPhone();
        example.model.Address address53 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str54 = address53.getCountry();
        java.lang.String str55 = address53.getStreet();
        example.model.Address address57 = null;
        example.model.CartItem[] cartItemArray58 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList59 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList59, cartItemArray58);
        example.model.Order order63 = new example.model.Order("", address57, (java.util.List<example.model.CartItem>) cartItemList59, 1.0d, "");
        example.model.Order order66 = example.service.OrderService.createOrder("ORD-1775916888151", address53, (java.util.List<example.model.CartItem>) cartItemList59, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order69 = example.service.OrderService.createOrder("ORD-1775916887228", address43, (java.util.List<example.model.CartItem>) cartItemList59, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address71 = null;
        example.model.CartItem[] cartItemArray72 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList73 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList73, cartItemArray72);
        example.model.Order order77 = new example.model.Order("", address71, (java.util.List<example.model.CartItem>) cartItemList73, 1.0d, "");
        java.lang.String str78 = order77.getOrderId();
        java.lang.String str79 = order77.getOrderId();
        java.util.List<example.model.CartItem> cartItemList80 = order77.getItems();
        example.model.Order order83 = example.service.OrderService.createOrder("ORD-1775916891135", address43, cartItemList80, (double) 0L, "ORD-1775916886040");
        example.model.Order order86 = new example.model.Order("ORD-1775916894406", address34, cartItemList80, (double) 'a', "ORD-1775916905114");
        example.model.Order order89 = new example.model.Order("ORD-1775916928392", address6, cartItemList80, (-35.0d), "ORD-1775916911624");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916886212" + "'", str35, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916886212" + "'", str44, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ORD-1775916886212" + "'", str46, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ORD-1775916886212" + "'", str54, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916886212" + "'", str55, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray58);
        org.junit.Assert.assertArrayEquals(cartItemArray58, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(order66);
        org.junit.Assert.assertNotNull(order69);
        org.junit.Assert.assertNotNull(cartItemArray72);
        org.junit.Assert.assertArrayEquals(cartItemArray72, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky "78) test0725(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ORD-1775916946143" + "'", str78, "ORD-1775916946143");
// flaky "50) test0725(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916946143" + "'", str79, "ORD-1775916946143");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(order83);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        example.model.CartItem cartItem13 = new example.model.CartItem(product11, (int) (byte) -1);
        java.lang.String str14 = cartItem13.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916890749    x-1  = $-1.00" + "'", str14, "ORD-1775916890749    x-1  = $-1.00");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        example.model.Address address5 = new example.model.Address("ORD-1775916891722", "ORD-1775916915941", "ORD-1775916899079", "2026-04-11 17:15:12", "ORD-1775916890749    x0  = $0.00");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:15:12" + "'", str6, "2026-04-11 17:15:12");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916891722" + "'", str7, "ORD-1775916891722");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916899079" + "'", str8, "ORD-1775916899079");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.getId();
        java.lang.String str11 = product4.getName();
        example.service.CartService.addProduct(product4, (int) ' ');
        double double14 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916890749" + "'", str11, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        example.model.Address address5 = new example.model.Address("ORD-1775916889515", "ORD-1775916886687", "2026-04-11 17:14:48", "PAID", "ORD-1775916887036");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.getFullName();
// flaky "79) test0729(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916887036" + "'", str6, "\ud83d\udcde ORD-1775916887036");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916889515" + "'", str7, "ORD-1775916889515");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        java.lang.String str5 = product4.getName();
        double double6 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        example.model.Address address5 = new example.model.Address("ORD-1775916891457", "ORD-1775916905596", "ORD-1775916891938", "ORD-1775916905829", "ORD-1775916920763");
        java.lang.String str6 = address5.toString();
// flaky "80) test0731(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916920763" + "'", str6, "\ud83d\udcde ORD-1775916920763");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        example.model.Address address6 = new example.model.Address("ORD-1775916903896", "ORD-1775916895177", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916887228", "ORD-1775916897794");
        example.model.Address address13 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str14 = address13.getCountry();
        java.lang.String str15 = address13.getStreet();
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916888151", address13, (java.util.List<example.model.CartItem>) cartItemList19, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order29 = new example.model.Order("ORD-1775916923295", address6, (java.util.List<example.model.CartItem>) cartItemList19, (double) 100L, "ORD-1775916897794");
        java.lang.String str30 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886212" + "'", str14, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916895177" + "'", str30, "ORD-1775916895177");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        example.model.Product product4 = new example.model.Product("ORD-1775916886040", "ORD-1775916896079", "ORD-1775916897099", (double) (short) -1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916897099" + "'", str5, "ORD-1775916897099");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916897099" + "'", str6, "ORD-1775916897099");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916897099" + "'", str7, "ORD-1775916897099");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:15:20", "2026-04-11 17:15:18", "\ud83d\udcde PAID", (-10.0d));
        example.service.CartService.addProduct(product4, (int) '#');
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 1);
        example.model.Product product6 = cartItem2.getProduct();
        int int7 = cartItem2.getQuantity();
        example.model.Product product8 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = new example.model.Order("2026-04-11 17:14:47", address18, (java.util.List<example.model.CartItem>) cartItemList22, (double) (-1.0f), "");
        example.model.Address address30 = order29.getAddress();
        example.model.Address address32 = null;
        example.model.Address address34 = null;
        example.model.CartItem[] cartItemArray35 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList36 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList36, cartItemArray35);
        example.model.Order order40 = new example.model.Order("", address34, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "");
        example.model.Order order43 = new example.model.Order("ORD-1775916886212", address32, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "ORD-1775916886040");
        example.model.Order order46 = new example.model.Order("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList36, (double) 10, "ORD-1775916887494");
        example.model.Address address48 = null;
        example.model.CartItem[] cartItemArray49 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList50 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList50, cartItemArray49);
        example.model.Order order54 = new example.model.Order("", address48, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "");
        example.model.Order order57 = example.service.OrderService.createOrder("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList50, 0.0d, "2026-04-11 17:14:52");
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916894406", address6, (java.util.List<example.model.CartItem>) cartItemList50, 35.0d, "ORD-1775916888578");
        java.lang.String str61 = address6.getFullName();
        java.lang.String str62 = address6.getCity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertNotNull(cartItemArray35);
        org.junit.Assert.assertArrayEquals(cartItemArray35, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cartItemArray49);
        org.junit.Assert.assertArrayEquals(cartItemArray49, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(order57);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916928912");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        example.model.Order order0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Order.getOrderId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.getId();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) '4');
        java.lang.String str13 = cartItem12.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916890749    x52  = $52.00" + "'", str13, "ORD-1775916890749    x52  = $52.00");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:52", "ORD-1775916897292", "ORD-1775916894246", (double) (short) 1);
        example.service.CartService.addProduct(product4, 97);
        example.service.CartService.addProduct(product4, (int) (short) 1);
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, (int) (byte) 1);
        example.model.Product product11 = cartItem10.getProduct();
        org.junit.Assert.assertNotNull(product11);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        example.model.Address address6 = new example.model.Address("ORD-1775916903896", "ORD-1775916895177", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916887228", "ORD-1775916897794");
        example.model.Address address13 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str14 = address13.getCountry();
        java.lang.String str15 = address13.getStreet();
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916888151", address13, (java.util.List<example.model.CartItem>) cartItemList19, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order29 = new example.model.Order("ORD-1775916923295", address6, (java.util.List<example.model.CartItem>) cartItemList19, (double) 100L, "ORD-1775916897794");
        java.lang.String str30 = order29.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886212" + "'", str14, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PAID" + "'", str30, "PAID");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        int int7 = cartItem6.getQuantity();
        double double8 = cartItem6.getSubtotal();
        java.lang.String str9 = cartItem6.toString();
        example.model.Product product10 = cartItem6.getProduct();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str9, "ORD-1775916890749    x1  = $1.00");
        org.junit.Assert.assertNotNull(product10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        example.model.Product product10 = cartItem9.getProduct();
        double double11 = cartItem9.getSubtotal();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916912399");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916889515" + "'", str7, "ORD-1775916889515");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str16 = address15.getStreet();
        java.lang.String str17 = address15.getCountry();
        java.lang.String str18 = address15.getPhone();
        java.lang.String str19 = address15.getFullName();
        example.model.Address address26 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str27 = address26.getCountry();
        java.lang.String str28 = address26.getStreet();
        java.util.List<example.model.CartItem> cartItemList29 = example.service.CartService.getCart();
        example.model.Order order32 = new example.model.Order("ORD-1775916887934", address26, cartItemList29, (double) 97, "ORD-1775916889159");
        example.model.Order order35 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address15, cartItemList29, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order38 = new example.model.Order("ORD-1775916895909", address6, cartItemList29, (double) 'a', "ORD-1775916887934");
        java.lang.String str39 = address6.getStreet();
        java.lang.String str40 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList29);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        java.lang.String str9 = product8.getName();
        java.lang.String str10 = product8.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749" + "'", str10, "ORD-1775916890749");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916887557");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        double double12 = order7.getTotalAmount();
        java.lang.String str13 = order7.getCustomerEmail();
        java.lang.String str14 = order7.getCustomerEmail();
        double double15 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "81) test0749(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916947179" + "'", str8, "ORD-1775916947179");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "51) test0749(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:47" + "'", str11, "2026-04-11 17:15:47");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        java.util.List<example.model.CartItem> cartItemList9 = example.service.CartService.getCart();
        example.model.Order order12 = new example.model.Order("ORD-1775916887934", address6, cartItemList9, (double) 97, "ORD-1775916889159");
        example.service.OrderService.printReceipt(order12);
        example.service.OrderService.printReceipt(order12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList9);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        example.model.Address address5 = new example.model.Address("ORD-1775916887611", "ORD-1775916887828", "ORD-1775916902814", "ORD-1775916902814", "");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.toString();
        java.lang.String str9 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916902814" + "'", str6, "ORD-1775916902814");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916902814" + "'", str7, "ORD-1775916902814");
// flaky "82) test0751(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde " + "'", str8, "\ud83d\udcde ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916887828" + "'", str9, "ORD-1775916887828");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, 0);
        java.lang.String str9 = product4.toString();
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        double double13 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getStreet();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getStreet();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = new example.model.Order("ORD-1775916894811", address7, (java.util.List<example.model.CartItem>) cartItemList16, (double) 1.0f, "ORD-1775916894327");
        java.lang.String str27 = address7.getStreet();
        java.lang.String str28 = address7.toString();
        example.model.Address address37 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str38 = address37.getCountry();
        java.lang.String str39 = address37.getStreet();
        java.util.List<example.model.CartItem> cartItemList40 = example.service.CartService.getCart();
        example.model.Order order43 = new example.model.Order("ORD-1775916887934", address37, cartItemList40, (double) 97, "ORD-1775916889159");
        example.model.Address address50 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str51 = address50.getStreet();
        example.model.CartItem[] cartItemArray52 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList53 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList53, cartItemArray52);
        example.model.Order order57 = example.service.OrderService.createOrder("ORD-1775916887036", address50, (java.util.List<example.model.CartItem>) cartItemList53, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order60 = new example.model.Order("ORD-1775916894327", address37, (java.util.List<example.model.CartItem>) cartItemList53, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address67 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str68 = address67.getCountry();
        java.lang.String str69 = address67.getStreet();
        example.model.Address address71 = null;
        example.model.CartItem[] cartItemArray72 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList73 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList73, cartItemArray72);
        example.model.Order order77 = new example.model.Order("", address71, (java.util.List<example.model.CartItem>) cartItemList73, 1.0d, "");
        example.model.Order order80 = example.service.OrderService.createOrder("ORD-1775916888151", address67, (java.util.List<example.model.CartItem>) cartItemList73, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order83 = new example.model.Order("ORD-1775916887934", address37, (java.util.List<example.model.CartItem>) cartItemList73, (double) 100, "ORD-1775916892053");
        example.model.Order order86 = example.service.OrderService.createOrder("ORD-1775916901311", address7, (java.util.List<example.model.CartItem>) cartItemList73, (double) 1, "ORD-1775916912855");
        java.lang.String str87 = order86.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
// flaky "83) test0754(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916886212" + "'", str38, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList40);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ORD-1775916886212" + "'", str51, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray52);
        org.junit.Assert.assertArrayEquals(cartItemArray52, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(order57);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ORD-1775916886212" + "'", str68, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ORD-1775916886212" + "'", str69, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray72);
        org.junit.Assert.assertArrayEquals(cartItemArray72, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(order80);
        org.junit.Assert.assertNotNull(order86);
// flaky "52) test0754(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str87 + "' != '" + "2026-04-11 17:15:47" + "'", str87, "2026-04-11 17:15:47");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        example.model.Product product4 = new example.model.Product("ORD-1775916907439", "2026-04-11 17:15:25", "ORD-1775916897099", (double) 1.0f);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        java.lang.String str11 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str11, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        double double12 = order7.getTotalAmount();
        java.lang.String str13 = order7.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList14 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "84) test0757(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916947611" + "'", str8, "ORD-1775916947611");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "53) test0757(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:47" + "'", str11, "2026-04-11 17:15:47");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(cartItemList14);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        example.model.Address address5 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str6 = address5.getFullName();
        java.lang.String str7 = address5.getStreet();
        java.lang.String str8 = address5.toString();
        java.lang.String str9 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892121" + "'", str6, "ORD-1775916892121");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916891938" + "'", str7, "ORD-1775916891938");
// flaky "85) test0758(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde " + "'", str8, "\ud83d\udcde ");
// flaky "54) test0758(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud83d\udcde " + "'", str9, "\ud83d\udcde ");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        example.model.Address address13 = order7.getAddress();
        java.lang.String str14 = order7.getOrderId();
        java.lang.String str15 = order7.getStatus();
        java.lang.String str16 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "86) test0759(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916947679" + "'", str8, "ORD-1775916947679");
// flaky "55) test0759(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916947679" + "'", str9, "ORD-1775916947679");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(address13);
// flaky "26) test0759(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916947679" + "'", str14, "ORD-1775916947679");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = example.service.OrderService.createOrder("ORD-1775916888151", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) ' ', "2026-04-11 17:14:48");
        java.lang.String str20 = order19.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PAID" + "'", str20, "PAID");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("ORD-1775916886212", address8, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "ORD-1775916886040");
        example.model.Order order22 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) (short) 0, "ORD-1775916903429");
        example.service.OrderService.printReceipt(order22);
        java.lang.String str24 = order22.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)" + "'", str24, "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916943877");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        example.model.Product product4 = new example.model.Product("ORD-1775916905596", "ORD-1775916894406", "ORD-1775916904664", (double) '#');
        example.service.CartService.addProduct(product4, (int) (short) 100);
        example.service.CartService.addProduct(product4, (int) (short) 100);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        example.model.Product product4 = new example.model.Product("", "ORD-1775916897292", "ORD-1775916893211", (double) '#');
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getName();
        java.lang.String str8 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)" + "'", str5, "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916897292" + "'", str6, "ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916897292" + "'", str7, "ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)" + "'", str8, "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        double double9 = cartItem8.getSubtotal();
        cartItem8.setQuantity(52);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = new example.model.Order("2026-04-11 17:14:47", address18, (java.util.List<example.model.CartItem>) cartItemList22, (double) (-1.0f), "");
        example.model.Address address30 = order29.getAddress();
        example.model.Address address32 = null;
        example.model.Address address34 = null;
        example.model.CartItem[] cartItemArray35 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList36 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList36, cartItemArray35);
        example.model.Order order40 = new example.model.Order("", address34, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "");
        example.model.Order order43 = new example.model.Order("ORD-1775916886212", address32, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "ORD-1775916886040");
        example.model.Order order46 = new example.model.Order("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList36, (double) 10, "ORD-1775916887494");
        example.model.Address address48 = null;
        example.model.CartItem[] cartItemArray49 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList50 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList50, cartItemArray49);
        example.model.Order order54 = new example.model.Order("", address48, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "");
        example.model.Order order57 = example.service.OrderService.createOrder("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList50, 0.0d, "2026-04-11 17:14:52");
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916894406", address6, (java.util.List<example.model.CartItem>) cartItemList50, 35.0d, "ORD-1775916888578");
        java.lang.String str61 = address6.getFullName();
        java.lang.String str62 = address6.getStreet();
        java.lang.String str63 = address6.getPhone();
        java.lang.String str64 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertNotNull(cartItemArray35);
        org.junit.Assert.assertArrayEquals(cartItemArray35, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cartItemArray49);
        org.junit.Assert.assertArrayEquals(cartItemArray49, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(order57);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ORD-1775916886212" + "'", str62, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ORD-1775916886212" + "'", str63, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ORD-1775916886212" + "'", str64, "ORD-1775916886212");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        example.model.Product product4 = new example.model.Product("ORD-1775916897371", "ORD-1775916892568", "ORD-1775916893369", (double) 10);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892568" + "'", str6, "ORD-1775916892568");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getId();
        example.service.CartService.addProduct(product4, (int) ' ');
        java.lang.String str12 = product4.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916888257" + "'", str8, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916888257" + "'", str9, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:14:50" + "'", str12, "2026-04-11 17:14:50");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getCreatedAt();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "87) test0769(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916948361" + "'", str8, "ORD-1775916948361");
// flaky "56) test0769(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916948361" + "'", str9, "ORD-1775916948361");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "27) test0769(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:48" + "'", str11, "2026-04-11 17:15:48");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
        java.lang.String str11 = order7.getCustomerEmail();
        java.lang.String str12 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "88) test0770(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916948394" + "'", str8, "ORD-1775916948394");
// flaky "57) test0770(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916948394" + "'", str9, "ORD-1775916948394");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        example.model.Address address5 = new example.model.Address("ORD-1775916888257", "ORD-1775916886040", "ORD-1775916887494", "ORD-1775916888151", "PAID");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getStreet();
// flaky "89) test0771(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde PAID" + "'", str6, "\ud83d\udcde PAID");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916888257" + "'", str7, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886040" + "'", str8, "ORD-1775916886040");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) (short) 1);
        double double15 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.toString();
        java.lang.Class<?> wildcardClass20 = address18.getClass();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "90) test0773(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str19, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        double double10 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList11 = order7.getItems();
        java.lang.String str12 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "91) test0774(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916948512" + "'", str8, "ORD-1775916948512");
// flaky "58) test0774(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916948512" + "'", str9, "ORD-1775916948512");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList11);
// flaky "28) test0774(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:15:48" + "'", str12, "2026-04-11 17:15:48");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        example.model.Address address6 = new example.model.Address("ORD-1775916906473", "ORD-1775916897371", "ORD-1775916888578", "ORD-1775916898989", "2026-04-11 17:15:03");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        java.lang.String str15 = order14.getOrderId();
        example.model.Address address16 = order14.getAddress();
        java.lang.String str17 = order14.getCreatedAt();
        java.lang.String str18 = order14.getCreatedAt();
        example.model.Address address19 = order14.getAddress();
        java.lang.String str20 = order14.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList21 = order14.getItems();
        example.model.Order order24 = new example.model.Order("2026-04-11 17:14:49", address6, cartItemList21, (double) '4', "ORD-1775916900020");
        java.lang.String str25 = address6.toString();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "92) test0775(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916948580" + "'", str15, "ORD-1775916948580");
        org.junit.Assert.assertNull(address16);
// flaky "59) test0775(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2026-04-11 17:15:48" + "'", str17, "2026-04-11 17:15:48");
// flaky "29) test0775(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2026-04-11 17:15:48" + "'", str18, "2026-04-11 17:15:48");
        org.junit.Assert.assertNull(address19);
// flaky "8) test0775(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2026-04-11 17:15:48" + "'", str20, "2026-04-11 17:15:48");
        org.junit.Assert.assertNotNull(cartItemList21);
// flaky "1) test0775(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ud83d\udcde 2026-04-11 17:15:03" + "'", str25, "\ud83d\udcde 2026-04-11 17:15:03");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        example.model.Address address5 = new example.model.Address("ORD-1775916924595", "ORD-1775916928550", "ORD-1775916890749    x0  = $0.00", "[ORD-1775916891615] ORD-1775916890749    - $1.00  (ORD-1775916892828)", "2026-04-11 17:14:53");
        java.lang.Class<?> wildcardClass6 = address5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        double double9 = product4.getPrice();
        java.lang.String str10 = product4.toString();
        java.lang.String str11 = product4.getId();
        java.lang.String str12 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916888257" + "'", str11, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        example.model.Address address27 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address29 = null;
        example.model.CartItem[] cartItemArray30 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList31 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList31, cartItemArray30);
        example.model.Order order35 = new example.model.Order("", address29, (java.util.List<example.model.CartItem>) cartItemList31, 1.0d, "");
        example.model.Order order38 = new example.model.Order("2026-04-11 17:14:47", address27, (java.util.List<example.model.CartItem>) cartItemList31, (double) (-1.0f), "");
        example.model.Address address39 = order38.getAddress();
        example.model.Address address41 = null;
        example.model.Address address43 = null;
        example.model.CartItem[] cartItemArray44 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList45 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList45, cartItemArray44);
        example.model.Order order49 = new example.model.Order("", address43, (java.util.List<example.model.CartItem>) cartItemList45, 1.0d, "");
        example.model.Order order52 = new example.model.Order("ORD-1775916886212", address41, (java.util.List<example.model.CartItem>) cartItemList45, 1.0d, "ORD-1775916886040");
        example.model.Order order55 = new example.model.Order("ORD-1775916892053", address39, (java.util.List<example.model.CartItem>) cartItemList45, (double) 10, "ORD-1775916887494");
        example.model.Order order58 = example.service.OrderService.createOrder("ORD-1775916926346", address19, (java.util.List<example.model.CartItem>) cartItemList45, (double) (-1), "ORD-1775916921394");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemArray30);
        org.junit.Assert.assertArrayEquals(cartItemArray30, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(address39);
        org.junit.Assert.assertNotNull(cartItemArray44);
        org.junit.Assert.assertArrayEquals(cartItemArray44, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(order58);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getOrderId();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "93) test0779(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916948761" + "'", str8, "ORD-1775916948761");
// flaky "60) test0779(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916948761" + "'", str9, "ORD-1775916948761");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "30) test0779(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916948761" + "'", str11, "ORD-1775916948761");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        example.model.Product product4 = new example.model.Product("ORD-1775916907784", "PAID", "ORD-1775916890749    x1  = $1.00", (double) '4');
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str5, "ORD-1775916890749    x1  = $1.00");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        example.model.Product product4 = new example.model.Product("", "ORD-1775916892827", "ORD-1775916935967", (-100.0d));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        example.model.Address address6 = new example.model.Address("ORD-1775916886212", "ORD-1775916909947", "ORD-1775916902074", "2026-04-11 17:14:51", "ORD-1775916892904");
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = new example.model.Order("2026-04-11 17:14:47", address15, (java.util.List<example.model.CartItem>) cartItemList19, (double) (-1.0f), "");
        example.model.Address address27 = order26.getAddress();
        java.lang.String str28 = address27.getStreet();
        example.model.Address address30 = null;
        example.model.CartItem[] cartItemArray31 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList32 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList32, cartItemArray31);
        example.model.Order order36 = new example.model.Order("", address30, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "");
        java.lang.String str37 = order36.getOrderId();
        java.util.List<example.model.CartItem> cartItemList38 = order36.getItems();
        example.model.Order order41 = new example.model.Order("ORD-1775916890225", address27, cartItemList38, (double) (byte) -1, "");
        example.model.Address address43 = null;
        example.model.Address address45 = null;
        example.model.CartItem[] cartItemArray46 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList47 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList47, cartItemArray46);
        example.model.Order order51 = new example.model.Order("", address45, (java.util.List<example.model.CartItem>) cartItemList47, 1.0d, "");
        example.model.Order order54 = new example.model.Order("ORD-1775916886212", address43, (java.util.List<example.model.CartItem>) cartItemList47, 1.0d, "ORD-1775916886040");
        java.lang.String str55 = order54.getPaymentIntentId();
        double double56 = order54.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList57 = order54.getItems();
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916899981", address27, cartItemList57, (double) 1, "ORD-1775916889159");
        example.model.Order order63 = new example.model.Order("ORD-1775916898608", address6, cartItemList57, (double) 1, "2026-04-11 17:15:02");
        java.lang.String str64 = address6.getStreet();
        java.lang.String str65 = address6.getCity();
        java.lang.String str66 = address6.getStreet();
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "94) test0782(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916948895" + "'", str37, "ORD-1775916948895");
        org.junit.Assert.assertNotNull(cartItemList38);
        org.junit.Assert.assertNotNull(cartItemArray46);
        org.junit.Assert.assertArrayEquals(cartItemArray46, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916886040" + "'", str55, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList57);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ORD-1775916909947" + "'", str64, "ORD-1775916909947");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ORD-1775916902074" + "'", str65, "ORD-1775916902074");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "ORD-1775916909947" + "'", str66, "ORD-1775916909947");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        java.lang.String str19 = address7.getPhone();
        example.model.Address address21 = null;
        example.model.CartItem[] cartItemArray22 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList23 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList23, cartItemArray22);
        example.model.Order order27 = new example.model.Order("", address21, (java.util.List<example.model.CartItem>) cartItemList23, 1.0d, "");
        example.model.Order order30 = example.service.OrderService.createOrder("ORD-1775916889159", address7, (java.util.List<example.model.CartItem>) cartItemList23, (double) 1, "2026-04-11 17:14:52");
        java.lang.String str31 = address7.getStreet();
        java.lang.String str32 = address7.getPhone();
        java.lang.String str33 = address7.getStreet();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916886212" + "'", str32, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916886212" + "'", str33, "ORD-1775916886212");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        example.model.Address address5 = new example.model.Address("ORD-1775916928258", "\ud83d\udcde PAID", "ORD-1775916913227", "ORD-1775916894521", "ORD-1775916928016");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        java.lang.String str19 = order17.getPaymentIntentId();
        example.service.OrderService.printReceipt(order17);
        java.lang.String str21 = order17.getPaymentIntentId();
        example.model.Address address22 = order17.getAddress();
        java.lang.String str23 = order17.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(address22);
// flaky "95) test0785(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916948993" + "'", str23, "ORD-1775916948993");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        int int11 = cartItem2.getQuantity();
        int int12 = cartItem2.getQuantity();
        int int13 = cartItem2.getQuantity();
        example.model.Product product14 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(product14);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        double double10 = order7.getTotalAmount();
        java.lang.String str11 = order7.getStatus();
        example.model.Address address12 = order7.getAddress();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        double double14 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "96) test0787(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916949059" + "'", str8, "ORD-1775916949059");
// flaky "61) test0787(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916949059" + "'", str9, "ORD-1775916949059");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        double double10 = cartItem9.getSubtotal();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        double double8 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "97) test0790(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916949229" + "'", str8, "ORD-1775916949229");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916894811", address6, (java.util.List<example.model.CartItem>) cartItemList15, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address26 = order25.getAddress();
        java.lang.String str27 = address26.getPhone();
        java.lang.String str28 = address26.getFullName();
        java.lang.String str29 = address26.getStreet();
        java.lang.String str30 = address26.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        example.model.Address address11 = order7.getAddress();
        double double12 = order7.getTotalAmount();
        java.lang.String str13 = order7.getCustomerEmail();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "98) test0792(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916949293" + "'", str8, "ORD-1775916949293");
        org.junit.Assert.assertNull(address9);
// flaky "62) test0792(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:49" + "'", str10, "2026-04-11 17:15:49");
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getStreet();
        java.lang.String str9 = address7.getFullName();
        java.lang.String str10 = address7.getStreet();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = new example.model.Order("ORD-1775916894811", address7, (java.util.List<example.model.CartItem>) cartItemList16, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address27 = order26.getAddress();
        java.lang.String str28 = address27.getPhone();
        java.lang.String str29 = address27.getFullName();
        java.lang.String str30 = address27.getStreet();
        example.model.Address address38 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address40 = null;
        example.model.CartItem[] cartItemArray41 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList42 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList42, cartItemArray41);
        example.model.Order order46 = new example.model.Order("", address40, (java.util.List<example.model.CartItem>) cartItemList42, 1.0d, "");
        example.model.Order order49 = new example.model.Order("2026-04-11 17:14:47", address38, (java.util.List<example.model.CartItem>) cartItemList42, (double) (-1.0f), "");
        example.model.Address address50 = order49.getAddress();
        java.lang.String str51 = address50.getStreet();
        example.model.Address address53 = null;
        example.model.CartItem[] cartItemArray54 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList55 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList55, cartItemArray54);
        example.model.Order order59 = new example.model.Order("", address53, (java.util.List<example.model.CartItem>) cartItemList55, 1.0d, "");
        java.lang.String str60 = order59.getOrderId();
        java.util.List<example.model.CartItem> cartItemList61 = order59.getItems();
        example.model.Order order64 = new example.model.Order("ORD-1775916890225", address50, cartItemList61, (double) (byte) -1, "");
        java.lang.String str65 = order64.getOrderId();
        java.util.List<example.model.CartItem> cartItemList66 = order64.getItems();
        example.model.Order order69 = example.service.OrderService.createOrder("ORD-1775916892053", address27, cartItemList66, (double) (short) -1, "ORD-1775916939408");
        java.lang.String str70 = address27.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray41);
        org.junit.Assert.assertArrayEquals(cartItemArray41, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(address50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ORD-1775916886212" + "'", str51, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray54);
        org.junit.Assert.assertArrayEquals(cartItemArray54, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky "99) test0793(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ORD-1775916949329" + "'", str60, "ORD-1775916949329");
        org.junit.Assert.assertNotNull(cartItemList61);
// flaky "63) test0793(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ORD-1775916949329" + "'", str65, "ORD-1775916949329");
        org.junit.Assert.assertNotNull(cartItemList66);
        org.junit.Assert.assertNotNull(order69);
// flaky "31) test0793(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str70, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        example.model.Address address1 = null;
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getStreet();
        java.lang.String str10 = address8.getCountry();
        example.model.Address address17 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str18 = address17.getStreet();
        java.lang.String str19 = address17.getCountry();
        java.lang.String str20 = address17.getPhone();
        java.lang.String str21 = address17.getFullName();
        example.model.Address address28 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str29 = address28.getCountry();
        java.lang.String str30 = address28.getStreet();
        java.util.List<example.model.CartItem> cartItemList31 = example.service.CartService.getCart();
        example.model.Order order34 = new example.model.Order("ORD-1775916887934", address28, cartItemList31, (double) 97, "ORD-1775916889159");
        example.model.Order order37 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address17, cartItemList31, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order40 = new example.model.Order("ORD-1775916895909", address8, cartItemList31, (double) 'a', "ORD-1775916887934");
        example.model.Order order43 = new example.model.Order("ORD-1775916895446", address1, cartItemList31, 350.0d, "ORD-1775916910746");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList31);
        org.junit.Assert.assertNotNull(order37);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        example.model.Address address5 = new example.model.Address("ORD-1775916918224", "ORD-1775916930720", "ORD-1775916911090", "2026-04-11 17:15:33", "ORD-1775916905284");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        java.util.List<example.model.CartItem> cartItemList9 = example.service.CartService.getCart();
        example.model.Order order12 = new example.model.Order("ORD-1775916887934", address6, cartItemList9, (double) 97, "ORD-1775916889159");
        java.lang.String str13 = order12.getCustomerEmail();
        example.model.Address address14 = order12.getAddress();
        java.lang.String str15 = order12.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916887934" + "'", str13, "ORD-1775916887934");
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916889159" + "'", str15, "ORD-1775916889159");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        example.model.Address address5 = new example.model.Address("ORD-1775916892053", "ORD-1775916891772", "ORD-1775916933302", "ORD-1775916905284", "ORD-1775916922558");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, 1);
        double double10 = cartItem9.getSubtotal();
        int int11 = cartItem9.getQuantity();
        cartItem9.setQuantity((int) '4');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        java.lang.String str19 = order17.getPaymentIntentId();
        java.lang.String str20 = order17.getPaymentIntentId();
        double double21 = order17.getTotalAmount();
        example.model.Address address22 = order17.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(address22);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde ORD-1775916886212", "2026-04-11 17:14:50", "ORD-1775916889693", 1.0d);
        java.lang.String str5 = product4.getId();
        java.lang.String str6 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str5, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889693" + "'", str6, "ORD-1775916889693");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        double double11 = order7.getTotalAmount();
        double double12 = order7.getTotalAmount();
        java.lang.Class<?> wildcardClass13 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "100) test0801(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916949611" + "'", str8, "ORD-1775916949611");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        java.util.List<example.model.CartItem> cartItemList9 = example.service.CartService.getCart();
        example.model.Order order12 = new example.model.Order("ORD-1775916887934", address6, cartItemList9, (double) 97, "ORD-1775916889159");
        example.service.OrderService.printReceipt(order12);
        java.util.List<example.model.CartItem> cartItemList14 = order12.getItems();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNotNull(cartItemList14);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) 10);
        example.model.Product product7 = cartItem6.getProduct();
        double double8 = product7.getPrice();
        org.junit.Assert.assertNotNull(product7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        example.model.Product product0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.service.CartService.addProduct(product0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        example.model.Address address9 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str10 = address9.getCountry();
        java.lang.String str11 = address9.getStreet();
        java.util.List<example.model.CartItem> cartItemList12 = example.service.CartService.getCart();
        example.model.Order order15 = new example.model.Order("ORD-1775916887934", address9, cartItemList12, (double) 97, "ORD-1775916889159");
        example.model.Address address22 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str23 = address22.getStreet();
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916887036", address22, (java.util.List<example.model.CartItem>) cartItemList25, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order32 = new example.model.Order("ORD-1775916894327", address9, (java.util.List<example.model.CartItem>) cartItemList25, (double) (short) -1, "ORD-1775916892828");
        example.model.Address address39 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str40 = address39.getCountry();
        java.lang.String str41 = address39.getStreet();
        example.model.Address address43 = null;
        example.model.CartItem[] cartItemArray44 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList45 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList45, cartItemArray44);
        example.model.Order order49 = new example.model.Order("", address43, (java.util.List<example.model.CartItem>) cartItemList45, 1.0d, "");
        example.model.Order order52 = example.service.OrderService.createOrder("ORD-1775916888151", address39, (java.util.List<example.model.CartItem>) cartItemList45, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order55 = new example.model.Order("ORD-1775916887934", address9, (java.util.List<example.model.CartItem>) cartItemList45, (double) 100, "ORD-1775916892053");
        example.model.Address address62 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str63 = address62.getCountry();
        java.lang.String str64 = address62.getStreet();
        example.model.Address address66 = null;
        example.model.CartItem[] cartItemArray67 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList68 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList68, cartItemArray67);
        example.model.Order order72 = new example.model.Order("", address66, (java.util.List<example.model.CartItem>) cartItemList68, 1.0d, "");
        example.model.Order order75 = example.service.OrderService.createOrder("ORD-1775916888151", address62, (java.util.List<example.model.CartItem>) cartItemList68, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order78 = new example.model.Order("ORD-1775916886687", address9, (java.util.List<example.model.CartItem>) cartItemList68, (double) 10.0f, "\ud83d\udcde PAID");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList12);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ORD-1775916886212" + "'", str41, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray44);
        org.junit.Assert.assertArrayEquals(cartItemArray44, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(order52);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ORD-1775916886212" + "'", str63, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ORD-1775916886212" + "'", str64, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray67);
        org.junit.Assert.assertArrayEquals(cartItemArray67, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(order75);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        example.model.Address address5 = new example.model.Address("ORD-1775916893477", "ORD-1775916893369", "ORD-1775916894406", "ORD-1775916890979", "ORD-1775916894811");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.toString();
        java.lang.String str8 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916893369" + "'", str6, "ORD-1775916893369");
// flaky "101) test0806(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916894811" + "'", str7, "\ud83d\udcde ORD-1775916894811");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916894811" + "'", str8, "ORD-1775916894811");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, 0);
        example.model.Product product15 = cartItem14.getProduct();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertNotNull(product15);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:15:12", "\ud83d\udcde ORD-1775916934258", "ORD-1775916898989", 10.0d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        example.service.CartService.removeProduct("ORD-1775916917032");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        example.service.CartService.removeProduct("ORD-1775916935720");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getPaymentIntentId();
        java.lang.Class<?> wildcardClass20 = order17.getClass();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        example.model.Product product4 = new example.model.Product("ORD-1775916937840", "2026-04-11 17:15:13", "ORD-1775916921063", (double) 'a');
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        example.model.Address address21 = null;
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = new example.model.Order("ORD-1775916886212", address21, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "ORD-1775916886040");
        example.model.Order order35 = new example.model.Order("ORD-1775916892053", address19, (java.util.List<example.model.CartItem>) cartItemList25, (double) 10, "ORD-1775916887494");
        java.lang.String str36 = address19.getPhone();
        java.lang.String str37 = address19.getPhone();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916886212" + "'", str36, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916889159", address6, (java.util.List<example.model.CartItem>) cartItemList16, (double) 100L, "ORD-1775916887611");
        example.model.Address address27 = order26.getAddress();
        java.lang.String str28 = order26.getOrderId();
        java.lang.String str29 = order26.getCustomerEmail();
        java.lang.String str30 = order26.getPaymentIntentId();
        java.lang.String str31 = order26.getStatus();
        java.lang.String str32 = order26.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "102) test0814(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertNotNull(address27);
// flaky "64) test0814(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916950084" + "'", str28, "ORD-1775916950084");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916889159" + "'", str29, "ORD-1775916889159");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916887611" + "'", str30, "ORD-1775916887611");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PAID" + "'", str31, "PAID");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        example.model.Address address5 = new example.model.Address("ORD-1775916889515", "ORD-1775916886687", "2026-04-11 17:14:48", "PAID", "ORD-1775916887036");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.getPhone();
        java.lang.String str8 = address5.getFullName();
// flaky "103) test0815(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916887036" + "'", str6, "\ud83d\udcde ORD-1775916887036");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916887036" + "'", str7, "ORD-1775916887036");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916889515" + "'", str8, "ORD-1775916889515");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) '4');
        double double15 = cartItem14.getSubtotal();
        java.lang.String str16 = cartItem14.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-52.0d) + "'", double15 == (-52.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-04-11 17:14:50  x52  = $-52.00" + "'", str16, "2026-04-11 17:14:50  x52  = $-52.00");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, 0);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 0);
        org.junit.Assert.assertNull(product3);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        example.model.Address address5 = new example.model.Address("ORD-1775916926346", "ORD-1775916904299", "ORD-1775916912970", "ORD-1775916924670", "ORD-1775916925213");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        example.service.CartService.removeProduct("ORD-1775916890749    x-1  = $-1.00");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        example.model.Address address9 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        example.model.Order order20 = new example.model.Order("2026-04-11 17:14:47", address9, (java.util.List<example.model.CartItem>) cartItemList13, (double) (-1.0f), "");
        java.lang.String str21 = address9.getPhone();
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = example.service.OrderService.createOrder("ORD-1775916889159", address9, (java.util.List<example.model.CartItem>) cartItemList25, (double) 1, "2026-04-11 17:14:52");
        java.lang.String str33 = address9.getPhone();
        example.model.Product product34 = null;
        example.model.CartItem cartItem36 = new example.model.CartItem(product34, (int) (short) 1);
        example.model.Product product37 = cartItem36.getProduct();
        example.model.Product product38 = cartItem36.getProduct();
        cartItem36.setQuantity((int) (short) -1);
        int int41 = cartItem36.getQuantity();
        example.model.Product product42 = null;
        example.model.CartItem cartItem44 = new example.model.CartItem(product42, (int) 'a');
        example.model.Product product45 = cartItem44.getProduct();
        int int46 = cartItem44.getQuantity();
        cartItem44.setQuantity((int) 'a');
        example.model.Product product49 = null;
        example.model.CartItem cartItem51 = new example.model.CartItem(product49, (int) (short) 1);
        example.model.Product product52 = cartItem51.getProduct();
        example.model.Product product53 = cartItem51.getProduct();
        example.model.Product product54 = null;
        example.model.CartItem cartItem56 = new example.model.CartItem(product54, (int) (short) 1);
        example.model.Product product57 = cartItem56.getProduct();
        cartItem56.setQuantity((int) (short) 1);
        example.model.Product product60 = null;
        example.model.CartItem cartItem62 = new example.model.CartItem(product60, (int) 'a');
        example.model.Product product63 = cartItem62.getProduct();
        int int64 = cartItem62.getQuantity();
        example.model.CartItem[] cartItemArray65 = new example.model.CartItem[] { cartItem36, cartItem44, cartItem51, cartItem56, cartItem62 };
        java.util.ArrayList<example.model.CartItem> cartItemList66 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList66, cartItemArray65);
        example.model.Order order70 = new example.model.Order("ORD-1775916886687", address9, (java.util.List<example.model.CartItem>) cartItemList66, (double) 97, "hi!");
        example.model.Address address72 = null;
        example.model.CartItem[] cartItemArray73 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList74 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList74, cartItemArray73);
        example.model.Order order78 = new example.model.Order("", address72, (java.util.List<example.model.CartItem>) cartItemList74, 1.0d, "");
        java.lang.String str79 = order78.getOrderId();
        java.lang.String str80 = order78.getOrderId();
        example.model.Address address81 = order78.getAddress();
        java.lang.String str82 = order78.getStatus();
        java.lang.String str83 = order78.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList84 = order78.getItems();
        double double85 = order78.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList86 = order78.getItems();
        example.model.Order order89 = example.service.OrderService.createOrder("ORD-1775916914333", address9, cartItemList86, (double) 10, "ORD-1775916905114");
        java.util.List<example.model.CartItem> cartItemList90 = order89.getItems();
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(order32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916886212" + "'", str33, "ORD-1775916886212");
        org.junit.Assert.assertNull(product37);
        org.junit.Assert.assertNull(product38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNull(product45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertNull(product52);
        org.junit.Assert.assertNull(product53);
        org.junit.Assert.assertNull(product57);
        org.junit.Assert.assertNull(product63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertNotNull(cartItemArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(cartItemArray73);
        org.junit.Assert.assertArrayEquals(cartItemArray73, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
// flaky "104) test0821(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916950285" + "'", str79, "ORD-1775916950285");
// flaky "65) test0821(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ORD-1775916950285" + "'", str80, "ORD-1775916950285");
        org.junit.Assert.assertNull(address81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "PAID" + "'", str82, "PAID");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(cartItemList84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList86);
        org.junit.Assert.assertNotNull(order89);
        org.junit.Assert.assertNotNull(cartItemList90);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        example.service.CartService.removeProduct("ORD-1775916906473");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        example.service.OrderService.printReceipt(order17);
        java.lang.String str20 = order17.getPaymentIntentId();
        example.model.Address address21 = order17.getAddress();
        java.lang.String str22 = address21.toString();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(address21);
// flaky "105) test0823(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str22, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) -1);
        int int7 = cartItem2.getQuantity();
        example.model.Product product8 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "106) test0825(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916950427" + "'", str8, "ORD-1775916950427");
// flaky "66) test0825(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916950427" + "'", str9, "ORD-1775916950427");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        java.lang.String str13 = order7.getStatus();
        java.lang.String str14 = order7.getCreatedAt();
        java.lang.String str15 = order7.getCustomerEmail();
        java.lang.String str16 = order7.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList17 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "107) test0826(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916950456" + "'", str8, "ORD-1775916950456");
// flaky "67) test0826(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916950456" + "'", str9, "ORD-1775916950456");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
// flaky "32) test0826(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:50" + "'", str14, "2026-04-11 17:15:50");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "9) test0826(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-04-11 17:15:50" + "'", str16, "2026-04-11 17:15:50");
        org.junit.Assert.assertNotNull(cartItemList17);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getStreet();
        java.lang.String str21 = address19.getFullName();
        example.model.Address address29 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address31 = null;
        example.model.CartItem[] cartItemArray32 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList33 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList33, cartItemArray32);
        example.model.Order order37 = new example.model.Order("", address31, (java.util.List<example.model.CartItem>) cartItemList33, 1.0d, "");
        example.model.Order order40 = new example.model.Order("2026-04-11 17:14:47", address29, (java.util.List<example.model.CartItem>) cartItemList33, (double) (-1.0f), "");
        example.model.Address address41 = order40.getAddress();
        java.lang.String str42 = address41.getCountry();
        java.lang.String str43 = address41.getCity();
        example.model.Address address51 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str52 = address51.getCountry();
        java.lang.String str53 = address51.getStreet();
        example.model.Address address55 = null;
        example.model.Address address57 = null;
        example.model.CartItem[] cartItemArray58 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList59 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList59, cartItemArray58);
        example.model.Order order63 = new example.model.Order("", address57, (java.util.List<example.model.CartItem>) cartItemList59, 1.0d, "");
        example.model.Order order66 = new example.model.Order("ORD-1775916886212", address55, (java.util.List<example.model.CartItem>) cartItemList59, 1.0d, "ORD-1775916886040");
        example.model.Order order69 = new example.model.Order("ORD-1775916893369", address51, (java.util.List<example.model.CartItem>) cartItemList59, (double) 52, "2026-04-11 17:14:52");
        example.model.Address address71 = null;
        example.model.CartItem[] cartItemArray72 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList73 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList73, cartItemArray72);
        example.model.Order order77 = new example.model.Order("", address71, (java.util.List<example.model.CartItem>) cartItemList73, 1.0d, "");
        java.lang.String str78 = order77.getOrderId();
        example.model.Address address79 = order77.getAddress();
        java.lang.String str80 = order77.getCreatedAt();
        java.lang.String str81 = order77.getCreatedAt();
        example.model.Address address82 = order77.getAddress();
        java.util.List<example.model.CartItem> cartItemList83 = order77.getItems();
        example.model.Order order86 = new example.model.Order("ORD-1775916903519", address51, cartItemList83, 35.0d, "ORD-1775916891938");
        example.model.Order order89 = new example.model.Order("\ud83d\udcde ORD-1775916886212", address41, cartItemList83, (double) (short) 1, "ORD-1775916916776");
        example.model.Order order92 = example.service.OrderService.createOrder("ORD-1775916943324", address19, cartItemList83, (double) 1L, "ORD-1775916894903");
        java.lang.String str93 = order92.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(cartItemArray32);
        org.junit.Assert.assertArrayEquals(cartItemArray32, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(address41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ORD-1775916886212" + "'", str42, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ORD-1775916886212" + "'", str52, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ORD-1775916886212" + "'", str53, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray58);
        org.junit.Assert.assertArrayEquals(cartItemArray58, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cartItemArray72);
        org.junit.Assert.assertArrayEquals(cartItemArray72, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky "108) test0827(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ORD-1775916950544" + "'", str78, "ORD-1775916950544");
        org.junit.Assert.assertNull(address79);
// flaky "68) test0827(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "2026-04-11 17:15:50" + "'", str80, "2026-04-11 17:15:50");
// flaky "33) test0827(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "2026-04-11 17:15:50" + "'", str81, "2026-04-11 17:15:50");
        org.junit.Assert.assertNull(address82);
        org.junit.Assert.assertNotNull(cartItemList83);
        org.junit.Assert.assertNotNull(order92);
// flaky "10) test0827(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str93 + "' != '" + "2026-04-11 17:15:50" + "'", str93, "2026-04-11 17:15:50");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916915644");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = new example.model.Order("2026-04-11 17:14:47", address18, (java.util.List<example.model.CartItem>) cartItemList22, (double) (-1.0f), "");
        example.model.Address address30 = order29.getAddress();
        example.model.Address address32 = null;
        example.model.Address address34 = null;
        example.model.CartItem[] cartItemArray35 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList36 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList36, cartItemArray35);
        example.model.Order order40 = new example.model.Order("", address34, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "");
        example.model.Order order43 = new example.model.Order("ORD-1775916886212", address32, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "ORD-1775916886040");
        example.model.Order order46 = new example.model.Order("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList36, (double) 10, "ORD-1775916887494");
        example.model.Address address48 = null;
        example.model.CartItem[] cartItemArray49 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList50 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList50, cartItemArray49);
        example.model.Order order54 = new example.model.Order("", address48, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "");
        example.model.Order order57 = example.service.OrderService.createOrder("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList50, 0.0d, "2026-04-11 17:14:52");
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916894406", address6, (java.util.List<example.model.CartItem>) cartItemList50, 35.0d, "ORD-1775916888578");
        java.lang.String str61 = address6.getFullName();
        java.lang.String str62 = address6.getStreet();
        java.lang.String str63 = address6.getPhone();
        java.lang.String str64 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertNotNull(cartItemArray35);
        org.junit.Assert.assertArrayEquals(cartItemArray35, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cartItemArray49);
        org.junit.Assert.assertArrayEquals(cartItemArray49, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(order57);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ORD-1775916886212" + "'", str62, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ORD-1775916886212" + "'", str63, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ORD-1775916886212" + "'", str64, "ORD-1775916886212");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        example.model.Product product4 = new example.model.Product("ORD-1775916900332", "ORD-1775916926649", "ORD-1775916917320", (double) 52);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (byte) 10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:15:00", "ORD-1775916916131", "ORD-1775916894246", "ORD-1775916930720", "ORD-1775916926649");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916894811", address6, (java.util.List<example.model.CartItem>) cartItemList15, (double) 1.0f, "ORD-1775916894327");
        java.lang.String str26 = order25.getCustomerEmail();
        java.lang.String str27 = order25.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916894811" + "'", str26, "ORD-1775916894811");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916894811" + "'", str27, "ORD-1775916894811");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        example.model.Product product9 = cartItem6.getProduct();
        double double10 = cartItem6.getSubtotal();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        example.model.Address address6 = new example.model.Address("2026-04-11 17:14:51", "ORD-1775916894079", "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)", "ORD-1775916895177", "");
        java.lang.String str7 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str16 = address15.getPhone();
        java.lang.String str17 = address15.getFullName();
        java.lang.String str18 = address15.getPhone();
        java.lang.String str19 = address15.toString();
        example.model.Address address21 = null;
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = new example.model.Order("ORD-1775916886212", address21, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "ORD-1775916886040");
        example.model.Order order35 = example.service.OrderService.createOrder("ORD-1775916889159", address15, (java.util.List<example.model.CartItem>) cartItemList25, (double) 100L, "ORD-1775916887611");
        java.lang.String str36 = address15.getCountry();
        java.lang.String str37 = address15.getPhone();
        example.model.Address address44 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str45 = address44.getStreet();
        java.lang.String str46 = address44.getCountry();
        java.lang.String str47 = address44.getPhone();
        java.lang.String str48 = address44.getFullName();
        example.model.Address address55 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str56 = address55.getCountry();
        java.lang.String str57 = address55.getStreet();
        java.util.List<example.model.CartItem> cartItemList58 = example.service.CartService.getCart();
        example.model.Order order61 = new example.model.Order("ORD-1775916887934", address55, cartItemList58, (double) 97, "ORD-1775916889159");
        example.model.Order order64 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address44, cartItemList58, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order67 = example.service.OrderService.createOrder("2026-04-11 17:14:48", address15, cartItemList58, (double) 97, "\ud83d\udcde PAID");
        example.model.Order order70 = example.service.OrderService.createOrder("ORD-1775916923295", address6, cartItemList58, (double) 100.0f, "ORD-1775916912361");
        java.lang.String str71 = address6.getPhone();
        java.lang.String str72 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916895177" + "'", str7, "ORD-1775916895177");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
// flaky "109) test0835(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str19, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916886212" + "'", str36, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916886212" + "'", str45, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ORD-1775916886212" + "'", str46, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ORD-1775916886212" + "'", str47, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886212" + "'", str56, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ORD-1775916886212" + "'", str57, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList58);
        org.junit.Assert.assertNotNull(order64);
        org.junit.Assert.assertNotNull(order67);
        org.junit.Assert.assertNotNull(order70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2026-04-11 17:14:51" + "'", str72, "2026-04-11 17:14:51");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) '4');
        java.lang.String str15 = cartItem14.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:14:50  x52  = $-52.00" + "'", str15, "2026-04-11 17:14:50  x52  = $-52.00");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 1);
        cartItem2.setQuantity(1);
        int int8 = cartItem2.getQuantity();
        cartItem2.setQuantity(1);
        int int11 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        example.model.Address address12 = order7.getAddress();
        double double13 = order7.getTotalAmount();
        java.lang.String str14 = order7.getPaymentIntentId();
        java.lang.String str15 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "110) test0838(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916950947" + "'", str8, "ORD-1775916950947");
        org.junit.Assert.assertNull(address9);
// flaky "69) test0838(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:50" + "'", str10, "2026-04-11 17:15:50");
// flaky "34) test0838(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:50" + "'", str11, "2026-04-11 17:15:50");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, 0);
        java.lang.String str9 = product4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916889515" + "'", str9, "ORD-1775916889515");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getCountry();
        java.lang.String str10 = address8.getStreet();
        java.util.List<example.model.CartItem> cartItemList11 = example.service.CartService.getCart();
        example.model.Order order14 = new example.model.Order("ORD-1775916887934", address8, cartItemList11, (double) 97, "ORD-1775916889159");
        example.model.Address address21 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str22 = address21.getStreet();
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916887036", address21, (java.util.List<example.model.CartItem>) cartItemList24, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order31 = new example.model.Order("ORD-1775916894327", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (short) -1, "ORD-1775916892828");
        java.lang.String str32 = order31.getStatus();
        java.lang.String str33 = order31.getOrderId();
        example.model.Address address34 = order31.getAddress();
        example.model.Address address41 = new example.model.Address("ORD-1775916903896", "ORD-1775916895177", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916887228", "ORD-1775916897794");
        example.model.Address address48 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str49 = address48.getCountry();
        java.lang.String str50 = address48.getStreet();
        example.model.Address address52 = null;
        example.model.CartItem[] cartItemArray53 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList54 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList54, cartItemArray53);
        example.model.Order order58 = new example.model.Order("", address52, (java.util.List<example.model.CartItem>) cartItemList54, 1.0d, "");
        example.model.Order order61 = example.service.OrderService.createOrder("ORD-1775916888151", address48, (java.util.List<example.model.CartItem>) cartItemList54, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order64 = new example.model.Order("ORD-1775916923295", address41, (java.util.List<example.model.CartItem>) cartItemList54, (double) 100L, "ORD-1775916897794");
        example.model.Order order67 = example.service.OrderService.createOrder("ORD-1775916916751", address34, (java.util.List<example.model.CartItem>) cartItemList54, 1.0d, "ORD-1775916943877");
        example.service.OrderService.printReceipt(order67);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
// flaky "111) test0840(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916951044" + "'", str33, "ORD-1775916951044");
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ORD-1775916886212" + "'", str49, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916886212" + "'", str50, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray53);
        org.junit.Assert.assertArrayEquals(cartItemArray53, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(order61);
        org.junit.Assert.assertNotNull(order67);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.util.List<example.model.CartItem> cartItemList14 = order13.getItems();
        java.lang.String str15 = order13.getStatus();
        double double16 = order13.getTotalAmount();
        java.lang.String str17 = order13.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(cartItemList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916887036" + "'", str17, "ORD-1775916887036");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        java.lang.String str10 = order7.getPaymentIntentId();
        java.lang.String str11 = order7.getStatus();
        double double12 = order7.getTotalAmount();
        java.lang.String str13 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "112) test0842(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916951127" + "'", str8, "ORD-1775916951127");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
// flaky "70) test0842(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916951127" + "'", str13, "ORD-1775916951127");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 10);
        cartItem11.setQuantity((int) (short) 10);
        java.lang.String str14 = cartItem11.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:14:50  x10  = $-10.00" + "'", str14, "2026-04-11 17:14:50  x10  = $-10.00");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        java.lang.String str14 = order7.getCustomerEmail();
        java.lang.String str15 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "113) test0844(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916951187" + "'", str8, "ORD-1775916951187");
        org.junit.Assert.assertNull(address9);
// flaky "71) test0844(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:51" + "'", str10, "2026-04-11 17:15:51");
// flaky "35) test0844(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:51" + "'", str11, "2026-04-11 17:15:51");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        int int12 = cartItem9.getQuantity();
        cartItem9.setQuantity((int) (byte) 1);
        int int15 = cartItem9.getQuantity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        int int9 = cartItem8.getQuantity();
        example.model.Product product10 = cartItem8.getProduct();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(product10);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        example.model.Product product4 = new example.model.Product("ORD-1775916891335", "ORD-1775916893211", "ORD-1775916892121", (double) 100.0f);
        java.lang.String str5 = product4.getDescription();
        example.model.CartItem cartItem7 = new example.model.CartItem(product4, 10);
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916892121" + "'", str5, "ORD-1775916892121");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916891335" + "'", str8, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916892121" + "'", str9, "ORD-1775916892121");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = new example.model.Order("2026-04-11 17:14:47", address18, (java.util.List<example.model.CartItem>) cartItemList22, (double) (-1.0f), "");
        example.model.Address address30 = order29.getAddress();
        example.model.Address address32 = null;
        example.model.Address address34 = null;
        example.model.CartItem[] cartItemArray35 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList36 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList36, cartItemArray35);
        example.model.Order order40 = new example.model.Order("", address34, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "");
        example.model.Order order43 = new example.model.Order("ORD-1775916886212", address32, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "ORD-1775916886040");
        example.model.Order order46 = new example.model.Order("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList36, (double) 10, "ORD-1775916887494");
        example.model.Address address48 = null;
        example.model.CartItem[] cartItemArray49 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList50 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList50, cartItemArray49);
        example.model.Order order54 = new example.model.Order("", address48, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "");
        example.model.Order order57 = example.service.OrderService.createOrder("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList50, 0.0d, "2026-04-11 17:14:52");
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916894406", address6, (java.util.List<example.model.CartItem>) cartItemList50, 35.0d, "ORD-1775916888578");
        java.lang.String str61 = address6.getFullName();
        java.lang.String str62 = address6.getStreet();
        java.lang.String str63 = address6.getFullName();
        java.lang.String str64 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertNotNull(cartItemArray35);
        org.junit.Assert.assertArrayEquals(cartItemArray35, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cartItemArray49);
        org.junit.Assert.assertArrayEquals(cartItemArray49, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(order57);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ORD-1775916886212" + "'", str62, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ORD-1775916886212" + "'", str64, "ORD-1775916886212");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde 2026-04-11 17:15:03", "ORD-1775916932901", "ORD-1775916906473", (-100.0d));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        example.model.Address address5 = new example.model.Address("ORD-1775916905284", "ORD-1775916892121", "ORD-1775916888578", "ORD-1775916887228", "2026-04-11 17:14:57");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:57" + "'", str6, "2026-04-11 17:14:57");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:57" + "'", str7, "2026-04-11 17:14:57");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getCountry();
        java.lang.String str9 = address7.getStreet();
        java.util.List<example.model.CartItem> cartItemList10 = example.service.CartService.getCart();
        example.model.Order order13 = new example.model.Order("ORD-1775916887934", address7, cartItemList10, (double) 97, "ORD-1775916889159");
        example.model.Address address20 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str21 = address20.getStreet();
        example.model.CartItem[] cartItemArray22 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList23 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList23, cartItemArray22);
        example.model.Order order27 = example.service.OrderService.createOrder("ORD-1775916887036", address20, (java.util.List<example.model.CartItem>) cartItemList23, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order30 = new example.model.Order("ORD-1775916894327", address7, (java.util.List<example.model.CartItem>) cartItemList23, (double) (short) -1, "ORD-1775916892828");
        java.lang.String str31 = address7.getStreet();
        java.lang.String str32 = address7.getCountry();
        java.lang.String str33 = address7.getStreet();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916886212" + "'", str32, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916886212" + "'", str33, "ORD-1775916886212");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getStreet();
        java.lang.String str10 = address8.getFullName();
        java.lang.String str11 = address8.getStreet();
        example.model.Address address13 = null;
        example.model.Address address15 = null;
        example.model.CartItem[] cartItemArray16 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList17 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList17, cartItemArray16);
        example.model.Order order21 = new example.model.Order("", address15, (java.util.List<example.model.CartItem>) cartItemList17, 1.0d, "");
        example.model.Order order24 = new example.model.Order("ORD-1775916886212", address13, (java.util.List<example.model.CartItem>) cartItemList17, 1.0d, "ORD-1775916886040");
        example.model.Order order27 = new example.model.Order("ORD-1775916894811", address8, (java.util.List<example.model.CartItem>) cartItemList17, (double) 1.0f, "ORD-1775916894327");
        java.lang.String str28 = address8.getCity();
        example.model.Address address30 = null;
        example.model.Address address32 = null;
        example.model.CartItem[] cartItemArray33 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList34 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList34, cartItemArray33);
        example.model.Order order38 = new example.model.Order("", address32, (java.util.List<example.model.CartItem>) cartItemList34, 1.0d, "");
        example.model.Order order41 = new example.model.Order("ORD-1775916886212", address30, (java.util.List<example.model.CartItem>) cartItemList34, 1.0d, "ORD-1775916886040");
        example.model.Order order44 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList34, (double) (byte) -1, "2026-04-11 17:14:50");
        example.model.Address address52 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address54 = null;
        example.model.CartItem[] cartItemArray55 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList56 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList56, cartItemArray55);
        example.model.Order order60 = new example.model.Order("", address54, (java.util.List<example.model.CartItem>) cartItemList56, 1.0d, "");
        example.model.Order order63 = new example.model.Order("2026-04-11 17:14:47", address52, (java.util.List<example.model.CartItem>) cartItemList56, (double) (-1.0f), "");
        example.model.Address address64 = order63.getAddress();
        example.model.Address address66 = null;
        example.model.Address address68 = null;
        example.model.CartItem[] cartItemArray69 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList70 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList70, cartItemArray69);
        example.model.Order order74 = new example.model.Order("", address68, (java.util.List<example.model.CartItem>) cartItemList70, 1.0d, "");
        example.model.Order order77 = new example.model.Order("ORD-1775916886212", address66, (java.util.List<example.model.CartItem>) cartItemList70, 1.0d, "ORD-1775916886040");
        example.model.Order order80 = new example.model.Order("ORD-1775916892053", address64, (java.util.List<example.model.CartItem>) cartItemList70, (double) 10, "ORD-1775916887494");
        example.model.Order order83 = example.service.OrderService.createOrder("ORD-1775916917827", address8, (java.util.List<example.model.CartItem>) cartItemList70, (double) 1, "ORD-1775916941170");
        double double84 = order83.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray16);
        org.junit.Assert.assertArrayEquals(cartItemArray16, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray33);
        org.junit.Assert.assertArrayEquals(cartItemArray33, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cartItemArray55);
        org.junit.Assert.assertArrayEquals(cartItemArray55, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(address64);
        org.junit.Assert.assertNotNull(cartItemArray69);
        org.junit.Assert.assertArrayEquals(cartItemArray69, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(order83);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 1.0d + "'", double84 == 1.0d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getStatus();
        example.model.Address address13 = order7.getAddress();
        example.model.Address address14 = order7.getAddress();
        double double15 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "114) test0853(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916951579" + "'", str8, "ORD-1775916951579");
// flaky "72) test0853(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916951579" + "'", str9, "ORD-1775916951579");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        java.lang.String str18 = order17.getOrderId();
        java.util.List<example.model.CartItem> cartItemList19 = order17.getItems();
        example.model.Order order22 = example.service.OrderService.createOrder("ORD-1775916887934", address6, cartItemList19, (double) '4', "ORD-1775916886212");
        java.lang.String str23 = address6.getPhone();
        java.lang.String str24 = address6.getPhone();
        java.lang.String str25 = address6.getCountry();
        java.lang.String str26 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "115) test0854(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916951623" + "'", str18, "ORD-1775916951623");
        org.junit.Assert.assertNotNull(cartItemList19);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916886212" + "'", str24, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
// flaky "73) test0854(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str26, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = new example.model.Order("2026-04-11 17:14:47", address18, (java.util.List<example.model.CartItem>) cartItemList22, (double) (-1.0f), "");
        example.model.Address address30 = order29.getAddress();
        example.model.Address address32 = null;
        example.model.Address address34 = null;
        example.model.CartItem[] cartItemArray35 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList36 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList36, cartItemArray35);
        example.model.Order order40 = new example.model.Order("", address34, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "");
        example.model.Order order43 = new example.model.Order("ORD-1775916886212", address32, (java.util.List<example.model.CartItem>) cartItemList36, 1.0d, "ORD-1775916886040");
        example.model.Order order46 = new example.model.Order("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList36, (double) 10, "ORD-1775916887494");
        example.model.Address address48 = null;
        example.model.CartItem[] cartItemArray49 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList50 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList50, cartItemArray49);
        example.model.Order order54 = new example.model.Order("", address48, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "");
        example.model.Order order57 = example.service.OrderService.createOrder("ORD-1775916892053", address30, (java.util.List<example.model.CartItem>) cartItemList50, 0.0d, "2026-04-11 17:14:52");
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916894406", address6, (java.util.List<example.model.CartItem>) cartItemList50, 35.0d, "ORD-1775916888578");
        example.model.Address address61 = order60.getAddress();
        java.lang.String str62 = address61.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertNotNull(cartItemArray35);
        org.junit.Assert.assertArrayEquals(cartItemArray35, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cartItemArray49);
        org.junit.Assert.assertArrayEquals(cartItemArray49, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(order57);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertNotNull(address61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        example.model.Product product4 = new example.model.Product("ORD-1775916894811", "ORD-1775916935354", "ORD-1775916932618", (double) 0);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getFullName();
        java.util.List<example.model.CartItem> cartItemList10 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916891615    x10  = $1000.00", address6, cartItemList10, (double) 1, "ORD-1775916887036");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because the return value of \"example.model.Order.getItems()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        example.model.Address address5 = new example.model.Address("ORD-1775916888257", "ORD-1775916886040", "ORD-1775916887494", "ORD-1775916888151", "PAID");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.toString();
// flaky "116) test0858(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde PAID" + "'", str6, "\ud83d\udcde PAID");
// flaky "74) test0858(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde PAID" + "'", str7, "\ud83d\udcde PAID");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        example.model.Address address5 = new example.model.Address("ORD-1775916951044", "ORD-1775916937840", "ORD-1775916912778", "ORD-1775916902070", "ORD-1775916938905");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        example.model.Address address11 = order7.getAddress();
        java.lang.String str12 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "117) test0860(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916951888" + "'", str8, "ORD-1775916951888");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        example.service.CartService.removeProduct("ORD-1775916947179");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        example.model.Product product9 = cartItem2.getProduct();
        int int10 = cartItem2.getQuantity();
        example.model.Product product11 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        example.model.Product product4 = new example.model.Product("PAID", "ORD-1775916912970", "", (double) (byte) -1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) ' ');
        double double9 = cartItem8.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-32.0d) + "'", double9 == (-32.0d));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        example.model.Address address5 = new example.model.Address("ORD-1775916887611", "ORD-1775916887828", "ORD-1775916902814", "ORD-1775916902814", "");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.toString();
        java.lang.String str9 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916902814" + "'", str6, "ORD-1775916902814");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916902814" + "'", str7, "ORD-1775916902814");
// flaky "118) test0864(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde " + "'", str8, "\ud83d\udcde ");
// flaky "75) test0864(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud83d\udcde " + "'", str9, "\ud83d\udcde ");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        example.model.Address address5 = new example.model.Address("ORD-1775916904159", "2026-04-11 17:15:28", "ORD-1775916906412", "ORD-1775916944503", "ORD-1775916899284");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        double double9 = cartItem8.getSubtotal();
        cartItem8.setQuantity((int) '#');
        cartItem8.setQuantity((int) (short) 1);
        example.model.Product product14 = cartItem8.getProduct();
        cartItem8.setQuantity(52);
        int int17 = cartItem8.getQuantity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(product14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getCountry();
        java.lang.String str9 = address7.getStreet();
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        example.model.Order order20 = example.service.OrderService.createOrder("ORD-1775916888151", address7, (java.util.List<example.model.CartItem>) cartItemList13, (double) ' ', "2026-04-11 17:14:48");
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        java.lang.String str29 = order28.getOrderId();
        java.util.List<example.model.CartItem> cartItemList30 = order28.getItems();
        example.model.Address address31 = order28.getAddress();
        java.lang.String str32 = order28.getCreatedAt();
        double double33 = order28.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList34 = order28.getItems();
        example.model.Order order37 = example.service.OrderService.createOrder("2026-04-11 17:15:15", address7, cartItemList34, 0.0d, "ORD-1775916904299");
        java.lang.String str38 = address7.getStreet();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(order20);
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "119) test0867(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916952205" + "'", str29, "ORD-1775916952205");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNull(address31);
// flaky "76) test0867(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2026-04-11 17:15:52" + "'", str32, "2026-04-11 17:15:52");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList34);
        org.junit.Assert.assertNotNull(order37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916886212" + "'", str38, "ORD-1775916886212");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916947818");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        cartItem9.setQuantity((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity(97);
        int int13 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.util.List<example.model.CartItem> cartItemList14 = order13.getItems();
        java.lang.String str15 = order13.getStatus();
        java.lang.String str16 = order13.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(cartItemList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916887166" + "'", str16, "ORD-1775916887166");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        example.model.Product product9 = cartItem6.getProduct();
        java.lang.String str10 = product9.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        example.model.Address address12 = order7.getAddress();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        double double14 = order7.getTotalAmount();
        double double15 = order7.getTotalAmount();
        java.lang.String str16 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "120) test0873(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916952447" + "'", str8, "ORD-1775916952447");
        org.junit.Assert.assertNull(address9);
// flaky "77) test0873(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:52" + "'", str10, "2026-04-11 17:15:52");
// flaky "36) test0873(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:52" + "'", str11, "2026-04-11 17:15:52");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.getPhone();
        java.lang.String str20 = address18.toString();
        java.lang.String str21 = address18.getPhone();
        java.lang.String str22 = address18.getFullName();
        java.lang.String str23 = address18.getFullName();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
// flaky "121) test0874(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        example.service.CartService.removeProduct("[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:14:51", "ORD-1775916894079", "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)", "ORD-1775916895177", "");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916895177" + "'", str6, "ORD-1775916895177");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:51" + "'", str7, "2026-04-11 17:14:51");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)" + "'", str8, "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getStreet();
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        java.lang.String str29 = order28.getOrderId();
        java.util.List<example.model.CartItem> cartItemList30 = order28.getItems();
        example.model.Order order33 = new example.model.Order("ORD-1775916890225", address19, cartItemList30, (double) (byte) -1, "");
        java.lang.String str34 = order33.getCustomerEmail();
        example.service.OrderService.printReceipt(order33);
        java.lang.String str36 = order33.getStatus();
        java.lang.String str37 = order33.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "122) test0877(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916952605" + "'", str29, "ORD-1775916952605");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916890225" + "'", str34, "ORD-1775916890225");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PAID" + "'", str36, "PAID");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916890225" + "'", str37, "ORD-1775916890225");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916894811", address6, (java.util.List<example.model.CartItem>) cartItemList15, (double) 1.0f, "ORD-1775916894327");
        java.lang.String str26 = address6.getCity();
        java.lang.String str27 = address6.getCity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        example.model.Address address5 = new example.model.Address("ORD-1775916931611", "ORD-1775916929571", "ORD-1775916941042", "ORD-1775916939357", "ORD-1775916926346");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, (int) (short) 0);
        double double11 = cartItem10.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        example.service.CartService.addProduct(product4, (int) (byte) 0);
        example.service.CartService.addProduct(product4, (int) (short) 100);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = example.service.OrderService.createOrder("ORD-1775916888151", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) ' ', "2026-04-11 17:14:48");
        java.lang.String str20 = address6.getCity();
        java.lang.String str21 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList11 = order7.getItems();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "123) test0883(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916952791" + "'", str8, "ORD-1775916952791");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList11);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        example.model.Product product4 = new example.model.Product("ORD-1775916933806", "ORD-1775916950427", "ORD-1775916940058", (double) 100L);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        java.lang.String str9 = product4.getId();
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916892568" + "'", str9, "ORD-1775916892568");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        example.model.Address address5 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky "124) test0886(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde " + "'", str7, "\ud83d\udcde ");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        example.model.Address address12 = null;
        example.model.Address address14 = null;
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = new example.model.Order("", address14, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "");
        example.model.Order order23 = new example.model.Order("ORD-1775916886212", address12, (java.util.List<example.model.CartItem>) cartItemList16, 1.0d, "ORD-1775916886040");
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916889159", address6, (java.util.List<example.model.CartItem>) cartItemList16, (double) 100L, "ORD-1775916887611");
        java.lang.String str27 = order26.getOrderId();
        java.lang.String str28 = order26.getCreatedAt();
        java.lang.String str29 = order26.getCustomerEmail();
        java.lang.String str30 = order26.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "125) test0887(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "78) test0887(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916952962" + "'", str27, "ORD-1775916952962");
// flaky "37) test0887(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2026-04-11 17:15:52" + "'", str28, "2026-04-11 17:15:52");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916889159" + "'", str29, "ORD-1775916889159");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916889159" + "'", str30, "ORD-1775916889159");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        example.service.OrderService.printReceipt(order17);
        example.service.OrderService.printReceipt(order17);
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        example.model.Address address12 = null;
        example.model.CartItem[] cartItemArray13 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList14 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList14, cartItemArray13);
        example.model.Order order18 = new example.model.Order("", address12, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "");
        example.model.Order order21 = new example.model.Order("ORD-1775916899079", address6, (java.util.List<example.model.CartItem>) cartItemList14, (double) 0.0f, "ORD-1775916887828");
        java.lang.String str22 = address6.getCity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "126) test0889(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        double double15 = order13.getTotalAmount();
        example.service.OrderService.printReceipt(order13);
        double double17 = order13.getTotalAmount();
        java.lang.String str18 = order13.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916887036" + "'", str18, "ORD-1775916887036");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916918224");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getCountry();
        java.lang.String str10 = address8.getStreet();
        java.util.List<example.model.CartItem> cartItemList11 = example.service.CartService.getCart();
        example.model.Order order14 = new example.model.Order("ORD-1775916887934", address8, cartItemList11, (double) 97, "ORD-1775916889159");
        example.model.Address address21 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str22 = address21.getStreet();
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916887036", address21, (java.util.List<example.model.CartItem>) cartItemList24, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order31 = new example.model.Order("ORD-1775916894327", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (short) -1, "ORD-1775916892828");
        java.lang.String str32 = address8.getStreet();
        java.lang.String str33 = address8.getCountry();
        example.model.Address address41 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address43 = null;
        example.model.CartItem[] cartItemArray44 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList45 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList45, cartItemArray44);
        example.model.Order order49 = new example.model.Order("", address43, (java.util.List<example.model.CartItem>) cartItemList45, 1.0d, "");
        example.model.Order order52 = new example.model.Order("2026-04-11 17:14:47", address41, (java.util.List<example.model.CartItem>) cartItemList45, (double) (-1.0f), "");
        example.model.Address address53 = order52.getAddress();
        java.lang.String str54 = address53.getStreet();
        example.model.Address address56 = null;
        example.model.CartItem[] cartItemArray57 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList58 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList58, cartItemArray57);
        example.model.Order order62 = new example.model.Order("", address56, (java.util.List<example.model.CartItem>) cartItemList58, 1.0d, "");
        java.lang.String str63 = order62.getOrderId();
        java.util.List<example.model.CartItem> cartItemList64 = order62.getItems();
        example.model.Order order67 = new example.model.Order("ORD-1775916890225", address53, cartItemList64, (double) (byte) -1, "");
        example.model.Order order70 = new example.model.Order("", address8, cartItemList64, (double) 0L, "ORD-1775916926618");
        example.service.OrderService.printReceipt(order70);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916886212" + "'", str32, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916886212" + "'", str33, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray44);
        org.junit.Assert.assertArrayEquals(cartItemArray44, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(address53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ORD-1775916886212" + "'", str54, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray57);
        org.junit.Assert.assertArrayEquals(cartItemArray57, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
// flaky "127) test0892(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ORD-1775916953271" + "'", str63, "ORD-1775916953271");
        org.junit.Assert.assertNotNull(cartItemList64);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) (short) 1);
        java.lang.String str15 = cartItem14.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str15, "ORD-1775916890749    x1  = $1.00");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916891135", "ORD-1775916899155", "2026-04-11 17:14:47", "ORD-1775916892568");
        java.lang.String str6 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891135" + "'", str6, "ORD-1775916891135");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        cartItem6.setQuantity((int) 'a');
        java.lang.String str9 = cartItem6.toString();
        example.model.Product product10 = cartItem6.getProduct();
        double double11 = cartItem6.getSubtotal();
        cartItem6.setQuantity(10);
        double double14 = cartItem6.getSubtotal();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749    x97  = $97.00" + "'", str9, "ORD-1775916890749    x97  = $97.00");
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) 1);
        java.lang.String str7 = cartItem6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str7, "ORD-1775916890749    x1  = $1.00");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        java.lang.String str13 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str13, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        example.model.Order order20 = new example.model.Order("ORD-1775916886212", address9, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "ORD-1775916886040");
        example.model.Order order23 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address7, (java.util.List<example.model.CartItem>) cartItemList13, (double) (short) 0, "ORD-1775916903429");
        java.lang.String str24 = address7.getStreet();
        example.model.Address address26 = null;
        example.model.CartItem[] cartItemArray27 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList28 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList28, cartItemArray27);
        example.model.Order order32 = new example.model.Order("", address26, (java.util.List<example.model.CartItem>) cartItemList28, 1.0d, "");
        java.lang.String str33 = order32.getOrderId();
        example.model.Address address34 = order32.getAddress();
        java.lang.String str35 = order32.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList36 = order32.getItems();
        example.model.Order order39 = new example.model.Order("ORD-1775916905034", address7, cartItemList36, (double) (-1L), "ORD-1775916898186");
        java.lang.Class<?> wildcardClass40 = order39.getClass();
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(order23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916886212" + "'", str24, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray27);
        org.junit.Assert.assertArrayEquals(cartItemArray27, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky "128) test0898(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916953470" + "'", str33, "ORD-1775916953470");
        org.junit.Assert.assertNull(address34);
// flaky "79) test0898(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2026-04-11 17:15:53" + "'", str35, "2026-04-11 17:15:53");
        org.junit.Assert.assertNotNull(cartItemList36);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        example.model.Product product0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.service.CartService.addProduct(product0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getStreet();
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = example.service.OrderService.createOrder("ORD-1775916887036", address7, (java.util.List<example.model.CartItem>) cartItemList10, (double) 10.0f, "ORD-1775916887166");
        example.model.Address address16 = null;
        example.model.Address address18 = null;
        example.model.CartItem[] cartItemArray19 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList20 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList20, cartItemArray19);
        example.model.Order order24 = new example.model.Order("", address18, (java.util.List<example.model.CartItem>) cartItemList20, 1.0d, "");
        example.model.Order order27 = new example.model.Order("ORD-1775916886212", address16, (java.util.List<example.model.CartItem>) cartItemList20, 1.0d, "ORD-1775916886040");
        example.model.Order order30 = new example.model.Order("ORD-1775916894079", address7, (java.util.List<example.model.CartItem>) cartItemList20, (double) 100, "2026-04-11 17:14:58");
        java.lang.String str31 = order30.getOrderId();
        example.model.Address address32 = order30.getAddress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(order14);
        org.junit.Assert.assertNotNull(cartItemArray19);
        org.junit.Assert.assertArrayEquals(cartItemArray19, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "129) test0900(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916953695" + "'", str31, "ORD-1775916953695");
        org.junit.Assert.assertNotNull(address32);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str16 = address15.getStreet();
        java.lang.String str17 = address15.getCountry();
        java.lang.String str18 = address15.getPhone();
        java.lang.String str19 = address15.getFullName();
        example.model.Address address26 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str27 = address26.getCountry();
        java.lang.String str28 = address26.getStreet();
        java.util.List<example.model.CartItem> cartItemList29 = example.service.CartService.getCart();
        example.model.Order order32 = new example.model.Order("ORD-1775916887934", address26, cartItemList29, (double) 97, "ORD-1775916889159");
        example.model.Order order35 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address15, cartItemList29, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order38 = new example.model.Order("ORD-1775916895909", address6, cartItemList29, (double) 'a', "ORD-1775916887934");
        example.model.Address address39 = order38.getAddress();
        java.util.List<example.model.CartItem> cartItemList40 = order38.getItems();
        java.util.List<example.model.CartItem> cartItemList41 = order38.getItems();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList29);
        org.junit.Assert.assertNotNull(order35);
        org.junit.Assert.assertNotNull(address39);
        org.junit.Assert.assertNotNull(cartItemList40);
        org.junit.Assert.assertNotNull(cartItemList41);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        cartItem2.setQuantity(100);
        java.lang.Class<?> wildcardClass5 = cartItem2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        example.service.CartService.removeProduct("2026-04-11 17:15:43");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        example.model.Address address13 = order7.getAddress();
        java.lang.String str14 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "130) test0904(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916953878" + "'", str8, "ORD-1775916953878");
// flaky "80) test0904(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916953878" + "'", str9, "ORD-1775916953878");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        java.lang.String str10 = order7.getPaymentIntentId();
        java.lang.String str11 = order7.getStatus();
        double double12 = order7.getTotalAmount();
        java.lang.String str13 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "131) test0905(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916953898" + "'", str8, "ORD-1775916953898");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        java.lang.String str9 = product4.toString();
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, 97);
        cartItem11.setQuantity(0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        example.model.Address address12 = order7.getAddress();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        double double14 = order7.getTotalAmount();
        java.lang.String str15 = order7.getOrderId();
        example.model.Address address16 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "132) test0907(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916954029" + "'", str8, "ORD-1775916954029");
        org.junit.Assert.assertNull(address9);
// flaky "81) test0907(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:54" + "'", str10, "2026-04-11 17:15:54");
// flaky "38) test0907(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:54" + "'", str11, "2026-04-11 17:15:54");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
// flaky "11) test0907(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916954029" + "'", str15, "ORD-1775916954029");
        org.junit.Assert.assertNull(address16);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getCountry();
        java.lang.String str9 = address7.getStreet();
        java.util.List<example.model.CartItem> cartItemList10 = example.service.CartService.getCart();
        example.model.Order order13 = new example.model.Order("ORD-1775916887934", address7, cartItemList10, (double) 97, "ORD-1775916889159");
        example.model.Address address20 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str21 = address20.getStreet();
        example.model.CartItem[] cartItemArray22 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList23 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList23, cartItemArray22);
        example.model.Order order27 = example.service.OrderService.createOrder("ORD-1775916887036", address20, (java.util.List<example.model.CartItem>) cartItemList23, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order30 = new example.model.Order("ORD-1775916894327", address7, (java.util.List<example.model.CartItem>) cartItemList23, (double) (short) -1, "ORD-1775916892828");
        java.lang.String str31 = order30.getStatus();
        java.lang.String str32 = order30.getPaymentIntentId();
        double double33 = order30.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PAID" + "'", str31, "PAID");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916892828" + "'", str32, "ORD-1775916892828");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        example.model.Address address5 = new example.model.Address("ORD-1775916888578", "ORD-1775916891722", "hi!", "ORD-1775916886687", "ORD-1775916888151");
        java.lang.String str6 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891722" + "'", str6, "ORD-1775916891722");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getCountry();
        java.lang.String str9 = address7.getStreet();
        java.util.List<example.model.CartItem> cartItemList10 = example.service.CartService.getCart();
        example.model.Order order13 = new example.model.Order("ORD-1775916887934", address7, cartItemList10, (double) 97, "ORD-1775916889159");
        example.model.Address address20 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str21 = address20.getStreet();
        example.model.CartItem[] cartItemArray22 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList23 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList23, cartItemArray22);
        example.model.Order order27 = example.service.OrderService.createOrder("ORD-1775916887036", address20, (java.util.List<example.model.CartItem>) cartItemList23, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order30 = new example.model.Order("ORD-1775916894327", address7, (java.util.List<example.model.CartItem>) cartItemList23, (double) (short) -1, "ORD-1775916892828");
        java.util.List<example.model.CartItem> cartItemList31 = order30.getItems();
        java.lang.String str32 = order30.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertNotNull(cartItemList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = cartItem6.toString();
        int int8 = cartItem6.getQuantity();
        cartItem6.setQuantity(10);
        example.model.Product product11 = cartItem6.getProduct();
        double double12 = product11.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str7, "ORD-1775916890749    x1  = $1.00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getCreatedAt();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "133) test0912(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916954265" + "'", str8, "ORD-1775916954265");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "82) test0912(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:54" + "'", str11, "2026-04-11 17:15:54");
// flaky "39) test0912(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:15:54" + "'", str12, "2026-04-11 17:15:54");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916894811", address6, (java.util.List<example.model.CartItem>) cartItemList15, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address26 = order25.getAddress();
        java.lang.String str27 = address26.getCity();
        java.lang.String str28 = address26.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
// flaky "134) test0913(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        java.lang.String str10 = product9.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:47" + "'", str10, "2026-04-11 17:14:47");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getStreet();
        java.lang.String str8 = address5.getCountry();
        java.lang.String str9 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        example.model.Address address5 = new example.model.Address("ORD-1775916930353", "ORD-1775916931854", "ORD-1775916904664", "ORD-1775916932104", "ORD-1775916900813");
        java.lang.String str6 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916900813" + "'", str6, "ORD-1775916900813");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        example.model.Product product4 = new example.model.Product("ORD-1775916903299", "ORD-1775916896079", "2026-04-11 17:14:50  x35  = $-35.00", (double) 0.0f);
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:50  x35  = $-35.00" + "'", str5, "2026-04-11 17:14:50  x35  = $-35.00");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.toString();
        java.lang.String str20 = address18.getCity();
        java.lang.String str21 = address18.toString();
        java.lang.String str22 = address18.getCountry();
        java.lang.String str23 = address18.getPhone();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "135) test0918(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str19, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky "83) test0918(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        double double9 = cartItem8.getSubtotal();
        cartItem8.setQuantity((int) '#');
        cartItem8.setQuantity((int) (short) 1);
        example.model.Product product14 = cartItem8.getProduct();
        cartItem8.setQuantity(100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(product14);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        example.model.Address address14 = order13.getAddress();
        java.lang.String str15 = order13.getStatus();
        java.lang.String str16 = order13.getOrderId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(address14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
// flaky "136) test0920(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916954530" + "'", str16, "ORD-1775916954530");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) 10);
        example.model.Product product7 = cartItem6.getProduct();
        java.lang.String str8 = product7.getName();
        org.junit.Assert.assertNotNull(product7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916891615" + "'", str8, "ORD-1775916891615");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        example.model.Address address21 = null;
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = new example.model.Order("ORD-1775916886212", address21, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "ORD-1775916886040");
        example.model.Order order35 = new example.model.Order("ORD-1775916892053", address19, (java.util.List<example.model.CartItem>) cartItemList25, (double) 10, "ORD-1775916887494");
        java.lang.String str36 = order35.getOrderId();
        java.lang.String str37 = order35.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "137) test0922(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916954596" + "'", str36, "ORD-1775916954596");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916892053" + "'", str37, "ORD-1775916892053");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        double double12 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        java.lang.String str14 = order7.getStatus();
        java.lang.String str15 = order7.getCustomerEmail();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "138) test0923(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916954662" + "'", str8, "ORD-1775916954662");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "84) test0923(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:54" + "'", str11, "2026-04-11 17:15:54");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        java.lang.String str10 = cartItem8.toString();
        java.lang.String str11 = cartItem8.toString();
        int int12 = cartItem8.getQuantity();
        example.model.Product product13 = cartItem8.getProduct();
        int int14 = cartItem8.getQuantity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
// flaky "139) test0924(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    str10  = $0.00" + "'", str10, "ORD-1775916890749    str10  = $0.00");
// flaky "85) test0924(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916890749    str11  = $0.00" + "'", str11, "ORD-1775916890749    str11  = $0.00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(product13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        example.model.Product product4 = new example.model.Product("ORD-1775916914217", "", "ORD-1775916947179", (double) 10);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 35);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        cartItem2.setQuantity(97);
        cartItem2.setQuantity((int) (short) 10);
        cartItem2.setQuantity(1);
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getFullName();
        java.lang.String str9 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:15:04");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        example.model.Product product4 = new example.model.Product("ORD-1775916890225", "ORD-1775916893211", "ORD-1775916890665", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916893211" + "'", str6, "ORD-1775916893211");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        example.model.Product product4 = new example.model.Product("ORD-1775916891772", "ORD-1775916913834", "ORD-1775916912361", (double) 0);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        example.service.CartService.addProduct(product4, 1);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        example.model.Address address7 = new example.model.Address("ORD-1775916907784", "ORD-1775916887611", "ORD-1775916915800", "ORD-1775916886212", "ORD-1775916934258");
        example.model.Address address14 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str15 = address14.getFullName();
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        java.lang.String str24 = order23.getOrderId();
        java.util.List<example.model.CartItem> cartItemList25 = order23.getItems();
        double double26 = order23.getTotalAmount();
        java.lang.String str27 = order23.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList28 = order23.getItems();
        example.model.Order order31 = new example.model.Order("ORD-1775916903896", address14, cartItemList28, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str32 = order31.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList33 = order31.getItems();
        example.model.Order order36 = new example.model.Order("ORD-1775916892121", address7, cartItemList33, (double) (byte) 0, "");
        example.model.Address address43 = new example.model.Address("ORD-1775916907784", "ORD-1775916887611", "ORD-1775916915800", "ORD-1775916886212", "ORD-1775916934258");
        example.model.Address address50 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str51 = address50.getFullName();
        example.model.Address address53 = null;
        example.model.CartItem[] cartItemArray54 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList55 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList55, cartItemArray54);
        example.model.Order order59 = new example.model.Order("", address53, (java.util.List<example.model.CartItem>) cartItemList55, 1.0d, "");
        java.lang.String str60 = order59.getOrderId();
        java.util.List<example.model.CartItem> cartItemList61 = order59.getItems();
        double double62 = order59.getTotalAmount();
        java.lang.String str63 = order59.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList64 = order59.getItems();
        example.model.Order order67 = new example.model.Order("ORD-1775916903896", address50, cartItemList64, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str68 = order67.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList69 = order67.getItems();
        example.model.Order order72 = new example.model.Order("ORD-1775916892121", address43, cartItemList69, (double) (byte) 0, "");
        example.model.Order order75 = example.service.OrderService.createOrder("ORD-1775916908948", address7, cartItemList69, (double) 1, "2026-04-11 17:15:30");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916892121" + "'", str15, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "140) test0931(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916954932" + "'", str24, "ORD-1775916954932");
        org.junit.Assert.assertNotNull(cartItemList25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cartItemList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916903896" + "'", str32, "ORD-1775916903896");
        org.junit.Assert.assertNotNull(cartItemList33);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ORD-1775916892121" + "'", str51, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray54);
        org.junit.Assert.assertArrayEquals(cartItemArray54, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky "86) test0931(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ORD-1775916954932" + "'", str60, "ORD-1775916954932");
        org.junit.Assert.assertNotNull(cartItemList61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(cartItemList64);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ORD-1775916903896" + "'", str68, "ORD-1775916903896");
        org.junit.Assert.assertNotNull(cartItemList69);
        org.junit.Assert.assertNotNull(order75);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:14:49", "ORD-1775916916776", "ORD-1775916900618", "2026-04-11 17:15:03", "ORD-1775916899563");
        java.lang.String str6 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916916776" + "'", str6, "ORD-1775916916776");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        example.model.Address address13 = order7.getAddress();
        double double14 = order7.getTotalAmount();
        java.lang.String str15 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "141) test0933(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916955015" + "'", str8, "ORD-1775916955015");
// flaky "87) test0933(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916955015" + "'", str9, "ORD-1775916955015");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(address13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916892827");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        cartItem8.setQuantity((int) (short) 100);
        double double11 = cartItem8.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        java.lang.String str19 = order17.getPaymentIntentId();
        java.lang.String str20 = order17.getStatus();
        java.lang.String str21 = order17.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PAID" + "'", str20, "PAID");
// flaky "142) test0936(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916955148" + "'", str21, "ORD-1775916955148");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        double double13 = product4.getPrice();
        java.lang.String str14 = product4.getId();
        example.model.CartItem cartItem16 = new example.model.CartItem(product4, 100);
        cartItem16.setQuantity(10);
        cartItem16.setQuantity((int) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str17 = address16.getCountry();
        java.lang.String str18 = address16.getStreet();
        java.util.List<example.model.CartItem> cartItemList19 = example.service.CartService.getCart();
        example.model.Order order22 = new example.model.Order("ORD-1775916887934", address16, cartItemList19, (double) 97, "ORD-1775916889159");
        example.model.Address address29 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str30 = address29.getStreet();
        example.model.CartItem[] cartItemArray31 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList32 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList32, cartItemArray31);
        example.model.Order order36 = example.service.OrderService.createOrder("ORD-1775916887036", address29, (java.util.List<example.model.CartItem>) cartItemList32, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order39 = new example.model.Order("ORD-1775916894327", address16, (java.util.List<example.model.CartItem>) cartItemList32, (double) (short) -1, "ORD-1775916892828");
        java.lang.String str40 = order39.getPaymentIntentId();
        java.lang.String str41 = order39.getStatus();
        java.util.List<example.model.CartItem> cartItemList42 = order39.getItems();
        example.model.Order order45 = new example.model.Order("ORD-1775916947953", address6, cartItemList42, (double) 10L, "ORD-1775916925021");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(order36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916892828" + "'", str40, "ORD-1775916892828");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PAID" + "'", str41, "PAID");
        org.junit.Assert.assertNotNull(cartItemList42);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.getId();
        example.service.CartService.addProduct(product4, 97);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.getId();
        java.lang.String str11 = product4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str11, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        example.model.Address address1 = null;
        example.model.Address address9 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str10 = address9.getPhone();
        java.lang.String str11 = address9.getFullName();
        java.lang.String str12 = address9.getPhone();
        java.lang.String str13 = address9.toString();
        example.model.Address address15 = null;
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = new example.model.Order("ORD-1775916886212", address15, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "ORD-1775916886040");
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916889159", address9, (java.util.List<example.model.CartItem>) cartItemList19, (double) 100L, "ORD-1775916887611");
        java.lang.String str30 = address9.getCountry();
        java.lang.String str31 = address9.getPhone();
        example.model.Address address38 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str39 = address38.getStreet();
        java.lang.String str40 = address38.getCountry();
        java.lang.String str41 = address38.getPhone();
        java.lang.String str42 = address38.getFullName();
        example.model.Address address49 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str50 = address49.getCountry();
        java.lang.String str51 = address49.getStreet();
        java.util.List<example.model.CartItem> cartItemList52 = example.service.CartService.getCart();
        example.model.Order order55 = new example.model.Order("ORD-1775916887934", address49, cartItemList52, (double) 97, "ORD-1775916889159");
        example.model.Order order58 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address38, cartItemList52, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order61 = example.service.OrderService.createOrder("2026-04-11 17:14:48", address9, cartItemList52, (double) 97, "\ud83d\udcde PAID");
        example.model.Order order64 = new example.model.Order("ORD-1775916924278", address1, cartItemList52, (double) (short) -1, "ORD-1775916895177");
        java.lang.String str65 = order64.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916886212" + "'", str12, "ORD-1775916886212");
// flaky "143) test0941(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str13, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ORD-1775916886212" + "'", str41, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916886212" + "'", str50, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ORD-1775916886212" + "'", str51, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList52);
        org.junit.Assert.assertNotNull(order58);
        org.junit.Assert.assertNotNull(order61);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "PAID" + "'", str65, "PAID");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        example.model.Address address5 = new example.model.Address("ORD-1775916907064", "ORD-1775916901034", "ORD-1775916905596", "ORD-1775916907784", "ORD-1775916896848");
        java.lang.String str6 = address5.toString();
// flaky "144) test0942(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916896848" + "'", str6, "\ud83d\udcde ORD-1775916896848");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getPaymentIntentId();
        java.lang.String str20 = order17.getOrderId();
        java.lang.String str21 = order17.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky "145) test0943(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916955399" + "'", str20, "ORD-1775916955399");
// flaky "88) test0943(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2026-04-11 17:15:55" + "'", str21, "2026-04-11 17:15:55");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        example.model.Product product4 = new example.model.Product("ORD-1775916891335", "ORD-1775916893211", "ORD-1775916892121", (double) 100.0f);
        java.lang.String str5 = product4.getDescription();
        example.model.CartItem cartItem7 = new example.model.CartItem(product4, 10);
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916892121" + "'", str5, "ORD-1775916892121");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916891335" + "'", str8, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916891335" + "'", str9, "ORD-1775916891335");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getOrderId();
        java.lang.String str12 = order7.getStatus();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        java.lang.Class<?> wildcardClass14 = cartItemList13.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "146) test0945(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916955473" + "'", str8, "ORD-1775916955473");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "89) test0945(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916955473" + "'", str11, "ORD-1775916955473");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getFullName();
        java.lang.String str10 = address5.getFullName();
        java.lang.String str11 = address5.getPhone();
        java.lang.String str12 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916886212" + "'", str12, "ORD-1775916886212");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        java.lang.String str19 = order17.getPaymentIntentId();
        example.service.OrderService.printReceipt(order17);
        double double21 = order17.getTotalAmount();
        java.lang.String str22 = order17.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2026-04-11 17:14:47" + "'", str22, "2026-04-11 17:14:47");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str17 = address16.getCountry();
        java.lang.String str18 = address16.getStreet();
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916888151", address16, (java.util.List<example.model.CartItem>) cartItemList22, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order32 = example.service.OrderService.createOrder("ORD-1775916887228", address6, (java.util.List<example.model.CartItem>) cartItemList22, (double) (byte) 1, "2026-04-11 17:14:49");
        java.lang.String str33 = address6.toString();
        java.lang.String str34 = address6.getPhone();
        java.lang.String str35 = address6.toString();
        java.lang.String str36 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertNotNull(order32);
// flaky "147) test0948(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str33, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916886212" + "'", str34, "ORD-1775916886212");
// flaky "90) test0948(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str35, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916886212" + "'", str36, "ORD-1775916886212");
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        double double12 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        example.model.Address address14 = order7.getAddress();
        java.lang.String str15 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "148) test0949(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916955615" + "'", str8, "ORD-1775916955615");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "91) test0949(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:55" + "'", str11, "2026-04-11 17:15:55");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertNull(address14);
// flaky "40) test0949(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916955615" + "'", str15, "ORD-1775916955615");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        example.model.Address address5 = new example.model.Address("ORD-1775916936421", "\ud83d\udcde ORD-1775916886212", "ORD-1775916898186", "ORD-1775916931854", "");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.toString();
        java.lang.String str10 = address5.getPhone();
        java.lang.String str11 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
// flaky "149) test0951(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str9, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
// flaky "92) test0951(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str11, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        example.model.Address address14 = order7.getAddress();
        java.util.List<example.model.CartItem> cartItemList15 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "150) test0952(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916955799" + "'", str8, "ORD-1775916955799");
// flaky "93) test0952(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916955799" + "'", str9, "ORD-1775916955799");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNotNull(cartItemList15);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, 0);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        example.model.Product product4 = new example.model.Product("ORD-1775916905596", "ORD-1775916894406", "ORD-1775916904664", (double) '#');
        example.service.CartService.addProduct(product4, 100);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        double double9 = cartItem6.getSubtotal();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        example.model.Address address5 = new example.model.Address("ORD-1775916903896", "ORD-1775916895177", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916887228", "ORD-1775916897794");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.getFullName();
// flaky "151) test0956(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916897794" + "'", str6, "\ud83d\udcde ORD-1775916897794");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916903896" + "'", str7, "ORD-1775916903896");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        java.lang.String str19 = address7.getPhone();
        example.model.Address address21 = null;
        example.model.CartItem[] cartItemArray22 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList23 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList23, cartItemArray22);
        example.model.Order order27 = new example.model.Order("", address21, (java.util.List<example.model.CartItem>) cartItemList23, 1.0d, "");
        example.model.Order order30 = example.service.OrderService.createOrder("ORD-1775916889159", address7, (java.util.List<example.model.CartItem>) cartItemList23, (double) 1, "2026-04-11 17:14:52");
        double double31 = order30.getTotalAmount();
        java.lang.String str32 = order30.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        example.service.CartService.removeProduct("2026-04-11 17:15:09");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.getPhone();
        java.lang.String str20 = address18.toString();
        java.lang.String str21 = address18.toString();
        java.lang.String str22 = address18.getStreet();
        java.lang.String str23 = address18.getCountry();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
// flaky "152) test0959(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
// flaky "94) test0959(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        double double8 = cartItem6.getSubtotal();
        cartItem6.setQuantity(97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        example.model.Address address21 = null;
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = new example.model.Order("ORD-1775916886212", address21, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "ORD-1775916886040");
        example.model.Order order35 = new example.model.Order("ORD-1775916892053", address19, (java.util.List<example.model.CartItem>) cartItemList25, (double) 10, "ORD-1775916887494");
        java.lang.String str36 = order35.getOrderId();
        java.lang.String str37 = order35.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "153) test0961(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916956082" + "'", str36, "ORD-1775916956082");
// flaky "95) test0961(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916956082" + "'", str37, "ORD-1775916956082");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        int int7 = cartItem6.getQuantity();
        example.model.Product product8 = cartItem6.getProduct();
        int int9 = cartItem6.getQuantity();
        cartItem6.setQuantity((int) 'a');
        int int12 = cartItem6.getQuantity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        double double11 = product4.getPrice();
        java.lang.String str12 = product4.getId();
        java.lang.String str13 = product4.getId();
        double double14 = product4.getPrice();
        example.model.CartItem cartItem16 = new example.model.CartItem(product4, (int) 'a');
        java.lang.String str17 = product4.getName();
        example.model.CartItem cartItem19 = new example.model.CartItem(product4, (int) (short) 1);
        example.model.Product product20 = cartItem19.getProduct();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916888257" + "'", str13, "ORD-1775916888257");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2026-04-11 17:14:50" + "'", str17, "2026-04-11 17:14:50");
        org.junit.Assert.assertNotNull(product20);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        example.service.CartService.removeProduct("ORD-1775916938275");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        example.service.CartService.removeProduct("ORD-1775916890142");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916951477");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        java.lang.String str10 = cartItem8.toString();
        java.lang.String str11 = cartItem8.toString();
        int int12 = cartItem8.getQuantity();
        example.model.Product product13 = cartItem8.getProduct();
        java.lang.String str14 = product13.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
// flaky "154) test0967(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    str10  = $0.00" + "'", str10, "ORD-1775916890749    str10  = $0.00");
// flaky "96) test0967(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916890749    str11  = $0.00" + "'", str11, "ORD-1775916890749    str11  = $0.00");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(product13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916889515" + "'", str14, "ORD-1775916889515");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, 1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        java.lang.String str15 = order13.getOrderId();
        java.lang.String str16 = order13.getOrderId();
        java.lang.String str17 = order13.getOrderId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
// flaky "155) test0969(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916956330" + "'", str15, "ORD-1775916956330");
// flaky "97) test0969(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916956330" + "'", str16, "ORD-1775916956330");
// flaky "41) test0969(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916956330" + "'", str17, "ORD-1775916956330");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) 1);
        java.lang.String str7 = product4.getName();
        java.lang.String str8 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916892828" + "'", str8, "ORD-1775916892828");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        double double13 = product4.getPrice();
        java.lang.String str14 = product4.getId();
        java.lang.String str15 = product4.getId();
        example.service.CartService.addProduct(product4, (-1));
        example.service.CartService.addProduct(product4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916888257" + "'", str15, "ORD-1775916888257");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getStatus();
        example.model.Address address11 = order7.getAddress();
        java.lang.String str12 = order7.getCreatedAt();
        example.model.Address address13 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "156) test0972(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916956430" + "'", str8, "ORD-1775916956430");
// flaky "98) test0972(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916956430" + "'", str9, "ORD-1775916956430");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertNull(address11);
// flaky "42) test0972(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:15:56" + "'", str12, "2026-04-11 17:15:56");
        org.junit.Assert.assertNull(address13);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, 35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "157) test0974(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916956488" + "'", str8, "ORD-1775916956488");
// flaky "99) test0974(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916956488" + "'", str9, "ORD-1775916956488");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
// flaky "43) test0974(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916956488" + "'", str12, "ORD-1775916956488");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916942507");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        example.model.Address address14 = order13.getAddress();
        java.lang.String str15 = order13.getOrderId();
        example.model.Address address16 = order13.getAddress();
        java.lang.String str17 = order13.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(address14);
// flaky "158) test0976(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916956548" + "'", str15, "ORD-1775916956548");
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916887166" + "'", str17, "ORD-1775916887166");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getStreet();
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        java.lang.String str29 = order28.getOrderId();
        java.util.List<example.model.CartItem> cartItemList30 = order28.getItems();
        example.model.Order order33 = new example.model.Order("ORD-1775916890225", address19, cartItemList30, (double) (byte) -1, "");
        java.lang.String str34 = order33.getCustomerEmail();
        java.lang.String str35 = order33.getOrderId();
        java.lang.String str36 = order33.getCustomerEmail();
        example.model.Address address37 = order33.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "159) test0977(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916956583" + "'", str29, "ORD-1775916956583");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916890225" + "'", str34, "ORD-1775916890225");
// flaky "100) test0977(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916956583" + "'", str35, "ORD-1775916956583");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916890225" + "'", str36, "ORD-1775916890225");
        org.junit.Assert.assertNotNull(address37);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 10);
        example.model.Product product12 = cartItem11.getProduct();
        java.lang.String str13 = cartItem11.toString();
        example.model.Product product14 = cartItem11.getProduct();
        int int15 = cartItem11.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(product12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50  x10  = $-10.00" + "'", str13, "2026-04-11 17:14:50  x10  = $-10.00");
        org.junit.Assert.assertNotNull(product14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getFullName();
        example.model.Address address17 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str18 = address17.getCountry();
        java.lang.String str19 = address17.getStreet();
        java.util.List<example.model.CartItem> cartItemList20 = example.service.CartService.getCart();
        example.model.Order order23 = new example.model.Order("ORD-1775916887934", address17, cartItemList20, (double) 97, "ORD-1775916889159");
        example.model.Order order26 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address6, cartItemList20, (double) '#', "2026-04-11 17:14:48");
        java.lang.String str27 = address6.getFullName();
        java.lang.String str28 = address6.getFullName();
        java.lang.Class<?> wildcardClass29 = address6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        double double15 = order13.getTotalAmount();
        example.service.OrderService.printReceipt(order13);
        java.lang.String str17 = order13.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916887036" + "'", str17, "ORD-1775916887036");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        java.lang.String str7 = cartItem6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749    x-1  = $-1.00" + "'", str7, "ORD-1775916890749    x-1  = $-1.00");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        example.model.Address address5 = new example.model.Address("[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)", "2026-04-11 17:15:25", "2026-04-11 17:15:17", "2026-04-11 17:15:03", "2026-04-11 17:15:03");
        java.lang.String str6 = address5.getFullName();
        java.lang.String str7 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)" + "'", str6, "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)");
// flaky "160) test0982(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde 2026-04-11 17:15:03" + "'", str7, "\ud83d\udcde 2026-04-11 17:15:03");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList11 = order7.getItems();
        java.lang.String str12 = order7.getPaymentIntentId();
        java.lang.String str13 = order7.getCustomerEmail();
        java.lang.String str14 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "161) test0983(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916956882" + "'", str8, "ORD-1775916956882");
        org.junit.Assert.assertNull(address9);
// flaky "101) test0983(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:56" + "'", str10, "2026-04-11 17:15:56");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        example.model.Address address7 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str8 = address7.getFullName();
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        java.lang.String str17 = order16.getOrderId();
        java.util.List<example.model.CartItem> cartItemList18 = order16.getItems();
        double double19 = order16.getTotalAmount();
        java.lang.String str20 = order16.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList21 = order16.getItems();
        example.model.Order order24 = new example.model.Order("ORD-1775916903896", address7, cartItemList21, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str25 = address7.getCountry();
        example.model.Address address32 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str33 = address32.getPhone();
        java.lang.String str34 = address32.getFullName();
        java.lang.String str35 = address32.getPhone();
        java.lang.String str36 = address32.toString();
        java.lang.String str37 = address32.getCountry();
        example.model.Address address45 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str46 = address45.getPhone();
        java.lang.String str47 = address45.getFullName();
        java.lang.String str48 = address45.getPhone();
        example.model.Address address55 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str56 = address55.getCountry();
        java.lang.String str57 = address55.getStreet();
        example.model.Address address59 = null;
        example.model.CartItem[] cartItemArray60 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList61 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList61, cartItemArray60);
        example.model.Order order65 = new example.model.Order("", address59, (java.util.List<example.model.CartItem>) cartItemList61, 1.0d, "");
        example.model.Order order68 = example.service.OrderService.createOrder("ORD-1775916888151", address55, (java.util.List<example.model.CartItem>) cartItemList61, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order71 = example.service.OrderService.createOrder("ORD-1775916887228", address45, (java.util.List<example.model.CartItem>) cartItemList61, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address73 = null;
        example.model.CartItem[] cartItemArray74 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList75 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList75, cartItemArray74);
        example.model.Order order79 = new example.model.Order("", address73, (java.util.List<example.model.CartItem>) cartItemList75, 1.0d, "");
        java.lang.String str80 = order79.getOrderId();
        java.lang.String str81 = order79.getOrderId();
        java.util.List<example.model.CartItem> cartItemList82 = order79.getItems();
        example.model.Order order85 = example.service.OrderService.createOrder("ORD-1775916891135", address45, cartItemList82, (double) 0L, "ORD-1775916886040");
        example.model.Order order88 = example.service.OrderService.createOrder("ORD-1775916889693", address32, cartItemList82, (double) (short) -1, "ORD-1775916886687");
        example.model.Order order91 = new example.model.Order("ORD-1775916916072", address7, cartItemList82, (double) 97, "ORD-1775916930186");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916892121" + "'", str8, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky "162) test0984(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916956949" + "'", str17, "ORD-1775916956949");
        org.junit.Assert.assertNotNull(cartItemList18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(cartItemList21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2026-04-11 17:14:53" + "'", str25, "2026-04-11 17:14:53");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916886212" + "'", str33, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916886212" + "'", str35, "ORD-1775916886212");
// flaky "102) test0984(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str36, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ORD-1775916886212" + "'", str46, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ORD-1775916886212" + "'", str48, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886212" + "'", str56, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ORD-1775916886212" + "'", str57, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray60);
        org.junit.Assert.assertArrayEquals(cartItemArray60, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(order68);
        org.junit.Assert.assertNotNull(order71);
        org.junit.Assert.assertNotNull(cartItemArray74);
        org.junit.Assert.assertArrayEquals(cartItemArray74, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
// flaky "44) test0984(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ORD-1775916956949" + "'", str80, "ORD-1775916956949");
// flaky "12) test0984(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "ORD-1775916956949" + "'", str81, "ORD-1775916956949");
        org.junit.Assert.assertNotNull(cartItemList82);
        org.junit.Assert.assertNotNull(order85);
        org.junit.Assert.assertNotNull(order88);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:15:27", "ORD-1775916887166", "ORD-1775916932901", (double) (byte) 1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        example.model.Product product4 = new example.model.Product("ORD-1775916911314", "ORD-1775916889693", "ORD-1775916905007", 100.0d);
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916905007" + "'", str5, "ORD-1775916905007");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str11 = product4.getName();
        java.lang.String str12 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:50" + "'", str11, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str12, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        example.model.Address address6 = new example.model.Address("2026-04-11 17:15:11", "2026-04-11 17:15:04", "ORD-1775916908674", "ORD-1775916892904", "ORD-1775916894079");
        java.lang.String str7 = address6.toString();
        example.model.Address address14 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        java.lang.String str15 = address14.getPhone();
        example.model.Address address22 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address24 = null;
        example.model.Address address26 = null;
        example.model.CartItem[] cartItemArray27 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList28 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList28, cartItemArray27);
        example.model.Order order32 = new example.model.Order("", address26, (java.util.List<example.model.CartItem>) cartItemList28, 1.0d, "");
        example.model.Order order35 = new example.model.Order("ORD-1775916886212", address24, (java.util.List<example.model.CartItem>) cartItemList28, 1.0d, "ORD-1775916886040");
        example.model.Order order38 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address22, (java.util.List<example.model.CartItem>) cartItemList28, (double) (short) 0, "ORD-1775916903429");
        example.model.Order order41 = new example.model.Order("ORD-1775916909184", address14, (java.util.List<example.model.CartItem>) cartItemList28, (double) (byte) 1, "ORD-1775916903519");
        example.model.Order order44 = example.service.OrderService.createOrder("2026-04-11 17:15:13", address6, (java.util.List<example.model.CartItem>) cartItemList28, 100.0d, "ORD-1775916887828");
// flaky "163) test0988(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916894079" + "'", str7, "\ud83d\udcde ORD-1775916894079");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916897292" + "'", str15, "ORD-1775916897292");
        org.junit.Assert.assertNotNull(cartItemArray27);
        org.junit.Assert.assertArrayEquals(cartItemArray27, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(order38);
        org.junit.Assert.assertNotNull(order44);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        example.model.Address address12 = order7.getAddress();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        java.lang.Class<?> wildcardClass14 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "164) test0989(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916957167" + "'", str8, "ORD-1775916957167");
        org.junit.Assert.assertNull(address9);
// flaky "103) test0989(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:57" + "'", str10, "2026-04-11 17:15:57");
// flaky "45) test0989(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:57" + "'", str11, "2026-04-11 17:15:57");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        double double12 = product11.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList13 = order7.getItems();
        double double14 = order7.getTotalAmount();
        java.lang.String str15 = order7.getCreatedAt();
        java.lang.String str16 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "165) test0991(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916957281" + "'", str8, "ORD-1775916957281");
// flaky "104) test0991(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916957281" + "'", str9, "ORD-1775916957281");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
// flaky "46) test0991(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:15:57" + "'", str15, "2026-04-11 17:15:57");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        example.model.Address address12 = order7.getAddress();
        double double13 = order7.getTotalAmount();
        double double14 = order7.getTotalAmount();
        java.lang.String str15 = order7.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "166) test0992(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916957318" + "'", str8, "ORD-1775916957318");
        org.junit.Assert.assertNull(address9);
// flaky "105) test0992(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:57" + "'", str10, "2026-04-11 17:15:57");
// flaky "47) test0992(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:57" + "'", str11, "2026-04-11 17:15:57");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.String str12 = order7.getCustomerEmail();
        java.lang.String str13 = order7.getCreatedAt();
        java.lang.String str14 = order7.getStatus();
        java.lang.String str15 = order7.getOrderId();
        java.lang.String str16 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "167) test0993(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916957347" + "'", str8, "ORD-1775916957347");
// flaky "106) test0993(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916957347" + "'", str9, "ORD-1775916957347");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "48) test0993(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:57" + "'", str13, "2026-04-11 17:15:57");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
// flaky "13) test0993(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916957347" + "'", str15, "ORD-1775916957347");
// flaky "2) test0993(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916957347" + "'", str16, "ORD-1775916957347");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 10);
        cartItem11.setQuantity((int) (short) 10);
        double double14 = cartItem11.getSubtotal();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-10.0d) + "'", double14 == (-10.0d));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        example.model.Address address12 = order7.getAddress();
        double double13 = order7.getTotalAmount();
        java.lang.String str14 = order7.getPaymentIntentId();
        java.lang.String str15 = order7.getCreatedAt();
        java.lang.String str16 = order7.getPaymentIntentId();
        java.lang.String str17 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "168) test0995(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916957406" + "'", str8, "ORD-1775916957406");
        org.junit.Assert.assertNull(address9);
// flaky "107) test0995(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:57" + "'", str10, "2026-04-11 17:15:57");
// flaky "49) test0995(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:57" + "'", str11, "2026-04-11 17:15:57");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "14) test0995(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:15:57" + "'", str15, "2026-04-11 17:15:57");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "3) test0995(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916957406" + "'", str17, "ORD-1775916957406");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        example.model.Address address6 = new example.model.Address("ORD-1775916886212", "ORD-1775916909947", "ORD-1775916902074", "2026-04-11 17:14:51", "ORD-1775916892904");
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = new example.model.Order("2026-04-11 17:14:47", address15, (java.util.List<example.model.CartItem>) cartItemList19, (double) (-1.0f), "");
        example.model.Address address27 = order26.getAddress();
        java.lang.String str28 = address27.getStreet();
        example.model.Address address30 = null;
        example.model.CartItem[] cartItemArray31 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList32 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList32, cartItemArray31);
        example.model.Order order36 = new example.model.Order("", address30, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "");
        java.lang.String str37 = order36.getOrderId();
        java.util.List<example.model.CartItem> cartItemList38 = order36.getItems();
        example.model.Order order41 = new example.model.Order("ORD-1775916890225", address27, cartItemList38, (double) (byte) -1, "");
        example.model.Address address43 = null;
        example.model.Address address45 = null;
        example.model.CartItem[] cartItemArray46 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList47 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList47, cartItemArray46);
        example.model.Order order51 = new example.model.Order("", address45, (java.util.List<example.model.CartItem>) cartItemList47, 1.0d, "");
        example.model.Order order54 = new example.model.Order("ORD-1775916886212", address43, (java.util.List<example.model.CartItem>) cartItemList47, 1.0d, "ORD-1775916886040");
        java.lang.String str55 = order54.getPaymentIntentId();
        double double56 = order54.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList57 = order54.getItems();
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916899981", address27, cartItemList57, (double) 1, "ORD-1775916889159");
        example.model.Order order63 = new example.model.Order("ORD-1775916898608", address6, cartItemList57, (double) 1, "2026-04-11 17:15:02");
        java.lang.String str64 = address6.getFullName();
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "169) test0996(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916957481" + "'", str37, "ORD-1775916957481");
        org.junit.Assert.assertNotNull(cartItemList38);
        org.junit.Assert.assertNotNull(cartItemArray46);
        org.junit.Assert.assertArrayEquals(cartItemArray46, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916886040" + "'", str55, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList57);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ORD-1775916886212" + "'", str64, "ORD-1775916886212");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916934665");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        double double9 = cartItem8.getSubtotal();
        cartItem8.setQuantity((int) '#');
        cartItem8.setQuantity((int) (short) 1);
        example.model.Product product14 = cartItem8.getProduct();
        double double15 = cartItem8.getSubtotal();
        double double16 = cartItem8.getSubtotal();
        example.model.Product product17 = cartItem8.getProduct();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(product14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(product17);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        example.model.Order order22 = new example.model.Order("ORD-1775916886212", address11, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "ORD-1775916886040");
        example.model.Order order25 = new example.model.Order("ORD-1775916894811", address6, (java.util.List<example.model.CartItem>) cartItemList15, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address26 = order25.getAddress();
        java.lang.String str27 = address26.getPhone();
        java.lang.String str28 = address26.getFullName();
        java.lang.String str29 = address26.getStreet();
        java.lang.Class<?> wildcardClass30 = address26.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        java.lang.String str8 = address6.toString();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str17 = address16.getStreet();
        java.lang.String str18 = address16.getFullName();
        java.lang.String str19 = address16.getStreet();
        example.model.Address address21 = null;
        example.model.Address address23 = null;
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        example.model.Order order29 = new example.model.Order("", address23, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "");
        example.model.Order order32 = new example.model.Order("ORD-1775916886212", address21, (java.util.List<example.model.CartItem>) cartItemList25, 1.0d, "ORD-1775916886040");
        example.model.Order order35 = new example.model.Order("ORD-1775916894811", address16, (java.util.List<example.model.CartItem>) cartItemList25, (double) 1.0f, "ORD-1775916894327");
        example.model.Address address36 = order35.getAddress();
        java.lang.String str37 = address36.getPhone();
        example.model.Address address45 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str46 = address45.getPhone();
        java.lang.String str47 = address45.getFullName();
        java.lang.String str48 = address45.getPhone();
        example.model.Address address55 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str56 = address55.getCountry();
        java.lang.String str57 = address55.getStreet();
        example.model.Address address59 = null;
        example.model.CartItem[] cartItemArray60 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList61 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList61, cartItemArray60);
        example.model.Order order65 = new example.model.Order("", address59, (java.util.List<example.model.CartItem>) cartItemList61, 1.0d, "");
        example.model.Order order68 = example.service.OrderService.createOrder("ORD-1775916888151", address55, (java.util.List<example.model.CartItem>) cartItemList61, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order71 = example.service.OrderService.createOrder("ORD-1775916887228", address45, (java.util.List<example.model.CartItem>) cartItemList61, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address73 = null;
        example.model.CartItem[] cartItemArray74 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList75 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList75, cartItemArray74);
        example.model.Order order79 = new example.model.Order("", address73, (java.util.List<example.model.CartItem>) cartItemList75, 1.0d, "");
        java.lang.String str80 = order79.getOrderId();
        java.lang.String str81 = order79.getOrderId();
        java.util.List<example.model.CartItem> cartItemList82 = order79.getItems();
        example.model.Order order85 = example.service.OrderService.createOrder("ORD-1775916891135", address45, cartItemList82, (double) 0L, "ORD-1775916886040");
        example.model.Order order88 = new example.model.Order("ORD-1775916894406", address36, cartItemList82, (double) 'a', "ORD-1775916905114");
        example.model.Order order91 = example.service.OrderService.createOrder("", address6, cartItemList82, (double) (byte) 100, "ORD-1775916896079");
        java.lang.String str92 = address6.getCity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
// flaky "170) test1000(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde " + "'", str8, "\ud83d\udcde ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(address36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ORD-1775916886212" + "'", str46, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ORD-1775916886212" + "'", str48, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886212" + "'", str56, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ORD-1775916886212" + "'", str57, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray60);
        org.junit.Assert.assertArrayEquals(cartItemArray60, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(order68);
        org.junit.Assert.assertNotNull(order71);
        org.junit.Assert.assertNotNull(cartItemArray74);
        org.junit.Assert.assertArrayEquals(cartItemArray74, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
// flaky "108) test1000(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ORD-1775916957647" + "'", str80, "ORD-1775916957647");
// flaky "50) test1000(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str81 + "' != '" + "ORD-1775916957647" + "'", str81, "ORD-1775916957647");
        org.junit.Assert.assertNotNull(cartItemList82);
        org.junit.Assert.assertNotNull(order85);
        org.junit.Assert.assertNotNull(order91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "ORD-1775916894246" + "'", str92, "ORD-1775916894246");
    }
}
