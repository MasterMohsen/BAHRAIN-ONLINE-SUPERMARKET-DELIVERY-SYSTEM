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
        example.model.Address address6 = new example.model.Address("ORD-1775916920763", "ORD-1775916890979", "2026-04-11 17:14:58", "2026-04-11 17:15:00", "ORD-1775916907784");
        example.model.Address address13 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str14 = address13.getStreet();
        java.lang.String str15 = address13.getCountry();
        java.lang.String str16 = address13.getPhone();
        example.model.Address address18 = null;
        example.model.CartItem[] cartItemArray19 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList20 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList20, cartItemArray19);
        example.model.Order order24 = new example.model.Order("", address18, (java.util.List<example.model.CartItem>) cartItemList20, 1.0d, "");
        java.lang.String str25 = order24.getOrderId();
        java.util.List<example.model.CartItem> cartItemList26 = order24.getItems();
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916887934", address13, cartItemList26, (double) '4', "ORD-1775916886212");
        example.model.Order order32 = new example.model.Order("hi!                  x10  = $350.00", address6, cartItemList26, (double) (byte) 1, "ORD-1775916929571");
        example.model.Address address33 = order32.getAddress();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886212" + "'", str14, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray19);
        org.junit.Assert.assertArrayEquals(cartItemArray19, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "1) test1001(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916957716" + "'", str25, "ORD-1775916957716");
        org.junit.Assert.assertNotNull(cartItemList26);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertNotNull(address33);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.String str29 = address27.toString();
        example.model.Address address36 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        java.lang.String str37 = address36.getPhone();
        example.model.Address address44 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address46 = null;
        example.model.Address address48 = null;
        example.model.CartItem[] cartItemArray49 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList50 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList50, cartItemArray49);
        example.model.Order order54 = new example.model.Order("", address48, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "");
        example.model.Order order57 = new example.model.Order("ORD-1775916886212", address46, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "ORD-1775916886040");
        example.model.Order order60 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address44, (java.util.List<example.model.CartItem>) cartItemList50, (double) (short) 0, "ORD-1775916903429");
        example.model.Order order63 = new example.model.Order("ORD-1775916909184", address36, (java.util.List<example.model.CartItem>) cartItemList50, (double) (byte) 1, "ORD-1775916903519");
        example.model.Order order66 = example.service.OrderService.createOrder("ORD-1775916886040", address27, (java.util.List<example.model.CartItem>) cartItemList50, (-1.0d), "ORD-1775916895446");
        java.lang.String str67 = order66.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(address27);
// flaky "2) test1002(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
// flaky "1) test1002(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str29, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916897292" + "'", str37, "ORD-1775916897292");
        org.junit.Assert.assertNotNull(cartItemArray49);
        org.junit.Assert.assertArrayEquals(cartItemArray49, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(order60);
        org.junit.Assert.assertNotNull(order66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PAID" + "'", str67, "PAID");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        example.model.CartItem cartItem13 = new example.model.CartItem(product11, (int) (byte) -1);
        cartItem13.setQuantity((int) (byte) 1);
        double double16 = cartItem13.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        example.model.Product product4 = new example.model.Product("ORD-1775916897371", "ORD-1775916892568", "ORD-1775916893369", (double) 10);
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str7 = product4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ORD-1775916897371] ORD-1775916892568    - $10.00  (ORD-1775916893369)" + "'", str7, "[ORD-1775916897371] ORD-1775916892568    - $10.00  (ORD-1775916893369)");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        example.model.Product product0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.service.CartService.addProduct(product0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        example.model.Product product4 = new example.model.Product("[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "", "ORD-1775916887934", (double) '4');
        example.service.CartService.addProduct(product4, (int) ' ');
        java.lang.String str7 = product4.getName();
        java.lang.String str8 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        double double7 = cartItem6.getSubtotal();
        int int8 = cartItem6.getQuantity();
        int int9 = cartItem6.getQuantity();
        example.model.Product product10 = cartItem6.getProduct();
        java.lang.String str11 = cartItem6.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916890749    x-1  = $-1.00" + "'", str11, "ORD-1775916890749    x-1  = $-1.00");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        example.model.Address address1 = null;
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getPhone();
        java.lang.String str10 = address8.getFullName();
        java.lang.String str11 = address8.getCity();
        example.model.Address address13 = null;
        example.model.CartItem[] cartItemArray14 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList15 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList15, cartItemArray14);
        example.model.Order order19 = new example.model.Order("", address13, (java.util.List<example.model.CartItem>) cartItemList15, 1.0d, "");
        java.lang.String str20 = order19.getOrderId();
        java.lang.String str21 = order19.getOrderId();
        double double22 = order19.getTotalAmount();
        java.lang.String str23 = order19.getStatus();
        java.util.List<example.model.CartItem> cartItemList24 = order19.getItems();
        example.model.Order order27 = example.service.OrderService.createOrder("ORD-1775916920522", address8, cartItemList24, (double) 1.0f, "2026-04-11 17:15:05");
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order30 = example.service.OrderService.createOrder("ORD-1775916922856", address1, cartItemList24, (double) (-1), "2026-04-11 17:15:24");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky "3) test1009(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916958065" + "'", str20, "ORD-1775916958065");
// flaky "2) test1009(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916958065" + "'", str21, "ORD-1775916958065");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PAID" + "'", str23, "PAID");
        org.junit.Assert.assertNotNull(cartItemList24);
        org.junit.Assert.assertNotNull(order27);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        example.model.Address address35 = order34.getAddress();
        example.model.Address address37 = null;
        example.model.CartItem[] cartItemArray38 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList39 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList39, cartItemArray38);
        example.model.Order order43 = new example.model.Order("", address37, (java.util.List<example.model.CartItem>) cartItemList39, 1.0d, "");
        java.lang.String str44 = order43.getOrderId();
        java.util.List<example.model.CartItem> cartItemList45 = order43.getItems();
        example.model.Address address46 = order43.getAddress();
        java.lang.String str47 = order43.getCreatedAt();
        double double48 = order43.getTotalAmount();
        java.lang.String str49 = order43.getStatus();
        java.util.List<example.model.CartItem> cartItemList50 = order43.getItems();
        example.model.Order order53 = example.service.OrderService.createOrder("[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)", address35, cartItemList50, (double) ' ', "2026-04-11 17:15:15");
        java.lang.String str54 = order53.getCreatedAt();
        java.lang.String str55 = order53.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "4) test1010(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916958112" + "'", str30, "ORD-1775916958112");
        org.junit.Assert.assertNotNull(cartItemList31);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(cartItemArray38);
        org.junit.Assert.assertArrayEquals(cartItemArray38, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "3) test1010(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916958112" + "'", str44, "ORD-1775916958112");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNull(address46);
// flaky "1) test1010(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2026-04-11 17:15:58" + "'", str47, "2026-04-11 17:15:58");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PAID" + "'", str49, "PAID");
        org.junit.Assert.assertNotNull(cartItemList50);
        org.junit.Assert.assertNotNull(order53);
// flaky "1) test1010(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "2026-04-11 17:15:58" + "'", str54, "2026-04-11 17:15:58");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "2026-04-11 17:15:15" + "'", str55, "2026-04-11 17:15:15");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        example.model.Address address5 = new example.model.Address("ORD-1775916887611", "ORD-1775916887828", "ORD-1775916902814", "ORD-1775916902814", "");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getCity();
        java.lang.String str8 = address5.toString();
        java.lang.String str9 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916902814" + "'", str6, "ORD-1775916902814");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916902814" + "'", str7, "ORD-1775916902814");
// flaky "5) test1011(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde " + "'", str8, "\ud83d\udcde ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916902814" + "'", str9, "ORD-1775916902814");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        java.lang.String str18 = order13.getPaymentIntentId();
        java.lang.String str19 = order13.getPaymentIntentId();
        java.lang.Class<?> wildcardClass20 = order13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PAID" + "'", str16, "PAID");
        org.junit.Assert.assertNotNull(address17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916887166" + "'", str18, "ORD-1775916887166");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916887166" + "'", str19, "ORD-1775916887166");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        example.service.CartService.removeProduct("ORD-1775916906984");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        java.lang.String str9 = product8.getName();
        java.lang.Class<?> wildcardClass10 = product8.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        example.service.CartService.removeProduct("ORD-1775916928912");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        example.model.Address address5 = new example.model.Address("ORD-1775916906473", "ORD-1775916897371", "ORD-1775916888578", "ORD-1775916898989", "2026-04-11 17:15:03");
        java.lang.String str6 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:15:03" + "'", str6, "2026-04-11 17:15:03");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        java.lang.String str9 = product4.toString();
        example.service.CartService.addProduct(product4, 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) (short) 1);
        example.service.CartService.addProduct(product4, 35);
        java.lang.String str17 = product4.getName();
        java.lang.String str18 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916890749" + "'", str17, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str18, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        double double9 = product4.getPrice();
        example.service.CartService.addProduct(product4, 52);
        double double12 = product4.getPrice();
        java.lang.String str13 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        example.service.CartService.removeProduct("ORD-1775916953981");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        double double9 = product4.getPrice();
        java.lang.String str10 = product4.toString();
        java.lang.String str11 = product4.getId();
        java.lang.String str12 = product4.toString();
        java.lang.String str13 = product4.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916888257" + "'", str11, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str12, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50" + "'", str13, "2026-04-11 17:14:50");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
        java.lang.String str11 = order7.getCustomerEmail();
        java.lang.String str12 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "6) test1022(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916958464" + "'", str8, "ORD-1775916958464");
// flaky "4) test1022(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916958464" + "'", str9, "ORD-1775916958464");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "2) test1022(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916958464" + "'", str12, "ORD-1775916958464");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = new example.model.Order("2026-04-11 17:14:47", address15, (java.util.List<example.model.CartItem>) cartItemList19, (double) (-1.0f), "");
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916893211", address6, (java.util.List<example.model.CartItem>) cartItemList19, (double) (byte) -1, "ORD-1775916900332");
        java.util.List<example.model.CartItem> cartItemList30 = order29.getItems();
        java.lang.Class<?> wildcardClass31 = cartItemList30.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        double double9 = cartItem8.getSubtotal();
        cartItem8.setQuantity((int) (short) -1);
        int int12 = cartItem8.getQuantity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        java.lang.String str16 = order15.getOrderId();
        java.util.List<example.model.CartItem> cartItemList17 = order15.getItems();
        double double18 = order15.getTotalAmount();
        java.lang.String str19 = order15.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList20 = order15.getItems();
        example.model.Order order23 = new example.model.Order("ORD-1775916903896", address6, cartItemList20, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str24 = order23.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList25 = order23.getItems();
        java.lang.String str26 = order23.getStatus();
        java.lang.String str27 = order23.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "7) test1025(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916958584" + "'", str16, "ORD-1775916958584");
        org.junit.Assert.assertNotNull(cartItemList17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916903896" + "'", str24, "ORD-1775916903896");
        org.junit.Assert.assertNotNull(cartItemList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PAID" + "'", str26, "PAID");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PAID" + "'", str27, "PAID");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
        example.model.Address address11 = order7.getAddress();
        example.model.Address address12 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "8) test1026(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916958617" + "'", str8, "ORD-1775916958617");
// flaky "5) test1026(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916958617" + "'", str9, "ORD-1775916958617");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        example.model.Address address6 = new example.model.Address("ORD-1775916889515", "ORD-1775916886687", "2026-04-11 17:14:48", "PAID", "ORD-1775916887036");
        java.lang.String str7 = address6.getCity();
        java.lang.String str8 = address6.toString();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        java.lang.String str18 = order17.getOrderId();
        java.lang.String str19 = order17.getOrderId();
        example.model.Address address20 = order17.getAddress();
        java.lang.String str21 = order17.getStatus();
        java.lang.String str22 = order17.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList23 = order17.getItems();
        double double24 = order17.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList25 = order17.getItems();
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916920763", address6, cartItemList25, (-100.0d), "ORD-1775916918328");
        java.lang.String str29 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:48" + "'", str7, "2026-04-11 17:14:48");
// flaky "9) test1027(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde ORD-1775916887036" + "'", str8, "\ud83d\udcde ORD-1775916887036");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886687" + "'", str9, "ORD-1775916886687");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "6) test1027(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916958652" + "'", str18, "ORD-1775916958652");
// flaky "3) test1027(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916958652" + "'", str19, "ORD-1775916958652");
        org.junit.Assert.assertNull(address20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PAID" + "'", str21, "PAID");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(cartItemList23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList25);
        org.junit.Assert.assertNotNull(order28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886687" + "'", str29, "ORD-1775916886687");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        int int7 = cartItem6.getQuantity();
        cartItem6.setQuantity((-1));
        example.model.Product product10 = cartItem6.getProduct();
        java.lang.String str11 = product10.getDescription();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:47" + "'", str11, "2026-04-11 17:14:47");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916926155");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str12 = cartItem11.toString();
        cartItem11.setQuantity((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:14:50  x-1  = $1.00" + "'", str12, "2026-04-11 17:14:50  x-1  = $1.00");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        java.util.List<example.model.CartItem> cartItemList9 = example.service.CartService.getCart();
        example.model.Order order12 = new example.model.Order("ORD-1775916887934", address6, cartItemList9, (double) 97, "ORD-1775916889159");
        example.service.OrderService.printReceipt(order12);
        java.lang.String str14 = order12.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        java.lang.String str15 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "10) test1032(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916958802" + "'", str8, "ORD-1775916958802");
// flaky "7) test1032(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916958802" + "'", str9, "ORD-1775916958802");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertNull(address14);
// flaky "4) test1032(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:15:58" + "'", str15, "2026-04-11 17:15:58");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getId();
        example.service.CartService.addProduct(product4, 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916888257" + "'", str7, "ORD-1775916888257");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("2026-04-11 17:14:47", address8, (java.util.List<example.model.CartItem>) cartItemList12, (double) (-1.0f), "");
        example.model.Address address20 = order19.getAddress();
        example.model.Address address22 = null;
        example.model.Address address24 = null;
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = new example.model.Order("", address24, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "");
        example.model.Order order33 = new example.model.Order("ORD-1775916886212", address22, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "ORD-1775916886040");
        example.model.Order order36 = new example.model.Order("ORD-1775916892053", address20, (java.util.List<example.model.CartItem>) cartItemList26, (double) 10, "ORD-1775916887494");
        example.model.Address address38 = null;
        example.model.CartItem[] cartItemArray39 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList40 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList40, cartItemArray39);
        example.model.Order order44 = new example.model.Order("", address38, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "");
        example.model.Order order47 = example.service.OrderService.createOrder("ORD-1775916892053", address20, (java.util.List<example.model.CartItem>) cartItemList40, 0.0d, "2026-04-11 17:14:52");
        example.model.Address address48 = order47.getAddress();
        java.lang.String str49 = address48.getCity();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cartItemArray39);
        org.junit.Assert.assertArrayEquals(cartItemArray39, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(order47);
        org.junit.Assert.assertNotNull(address48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.lang.String str14 = order12.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList15 = order12.getItems();
        double double16 = order12.getTotalAmount();
        java.lang.String str17 = order12.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886040" + "'", str14, "ORD-1775916886040");
        org.junit.Assert.assertNotNull(cartItemList15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
// flaky "11) test1035(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2026-04-11 17:15:58" + "'", str17, "2026-04-11 17:15:58");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        example.model.Address address5 = new example.model.Address("ORD-1775916899079", "ORD-1775916909254", "ORD-1775916894903", "ORD-1775916887934", "ORD-1775916910496");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916910496" + "'", str6, "ORD-1775916910496");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916910496" + "'", str7, "ORD-1775916910496");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.lang.String str14 = order12.getOrderId();
        java.lang.Class<?> wildcardClass15 = order12.getClass();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
// flaky "12) test1037(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916959027" + "'", str14, "ORD-1775916959027");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)" + "'", str7, "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        java.lang.String str22 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "13) test1039(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity((int) (short) 0);
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 1);
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, 52);
        java.lang.String str11 = cartItem10.toString();
        double double12 = cartItem10.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916890749    x52  = $52.00" + "'", str11, "ORD-1775916890749    x52  = $52.00");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916958584");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str11 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        java.lang.String str78 = address9.getCountry();
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ORD-1775916886212" + "'", str78, "ORD-1775916886212");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        example.model.Product product4 = new example.model.Product("ORD-1775916898186", "ORD-1775916932985", "[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)", (double) (short) 10);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.lang.String str30 = order26.getStatus();
        java.lang.String str31 = order26.getCreatedAt();
        java.lang.String str32 = order26.getStatus();
        java.lang.String str33 = order26.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "14) test1046(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "8) test1046(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916959350" + "'", str27, "ORD-1775916959350");
// flaky "5) test1046(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916959350" + "'", str28, "ORD-1775916959350");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PAID" + "'", str30, "PAID");
// flaky "2) test1046(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2026-04-11 17:15:59" + "'", str31, "2026-04-11 17:15:59");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
// flaky "1) test1046(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2026-04-11 17:15:59" + "'", str33, "2026-04-11 17:15:59");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        example.model.Address address5 = new example.model.Address("ORD-1775916891722", "ORD-1775916915941", "ORD-1775916899079", "2026-04-11 17:15:12", "ORD-1775916890749    x0  = $0.00");
        java.lang.String str6 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916899079" + "'", str6, "ORD-1775916899079");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        example.model.Product product4 = new example.model.Product("ORD-1775916958617", "ORD-1775916919220", "ORD-1775916927176", (double) '4');
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        example.model.Product product4 = new example.model.Product("", "ORD-1775916897292", "ORD-1775916893211", (double) '#');
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getId();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)" + "'", str5, "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916897292" + "'", str6, "ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        java.lang.String str28 = address26.toString();
        java.lang.String str29 = address26.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
// flaky "15) test1050(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str27, "\ud83d\udcde ORD-1775916886212");
// flaky "9) test1050(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getPhone();
        java.lang.String str10 = address8.getFullName();
        java.lang.String str11 = address8.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str19 = address18.getCountry();
        java.lang.String str20 = address18.getStreet();
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        example.model.Order order31 = example.service.OrderService.createOrder("ORD-1775916888151", address18, (java.util.List<example.model.CartItem>) cartItemList24, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order34 = example.service.OrderService.createOrder("ORD-1775916887228", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address36 = null;
        example.model.CartItem[] cartItemArray37 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList38 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList38, cartItemArray37);
        example.model.Order order42 = new example.model.Order("", address36, (java.util.List<example.model.CartItem>) cartItemList38, 1.0d, "");
        java.lang.String str43 = order42.getOrderId();
        java.lang.String str44 = order42.getOrderId();
        java.util.List<example.model.CartItem> cartItemList45 = order42.getItems();
        example.model.Order order48 = example.service.OrderService.createOrder("ORD-1775916891135", address8, cartItemList45, (double) 0L, "ORD-1775916886040");
        example.model.Address address55 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str56 = address55.getStreet();
        java.lang.String str57 = address55.getFullName();
        java.lang.String str58 = address55.getStreet();
        example.model.Address address60 = null;
        example.model.Address address62 = null;
        example.model.CartItem[] cartItemArray63 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList64 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList64, cartItemArray63);
        example.model.Order order68 = new example.model.Order("", address62, (java.util.List<example.model.CartItem>) cartItemList64, 1.0d, "");
        example.model.Order order71 = new example.model.Order("ORD-1775916886212", address60, (java.util.List<example.model.CartItem>) cartItemList64, 1.0d, "ORD-1775916886040");
        example.model.Order order74 = new example.model.Order("ORD-1775916894811", address55, (java.util.List<example.model.CartItem>) cartItemList64, (double) 1.0f, "ORD-1775916894327");
        example.model.Order order77 = new example.model.Order("ORD-1775916924595", address8, (java.util.List<example.model.CartItem>) cartItemList64, (double) (byte) 0, "2026-04-11 17:14:50  x35  = $-35.00");
        java.lang.String str78 = address8.getCountry();
        java.lang.String str79 = address8.getCountry();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order31);
        org.junit.Assert.assertNotNull(order34);
        org.junit.Assert.assertNotNull(cartItemArray37);
        org.junit.Assert.assertArrayEquals(cartItemArray37, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "16) test1051(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916959549" + "'", str43, "ORD-1775916959549");
// flaky "10) test1051(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916959549" + "'", str44, "ORD-1775916959549");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886212" + "'", str56, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ORD-1775916886212" + "'", str58, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray63);
        org.junit.Assert.assertArrayEquals(cartItemArray63, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ORD-1775916886212" + "'", str78, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916886212" + "'", str79, "ORD-1775916886212");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:52", "ORD-1775916897292", "ORD-1775916894246", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916894246" + "'", str5, "ORD-1775916894246");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:52" + "'", str6, "2026-04-11 17:14:52");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916894246" + "'", str7, "ORD-1775916894246");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, 0);
        example.model.CartItem cartItem16 = new example.model.CartItem(product4, (int) (byte) 10);
        java.lang.String str17 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916890749" + "'", str17, "ORD-1775916890749");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        java.lang.String str5 = product4.getId();
        java.lang.String str6 = product4.toString();
        java.lang.String str7 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916891615" + "'", str5, "ORD-1775916891615");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ORD-1775916891615] ORD-1775916890749    - $1.00  (ORD-1775916892828)" + "'", str6, "[ORD-1775916891615] ORD-1775916890749    - $1.00  (ORD-1775916892828)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        java.util.List<example.model.CartItem> cartItemList31 = order30.getItems();
        java.lang.Class<?> wildcardClass32 = cartItemList31.getClass();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order30);
        org.junit.Assert.assertNotNull(cartItemList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        example.model.Product product4 = new example.model.Product("ORD-1775916887557", "ORD-1775916938704", "ORD-1775916944819", 0.0d);
        java.lang.String str5 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916887557" + "'", str5, "ORD-1775916887557");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.String str23 = address6.getStreet();
        java.lang.String str24 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "17) test1057(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916959791" + "'", str18, "ORD-1775916959791");
        org.junit.Assert.assertNotNull(cartItemList19);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916886212" + "'", str24, "ORD-1775916886212");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        java.lang.String str34 = address19.getStreet();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "18) test1058(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916959816" + "'", str29, "ORD-1775916959816");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916886212" + "'", str34, "ORD-1775916886212");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916911594");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        double double87 = order86.getTotalAmount();
        double double88 = order86.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
// flaky "19) test1060(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
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
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 1.0d + "'", double87 == 1.0d);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 1.0d + "'", double88 == 1.0d);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        example.service.CartService.removeProduct("ORD-1775916943439");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916952447");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        example.model.Product product4 = new example.model.Product("ORD-1775916939114", "ORD-1775916907850", "2026-04-11 17:15:27", (double) (short) 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        java.lang.String str5 = product4.getId();
        example.model.CartItem cartItem7 = new example.model.CartItem(product4, (int) (byte) 10);
        java.lang.String str8 = cartItem7.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916891615" + "'", str5, "ORD-1775916891615");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916890749    x10  = $10.00" + "'", str8, "ORD-1775916890749    x10  = $10.00");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        java.lang.String str13 = product4.getDescription();
        java.lang.String str14 = product4.getId();
        java.lang.String str15 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str15, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        example.model.Address address5 = new example.model.Address("ORD-1775916930684", "2026-04-11 17:15:17", "ORD-1775916956583", "2026-04-11 17:14:50  x1  = $-1.00", "ORD-1775916916751");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getCustomerEmail();
        java.lang.String str14 = order12.getCreatedAt();
        java.lang.String str15 = order12.getCreatedAt();
        java.lang.String str16 = order12.getCustomerEmail();
        double double17 = order12.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886212" + "'", str13, "ORD-1775916886212");
// flaky "20) test1067(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:16:00" + "'", str14, "2026-04-11 17:16:00");
// flaky "11) test1067(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:16:00" + "'", str15, "2026-04-11 17:16:00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        example.model.Product product10 = cartItem9.getProduct();
        cartItem9.setQuantity((int) (short) 0);
        int int13 = cartItem9.getQuantity();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        example.model.Product product4 = new example.model.Product("ORD-1775916917827", "ORD-1775916925720", "ORD-1775916939408", 1.0d);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getStreet();
        java.lang.String str8 = address5.getCity();
        java.lang.String str9 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "21) test1070(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str9, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        java.lang.String str10 = cartItem8.toString();
        int int11 = cartItem8.getQuantity();
        double double12 = cartItem8.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
// flaky "22) test1071(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    str10  = $0.00" + "'", str10, "ORD-1775916890749    str10  = $0.00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getCreatedAt();
        // The following exception was thrown during execution in test generation
        try {
            example.service.OrderService.printReceipt(order12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "23) test1072(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:16:00" + "'", str13, "2026-04-11 17:16:00");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        java.lang.String str11 = address6.getCountry();
        example.model.Address address19 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str20 = address19.getPhone();
        java.lang.String str21 = address19.getFullName();
        java.lang.String str22 = address19.getPhone();
        example.model.Address address29 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str30 = address29.getCountry();
        java.lang.String str31 = address29.getStreet();
        example.model.Address address33 = null;
        example.model.CartItem[] cartItemArray34 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList35 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList35, cartItemArray34);
        example.model.Order order39 = new example.model.Order("", address33, (java.util.List<example.model.CartItem>) cartItemList35, 1.0d, "");
        example.model.Order order42 = example.service.OrderService.createOrder("ORD-1775916888151", address29, (java.util.List<example.model.CartItem>) cartItemList35, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order45 = example.service.OrderService.createOrder("ORD-1775916887228", address19, (java.util.List<example.model.CartItem>) cartItemList35, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address47 = null;
        example.model.CartItem[] cartItemArray48 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList49 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList49, cartItemArray48);
        example.model.Order order53 = new example.model.Order("", address47, (java.util.List<example.model.CartItem>) cartItemList49, 1.0d, "");
        java.lang.String str54 = order53.getOrderId();
        java.lang.String str55 = order53.getOrderId();
        java.util.List<example.model.CartItem> cartItemList56 = order53.getItems();
        example.model.Order order59 = example.service.OrderService.createOrder("ORD-1775916891135", address19, cartItemList56, (double) 0L, "ORD-1775916886040");
        example.model.Order order62 = example.service.OrderService.createOrder("ORD-1775916889693", address6, cartItemList56, (double) (short) -1, "ORD-1775916886687");
        java.lang.String str63 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "24) test1073(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray34);
        org.junit.Assert.assertArrayEquals(cartItemArray34, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(order42);
        org.junit.Assert.assertNotNull(order45);
        org.junit.Assert.assertNotNull(cartItemArray48);
        org.junit.Assert.assertArrayEquals(cartItemArray48, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky "12) test1073(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ORD-1775916960282" + "'", str54, "ORD-1775916960282");
// flaky "6) test1073(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916960282" + "'", str55, "ORD-1775916960282");
        org.junit.Assert.assertNotNull(cartItemList56);
        org.junit.Assert.assertNotNull(order59);
        org.junit.Assert.assertNotNull(order62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        example.model.Product product4 = new example.model.Product("ORD-1775916942541", "ORD-1775916956330", "ORD-1775916915454", (double) (byte) -1);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getFullName();
        java.lang.String str11 = address6.toString();
        example.model.Address address19 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str20 = address19.getStreet();
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916887036", address19, (java.util.List<example.model.CartItem>) cartItemList22, (double) 10.0f, "ORD-1775916887166");
        example.model.Address address28 = null;
        example.model.Address address30 = null;
        example.model.CartItem[] cartItemArray31 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList32 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList32, cartItemArray31);
        example.model.Order order36 = new example.model.Order("", address30, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "");
        example.model.Order order39 = new example.model.Order("ORD-1775916886212", address28, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "ORD-1775916886040");
        example.model.Order order42 = new example.model.Order("ORD-1775916894079", address19, (java.util.List<example.model.CartItem>) cartItemList32, (double) 100, "2026-04-11 17:14:58");
        example.model.Order order45 = example.service.OrderService.createOrder("ORD-1775916920862", address6, (java.util.List<example.model.CartItem>) cartItemList32, (double) 100, "ORD-1775916891457");
        java.lang.String str46 = order45.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "25) test1075(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str11, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(order45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ORD-1775916920862" + "'", str46, "ORD-1775916920862");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.String str29 = address27.getFullName();
        java.lang.String str30 = address27.getPhone();
        example.model.Address address38 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address40 = null;
        example.model.CartItem[] cartItemArray41 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList42 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList42, cartItemArray41);
        example.model.Order order46 = new example.model.Order("", address40, (java.util.List<example.model.CartItem>) cartItemList42, 1.0d, "");
        example.model.Order order49 = new example.model.Order("2026-04-11 17:14:47", address38, (java.util.List<example.model.CartItem>) cartItemList42, (double) (-1.0f), "");
        example.model.Address address50 = order49.getAddress();
        java.lang.String str51 = address50.toString();
        example.model.Address address59 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address61 = null;
        example.model.CartItem[] cartItemArray62 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList63 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList63, cartItemArray62);
        example.model.Order order67 = new example.model.Order("", address61, (java.util.List<example.model.CartItem>) cartItemList63, 1.0d, "");
        example.model.Order order70 = new example.model.Order("2026-04-11 17:14:47", address59, (java.util.List<example.model.CartItem>) cartItemList63, (double) (-1.0f), "");
        example.model.Address address71 = order70.getAddress();
        example.model.Address address73 = null;
        example.model.Address address75 = null;
        example.model.CartItem[] cartItemArray76 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList77 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList77, cartItemArray76);
        example.model.Order order81 = new example.model.Order("", address75, (java.util.List<example.model.CartItem>) cartItemList77, 1.0d, "");
        example.model.Order order84 = new example.model.Order("ORD-1775916886212", address73, (java.util.List<example.model.CartItem>) cartItemList77, 1.0d, "ORD-1775916886040");
        example.model.Order order87 = new example.model.Order("ORD-1775916892053", address71, (java.util.List<example.model.CartItem>) cartItemList77, (double) 10, "ORD-1775916887494");
        example.model.Order order90 = example.service.OrderService.createOrder("ORD-1775916911907", address50, (java.util.List<example.model.CartItem>) cartItemList77, (double) (-1.0f), "ORD-1775916904860");
        example.model.Order order93 = example.service.OrderService.createOrder("ORD-1775916936623", address27, (java.util.List<example.model.CartItem>) cartItemList77, (double) 1, "ORD-1775916898608");
        java.lang.String str94 = address27.getPhone();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(address27);
// flaky "26) test1076(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray41);
        org.junit.Assert.assertArrayEquals(cartItemArray41, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(address50);
// flaky "13) test1076(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str51, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray62);
        org.junit.Assert.assertArrayEquals(cartItemArray62, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(address71);
        org.junit.Assert.assertNotNull(cartItemArray76);
        org.junit.Assert.assertArrayEquals(cartItemArray76, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(order90);
        org.junit.Assert.assertNotNull(order93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "ORD-1775916886212" + "'", str94, "ORD-1775916886212");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        java.lang.String str13 = cartItem12.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50  x1  = $-1.00" + "'", str13, "2026-04-11 17:14:50  x1  = $-1.00");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        double double9 = product4.getPrice();
        example.service.CartService.addProduct(product4, 52);
        double double12 = product4.getPrice();
        java.lang.String str13 = product4.getName();
        java.lang.String str14 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50" + "'", str13, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        cartItem19.setQuantity(35);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916888257" + "'", str13, "ORD-1775916888257");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2026-04-11 17:14:50" + "'", str17, "2026-04-11 17:14:50");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        java.lang.String str22 = address21.getStreet();
        java.lang.String str23 = address21.getFullName();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getOrderId();
        example.model.Address address12 = order7.getAddress();
        java.lang.String str13 = order7.getCustomerEmail();
        java.lang.Class<?> wildcardClass14 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "27) test1081(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916960568" + "'", str8, "ORD-1775916960568");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "14) test1081(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916960568" + "'", str11, "ORD-1775916960568");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        example.model.Address address35 = order34.getAddress();
        example.model.Address address37 = null;
        example.model.CartItem[] cartItemArray38 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList39 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList39, cartItemArray38);
        example.model.Order order43 = new example.model.Order("", address37, (java.util.List<example.model.CartItem>) cartItemList39, 1.0d, "");
        java.lang.String str44 = order43.getOrderId();
        java.util.List<example.model.CartItem> cartItemList45 = order43.getItems();
        example.model.Address address46 = order43.getAddress();
        java.lang.String str47 = order43.getCreatedAt();
        double double48 = order43.getTotalAmount();
        java.lang.String str49 = order43.getStatus();
        java.util.List<example.model.CartItem> cartItemList50 = order43.getItems();
        example.model.Order order53 = example.service.OrderService.createOrder("[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)", address35, cartItemList50, (double) ' ', "2026-04-11 17:15:15");
        java.lang.String str54 = order53.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "28) test1082(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916960601" + "'", str30, "ORD-1775916960601");
        org.junit.Assert.assertNotNull(cartItemList31);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(cartItemArray38);
        org.junit.Assert.assertArrayEquals(cartItemArray38, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "15) test1082(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916960601" + "'", str44, "ORD-1775916960601");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNull(address46);
// flaky "7) test1082(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2026-04-11 17:16:00" + "'", str47, "2026-04-11 17:16:00");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PAID" + "'", str49, "PAID");
        org.junit.Assert.assertNotNull(cartItemList50);
        org.junit.Assert.assertNotNull(order53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "PAID" + "'", str54, "PAID");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916889515" + "'", str8, "ORD-1775916889515");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        cartItem2.setQuantity((int) 'a');
        int int7 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.getDescription();
        double double11 = product4.getPrice();
        example.service.CartService.addProduct(product4, (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        java.lang.String str12 = product11.getId();
        java.lang.String str13 = product11.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916889515" + "'", str12, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916889515" + "'", str13, "ORD-1775916889515");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        example.model.Address address1 = null;
        example.model.Address address9 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        example.model.Order order20 = new example.model.Order("2026-04-11 17:14:47", address9, (java.util.List<example.model.CartItem>) cartItemList13, (double) (-1.0f), "");
        example.model.Address address21 = order20.getAddress();
        java.lang.String str22 = address21.getStreet();
        example.model.Address address24 = null;
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = new example.model.Order("", address24, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "");
        java.lang.String str31 = order30.getOrderId();
        java.util.List<example.model.CartItem> cartItemList32 = order30.getItems();
        example.model.Order order35 = new example.model.Order("ORD-1775916890225", address21, cartItemList32, (double) (byte) -1, "");
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order38 = example.service.OrderService.createOrder("ORD-1775916902486", address1, cartItemList32, 100.0d, "ORD-1775916898459");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "29) test1087(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916960805" + "'", str31, "ORD-1775916960805");
        org.junit.Assert.assertNotNull(cartItemList32);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.lang.String str71 = order70.getOrderId();
        example.model.Address address72 = order70.getAddress();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916895177" + "'", str7, "ORD-1775916895177");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
// flaky "30) test1088(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str19, "\ud83d\udcde ORD-1775916886212");
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
// flaky "16) test1088(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ORD-1775916960851" + "'", str71, "ORD-1775916960851");
        org.junit.Assert.assertNotNull(address72);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        double double7 = cartItem6.getSubtotal();
        java.lang.Class<?> wildcardClass8 = cartItem6.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        example.model.Product product4 = new example.model.Product("ORD-1775916909254", "ORD-1775916914931", "ORD-1775916907850", (double) (short) 1);
        java.lang.String str5 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916909254] ORD-1775916914931    - $1.00  (ORD-1775916907850)" + "'", str5, "[ORD-1775916909254] ORD-1775916914931    - $1.00  (ORD-1775916907850)");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916895177", "2026-04-11 17:14:53", "ORD-1775916889159", "ORD-1775916894903");
        java.lang.String str6 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889159" + "'", str6, "ORD-1775916889159");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        example.service.CartService.removeProduct("ORD-1775916943260");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = cartItem6.toString();
        double double8 = cartItem6.getSubtotal();
        cartItem6.setQuantity(100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str7, "ORD-1775916890749    x1  = $1.00");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.lang.String str27 = order26.getStatus();
        java.lang.String str28 = order26.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "31) test1094(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "PAID" + "'", str27, "PAID");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916889159" + "'", str28, "ORD-1775916889159");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        example.service.CartService.removeProduct("ORD-1775916887166");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916905654");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address13 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str14 = address13.getStreet();
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = example.service.OrderService.createOrder("ORD-1775916887036", address13, (java.util.List<example.model.CartItem>) cartItemList16, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order23 = new example.model.Order("2026-04-11 17:14:48", address6, (java.util.List<example.model.CartItem>) cartItemList16, 0.0d, "ORD-1775916900332");
        java.lang.String str24 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886212" + "'", str14, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916886212" + "'", str24, "ORD-1775916886212");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = example.service.OrderService.createOrder("ORD-1775916888151", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) ' ', "2026-04-11 17:14:48");
        java.lang.String str20 = order19.getOrderId();
        java.lang.String str21 = order19.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
// flaky "32) test1098(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916961177" + "'", str20, "ORD-1775916961177");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916888151" + "'", str21, "ORD-1775916888151");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        example.model.Address address7 = new example.model.Address("ORD-1775916899079", "ORD-1775916909254", "ORD-1775916894903", "ORD-1775916887934", "ORD-1775916910496");
        example.model.Address address14 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str15 = address14.getStreet();
        example.model.CartItem[] cartItemArray16 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList17 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList17, cartItemArray16);
        example.model.Order order21 = example.service.OrderService.createOrder("ORD-1775916887036", address14, (java.util.List<example.model.CartItem>) cartItemList17, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order24 = new example.model.Order("2026-04-11 17:14:55", address7, (java.util.List<example.model.CartItem>) cartItemList17, 0.0d, "ORD-1775916887494");
        example.model.Address address31 = new example.model.Address("ORD-1775916886212", "ORD-1775916909947", "ORD-1775916902074", "2026-04-11 17:14:51", "ORD-1775916892904");
        example.model.Address address40 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        example.model.Order order51 = new example.model.Order("2026-04-11 17:14:47", address40, (java.util.List<example.model.CartItem>) cartItemList44, (double) (-1.0f), "");
        example.model.Address address52 = order51.getAddress();
        java.lang.String str53 = address52.getStreet();
        example.model.Address address55 = null;
        example.model.CartItem[] cartItemArray56 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList57 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList57, cartItemArray56);
        example.model.Order order61 = new example.model.Order("", address55, (java.util.List<example.model.CartItem>) cartItemList57, 1.0d, "");
        java.lang.String str62 = order61.getOrderId();
        java.util.List<example.model.CartItem> cartItemList63 = order61.getItems();
        example.model.Order order66 = new example.model.Order("ORD-1775916890225", address52, cartItemList63, (double) (byte) -1, "");
        example.model.Address address68 = null;
        example.model.Address address70 = null;
        example.model.CartItem[] cartItemArray71 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList72 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList72, cartItemArray71);
        example.model.Order order76 = new example.model.Order("", address70, (java.util.List<example.model.CartItem>) cartItemList72, 1.0d, "");
        example.model.Order order79 = new example.model.Order("ORD-1775916886212", address68, (java.util.List<example.model.CartItem>) cartItemList72, 1.0d, "ORD-1775916886040");
        java.lang.String str80 = order79.getPaymentIntentId();
        double double81 = order79.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList82 = order79.getItems();
        example.model.Order order85 = example.service.OrderService.createOrder("ORD-1775916899981", address52, cartItemList82, (double) 1, "ORD-1775916889159");
        example.model.Order order88 = new example.model.Order("ORD-1775916898608", address31, cartItemList82, (double) 1, "2026-04-11 17:15:02");
        example.model.Order order91 = example.service.OrderService.createOrder("ORD-1775916936773", address7, cartItemList82, (double) (byte) -1, "ORD-1775916959665");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray16);
        org.junit.Assert.assertArrayEquals(cartItemArray16, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(order21);
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(address52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ORD-1775916886212" + "'", str53, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray56);
        org.junit.Assert.assertArrayEquals(cartItemArray56, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky "33) test1099(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ORD-1775916961205" + "'", str62, "ORD-1775916961205");
        org.junit.Assert.assertNotNull(cartItemList63);
        org.junit.Assert.assertNotNull(cartItemArray71);
        org.junit.Assert.assertArrayEquals(cartItemArray71, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ORD-1775916886040" + "'", str80, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 1.0d + "'", double81 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList82);
        org.junit.Assert.assertNotNull(order85);
        org.junit.Assert.assertNotNull(order91);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.lang.String str15 = order7.getOrderId();
        java.lang.String str16 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "34) test1100(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916961263" + "'", str8, "ORD-1775916961263");
// flaky "17) test1100(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916961263" + "'", str9, "ORD-1775916961263");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
// flaky "8) test1100(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916961263" + "'", str15, "ORD-1775916961263");
// flaky "3) test1100(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-04-11 17:16:01" + "'", str16, "2026-04-11 17:16:01");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde ORD-1775916887036", "ORD-1775916936937", "ORD-1775916907784", (double) 0);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        java.lang.String str16 = order15.getOrderId();
        java.util.List<example.model.CartItem> cartItemList17 = order15.getItems();
        double double18 = order15.getTotalAmount();
        java.lang.String str19 = order15.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList20 = order15.getItems();
        example.model.Order order23 = new example.model.Order("ORD-1775916903896", address6, cartItemList20, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str24 = order23.getCustomerEmail();
        java.lang.String str25 = order23.getOrderId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "35) test1102(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916961349" + "'", str16, "ORD-1775916961349");
        org.junit.Assert.assertNotNull(cartItemList17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916903896" + "'", str24, "ORD-1775916903896");
// flaky "18) test1102(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916961349" + "'", str25, "ORD-1775916961349");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        double double76 = order75.getTotalAmount();
        java.lang.String str77 = order75.getStatus();
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
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 1.0d + "'", double76 == 1.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "PAID" + "'", str77, "PAID");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        double double31 = order30.getTotalAmount();
        java.lang.String str32 = order30.getCustomerEmail();
        java.lang.Class<?> wildcardClass33 = order30.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916894327" + "'", str32, "ORD-1775916894327");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916958617");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 10);
        int int7 = cartItem6.getQuantity();
        double double8 = cartItem6.getSubtotal();
        cartItem6.setQuantity((int) (byte) -1);
        example.model.Product product11 = cartItem6.getProduct();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 350.0d + "'", double8 == 350.0d);
        org.junit.Assert.assertNotNull(product11);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        double double10 = product9.getPrice();
        java.lang.String str11 = product9.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:47" + "'", str11, "2026-04-11 17:14:47");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        example.service.CartService.addProduct(product4, 52);
        java.lang.String str9 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:47" + "'", str9, "2026-04-11 17:14:47");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        java.util.List<example.model.CartItem> cartItemList68 = order67.getItems();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
// flaky "36) test1109(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916961606" + "'", str33, "ORD-1775916961606");
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ORD-1775916886212" + "'", str49, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916886212" + "'", str50, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray53);
        org.junit.Assert.assertArrayEquals(cartItemArray53, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(order61);
        org.junit.Assert.assertNotNull(order67);
        org.junit.Assert.assertNotNull(cartItemList68);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        example.model.Address address5 = new example.model.Address("ORD-1775916915644", "ORD-1775916886212", "ORD-1775916887166", "ORD-1775916890979", "ORD-1775916893816");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.toString();
        java.lang.String str8 = address5.getCity();
// flaky "37) test1110(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916893816" + "'", str6, "\ud83d\udcde ORD-1775916893816");
// flaky "19) test1110(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916893816" + "'", str7, "\ud83d\udcde ORD-1775916893816");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916887166" + "'", str8, "ORD-1775916887166");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        example.model.Product product4 = new example.model.Product("ORD-1775916933652", "ORD-1775916943610", "ORD-1775916942541", (double) 52);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        int int9 = cartItem8.getQuantity();
        cartItem8.setQuantity((int) (byte) 10);
        example.model.Product product12 = cartItem8.getProduct();
        double double13 = product12.getPrice();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(product12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double13 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        example.model.Product product9 = cartItem6.getProduct();
        cartItem6.setQuantity(0);
        int int12 = cartItem6.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        java.lang.String str17 = order7.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "38) test1115(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916961865" + "'", str8, "ORD-1775916961865");
// flaky "20) test1115(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916961865" + "'", str9, "ORD-1775916961865");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
// flaky "9) test1115(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:16:01" + "'", str14, "2026-04-11 17:16:01");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "4) test1115(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-04-11 17:16:01" + "'", str16, "2026-04-11 17:16:01");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PAID" + "'", str17, "PAID");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = cartItem6.toString();
        java.lang.String str8 = cartItem6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str7, "ORD-1775916890749    x1  = $1.00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str8, "ORD-1775916890749    x1  = $1.00");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = example.service.OrderService.createOrder("ORD-1775916903896", address6, (java.util.List<example.model.CartItem>) cartItemList11, (double) 0L, "ORD-1775916904159");
        example.service.OrderService.printReceipt(order18);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(order18);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        java.lang.String str22 = order17.getStatus();
        double double23 = order17.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PAID" + "'", str22, "PAID");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        java.lang.String str10 = cartItem8.toString();
        java.lang.String str11 = cartItem8.toString();
        java.lang.String str12 = cartItem8.toString();
        java.lang.String str13 = cartItem8.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
// flaky "39) test1119(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    str10  = $0.00" + "'", str10, "ORD-1775916890749    str10  = $0.00");
// flaky "21) test1119(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916890749    str11  = $0.00" + "'", str11, "ORD-1775916890749    str11  = $0.00");
// flaky "10) test1119(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916890749    str12  = $0.00" + "'", str12, "ORD-1775916890749    str12  = $0.00");
// flaky "5) test1119(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916890749    str13  = $0.00" + "'", str13, "ORD-1775916890749    str13  = $0.00");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        example.model.Address address35 = order33.getAddress();
        example.service.OrderService.printReceipt(order33);
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "40) test1120(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916962028" + "'", str29, "ORD-1775916962028");
        org.junit.Assert.assertNotNull(cartItemList30);
// flaky "22) test1120(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916962028" + "'", str34, "ORD-1775916962028");
        org.junit.Assert.assertNotNull(address35);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        example.model.Address address5 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.getPhone();
        java.lang.String str8 = address5.getFullName();
// flaky "41) test1121(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916897292" + "'", str6, "\ud83d\udcde ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916897292" + "'", str7, "ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886040" + "'", str8, "ORD-1775916886040");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        example.model.Product product9 = cartItem2.getProduct();
        int int10 = cartItem2.getQuantity();
        cartItem2.setQuantity(100);
        int int13 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        double double13 = order7.getTotalAmount();
        java.lang.String str14 = order7.getStatus();
        java.lang.String str15 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "42) test1123(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916962150" + "'", str8, "ORD-1775916962150");
// flaky "23) test1123(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916962150" + "'", str9, "ORD-1775916962150");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
// flaky "11) test1123(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:16:02" + "'", str15, "2026-04-11 17:16:02");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916957647");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        double double11 = order7.getTotalAmount();
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
// flaky "43) test1125(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916962212" + "'", str8, "ORD-1775916962212");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        example.service.CartService.addProduct(product4, 1);
        double double9 = product4.getPrice();
        java.lang.String str10 = product4.getDescription();
        java.lang.String str11 = product4.getId();
        example.service.CartService.addProduct(product4, (-1));
        double double14 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:47" + "'", str10, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916889515" + "'", str11, "ORD-1775916889515");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.lang.Class<?> wildcardClass33 = address7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916939206", "ORD-1775916916040", "ORD-1775916887828", "ORD-1775916951795");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        example.service.CartService.removeProduct("ORD-1775916899155");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        java.lang.String str29 = order26.getStatus();
        java.lang.String str30 = order26.getCustomerEmail();
        double double31 = order26.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "44) test1130(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "24) test1130(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916962350" + "'", str27, "ORD-1775916962350");
// flaky "12) test1130(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2026-04-11 17:16:02" + "'", str28, "2026-04-11 17:16:02");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PAID" + "'", str29, "PAID");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916889159" + "'", str30, "ORD-1775916889159");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        java.lang.Class<?> wildcardClass14 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "45) test1131(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916962383" + "'", str8, "ORD-1775916962383");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "25) test1131(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916962383" + "'", str11, "ORD-1775916962383");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
// flaky "13) test1131(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:16:02" + "'", str13, "2026-04-11 17:16:02");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        example.model.Product product4 = new example.model.Product("ORD-1775916926618", "\ud83d\udcde PAID", "ORD-1775916936388", (double) (short) 100);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 10);
        double double7 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        example.model.Address address6 = new example.model.Address("ORD-1775916930220", "ORD-1775916911594", "ORD-1775916904299", "ORD-1775916911594", "2026-04-11 17:14:54");
        java.lang.String str7 = address6.getCity();
        example.model.Address address14 = new example.model.Address("ORD-1775916895446", "ORD-1775916922856", "ORD-1775916898820", "ORD-1775916921154", "ORD-1775916895177");
        example.model.Address address16 = null;
        example.model.CartItem[] cartItemArray17 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList18 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList18, cartItemArray17);
        example.model.Order order22 = new example.model.Order("", address16, (java.util.List<example.model.CartItem>) cartItemList18, 1.0d, "");
        java.lang.String str23 = order22.getOrderId();
        java.lang.String str24 = order22.getOrderId();
        example.model.Address address25 = order22.getAddress();
        java.lang.String str26 = order22.getStatus();
        java.lang.String str27 = order22.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList28 = order22.getItems();
        example.model.Order order31 = example.service.OrderService.createOrder("[PAID] ORD-1775916912970    - $-1.00  ()", address14, cartItemList28, (-35.0d), "ORD-1775916915537");
        example.model.Order order34 = new example.model.Order("ORD-1775916941960", address6, cartItemList28, (double) (short) 10, "ORD-1775916928225");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916904299" + "'", str7, "ORD-1775916904299");
        org.junit.Assert.assertNotNull(cartItemArray17);
        org.junit.Assert.assertArrayEquals(cartItemArray17, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "46) test1135(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916962484" + "'", str23, "ORD-1775916962484");
// flaky "26) test1135(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916962484" + "'", str24, "ORD-1775916962484");
        org.junit.Assert.assertNull(address25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PAID" + "'", str26, "PAID");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(cartItemList28);
        org.junit.Assert.assertNotNull(order31);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getCountry();
        java.lang.String str21 = address19.getCity();
        example.model.Address address29 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str30 = address29.getCountry();
        java.lang.String str31 = address29.getStreet();
        example.model.Address address33 = null;
        example.model.Address address35 = null;
        example.model.CartItem[] cartItemArray36 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList37 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList37, cartItemArray36);
        example.model.Order order41 = new example.model.Order("", address35, (java.util.List<example.model.CartItem>) cartItemList37, 1.0d, "");
        example.model.Order order44 = new example.model.Order("ORD-1775916886212", address33, (java.util.List<example.model.CartItem>) cartItemList37, 1.0d, "ORD-1775916886040");
        example.model.Order order47 = new example.model.Order("ORD-1775916893369", address29, (java.util.List<example.model.CartItem>) cartItemList37, (double) 52, "2026-04-11 17:14:52");
        example.model.Address address49 = null;
        example.model.CartItem[] cartItemArray50 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList51 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList51, cartItemArray50);
        example.model.Order order55 = new example.model.Order("", address49, (java.util.List<example.model.CartItem>) cartItemList51, 1.0d, "");
        java.lang.String str56 = order55.getOrderId();
        example.model.Address address57 = order55.getAddress();
        java.lang.String str58 = order55.getCreatedAt();
        java.lang.String str59 = order55.getCreatedAt();
        example.model.Address address60 = order55.getAddress();
        java.util.List<example.model.CartItem> cartItemList61 = order55.getItems();
        example.model.Order order64 = new example.model.Order("ORD-1775916903519", address29, cartItemList61, 35.0d, "ORD-1775916891938");
        example.model.Order order67 = new example.model.Order("\ud83d\udcde ORD-1775916886212", address19, cartItemList61, (double) (short) 1, "ORD-1775916916776");
        java.util.List<example.model.CartItem> cartItemList68 = order67.getItems();
        java.lang.Class<?> wildcardClass69 = cartItemList68.getClass();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray36);
        org.junit.Assert.assertArrayEquals(cartItemArray36, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cartItemArray50);
        org.junit.Assert.assertArrayEquals(cartItemArray50, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky "47) test1136(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916962516" + "'", str56, "ORD-1775916962516");
        org.junit.Assert.assertNull(address57);
// flaky "27) test1136(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "2026-04-11 17:16:02" + "'", str58, "2026-04-11 17:16:02");
// flaky "14) test1136(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "2026-04-11 17:16:02" + "'", str59, "2026-04-11 17:16:02");
        org.junit.Assert.assertNull(address60);
        org.junit.Assert.assertNotNull(cartItemList61);
        org.junit.Assert.assertNotNull(cartItemList68);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getCountry();
        java.lang.String str10 = address8.getStreet();
        example.model.Address address12 = null;
        example.model.CartItem[] cartItemArray13 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList14 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList14, cartItemArray13);
        example.model.Order order18 = new example.model.Order("", address12, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "");
        example.model.Order order21 = example.service.OrderService.createOrder("ORD-1775916888151", address8, (java.util.List<example.model.CartItem>) cartItemList14, (double) ' ', "2026-04-11 17:14:48");
        java.lang.String str22 = address8.getCity();
        example.model.Address address24 = null;
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = new example.model.Order("", address24, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "");
        java.lang.String str31 = order30.getOrderId();
        java.util.List<example.model.CartItem> cartItemList32 = order30.getItems();
        double double33 = order30.getTotalAmount();
        java.lang.String str34 = order30.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList35 = order30.getItems();
        example.model.Order order38 = example.service.OrderService.createOrder("ORD-1775916907439", address8, cartItemList35, (double) (short) 1, "ORD-1775916890749");
        java.lang.String str39 = address8.toString();
        java.util.List<example.model.CartItem> cartItemList40 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order43 = example.service.OrderService.createOrder("ORD-1775916953695", address8, cartItemList40, (double) 100L, "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because the return value of \"example.model.Order.getItems()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(order21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "48) test1137(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916962553" + "'", str31, "ORD-1775916962553");
        org.junit.Assert.assertNotNull(cartItemList32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(cartItemList35);
        org.junit.Assert.assertNotNull(order38);
// flaky "28) test1137(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str39, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList11 = order7.getItems();
        double double12 = order7.getTotalAmount();
        java.lang.String str13 = order7.getPaymentIntentId();
        example.model.Address address14 = order7.getAddress();
        double double15 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "49) test1138(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916962586" + "'", str8, "ORD-1775916962586");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getFullName();
        java.lang.String str9 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        cartItem12.setQuantity(52);
        java.lang.String str15 = cartItem12.toString();
        int int16 = cartItem12.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:14:50  x52  = $-52.00" + "'", str15, "2026-04-11 17:14:50  x52  = $-52.00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        example.model.Address address6 = new example.model.Address("2026-04-11 17:14:51", "ORD-1775916894079", "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)", "ORD-1775916895177", "");
        java.lang.String str7 = address6.getCountry();
        example.model.Address address9 = null;
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        java.lang.String str18 = order17.getOrderId();
        java.lang.String str19 = order17.getOrderId();
        example.model.Address address20 = order17.getAddress();
        java.lang.String str21 = order17.getStatus();
        java.lang.String str22 = order17.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList23 = order17.getItems();
        example.model.Order order26 = new example.model.Order("ORD-1775916900618", address9, cartItemList23, (double) (byte) -1, "ORD-1775916917643");
        example.model.Order order29 = example.service.OrderService.createOrder("\ud83d\udcde 2026-04-11 17:15:03", address6, cartItemList23, (double) 10, "ORD-1775916923419");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916895177" + "'", str7, "ORD-1775916895177");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "50) test1141(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916962663" + "'", str18, "ORD-1775916962663");
// flaky "29) test1141(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916962663" + "'", str19, "ORD-1775916962663");
        org.junit.Assert.assertNull(address20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PAID" + "'", str21, "PAID");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(cartItemList23);
        org.junit.Assert.assertNotNull(order29);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        example.service.OrderService.printReceipt(order63);
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "51) test1142(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916962686" + "'", str37, "ORD-1775916962686");
        org.junit.Assert.assertNotNull(cartItemList38);
        org.junit.Assert.assertNotNull(cartItemArray46);
        org.junit.Assert.assertArrayEquals(cartItemArray46, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916886040" + "'", str55, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList57);
        org.junit.Assert.assertNotNull(order60);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.lang.String str99 = address98.toString();
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
// flaky "52) test1143(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916962736" + "'", str44, "ORD-1775916962736");
// flaky "30) test1143(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916962736" + "'", str45, "ORD-1775916962736");
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
// flaky "15) test1143(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916962736" + "'", str79, "ORD-1775916962736");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(address98);
// flaky "6) test1143(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str99 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str99, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = example.service.OrderService.createOrder("ORD-1775916888151", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) ' ', "2026-04-11 17:14:48");
        java.lang.String str20 = address6.toString();
        java.lang.String str21 = address6.getPhone();
        java.lang.String str22 = address6.getCity();
        java.lang.String str23 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
// flaky "53) test1144(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        example.service.CartService.removeProduct("ORD-1775916911314");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        example.service.CartService.removeProduct("\ud83d\udcde ORD-1775916897794");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        example.model.Product product4 = new example.model.Product("ORD-1775916903299", "ORD-1775916896079", "2026-04-11 17:14:50  x35  = $-35.00", (double) 0.0f);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (-1));
        java.lang.String str7 = product4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ORD-1775916903299] ORD-1775916896079    - $0.00  (2026-04-11 17:14:50  x35  = $-35.00)" + "'", str7, "[ORD-1775916903299] ORD-1775916896079    - $0.00  (2026-04-11 17:14:50  x35  = $-35.00)");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.toString();
        example.model.Address address28 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address30 = null;
        example.model.CartItem[] cartItemArray31 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList32 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList32, cartItemArray31);
        example.model.Order order36 = new example.model.Order("", address30, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "");
        example.model.Order order39 = new example.model.Order("2026-04-11 17:14:47", address28, (java.util.List<example.model.CartItem>) cartItemList32, (double) (-1.0f), "");
        example.model.Address address40 = order39.getAddress();
        example.model.Address address42 = null;
        example.model.Address address44 = null;
        example.model.CartItem[] cartItemArray45 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList46 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList46, cartItemArray45);
        example.model.Order order50 = new example.model.Order("", address44, (java.util.List<example.model.CartItem>) cartItemList46, 1.0d, "");
        example.model.Order order53 = new example.model.Order("ORD-1775916886212", address42, (java.util.List<example.model.CartItem>) cartItemList46, 1.0d, "ORD-1775916886040");
        example.model.Order order56 = new example.model.Order("ORD-1775916892053", address40, (java.util.List<example.model.CartItem>) cartItemList46, (double) 10, "ORD-1775916887494");
        example.model.Order order59 = example.service.OrderService.createOrder("ORD-1775916911907", address19, (java.util.List<example.model.CartItem>) cartItemList46, (double) (-1.0f), "ORD-1775916904860");
        java.lang.String str60 = address19.getPhone();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
// flaky "54) test1148(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(address40);
        org.junit.Assert.assertNotNull(cartItemArray45);
        org.junit.Assert.assertArrayEquals(cartItemArray45, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(order59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ORD-1775916886212" + "'", str60, "ORD-1775916886212");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        java.lang.Class<?> wildcardClass44 = address7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:15:08", "ORD-1775916936275", "ORD-1775916897794", (double) (byte) 0);
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916897794" + "'", str5, "ORD-1775916897794");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.String str22 = order17.getStatus();
        java.lang.String str23 = order17.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PAID" + "'", str22, "PAID");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PAID" + "'", str23, "PAID");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        java.lang.String str8 = product4.getId();
        example.service.CartService.addProduct(product4, (int) '#');
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str13 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916889515" + "'", str8, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:47" + "'", str13, "2026-04-11 17:14:47");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        double double36 = order35.getTotalAmount();
        java.lang.String str37 = order35.getOrderId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
// flaky "55) test1154(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-35.0d) + "'", double36 == (-35.0d));
// flaky "31) test1154(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916963086" + "'", str37, "ORD-1775916963086");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        example.model.Address address5 = new example.model.Address("ORD-1775916903896", "ORD-1775916895177", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916887228", "ORD-1775916897794");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.getStreet();
// flaky "56) test1155(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916897794" + "'", str6, "\ud83d\udcde ORD-1775916897794");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916895177" + "'", str7, "ORD-1775916895177");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        java.lang.String str98 = address9.getCity();
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
// flaky "57) test1156(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916963146" + "'", str44, "ORD-1775916963146");
// flaky "32) test1156(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916963146" + "'", str45, "ORD-1775916963146");
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
// flaky "16) test1156(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916963146" + "'", str79, "ORD-1775916963146");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi!" + "'", str98, "hi!");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = new example.model.Order("2026-04-11 17:14:47", address15, (java.util.List<example.model.CartItem>) cartItemList19, (double) (-1.0f), "");
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916893211", address6, (java.util.List<example.model.CartItem>) cartItemList19, (double) (byte) -1, "ORD-1775916900332");
        java.lang.String str30 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(order29);
// flaky "58) test1157(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str30, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = address6.getPhone();
        java.lang.String str19 = address6.getStreet();
        java.lang.String str20 = address6.getStreet();
        java.lang.String str21 = address6.getPhone();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        double double14 = order12.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList15 = order12.getItems();
        example.model.Address address16 = order12.getAddress();
        double double17 = order12.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList15);
        org.junit.Assert.assertNull(address16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        example.model.Address address5 = new example.model.Address("ORD-1775916903896", "ORD-1775916895177", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916887228", "ORD-1775916897794");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916887228" + "'", str6, "ORD-1775916887228");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916887228" + "'", str7, "ORD-1775916887228");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        java.lang.Class<?> wildcardClass5 = product4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        java.lang.String str28 = address26.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        java.lang.String str28 = address26.toString();
        java.lang.String str29 = address26.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
// flaky "59) test1163(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str27, "\ud83d\udcde ORD-1775916886212");
// flaky "33) test1163(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        java.lang.String str13 = order7.getCustomerEmail();
        example.model.Address address14 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "60) test1164(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916963468" + "'", str8, "ORD-1775916963468");
// flaky "34) test1164(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916963468" + "'", str9, "ORD-1775916963468");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertNull(address11);
// flaky "17) test1164(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:16:03" + "'", str12, "2026-04-11 17:16:03");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(address14);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        double double8 = product4.getPrice();
        java.lang.String str9 = product4.getDescription();
        java.lang.String str10 = product4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916891335" + "'", str9, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = example.service.OrderService.createOrder("ORD-1775916888151", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) ' ', "2026-04-11 17:14:48");
        java.lang.String str20 = address6.toString();
        java.lang.String str21 = address6.getPhone();
        java.lang.String str22 = address6.getCity();
        java.lang.String str23 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
// flaky "61) test1166(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
// flaky "35) test1166(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str23, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.toString();
        java.lang.String str11 = product4.getDescription();
        java.lang.String str12 = product4.getId();
        java.lang.String str13 = product4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str13, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str11 = product4.getName();
        java.lang.String str12 = product4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:50" + "'", str11, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:14:50" + "'", str12, "2026-04-11 17:14:50");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        java.lang.String str16 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "62) test1169(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916963666" + "'", str8, "ORD-1775916963666");
        org.junit.Assert.assertNull(address9);
// flaky "36) test1169(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:16:03" + "'", str10, "2026-04-11 17:16:03");
// flaky "18) test1169(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:03" + "'", str11, "2026-04-11 17:16:03");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "7) test1169(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:16:03" + "'", str15, "2026-04-11 17:16:03");
// flaky "2) test1169(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916963666" + "'", str16, "ORD-1775916963666");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:15:35");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str11 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916889515" + "'", str11, "ORD-1775916889515");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        double double87 = order86.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList88 = order86.getItems();
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
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(cartItemList88);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        java.lang.String str13 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "63) test1173(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916963818" + "'", str8, "ORD-1775916963818");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "37) test1173(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916963818" + "'", str11, "ORD-1775916963818");
        org.junit.Assert.assertNotNull(cartItemList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        int int19 = cartItem16.getQuantity();
        int int20 = cartItem16.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        cartItem8.setQuantity((int) (short) 100);
        int int11 = cartItem8.getQuantity();
        cartItem8.setQuantity(0);
        example.model.Product product14 = cartItem8.getProduct();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(product14);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        java.lang.String str16 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "64) test1176(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916963934" + "'", str8, "ORD-1775916963934");
// flaky "38) test1176(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916963934" + "'", str9, "ORD-1775916963934");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
// flaky "19) test1176(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:16:03" + "'", str14, "2026-04-11 17:16:03");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
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
// flaky "65) test1177(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916963963" + "'", str8, "ORD-1775916963963");
        org.junit.Assert.assertNull(address9);
// flaky "39) test1177(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:16:03" + "'", str10, "2026-04-11 17:16:03");
        org.junit.Assert.assertNotNull(cartItemList11);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        example.service.CartService.removeProduct("ORD-1775916942541");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        cartItem9.setQuantity((int) (short) 0);
        example.model.Product product14 = cartItem9.getProduct();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertNotNull(product14);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:15:16", "", "ORD-1775916955473", "2026-04-11 17:15:59", "ORD-1775916957716");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        example.service.CartService.removeProduct("ORD-1775916898989");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.getId();
        java.lang.String str11 = product4.getName();
        example.service.CartService.addProduct(product4, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916890749" + "'", str11, "ORD-1775916890749");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916927391");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity((int) '4');
        int int13 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str6, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        example.model.Product product4 = new example.model.Product("ORD-1775916924945", "2026-04-11 17:15:37", "ORD-1775916935853", (double) 10.0f);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        java.lang.String str15 = order13.getOrderId();
        java.lang.String str16 = order13.getOrderId();
        java.util.List<example.model.CartItem> cartItemList17 = order13.getItems();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
// flaky "66) test1187(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916964253" + "'", str15, "ORD-1775916964253");
// flaky "40) test1187(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916964253" + "'", str16, "ORD-1775916964253");
        org.junit.Assert.assertNotNull(cartItemList17);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        java.lang.String str35 = order33.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "67) test1188(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916964298" + "'", str29, "ORD-1775916964298");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916890225" + "'", str35, "ORD-1775916890225");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 10);
        example.model.Product product12 = cartItem11.getProduct();
        java.lang.Class<?> wildcardClass13 = product12.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(product12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916904159");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        java.lang.String str22 = address18.getCity();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "68) test1191(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str19, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
// flaky "41) test1191(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity(97);
        example.model.Product product13 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product13);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        cartItem12.setQuantity(52);
        cartItem12.setQuantity(52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        example.model.Address address5 = new example.model.Address("ORD-1775916921063", "ORD-1775916891135", "ORD-1775916939080", "ORD-1775916932519", "2026-04-11 17:15:07");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        java.lang.String str9 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        example.service.CartService.removeProduct("ORD-1775916899981");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        java.lang.String str14 = order7.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList15 = order7.getItems();
        java.lang.String str16 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "69) test1197(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916964529" + "'", str8, "ORD-1775916964529");
// flaky "42) test1197(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916964529" + "'", str9, "ORD-1775916964529");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
// flaky "20) test1197(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:16:04" + "'", str14, "2026-04-11 17:16:04");
        org.junit.Assert.assertNotNull(cartItemList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        java.lang.String str8 = address6.getStreet();
        java.lang.String str9 = address6.getCountry();
        java.lang.String str10 = address6.getCountry();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str19 = address18.getStreet();
        java.lang.String str20 = address18.getFullName();
        java.lang.String str21 = address18.getStreet();
        example.model.Address address23 = null;
        example.model.Address address25 = null;
        example.model.CartItem[] cartItemArray26 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList27 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList27, cartItemArray26);
        example.model.Order order31 = new example.model.Order("", address25, (java.util.List<example.model.CartItem>) cartItemList27, 1.0d, "");
        example.model.Order order34 = new example.model.Order("ORD-1775916886212", address23, (java.util.List<example.model.CartItem>) cartItemList27, 1.0d, "ORD-1775916886040");
        example.model.Order order37 = new example.model.Order("ORD-1775916894811", address18, (java.util.List<example.model.CartItem>) cartItemList27, (double) 1.0f, "ORD-1775916894327");
        java.lang.String str38 = address18.getCity();
        example.model.Address address40 = null;
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        example.model.Order order51 = new example.model.Order("ORD-1775916886212", address40, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "ORD-1775916886040");
        example.model.Order order54 = new example.model.Order("", address18, (java.util.List<example.model.CartItem>) cartItemList44, (double) (byte) -1, "2026-04-11 17:14:50");
        example.model.Order order57 = example.service.OrderService.createOrder("\ud83d\udcde ORD-1775916893816", address6, (java.util.List<example.model.CartItem>) cartItemList44, 0.0d, "ORD-1775916906984");
        java.lang.String str58 = address6.getCity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916891938" + "'", str8, "ORD-1775916891938");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:53" + "'", str9, "2026-04-11 17:14:53");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:53" + "'", str10, "2026-04-11 17:14:53");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray26);
        org.junit.Assert.assertArrayEquals(cartItemArray26, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(order57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ORD-1775916894246" + "'", str58, "ORD-1775916894246");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.lang.String str14 = order12.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList15 = order12.getItems();
        java.lang.String str16 = order12.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886040" + "'", str14, "ORD-1775916886040");
        org.junit.Assert.assertNotNull(cartItemList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886040" + "'", str16, "ORD-1775916886040");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        example.model.Address address5 = new example.model.Address("ORD-1775916933806", "ORD-1775916890225", "ORD-1775916939114", "ORD-1775916933088", "ORD-1775916936937");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        java.util.List<example.model.CartItem> cartItemList35 = order33.getItems();
        java.lang.String str36 = order33.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "70) test1201(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916964654" + "'", str29, "ORD-1775916964654");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916890225" + "'", str34, "ORD-1775916890225");
        org.junit.Assert.assertNotNull(cartItemList35);
// flaky "43) test1201(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2026-04-11 17:16:04" + "'", str36, "2026-04-11 17:16:04");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
// flaky "71) test1202(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str8, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:15:36", "ORD-1775916945926", "ORD-1775916907439", (-10.0d));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916961606");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.getId();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str13 = product4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916889515" + "'", str13, "ORD-1775916889515");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        example.model.Address address5 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str6 = address5.getFullName();
        java.lang.String str7 = address5.getStreet();
        java.lang.String str8 = address5.getCountry();
        java.lang.String str9 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892121" + "'", str6, "ORD-1775916892121");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916891938" + "'", str7, "ORD-1775916891938");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-04-11 17:14:53" + "'", str8, "2026-04-11 17:14:53");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getCountry();
        java.lang.String str9 = address7.getStreet();
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        example.model.Order order20 = example.service.OrderService.createOrder("ORD-1775916888151", address7, (java.util.List<example.model.CartItem>) cartItemList13, (double) ' ', "2026-04-11 17:14:48");
        java.lang.String str21 = address7.toString();
        java.lang.String str22 = address7.getPhone();
        java.lang.String str23 = address7.getCity();
        example.model.Address address31 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address33 = null;
        example.model.CartItem[] cartItemArray34 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList35 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList35, cartItemArray34);
        example.model.Order order39 = new example.model.Order("", address33, (java.util.List<example.model.CartItem>) cartItemList35, 1.0d, "");
        example.model.Order order42 = new example.model.Order("2026-04-11 17:14:47", address31, (java.util.List<example.model.CartItem>) cartItemList35, (double) (-1.0f), "");
        example.model.Address address43 = order42.getAddress();
        java.lang.String str44 = address43.getStreet();
        example.model.Address address46 = null;
        example.model.CartItem[] cartItemArray47 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList48 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList48, cartItemArray47);
        example.model.Order order52 = new example.model.Order("", address46, (java.util.List<example.model.CartItem>) cartItemList48, 1.0d, "");
        java.lang.String str53 = order52.getOrderId();
        java.util.List<example.model.CartItem> cartItemList54 = order52.getItems();
        example.model.Order order57 = new example.model.Order("ORD-1775916890225", address43, cartItemList54, (double) (byte) -1, "");
        java.lang.String str58 = order57.getOrderId();
        java.util.List<example.model.CartItem> cartItemList59 = order57.getItems();
        example.model.Order order62 = new example.model.Order("ORD-1775916920662", address7, cartItemList59, (double) 10L, "ORD-1775916933148");
        java.util.List<example.model.CartItem> cartItemList63 = order62.getItems();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(order20);
// flaky "72) test1207(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray34);
        org.junit.Assert.assertArrayEquals(cartItemArray34, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(address43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916886212" + "'", str44, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray47);
        org.junit.Assert.assertArrayEquals(cartItemArray47, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky "44) test1207(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "ORD-1775916964870" + "'", str53, "ORD-1775916964870");
        org.junit.Assert.assertNotNull(cartItemList54);
// flaky "21) test1207(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ORD-1775916964870" + "'", str58, "ORD-1775916964870");
        org.junit.Assert.assertNotNull(cartItemList59);
        org.junit.Assert.assertNotNull(cartItemList63);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        example.model.Product product9 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '#');
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product9);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        cartItem8.setQuantity((int) '4');
        cartItem8.setQuantity(10);
        int int14 = cartItem8.getQuantity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        example.model.Product product5 = cartItem2.getProduct();
        cartItem2.setQuantity((-1));
        java.lang.Class<?> wildcardClass8 = cartItem2.getClass();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        example.model.Address address9 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        example.model.Order order20 = new example.model.Order("2026-04-11 17:14:47", address9, (java.util.List<example.model.CartItem>) cartItemList13, (double) (-1.0f), "");
        example.model.Address address21 = order20.getAddress();
        java.lang.String str22 = address21.getStreet();
        example.model.Address address24 = null;
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = new example.model.Order("", address24, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "");
        java.lang.String str31 = order30.getOrderId();
        java.util.List<example.model.CartItem> cartItemList32 = order30.getItems();
        example.model.Order order35 = new example.model.Order("ORD-1775916890225", address21, cartItemList32, (double) (byte) -1, "");
        example.model.Address address36 = order35.getAddress();
        example.model.Address address38 = null;
        example.model.CartItem[] cartItemArray39 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList40 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList40, cartItemArray39);
        example.model.Order order44 = new example.model.Order("", address38, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "");
        java.lang.String str45 = order44.getOrderId();
        java.util.List<example.model.CartItem> cartItemList46 = order44.getItems();
        example.model.Address address47 = order44.getAddress();
        java.lang.String str48 = order44.getCreatedAt();
        double double49 = order44.getTotalAmount();
        java.lang.String str50 = order44.getStatus();
        java.util.List<example.model.CartItem> cartItemList51 = order44.getItems();
        example.model.Order order54 = example.service.OrderService.createOrder("[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)", address36, cartItemList51, (double) ' ', "2026-04-11 17:15:15");
        java.util.List<example.model.CartItem> cartItemList55 = null;
        example.model.Order order58 = new example.model.Order("ORD-1775916890142", address36, cartItemList55, (double) 1, "ORD-1775916915305");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "73) test1211(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916964985" + "'", str31, "ORD-1775916964985");
        org.junit.Assert.assertNotNull(cartItemList32);
        org.junit.Assert.assertNotNull(address36);
        org.junit.Assert.assertNotNull(cartItemArray39);
        org.junit.Assert.assertArrayEquals(cartItemArray39, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky "45) test1211(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916964985" + "'", str45, "ORD-1775916964985");
        org.junit.Assert.assertNotNull(cartItemList46);
        org.junit.Assert.assertNull(address47);
// flaky "22) test1211(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2026-04-11 17:16:04" + "'", str48, "2026-04-11 17:16:04");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "PAID" + "'", str50, "PAID");
        org.junit.Assert.assertNotNull(cartItemList51);
        org.junit.Assert.assertNotNull(order54);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        double double15 = order13.getTotalAmount();
        double double16 = order13.getTotalAmount();
        java.lang.String str17 = order13.getOrderId();
        java.lang.String str18 = order13.getStatus();
        example.model.Address address19 = order13.getAddress();
        java.util.List<example.model.CartItem> cartItemList20 = order13.getItems();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
// flaky "74) test1212(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916965019" + "'", str17, "ORD-1775916965019");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemList20);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        java.lang.String str32 = order30.getOrderId();
        java.lang.String str33 = order30.getOrderId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PAID" + "'", str31, "PAID");
// flaky "75) test1213(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916965053" + "'", str32, "ORD-1775916965053");
// flaky "46) test1213(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916965053" + "'", str33, "ORD-1775916965053");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        example.model.Address address6 = new example.model.Address("ORD-1775916893477", "ORD-1775916893369", "ORD-1775916894406", "ORD-1775916890979", "ORD-1775916894811");
        java.lang.String str7 = address6.getStreet();
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
        java.lang.String str42 = order41.getCustomerEmail();
        java.lang.String str43 = order41.getOrderId();
        java.lang.String str44 = order41.getOrderId();
        java.util.List<example.model.CartItem> cartItemList45 = order41.getItems();
        example.model.Order order48 = example.service.OrderService.createOrder("ORD-1775916913227", address6, cartItemList45, (double) 10L, "2026-04-11 17:14:58");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916893369" + "'", str7, "ORD-1775916893369");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "76) test1214(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916965103" + "'", str37, "ORD-1775916965103");
        org.junit.Assert.assertNotNull(cartItemList38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ORD-1775916890225" + "'", str42, "ORD-1775916890225");
// flaky "47) test1214(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916965103" + "'", str43, "ORD-1775916965103");
// flaky "23) test1214(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916965103" + "'", str44, "ORD-1775916965103");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        example.model.Address address6 = new example.model.Address("ORD-1775916893477", "ORD-1775916893369", "ORD-1775916894406", "ORD-1775916890979", "ORD-1775916894811");
        java.lang.String str7 = address6.getCountry();
        example.model.Address address9 = null;
        example.model.Address address17 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str18 = address17.getPhone();
        java.lang.String str19 = address17.getFullName();
        java.lang.String str20 = address17.getPhone();
        java.lang.String str21 = address17.toString();
        example.model.Address address23 = null;
        example.model.Address address25 = null;
        example.model.CartItem[] cartItemArray26 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList27 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList27, cartItemArray26);
        example.model.Order order31 = new example.model.Order("", address25, (java.util.List<example.model.CartItem>) cartItemList27, 1.0d, "");
        example.model.Order order34 = new example.model.Order("ORD-1775916886212", address23, (java.util.List<example.model.CartItem>) cartItemList27, 1.0d, "ORD-1775916886040");
        example.model.Order order37 = example.service.OrderService.createOrder("ORD-1775916889159", address17, (java.util.List<example.model.CartItem>) cartItemList27, (double) 100L, "ORD-1775916887611");
        java.lang.String str38 = address17.getCountry();
        java.lang.String str39 = address17.getPhone();
        example.model.Address address46 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str47 = address46.getStreet();
        java.lang.String str48 = address46.getCountry();
        java.lang.String str49 = address46.getPhone();
        java.lang.String str50 = address46.getFullName();
        example.model.Address address57 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str58 = address57.getCountry();
        java.lang.String str59 = address57.getStreet();
        java.util.List<example.model.CartItem> cartItemList60 = example.service.CartService.getCart();
        example.model.Order order63 = new example.model.Order("ORD-1775916887934", address57, cartItemList60, (double) 97, "ORD-1775916889159");
        example.model.Order order66 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address46, cartItemList60, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order69 = example.service.OrderService.createOrder("2026-04-11 17:14:48", address17, cartItemList60, (double) 97, "\ud83d\udcde PAID");
        example.model.Order order72 = new example.model.Order("ORD-1775916924278", address9, cartItemList60, (double) (short) -1, "ORD-1775916895177");
        example.model.Order order75 = example.service.OrderService.createOrder("ORD-1775916905114", address6, cartItemList60, (double) 52, "ORD-1775916928853");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890979" + "'", str7, "ORD-1775916890979");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
// flaky "77) test1215(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray26);
        org.junit.Assert.assertArrayEquals(cartItemArray26, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(order37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916886212" + "'", str38, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ORD-1775916886212" + "'", str47, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ORD-1775916886212" + "'", str48, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ORD-1775916886212" + "'", str49, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ORD-1775916886212" + "'", str58, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ORD-1775916886212" + "'", str59, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList60);
        org.junit.Assert.assertNotNull(order66);
        org.junit.Assert.assertNotNull(order69);
        org.junit.Assert.assertNotNull(order75);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        example.model.Address address5 = new example.model.Address("ORD-1775916937364", "ORD-1775916965103", "ORD-1775916913227", "ORD-1775916915743", "ORD-1775916950285");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        example.model.Product product4 = new example.model.Product("", "ORD-1775916897292", "ORD-1775916893211", (double) '#');
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getDescription();
        example.service.CartService.addProduct(product4, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)" + "'", str5, "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916897292" + "'", str6, "ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916893211" + "'", str7, "ORD-1775916893211");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        double double49 = order48.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886212" + "'", str13, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray16);
        org.junit.Assert.assertArrayEquals(cartItemArray16, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky "78) test1218(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916965228" + "'", str22, "ORD-1775916965228");
        org.junit.Assert.assertNotNull(cartItemList23);
        org.junit.Assert.assertNotNull(order26);
// flaky "48) test1218(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str27, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916886212" + "'", str35, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray36);
        org.junit.Assert.assertArrayEquals(cartItemArray36, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(order41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "PAID" + "'", str42, "PAID");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "PAID" + "'", str44, "PAID");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 1.0d + "'", double49 == 1.0d);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        double double11 = product4.getPrice();
        java.lang.String str12 = product4.getId();
        java.lang.String str13 = product4.getDescription();
        java.lang.String str14 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        java.lang.String str44 = order43.getOrderId();
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
// flaky "79) test1220(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916965336" + "'", str44, "ORD-1775916965336");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        java.lang.String str10 = order7.getPaymentIntentId();
        example.model.Address address11 = order7.getAddress();
        example.model.Address address12 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "80) test1221(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916965370" + "'", str8, "ORD-1775916965370");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        example.model.Product product4 = new example.model.Product("ORD-1775916929250", "", "ORD-1775916947210", (-1.0d));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:52", "ORD-1775916897292", "ORD-1775916894246", (double) (short) 1);
        example.service.CartService.addProduct(product4, 97);
        example.service.CartService.addProduct(product4, (int) (short) 1);
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, (int) (byte) 1);
        double double11 = cartItem10.getSubtotal();
        java.lang.String str12 = cartItem10.toString();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916897292    x1  = $1.00" + "'", str12, "ORD-1775916897292    x1  = $1.00");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getPhone();
        example.model.Address address22 = null;
        example.model.Address address30 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str31 = address30.getPhone();
        java.lang.String str32 = address30.getFullName();
        java.lang.String str33 = address30.getPhone();
        java.lang.String str34 = address30.toString();
        example.model.Address address36 = null;
        example.model.Address address38 = null;
        example.model.CartItem[] cartItemArray39 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList40 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList40, cartItemArray39);
        example.model.Order order44 = new example.model.Order("", address38, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "");
        example.model.Order order47 = new example.model.Order("ORD-1775916886212", address36, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "ORD-1775916886040");
        example.model.Order order50 = example.service.OrderService.createOrder("ORD-1775916889159", address30, (java.util.List<example.model.CartItem>) cartItemList40, (double) 100L, "ORD-1775916887611");
        java.lang.String str51 = address30.getCountry();
        java.lang.String str52 = address30.getPhone();
        example.model.Address address59 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str60 = address59.getStreet();
        java.lang.String str61 = address59.getCountry();
        java.lang.String str62 = address59.getPhone();
        java.lang.String str63 = address59.getFullName();
        example.model.Address address70 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str71 = address70.getCountry();
        java.lang.String str72 = address70.getStreet();
        java.util.List<example.model.CartItem> cartItemList73 = example.service.CartService.getCart();
        example.model.Order order76 = new example.model.Order("ORD-1775916887934", address70, cartItemList73, (double) 97, "ORD-1775916889159");
        example.model.Order order79 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address59, cartItemList73, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order82 = example.service.OrderService.createOrder("2026-04-11 17:14:48", address30, cartItemList73, (double) 97, "\ud83d\udcde PAID");
        example.model.Order order85 = new example.model.Order("ORD-1775916924278", address22, cartItemList73, (double) (short) -1, "ORD-1775916895177");
        example.model.Order order88 = new example.model.Order("2026-04-11 17:14:52", address19, cartItemList73, 35.0d, "ORD-1775916898186");
        java.util.List<example.model.CartItem> cartItemList89 = order88.getItems();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916886212" + "'", str33, "ORD-1775916886212");
// flaky "81) test1224(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str34, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray39);
        org.junit.Assert.assertArrayEquals(cartItemArray39, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(order50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ORD-1775916886212" + "'", str51, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "ORD-1775916886212" + "'", str52, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ORD-1775916886212" + "'", str60, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "ORD-1775916886212" + "'", str61, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ORD-1775916886212" + "'", str62, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ORD-1775916886212" + "'", str71, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ORD-1775916886212" + "'", str72, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList73);
        org.junit.Assert.assertNotNull(order79);
        org.junit.Assert.assertNotNull(order82);
        org.junit.Assert.assertNotNull(cartItemList89);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str11 = product4.getName();
        java.lang.String str12 = product4.toString();
        java.lang.String str13 = product4.getId();
        java.lang.String str14 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:50" + "'", str11, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str12, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916888257" + "'", str13, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address17 = null;
        example.model.CartItem[] cartItemArray18 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList19 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList19, cartItemArray18);
        example.model.Order order23 = new example.model.Order("", address17, (java.util.List<example.model.CartItem>) cartItemList19, 1.0d, "");
        example.model.Order order26 = new example.model.Order("2026-04-11 17:14:47", address15, (java.util.List<example.model.CartItem>) cartItemList19, (double) (-1.0f), "");
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916893211", address6, (java.util.List<example.model.CartItem>) cartItemList19, (double) (byte) -1, "ORD-1775916900332");
        java.lang.String str30 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        example.model.Address address5 = new example.model.Address("\ud83d\udcde ORD-1775916886212] 2026-04-11 17:14:50  - $1.00  (ORD-1775916889693)", "", "ORD-1775916924945", "ORD-1775916912399", "");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        example.model.Address address6 = new example.model.Address("ORD-1775916924595", "ORD-1775916928550", "ORD-1775916890749    x0  = $0.00", "[ORD-1775916891615] ORD-1775916890749    - $1.00  (ORD-1775916892828)", "2026-04-11 17:14:53");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        java.lang.String str15 = order14.getOrderId();
        java.util.List<example.model.CartItem> cartItemList16 = order14.getItems();
        example.model.Address address17 = order14.getAddress();
        java.lang.String str18 = order14.getCreatedAt();
        double double19 = order14.getTotalAmount();
        java.lang.String str20 = order14.getStatus();
        java.util.List<example.model.CartItem> cartItemList21 = order14.getItems();
        example.model.Order order24 = new example.model.Order("ORD-1775916952605", address6, cartItemList21, (double) (short) 100, "ORD-1775916906473");
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "82) test1228(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916965569" + "'", str15, "ORD-1775916965569");
        org.junit.Assert.assertNotNull(cartItemList16);
        org.junit.Assert.assertNull(address17);
// flaky "49) test1228(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2026-04-11 17:16:05" + "'", str18, "2026-04-11 17:16:05");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PAID" + "'", str20, "PAID");
        org.junit.Assert.assertNotNull(cartItemList21);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.lang.String str30 = order26.getStatus();
        java.lang.String str31 = order26.getCreatedAt();
        java.lang.String str32 = order26.getStatus();
        java.util.List<example.model.CartItem> cartItemList33 = order26.getItems();
        java.lang.String str34 = order26.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "83) test1229(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "50) test1229(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916965602" + "'", str27, "ORD-1775916965602");
// flaky "24) test1229(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916965602" + "'", str28, "ORD-1775916965602");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PAID" + "'", str30, "PAID");
// flaky "8) test1229(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2026-04-11 17:16:05" + "'", str31, "2026-04-11 17:16:05");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
        org.junit.Assert.assertNotNull(cartItemList33);
// flaky "3) test1229(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2026-04-11 17:16:05" + "'", str34, "2026-04-11 17:16:05");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, 0);
        int int15 = cartItem14.getQuantity();
        int int16 = cartItem14.getQuantity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getStreet();
        java.lang.String str9 = address7.getCountry();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str17 = address16.getStreet();
        java.lang.String str18 = address16.getCountry();
        java.lang.String str19 = address16.getPhone();
        java.lang.String str20 = address16.getFullName();
        example.model.Address address27 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str28 = address27.getCountry();
        java.lang.String str29 = address27.getStreet();
        java.util.List<example.model.CartItem> cartItemList30 = example.service.CartService.getCart();
        example.model.Order order33 = new example.model.Order("ORD-1775916887934", address27, cartItemList30, (double) 97, "ORD-1775916889159");
        example.model.Order order36 = example.service.OrderService.createOrder("2026-04-11 17:14:47", address16, cartItemList30, (double) '#', "2026-04-11 17:14:48");
        example.model.Order order39 = new example.model.Order("ORD-1775916895909", address7, cartItemList30, (double) 'a', "ORD-1775916887934");
        java.lang.String str40 = address7.getStreet();
        java.lang.String str41 = address7.toString();
        example.model.Address address43 = null;
        example.model.CartItem[] cartItemArray44 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList45 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList45, cartItemArray44);
        example.model.Order order49 = new example.model.Order("", address43, (java.util.List<example.model.CartItem>) cartItemList45, 1.0d, "");
        java.lang.String str50 = order49.getOrderId();
        java.lang.String str51 = order49.getOrderId();
        double double52 = order49.getTotalAmount();
        java.lang.String str53 = order49.getStatus();
        example.model.Address address54 = order49.getAddress();
        java.util.List<example.model.CartItem> cartItemList55 = order49.getItems();
        example.model.Order order58 = new example.model.Order("2026-04-11 17:15:27", address7, cartItemList55, 52.0d, "ORD-1775916944503");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916886212" + "'", str29, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(order36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
// flaky "84) test1231(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str41, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray44);
        org.junit.Assert.assertArrayEquals(cartItemArray44, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "51) test1231(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916965671" + "'", str50, "ORD-1775916965671");
// flaky "25) test1231(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "ORD-1775916965671" + "'", str51, "ORD-1775916965671");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 1.0d + "'", double52 == 1.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "PAID" + "'", str53, "PAID");
        org.junit.Assert.assertNull(address54);
        org.junit.Assert.assertNotNull(cartItemList55);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        example.model.CartItem cartItem13 = new example.model.CartItem(product11, (int) (byte) -1);
        example.model.Product product14 = cartItem13.getProduct();
        double double15 = cartItem13.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertNotNull(product14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) 1);
        int int7 = cartItem6.getQuantity();
        cartItem6.setQuantity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.lang.String str55 = address8.getStreet();
        java.lang.String str56 = address8.toString();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916886212" + "'", str55, "ORD-1775916886212");
// flaky "85) test1234(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str56, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916895177", "2026-04-11 17:14:53", "ORD-1775916889159", "ORD-1775916894903");
        example.model.Address address14 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str15 = address14.getPhone();
        java.lang.String str16 = address14.getFullName();
        java.lang.String str17 = address14.getPhone();
        example.model.Address address24 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str25 = address24.getCountry();
        java.lang.String str26 = address24.getStreet();
        example.model.Address address28 = null;
        example.model.CartItem[] cartItemArray29 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList30 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList30, cartItemArray29);
        example.model.Order order34 = new example.model.Order("", address28, (java.util.List<example.model.CartItem>) cartItemList30, 1.0d, "");
        example.model.Order order37 = example.service.OrderService.createOrder("ORD-1775916888151", address24, (java.util.List<example.model.CartItem>) cartItemList30, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order40 = example.service.OrderService.createOrder("ORD-1775916887228", address14, (java.util.List<example.model.CartItem>) cartItemList30, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        java.lang.String str49 = order48.getOrderId();
        java.lang.String str50 = order48.getOrderId();
        java.util.List<example.model.CartItem> cartItemList51 = order48.getItems();
        example.model.Order order54 = example.service.OrderService.createOrder("ORD-1775916891135", address14, cartItemList51, (double) 0L, "ORD-1775916886040");
        example.model.Order order57 = new example.model.Order("ORD-1775916900539", address6, cartItemList51, (double) 1, "ORD-1775916887934");
        java.lang.String str58 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916886212" + "'", str26, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray29);
        org.junit.Assert.assertArrayEquals(cartItemArray29, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(order37);
        org.junit.Assert.assertNotNull(order40);
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky "86) test1235(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ORD-1775916965788" + "'", str49, "ORD-1775916965788");
// flaky "52) test1235(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916965788" + "'", str50, "ORD-1775916965788");
        org.junit.Assert.assertNotNull(cartItemList51);
        org.junit.Assert.assertNotNull(order54);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ORD-1775916889159" + "'", str58, "ORD-1775916889159");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        java.lang.String str40 = address39.getCity();
        java.lang.String str41 = address39.getCity();
        java.lang.String str42 = address39.getCity();
        java.lang.String str43 = address39.getCountry();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916886212" + "'", str43, "ORD-1775916886212");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        double double11 = product4.getPrice();
        double double12 = product4.getPrice();
        java.lang.String str13 = product4.getName();
        example.model.CartItem cartItem15 = new example.model.CartItem(product4, 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50" + "'", str13, "2026-04-11 17:14:50");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        java.lang.String str29 = order26.getStatus();
        java.lang.String str30 = order26.getCustomerEmail();
        java.lang.String str31 = order26.getCreatedAt();
        java.lang.String str32 = order26.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "87) test1238(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "53) test1238(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916965886" + "'", str27, "ORD-1775916965886");
// flaky "26) test1238(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2026-04-11 17:16:05" + "'", str28, "2026-04-11 17:16:05");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "PAID" + "'", str29, "PAID");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916889159" + "'", str30, "ORD-1775916889159");
// flaky "9) test1238(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2026-04-11 17:16:05" + "'", str31, "2026-04-11 17:16:05");
// flaky "4) test1238(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2026-04-11 17:16:05" + "'", str32, "2026-04-11 17:16:05");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        java.lang.String str32 = order30.getOrderId();
        example.model.Address address33 = order30.getAddress();
        java.lang.String str34 = order30.getOrderId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PAID" + "'", str31, "PAID");
// flaky "88) test1239(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916965928" + "'", str32, "ORD-1775916965928");
        org.junit.Assert.assertNotNull(address33);
// flaky "54) test1239(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916965928" + "'", str34, "ORD-1775916965928");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) 10);
        java.lang.String str7 = cartItem6.toString();
        example.model.Product product8 = cartItem6.getProduct();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916891615    x10  = $1000.00" + "'", str7, "ORD-1775916891615    x10  = $1000.00");
        org.junit.Assert.assertNotNull(product8);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        int int9 = cartItem8.getQuantity();
        int int10 = cartItem8.getQuantity();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916916131");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:15:12");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        double double14 = order12.getTotalAmount();
        java.lang.String str15 = order12.getCustomerEmail();
        java.lang.String str16 = order12.getCustomerEmail();
        java.lang.Class<?> wildcardClass17 = order12.getClass();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.toString();
        java.lang.String str10 = address5.getPhone();
        java.lang.String str11 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
// flaky "89) test1245(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str9, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916909254");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        int int7 = cartItem6.getQuantity();
        example.model.Product product8 = cartItem6.getProduct();
        int int9 = cartItem6.getQuantity();
        cartItem6.setQuantity((int) 'a');
        java.lang.String str12 = cartItem6.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916890749    x97  = $97.00" + "'", str12, "ORD-1775916890749    x97  = $97.00");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        example.model.Product product4 = new example.model.Product("ORD-1775916886040", "ORD-1775916896079", "ORD-1775916897099", (double) (short) -1);
        java.lang.String str5 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916886040] ORD-1775916896079    - $-1.00  (ORD-1775916897099)" + "'", str5, "[ORD-1775916886040] ORD-1775916896079    - $-1.00  (ORD-1775916897099)");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getPhone();
        example.model.Address address17 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str18 = address17.getPhone();
        java.lang.String str19 = address17.getFullName();
        java.lang.String str20 = address17.getPhone();
        java.lang.String str21 = address17.toString();
        example.model.Address address23 = null;
        example.model.Address address25 = null;
        example.model.CartItem[] cartItemArray26 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList27 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList27, cartItemArray26);
        example.model.Order order31 = new example.model.Order("", address25, (java.util.List<example.model.CartItem>) cartItemList27, 1.0d, "");
        example.model.Order order34 = new example.model.Order("ORD-1775916886212", address23, (java.util.List<example.model.CartItem>) cartItemList27, 1.0d, "ORD-1775916886040");
        example.model.Order order37 = example.service.OrderService.createOrder("ORD-1775916889159", address17, (java.util.List<example.model.CartItem>) cartItemList27, (double) 100L, "ORD-1775916887611");
        java.lang.String str38 = order37.getOrderId();
        java.lang.String str39 = order37.getCreatedAt();
        java.lang.String str40 = order37.getStatus();
        java.util.List<example.model.CartItem> cartItemList41 = order37.getItems();
        example.model.Order order44 = new example.model.Order("2026-04-11 17:15:00", address6, cartItemList41, (double) 1.0f, "ORD-1775916930620");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
// flaky "90) test1249(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray26);
        org.junit.Assert.assertArrayEquals(cartItemArray26, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(order37);
// flaky "55) test1249(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916966268" + "'", str38, "ORD-1775916966268");
// flaky "27) test1249(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2026-04-11 17:16:06" + "'", str39, "2026-04-11 17:16:06");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PAID" + "'", str40, "PAID");
        org.junit.Assert.assertNotNull(cartItemList41);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.toString();
        java.lang.String str20 = address18.getPhone();
        java.lang.String str21 = address18.getCity();
        java.lang.String str22 = address18.getPhone();
        java.lang.String str23 = address18.toString();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "91) test1250(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str19, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
// flaky "56) test1250(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str23, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        java.lang.String str90 = address9.getFullName();
        java.lang.String str91 = address9.getPhone();
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
// flaky "92) test1251(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916966343" + "'", str79, "ORD-1775916966343");
// flaky "57) test1251(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ORD-1775916966343" + "'", str80, "ORD-1775916966343");
        org.junit.Assert.assertNull(address81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "PAID" + "'", str82, "PAID");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(cartItemList84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 1.0d + "'", double85 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList86);
        org.junit.Assert.assertNotNull(order89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "ORD-1775916886212" + "'", str91, "ORD-1775916886212");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        java.lang.String str9 = product4.getId();
        double double10 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916892568" + "'", str9, "ORD-1775916892568");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        java.lang.String str23 = address6.getStreet();
        java.lang.String str24 = address6.getFullName();
        java.lang.String str25 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "93) test1253(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916966431" + "'", str18, "ORD-1775916966431");
        org.junit.Assert.assertNotNull(cartItemList19);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, 0);
        java.lang.String str9 = product4.toString();
        java.lang.String str10 = product4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749" + "'", str10, "ORD-1775916890749");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.util.List<example.model.CartItem> cartItemList15 = order7.getItems();
        java.lang.String str16 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "94) test1255(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916966502" + "'", str8, "ORD-1775916966502");
// flaky "58) test1255(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916966502" + "'", str9, "ORD-1775916966502");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList15);
// flaky "28) test1255(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916966502" + "'", str16, "ORD-1775916966502");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        java.lang.String str15 = order13.getOrderId();
        example.model.Address address16 = order13.getAddress();
        java.util.List<example.model.CartItem> cartItemList17 = order13.getItems();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
// flaky "95) test1256(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916966528" + "'", str15, "ORD-1775916966528");
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertNotNull(cartItemList17);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        example.model.Product product4 = new example.model.Product("ORD-1775916962484", "ORD-1775916956949", "ORD-1775916902814", (double) ' ');
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        java.lang.String str13 = order7.getPaymentIntentId();
        java.lang.String str14 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList15 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "96) test1258(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916966587" + "'", str8, "ORD-1775916966587");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
// flaky "59) test1258(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:16:06" + "'", str12, "2026-04-11 17:16:06");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "29) test1258(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916966587" + "'", str14, "ORD-1775916966587");
        org.junit.Assert.assertNotNull(cartItemList15);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:15:48");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        example.model.Product product4 = new example.model.Product("ORD-1775916897371", "ORD-1775916892568", "ORD-1775916893369", (double) 10);
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str7 = product4.getId();
        java.lang.String str8 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916897371" + "'", str7, "ORD-1775916897371");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916897371" + "'", str8, "ORD-1775916897371");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        int int10 = cartItem9.getQuantity();
        example.model.Product product11 = cartItem9.getProduct();
        java.lang.String str12 = product11.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:14:47" + "'", str12, "2026-04-11 17:14:47");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        example.model.Product product4 = new example.model.Product("ORD-1775916891772", "ORD-1775916916999", "ORD-1775916894811", 35.0d);
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916891772] ORD-1775916916999    - $35.00  (ORD-1775916894811)" + "'", str5, "[ORD-1775916891772] ORD-1775916916999    - $35.00  (ORD-1775916894811)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916894811" + "'", str6, "ORD-1775916894811");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.toString();
        java.lang.String str11 = address6.getCountry();
        example.model.Address address19 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str20 = address19.getPhone();
        java.lang.String str21 = address19.getFullName();
        java.lang.String str22 = address19.getPhone();
        example.model.Address address29 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str30 = address29.getCountry();
        java.lang.String str31 = address29.getStreet();
        example.model.Address address33 = null;
        example.model.CartItem[] cartItemArray34 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList35 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList35, cartItemArray34);
        example.model.Order order39 = new example.model.Order("", address33, (java.util.List<example.model.CartItem>) cartItemList35, 1.0d, "");
        example.model.Order order42 = example.service.OrderService.createOrder("ORD-1775916888151", address29, (java.util.List<example.model.CartItem>) cartItemList35, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order45 = example.service.OrderService.createOrder("ORD-1775916887228", address19, (java.util.List<example.model.CartItem>) cartItemList35, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address47 = null;
        example.model.CartItem[] cartItemArray48 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList49 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList49, cartItemArray48);
        example.model.Order order53 = new example.model.Order("", address47, (java.util.List<example.model.CartItem>) cartItemList49, 1.0d, "");
        java.lang.String str54 = order53.getOrderId();
        java.lang.String str55 = order53.getOrderId();
        java.util.List<example.model.CartItem> cartItemList56 = order53.getItems();
        example.model.Order order59 = example.service.OrderService.createOrder("ORD-1775916891135", address19, cartItemList56, (double) 0L, "ORD-1775916886040");
        example.model.Order order62 = example.service.OrderService.createOrder("ORD-1775916889693", address6, cartItemList56, (double) (short) -1, "ORD-1775916886687");
        java.lang.String str63 = address6.getStreet();
        java.lang.String str64 = address6.getFullName();
        java.lang.String str65 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "97) test1263(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray34);
        org.junit.Assert.assertArrayEquals(cartItemArray34, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(order42);
        org.junit.Assert.assertNotNull(order45);
        org.junit.Assert.assertNotNull(cartItemArray48);
        org.junit.Assert.assertArrayEquals(cartItemArray48, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky "60) test1263(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ORD-1775916966782" + "'", str54, "ORD-1775916966782");
// flaky "30) test1263(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916966782" + "'", str55, "ORD-1775916966782");
        org.junit.Assert.assertNotNull(cartItemList56);
        org.junit.Assert.assertNotNull(order59);
        org.junit.Assert.assertNotNull(order62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ORD-1775916886212" + "'", str63, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ORD-1775916886212" + "'", str65, "ORD-1775916886212");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        java.util.List<example.model.CartItem> cartItemList29 = order25.getItems();
        java.lang.String str30 = order25.getOrderId();
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
        org.junit.Assert.assertNotNull(cartItemList29);
// flaky "98) test1264(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916966821" + "'", str30, "ORD-1775916966821");
// flaky "61) test1264(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916966821" + "'", str31, "ORD-1775916966821");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        example.model.Product product4 = new example.model.Product("ORD-1775916963818", "2026-04-11 17:15:36", "", 0.0d);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getOrderId();
        java.lang.String str12 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "99) test1266(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916966905" + "'", str8, "ORD-1775916966905");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "62) test1266(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916966905" + "'", str11, "ORD-1775916966905");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        example.model.Product product4 = new example.model.Product("ORD-1775916899079", "ORD-1775916918928", "ORD-1775916942507", (double) (byte) -1);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        java.lang.String str16 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "100) test1268(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916966968" + "'", str8, "ORD-1775916966968");
        org.junit.Assert.assertNull(address9);
// flaky "63) test1268(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:16:06" + "'", str10, "2026-04-11 17:16:06");
// flaky "31) test1268(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:06" + "'", str11, "2026-04-11 17:16:06");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        example.model.Address address5 = new example.model.Address("ORD-1775916893477", "ORD-1775916893369", "ORD-1775916894406", "ORD-1775916890979", "ORD-1775916894811");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890979" + "'", str6, "ORD-1775916890979");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916894811" + "'", str7, "ORD-1775916894811");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        java.lang.String str9 = product4.getId();
        double double10 = product4.getPrice();
        example.service.CartService.addProduct(product4, 97);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916892568" + "'", str9, "ORD-1775916892568");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getId();
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916888257" + "'", str8, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916888257" + "'", str9, "ORD-1775916888257");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        java.lang.String str5 = product4.getId();
        java.lang.String str6 = product4.getDescription();
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916891615" + "'", str5, "ORD-1775916891615");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892828" + "'", str6, "ORD-1775916892828");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.Class<?> wildcardClass14 = order13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getPhone();
        java.lang.String str10 = address5.getFullName();
        java.lang.String str11 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916910746");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        example.model.Product product4 = new example.model.Product("ORD-1775916890225", "ORD-1775916893211", "ORD-1775916890665", (double) (short) 1);
        java.lang.String str5 = product4.getId();
        java.lang.Class<?> wildcardClass6 = product4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916890225" + "'", str5, "ORD-1775916890225");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 10);
        cartItem11.setQuantity((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = cartItem11.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        example.model.Address address6 = new example.model.Address("ORD-1775916889515", "ORD-1775916886687", "2026-04-11 17:14:48", "PAID", "ORD-1775916887036");
        java.lang.String str7 = address6.getCity();
        java.lang.String str8 = address6.toString();
        example.model.Address address16 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str17 = address16.getCountry();
        java.lang.String str18 = address16.getStreet();
        example.model.Address address20 = null;
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        example.model.Order order31 = new example.model.Order("ORD-1775916886212", address20, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "ORD-1775916886040");
        example.model.Order order34 = new example.model.Order("ORD-1775916893369", address16, (java.util.List<example.model.CartItem>) cartItemList24, (double) 52, "2026-04-11 17:14:52");
        java.lang.String str35 = address16.getPhone();
        java.lang.String str36 = address16.getCity();
        java.lang.String str37 = address16.getCity();
        java.lang.String str38 = address16.getCountry();
        example.model.Address address46 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address48 = null;
        example.model.CartItem[] cartItemArray49 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList50 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList50, cartItemArray49);
        example.model.Order order54 = new example.model.Order("", address48, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "");
        example.model.Order order57 = new example.model.Order("2026-04-11 17:14:47", address46, (java.util.List<example.model.CartItem>) cartItemList50, (double) (-1.0f), "");
        java.lang.String str58 = address46.getPhone();
        example.model.Address address60 = null;
        example.model.CartItem[] cartItemArray61 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList62 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList62, cartItemArray61);
        example.model.Order order66 = new example.model.Order("", address60, (java.util.List<example.model.CartItem>) cartItemList62, 1.0d, "");
        example.model.Order order69 = example.service.OrderService.createOrder("ORD-1775916889159", address46, (java.util.List<example.model.CartItem>) cartItemList62, (double) 1, "2026-04-11 17:14:52");
        java.util.List<example.model.CartItem> cartItemList70 = order69.getItems();
        example.model.Order order73 = new example.model.Order("ORD-1775916932785", address16, cartItemList70, (double) '4', "2026-04-11 17:15:06");
        example.model.Order order76 = new example.model.Order("", address6, cartItemList70, (double) ' ', "ORD-1775916921769");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:48" + "'", str7, "2026-04-11 17:14:48");
// flaky "101) test1278(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde ORD-1775916887036" + "'", str8, "\ud83d\udcde ORD-1775916887036");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916886212" + "'", str35, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916886212" + "'", str38, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray49);
        org.junit.Assert.assertArrayEquals(cartItemArray49, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ORD-1775916886212" + "'", str58, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray61);
        org.junit.Assert.assertArrayEquals(cartItemArray61, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(order69);
        org.junit.Assert.assertNotNull(cartItemList70);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        example.model.Address address5 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str6 = address5.getFullName();
        java.lang.String str7 = address5.toString();
        java.lang.String str8 = address5.getStreet();
        java.lang.Class<?> wildcardClass9 = address5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892121" + "'", str6, "ORD-1775916892121");
// flaky "102) test1279(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde " + "'", str7, "\ud83d\udcde ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916891938" + "'", str8, "ORD-1775916891938");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        example.model.Address address5 = new example.model.Address("ORD-1775916901033", "ORD-1775916937740", "ORD-1775916897292", "ORD-1775916917320", "ORD-1775916890749    x35  = $35.00");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916898339");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        example.model.Address address14 = order7.getAddress();
        example.model.Address address15 = order7.getAddress();
        java.lang.String str16 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "103) test1282(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916967399" + "'", str8, "ORD-1775916967399");
        org.junit.Assert.assertNull(address9);
// flaky "64) test1282(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:16:07" + "'", str10, "2026-04-11 17:16:07");
// flaky "32) test1282(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:07" + "'", str11, "2026-04-11 17:16:07");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        java.lang.String str10 = address6.getStreet();
        example.model.Address address17 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str18 = address17.getPhone();
        java.lang.String str19 = address17.getCountry();
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
        java.lang.String str54 = order53.getCustomerEmail();
        example.service.OrderService.printReceipt(order53);
        java.lang.String str56 = order53.getStatus();
        java.lang.String str57 = order53.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList58 = order53.getItems();
        example.model.Order order61 = new example.model.Order("ORD-1775916904299", address17, cartItemList58, 35.0d, "ORD-1775916926346");
        example.model.Order order64 = example.service.OrderService.createOrder("ORD-1775916904159", address6, cartItemList58, (-52.0d), "ORD-1775916951579");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray30);
        org.junit.Assert.assertArrayEquals(cartItemArray30, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(address39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky "104) test1283(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ORD-1775916967419" + "'", str49, "ORD-1775916967419");
        org.junit.Assert.assertNotNull(cartItemList50);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ORD-1775916890225" + "'", str54, "ORD-1775916890225");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "PAID" + "'", str56, "PAID");
// flaky "65) test1283(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "2026-04-11 17:16:07" + "'", str57, "2026-04-11 17:16:07");
        org.junit.Assert.assertNotNull(cartItemList58);
        org.junit.Assert.assertNotNull(order64);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        cartItem8.setQuantity((int) '4');
        java.lang.String str12 = cartItem8.toString();
        java.lang.String str13 = cartItem8.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916890749    x52  = $52.00" + "'", str12, "ORD-1775916890749    x52  = $52.00");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916890749    x52  = $52.00" + "'", str13, "ORD-1775916890749    x52  = $52.00");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        example.model.Address address15 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str16 = address15.getStreet();
        example.model.CartItem[] cartItemArray17 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList18 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList18, cartItemArray17);
        example.model.Order order22 = example.service.OrderService.createOrder("ORD-1775916887036", address15, (java.util.List<example.model.CartItem>) cartItemList18, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str23 = order22.getStatus();
        example.service.OrderService.printReceipt(order22);
        java.lang.String str25 = order22.getStatus();
        java.util.List<example.model.CartItem> cartItemList26 = order22.getItems();
        example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916920328", address6, cartItemList26, (-100.0d), "ORD-1775916933671");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray17);
        org.junit.Assert.assertArrayEquals(cartItemArray17, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PAID" + "'", str23, "PAID");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PAID" + "'", str25, "PAID");
        org.junit.Assert.assertNotNull(cartItemList26);
        org.junit.Assert.assertNotNull(order29);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:15:56");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916924595", "ORD-1775916887828", "ORD-1775916953470", "ORD-1775916899563");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        cartItem6.setQuantity((int) 'a');
        int int9 = cartItem6.getQuantity();
        example.model.Product product10 = cartItem6.getProduct();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(product10);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        double double9 = product4.getPrice();
        example.service.CartService.addProduct(product4, 52);
        java.lang.String str12 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str12, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getFullName();
        java.lang.String str10 = address5.toString();
        java.lang.String str11 = address5.getPhone();
        java.lang.String str12 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "105) test1290(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
// flaky "66) test1290(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str12, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.toString();
        java.lang.String str11 = product4.getDescription();
        java.lang.String str12 = product4.getId();
        java.lang.String str13 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916888257" + "'", str13, "ORD-1775916888257");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        example.model.Product product0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.service.CartService.addProduct(product0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        int int5 = cartItem2.getQuantity();
        cartItem2.setQuantity((-1));
        int int8 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getOrderId();
        java.lang.String str11 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "106) test1294(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916967754" + "'", str8, "ORD-1775916967754");
// flaky "67) test1294(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916967754" + "'", str9, "ORD-1775916967754");
// flaky "33) test1294(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916967754" + "'", str10, "ORD-1775916967754");
// flaky "10) test1294(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916967754" + "'", str11, "ORD-1775916967754");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        example.model.Address address35 = order33.getAddress();
        java.lang.String str36 = address35.getCity();
        java.lang.String str37 = address35.toString();
        java.lang.String str38 = address35.getStreet();
        java.lang.String str39 = address35.getFullName();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "107) test1295(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916967788" + "'", str29, "ORD-1775916967788");
        org.junit.Assert.assertNotNull(cartItemList30);
// flaky "68) test1295(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916967788" + "'", str34, "ORD-1775916967788");
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
// flaky "34) test1295(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str37, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "ORD-1775916886212" + "'", str38, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        example.model.Product product4 = new example.model.Product("ORD-1775916901837", "ORD-1775916894557", "ORD-1775916898608", (double) (-1.0f));
        double double5 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        example.service.CartService.addProduct(product4, 52);
        java.lang.String str9 = product4.getId();
        java.lang.String str10 = product4.getName();
        java.lang.String str11 = product4.toString();
        java.lang.String str12 = product4.getName();
        example.service.CartService.addProduct(product4, (int) (byte) 10);
        double double15 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916889515" + "'", str9, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749" + "'", str10, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str11, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916890749" + "'", str12, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916895177", "2026-04-11 17:14:53", "ORD-1775916889159", "ORD-1775916894903");
        example.model.Address address14 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str15 = address14.getPhone();
        java.lang.String str16 = address14.getFullName();
        java.lang.String str17 = address14.getPhone();
        example.model.Address address24 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str25 = address24.getCountry();
        java.lang.String str26 = address24.getStreet();
        example.model.Address address28 = null;
        example.model.CartItem[] cartItemArray29 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList30 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList30, cartItemArray29);
        example.model.Order order34 = new example.model.Order("", address28, (java.util.List<example.model.CartItem>) cartItemList30, 1.0d, "");
        example.model.Order order37 = example.service.OrderService.createOrder("ORD-1775916888151", address24, (java.util.List<example.model.CartItem>) cartItemList30, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order40 = example.service.OrderService.createOrder("ORD-1775916887228", address14, (java.util.List<example.model.CartItem>) cartItemList30, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        java.lang.String str49 = order48.getOrderId();
        java.lang.String str50 = order48.getOrderId();
        java.util.List<example.model.CartItem> cartItemList51 = order48.getItems();
        example.model.Order order54 = example.service.OrderService.createOrder("ORD-1775916891135", address14, cartItemList51, (double) 0L, "ORD-1775916886040");
        example.model.Order order57 = new example.model.Order("ORD-1775916900539", address6, cartItemList51, (double) 1, "ORD-1775916887934");
        example.model.Address address58 = order57.getAddress();
        example.model.Address address59 = order57.getAddress();
        java.lang.String str60 = address59.getFullName();
        java.lang.String str61 = address59.getFullName();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916886212" + "'", str26, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray29);
        org.junit.Assert.assertArrayEquals(cartItemArray29, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(order37);
        org.junit.Assert.assertNotNull(order40);
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
// flaky "108) test1298(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "ORD-1775916967885" + "'", str49, "ORD-1775916967885");
// flaky "69) test1298(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916967885" + "'", str50, "ORD-1775916967885");
        org.junit.Assert.assertNotNull(cartItemList51);
        org.junit.Assert.assertNotNull(order54);
        org.junit.Assert.assertNotNull(address58);
        org.junit.Assert.assertNotNull(address59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        example.model.Address address1 = null;
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getPhone();
        java.lang.String str10 = address8.getCountry();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = new example.model.Order("2026-04-11 17:14:47", address18, (java.util.List<example.model.CartItem>) cartItemList22, (double) (-1.0f), "");
        example.model.Address address30 = order29.getAddress();
        java.lang.String str31 = address30.getStreet();
        example.model.Address address33 = null;
        example.model.CartItem[] cartItemArray34 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList35 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList35, cartItemArray34);
        example.model.Order order39 = new example.model.Order("", address33, (java.util.List<example.model.CartItem>) cartItemList35, 1.0d, "");
        java.lang.String str40 = order39.getOrderId();
        java.util.List<example.model.CartItem> cartItemList41 = order39.getItems();
        example.model.Order order44 = new example.model.Order("ORD-1775916890225", address30, cartItemList41, (double) (byte) -1, "");
        java.lang.String str45 = order44.getCustomerEmail();
        example.service.OrderService.printReceipt(order44);
        java.lang.String str47 = order44.getStatus();
        java.lang.String str48 = order44.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList49 = order44.getItems();
        example.model.Order order52 = new example.model.Order("ORD-1775916904299", address8, cartItemList49, 35.0d, "ORD-1775916926346");
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order55 = example.service.OrderService.createOrder("ORD-1775916960851", address1, cartItemList49, 0.0d, "2026-04-11 17:15:25");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray34);
        org.junit.Assert.assertArrayEquals(cartItemArray34, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "109) test1299(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916967921" + "'", str40, "ORD-1775916967921");
        org.junit.Assert.assertNotNull(cartItemList41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916890225" + "'", str45, "ORD-1775916890225");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "PAID" + "'", str47, "PAID");
// flaky "70) test1299(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2026-04-11 17:16:07" + "'", str48, "2026-04-11 17:16:07");
        org.junit.Assert.assertNotNull(cartItemList49);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.String str22 = order17.getStatus();
        java.lang.String str23 = order17.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PAID" + "'", str22, "PAID");
// flaky "110) test1300(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2026-04-11 17:16:07" + "'", str23, "2026-04-11 17:16:07");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916923419");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        double double40 = order38.getTotalAmount();
        double double41 = order38.getTotalAmount();
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
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 97.0d + "'", double40 == 97.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 97.0d + "'", double41 == 97.0d);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        example.model.Address address14 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str15 = address14.getStreet();
        java.lang.String str16 = address14.getCountry();
        java.lang.String str17 = address14.getPhone();
        example.model.Address address26 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address28 = null;
        example.model.CartItem[] cartItemArray29 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList30 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList30, cartItemArray29);
        example.model.Order order34 = new example.model.Order("", address28, (java.util.List<example.model.CartItem>) cartItemList30, 1.0d, "");
        example.model.Order order37 = new example.model.Order("2026-04-11 17:14:47", address26, (java.util.List<example.model.CartItem>) cartItemList30, (double) (-1.0f), "");
        example.model.Address address38 = order37.getAddress();
        example.model.Address address40 = null;
        example.model.Address address42 = null;
        example.model.CartItem[] cartItemArray43 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList44 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList44, cartItemArray43);
        example.model.Order order48 = new example.model.Order("", address42, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "");
        example.model.Order order51 = new example.model.Order("ORD-1775916886212", address40, (java.util.List<example.model.CartItem>) cartItemList44, 1.0d, "ORD-1775916886040");
        example.model.Order order54 = new example.model.Order("ORD-1775916892053", address38, (java.util.List<example.model.CartItem>) cartItemList44, (double) 10, "ORD-1775916887494");
        example.model.Address address56 = null;
        example.model.CartItem[] cartItemArray57 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList58 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList58, cartItemArray57);
        example.model.Order order62 = new example.model.Order("", address56, (java.util.List<example.model.CartItem>) cartItemList58, 1.0d, "");
        example.model.Order order65 = example.service.OrderService.createOrder("ORD-1775916892053", address38, (java.util.List<example.model.CartItem>) cartItemList58, 0.0d, "2026-04-11 17:14:52");
        example.model.Order order68 = example.service.OrderService.createOrder("ORD-1775916894406", address14, (java.util.List<example.model.CartItem>) cartItemList58, 35.0d, "ORD-1775916888578");
        example.model.Order order71 = example.service.OrderService.createOrder("ORD-1775916893477", address6, (java.util.List<example.model.CartItem>) cartItemList58, (double) 0, "ORD-1775916888257");
        java.lang.String str72 = order71.getStatus();
        java.lang.String str73 = order71.getStatus();
        java.lang.Class<?> wildcardClass74 = order71.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray29);
        org.junit.Assert.assertArrayEquals(cartItemArray29, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(address38);
        org.junit.Assert.assertNotNull(cartItemArray43);
        org.junit.Assert.assertArrayEquals(cartItemArray43, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cartItemArray57);
        org.junit.Assert.assertArrayEquals(cartItemArray57, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(order65);
        org.junit.Assert.assertNotNull(order68);
        org.junit.Assert.assertNotNull(order71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "PAID" + "'", str72, "PAID");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "PAID" + "'", str73, "PAID");
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        java.lang.String str15 = order13.getPaymentIntentId();
        example.service.OrderService.printReceipt(order13);
        double double17 = order13.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916887166" + "'", str15, "ORD-1775916887166");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        cartItem6.setQuantity((int) 'a');
        java.lang.String str9 = cartItem6.toString();
        example.model.Product product10 = cartItem6.getProduct();
        double double11 = cartItem6.getSubtotal();
        cartItem6.setQuantity(10);
        example.model.Product product14 = cartItem6.getProduct();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749    x97  = $97.00" + "'", str9, "ORD-1775916890749    x97  = $97.00");
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(product14);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        int int7 = cartItem6.getQuantity();
        example.model.Product product8 = cartItem6.getProduct();
        java.lang.String str9 = cartItem6.toString();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749    x-1  = $-1.00" + "'", str9, "ORD-1775916890749    x-1  = $-1.00");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        int int9 = cartItem8.getQuantity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        cartItem2.setQuantity((int) 'a');
        cartItem2.setQuantity(35);
        int int9 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        example.model.Address address1 = null;
        java.util.List<example.model.CartItem> cartItemList2 = null;
        example.model.Order order5 = new example.model.Order("ORD-1775916945185", address1, cartItemList2, (double) 10, "ORD-1775916919220");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916951623");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) (byte) 10);
        int int13 = cartItem12.getQuantity();
        int int14 = cartItem12.getQuantity();
        java.lang.String str15 = cartItem12.toString();
        java.lang.String str16 = cartItem12.toString();
        cartItem12.setQuantity(0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:14:50  x10  = $-10.00" + "'", str15, "2026-04-11 17:14:50  x10  = $-10.00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2026-04-11 17:14:50  x10  = $-10.00" + "'", str16, "2026-04-11 17:14:50  x10  = $-10.00");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:15:00", "", "ORD-1775916943843", (double) (byte) 100);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:15:43", "ORD-1775916911907", "[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)", "2026-04-11 17:15:10", "ORD-1775916962028");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        example.model.Product product4 = new example.model.Product("ORD-1775916917204", "ORD-1775916919738", "ORD-1775916921579", 100.0d);
        example.service.CartService.addProduct(product4, (int) (byte) 1);
        example.service.CartService.addProduct(product4, (int) (short) 1);
        example.service.CartService.addProduct(product4, (int) (short) -1);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, 0);
        int int3 = cartItem2.getQuantity();
        cartItem2.setQuantity((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = product4.getDescription();
        double double8 = product4.getPrice();
        java.lang.String str9 = product4.getName();
        example.service.CartService.addProduct(product4, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916890749" + "'", str5, "ORD-1775916890749");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, 0);
        example.model.CartItem cartItem16 = new example.model.CartItem(product4, (int) (byte) 10);
        double double17 = cartItem16.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getPaymentIntentId();
        java.lang.String str20 = order17.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PAID" + "'", str20, "PAID");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        example.model.Product product1 = example.service.ProductService.getProductById("\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.getId();
        example.service.CartService.addProduct(product4, 97);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) ' ');
        example.model.CartItem cartItem16 = new example.model.CartItem(product4, 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        double double9 = product4.getPrice();
        java.lang.String str10 = product4.toString();
        java.lang.String str11 = product4.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:50" + "'", str11, "2026-04-11 17:14:50");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        cartItem2.setQuantity((-1));
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        example.model.Address address5 = new example.model.Address("ORD-1775916942889", "ORD-1775916937974", "", "ORD-1775916921063", "ORD-1775916904976");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        example.model.Address address19 = order17.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertNotNull(address19);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        java.lang.String str9 = product4.toString();
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, 97);
        example.model.Product product12 = cartItem11.getProduct();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertNotNull(product12);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.util.List<example.model.CartItem> cartItemList14 = order13.getItems();
        java.lang.String str15 = order13.getStatus();
        double double16 = order13.getTotalAmount();
        double double17 = order13.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(cartItemList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        java.lang.String str31 = order30.getCustomerEmail();
        java.lang.String str32 = order30.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916894327" + "'", str31, "ORD-1775916894327");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916894327" + "'", str32, "ORD-1775916894327");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
        java.lang.String str36 = order35.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "111) test1331(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2026-04-11 17:16:09" + "'", str36, "2026-04-11 17:16:09");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        double double15 = order13.getTotalAmount();
        double double16 = order13.getTotalAmount();
        java.lang.String str17 = order13.getOrderId();
        java.lang.String str18 = order13.getStatus();
        example.model.Address address19 = order13.getAddress();
        java.lang.String str20 = order13.getOrderId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
// flaky "112) test1332(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916969113" + "'", str17, "ORD-1775916969113");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertNotNull(address19);
// flaky "71) test1332(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916969113" + "'", str20, "ORD-1775916969113");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        double double9 = product4.getPrice();
        example.service.CartService.addProduct(product4, 52);
        double double12 = product4.getPrice();
        java.lang.String str13 = product4.getName();
        example.service.CartService.addProduct(product4, 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50" + "'", str13, "2026-04-11 17:14:50");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:14:56", "ORD-1775916927208", "2026-04-11 17:15:23", "ORD-1775916914723", "ORD-1775916944975");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        java.lang.String str10 = cartItem8.toString();
        int int11 = cartItem8.getQuantity();
        cartItem8.setQuantity((int) ' ');
        cartItem8.setQuantity((int) (short) 10);
        cartItem8.setQuantity((int) '4');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
// flaky "113) test1335(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749    str10  = $0.00" + "'", str10, "ORD-1775916890749    str10  = $0.00");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 10);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:14:51", "ORD-1775916894079", "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)", "ORD-1775916895177", "");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916895177" + "'", str6, "ORD-1775916895177");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:51" + "'", str7, "2026-04-11 17:14:51");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916894079" + "'", str8, "ORD-1775916894079");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = product4.getId();
        java.lang.String str8 = product4.getDescription();
        java.lang.String str9 = product4.getDescription();
        java.lang.String str10 = product4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916889515" + "'", str7, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-04-11 17:14:47" + "'", str8, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:47" + "'", str9, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        int int9 = cartItem8.getQuantity();
        cartItem8.setQuantity(100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = example.service.OrderService.createOrder("ORD-1775916903896", address6, (java.util.List<example.model.CartItem>) cartItemList11, (double) 0L, "ORD-1775916904159");
        java.lang.String str19 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(order18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916891938" + "'", str19, "ORD-1775916891938");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        example.model.Product product4 = new example.model.Product("PAID", "ORD-1775916912970", "", (double) (byte) -1);
        java.lang.String str5 = product4.getId();
        java.lang.String str6 = product4.toString();
        double double7 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PAID" + "'", str5, "PAID");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[PAID] ORD-1775916912970    - $-1.00  ()" + "'", str6, "[PAID] ORD-1775916912970    - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getCountry();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address20 = null;
        example.model.CartItem[] cartItemArray21 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList22 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList22, cartItemArray21);
        example.model.Order order26 = new example.model.Order("", address20, (java.util.List<example.model.CartItem>) cartItemList22, 1.0d, "");
        example.model.Order order29 = new example.model.Order("2026-04-11 17:14:47", address18, (java.util.List<example.model.CartItem>) cartItemList22, (double) (-1.0f), "");
        example.model.Address address30 = order29.getAddress();
        java.lang.String str31 = address30.getCountry();
        java.lang.String str32 = address30.getCity();
        example.model.Address address40 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str41 = address40.getCountry();
        java.lang.String str42 = address40.getStreet();
        example.model.Address address44 = null;
        example.model.Address address46 = null;
        example.model.CartItem[] cartItemArray47 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList48 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList48, cartItemArray47);
        example.model.Order order52 = new example.model.Order("", address46, (java.util.List<example.model.CartItem>) cartItemList48, 1.0d, "");
        example.model.Order order55 = new example.model.Order("ORD-1775916886212", address44, (java.util.List<example.model.CartItem>) cartItemList48, 1.0d, "ORD-1775916886040");
        example.model.Order order58 = new example.model.Order("ORD-1775916893369", address40, (java.util.List<example.model.CartItem>) cartItemList48, (double) 52, "2026-04-11 17:14:52");
        example.model.Address address60 = null;
        example.model.CartItem[] cartItemArray61 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList62 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList62, cartItemArray61);
        example.model.Order order66 = new example.model.Order("", address60, (java.util.List<example.model.CartItem>) cartItemList62, 1.0d, "");
        java.lang.String str67 = order66.getOrderId();
        example.model.Address address68 = order66.getAddress();
        java.lang.String str69 = order66.getCreatedAt();
        java.lang.String str70 = order66.getCreatedAt();
        example.model.Address address71 = order66.getAddress();
        java.util.List<example.model.CartItem> cartItemList72 = order66.getItems();
        example.model.Order order75 = new example.model.Order("ORD-1775916903519", address40, cartItemList72, 35.0d, "ORD-1775916891938");
        example.model.Order order78 = new example.model.Order("\ud83d\udcde ORD-1775916886212", address30, cartItemList72, (double) (short) 1, "ORD-1775916916776");
        java.util.List<example.model.CartItem> cartItemList79 = order78.getItems();
        example.model.Order order82 = example.service.OrderService.createOrder("ORD-1775916928800", address6, cartItemList79, (double) 1, "ORD-1775916963934");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray21);
        org.junit.Assert.assertArrayEquals(cartItemArray21, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(address30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ORD-1775916886212" + "'", str41, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ORD-1775916886212" + "'", str42, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray47);
        org.junit.Assert.assertArrayEquals(cartItemArray47, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cartItemArray61);
        org.junit.Assert.assertArrayEquals(cartItemArray61, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
// flaky "114) test1342(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ORD-1775916969386" + "'", str67, "ORD-1775916969386");
        org.junit.Assert.assertNull(address68);
// flaky "72) test1342(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "2026-04-11 17:16:09" + "'", str69, "2026-04-11 17:16:09");
// flaky "35) test1342(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "2026-04-11 17:16:09" + "'", str70, "2026-04-11 17:16:09");
        org.junit.Assert.assertNull(address71);
        org.junit.Assert.assertNotNull(cartItemList72);
        org.junit.Assert.assertNotNull(cartItemList79);
        org.junit.Assert.assertNotNull(order82);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        int int5 = cartItem2.getQuantity();
        cartItem2.setQuantity((-1));
        example.model.Product product8 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(product8);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        example.service.OrderService.printReceipt(order13);
        java.lang.String str16 = order13.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916887036" + "'", str16, "ORD-1775916887036");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getPhone();
        java.lang.String str10 = address8.getFullName();
        java.lang.String str11 = address8.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str19 = address18.getCountry();
        java.lang.String str20 = address18.getStreet();
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        example.model.Order order31 = example.service.OrderService.createOrder("ORD-1775916888151", address18, (java.util.List<example.model.CartItem>) cartItemList24, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order34 = example.service.OrderService.createOrder("ORD-1775916887228", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address36 = null;
        example.model.CartItem[] cartItemArray37 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList38 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList38, cartItemArray37);
        example.model.Order order42 = new example.model.Order("", address36, (java.util.List<example.model.CartItem>) cartItemList38, 1.0d, "");
        java.lang.String str43 = order42.getOrderId();
        java.lang.String str44 = order42.getOrderId();
        java.util.List<example.model.CartItem> cartItemList45 = order42.getItems();
        example.model.Order order48 = example.service.OrderService.createOrder("ORD-1775916891135", address8, cartItemList45, (double) 0L, "ORD-1775916886040");
        java.lang.String str49 = address8.getCity();
        example.model.Address address56 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str57 = address56.getPhone();
        java.lang.String str58 = address56.getFullName();
        java.lang.String str59 = address56.getPhone();
        example.model.Address address66 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str67 = address66.getCountry();
        java.lang.String str68 = address66.getStreet();
        example.model.Address address70 = null;
        example.model.CartItem[] cartItemArray71 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList72 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList72, cartItemArray71);
        example.model.Order order76 = new example.model.Order("", address70, (java.util.List<example.model.CartItem>) cartItemList72, 1.0d, "");
        example.model.Order order79 = example.service.OrderService.createOrder("ORD-1775916888151", address66, (java.util.List<example.model.CartItem>) cartItemList72, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order82 = example.service.OrderService.createOrder("ORD-1775916887228", address56, (java.util.List<example.model.CartItem>) cartItemList72, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Order order85 = new example.model.Order("ORD-1775916906793", address8, (java.util.List<example.model.CartItem>) cartItemList72, (double) (-1.0f), "ORD-1775916902394");
        java.lang.String str86 = address8.getPhone();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order31);
        org.junit.Assert.assertNotNull(order34);
        org.junit.Assert.assertNotNull(cartItemArray37);
        org.junit.Assert.assertArrayEquals(cartItemArray37, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "115) test1345(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916969503" + "'", str43, "ORD-1775916969503");
// flaky "73) test1345(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916969503" + "'", str44, "ORD-1775916969503");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "ORD-1775916886212" + "'", str57, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "ORD-1775916886212" + "'", str59, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "ORD-1775916886212" + "'", str67, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "ORD-1775916886212" + "'", str68, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray71);
        org.junit.Assert.assertArrayEquals(cartItemArray71, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(order79);
        org.junit.Assert.assertNotNull(order82);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "ORD-1775916886212" + "'", str86, "ORD-1775916886212");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        java.lang.String str29 = address26.getCity();
        java.lang.String str30 = address26.toString();
        java.lang.String str31 = address26.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
// flaky "116) test1346(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str30, "\ud83d\udcde ORD-1775916886212");
// flaky "74) test1346(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str31, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        example.model.Address address6 = new example.model.Address("ORD-1775916944819", "ORD-1775916940842", "ORD-1775916933088", "ORD-1775916925904", "ORD-1775916936937");
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
        java.lang.String str35 = address34.toString();
        example.model.Address address42 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str43 = address42.getCountry();
        java.lang.String str44 = address42.getStreet();
        example.model.Address address46 = null;
        example.model.Address address48 = null;
        example.model.CartItem[] cartItemArray49 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList50 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList50, cartItemArray49);
        example.model.Order order54 = new example.model.Order("", address48, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "");
        example.model.Order order57 = new example.model.Order("ORD-1775916886212", address46, (java.util.List<example.model.CartItem>) cartItemList50, 1.0d, "ORD-1775916886040");
        example.model.Order order60 = new example.model.Order("ORD-1775916893369", address42, (java.util.List<example.model.CartItem>) cartItemList50, (double) 52, "2026-04-11 17:14:52");
        example.model.Order order63 = new example.model.Order("ORD-1775916921154", address34, (java.util.List<example.model.CartItem>) cartItemList50, (double) (short) 10, "ORD-1775916907064");
        example.model.Order order66 = example.service.OrderService.createOrder("ORD-1775916948853", address6, (java.util.List<example.model.CartItem>) cartItemList50, (-35.0d), "ORD-1775916943010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916886212" + "'", str17, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(address34);
// flaky "117) test1347(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str35, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916886212" + "'", str43, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916886212" + "'", str44, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray49);
        org.junit.Assert.assertArrayEquals(cartItemArray49, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(order66);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        example.model.Address address5 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getPhone();
        java.lang.String str8 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916897292" + "'", str6, "ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916897292" + "'", str7, "ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-04-11 17:15:02" + "'", str8, "2026-04-11 17:15:02");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        java.lang.String str29 = order26.getOrderId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "118) test1349(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "75) test1349(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916969656" + "'", str27, "ORD-1775916969656");
// flaky "36) test1349(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2026-04-11 17:16:09" + "'", str28, "2026-04-11 17:16:09");
// flaky "11) test1349(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916969656" + "'", str29, "ORD-1775916969656");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        java.lang.String str16 = order15.getOrderId();
        java.util.List<example.model.CartItem> cartItemList17 = order15.getItems();
        double double18 = order15.getTotalAmount();
        java.lang.String str19 = order15.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList20 = order15.getItems();
        example.model.Order order23 = new example.model.Order("ORD-1775916903896", address6, cartItemList20, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str24 = address6.getCity();
        java.lang.String str25 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "119) test1351(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916969723" + "'", str16, "ORD-1775916969723");
        org.junit.Assert.assertNotNull(cartItemList17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916894246" + "'", str24, "ORD-1775916894246");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getPhone();
        java.lang.String str21 = address19.toString();
        java.lang.String str22 = address19.toString();
        java.lang.String str23 = address19.getStreet();
        java.lang.String str24 = address19.getCity();
        example.model.Address address31 = new example.model.Address("ORD-1775916886040", "ORD-1775916893211", "ORD-1775916902864", "2026-04-11 17:15:02", "ORD-1775916897292");
        java.lang.String str32 = address31.getPhone();
        example.model.Address address39 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address41 = null;
        example.model.Address address43 = null;
        example.model.CartItem[] cartItemArray44 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList45 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList45, cartItemArray44);
        example.model.Order order49 = new example.model.Order("", address43, (java.util.List<example.model.CartItem>) cartItemList45, 1.0d, "");
        example.model.Order order52 = new example.model.Order("ORD-1775916886212", address41, (java.util.List<example.model.CartItem>) cartItemList45, 1.0d, "ORD-1775916886040");
        example.model.Order order55 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address39, (java.util.List<example.model.CartItem>) cartItemList45, (double) (short) 0, "ORD-1775916903429");
        example.model.Order order58 = new example.model.Order("ORD-1775916909184", address31, (java.util.List<example.model.CartItem>) cartItemList45, (double) (byte) 1, "ORD-1775916903519");
        example.model.Order order61 = new example.model.Order("ORD-1775916887611", address19, (java.util.List<example.model.CartItem>) cartItemList45, (double) 0.0f, "ORD-1775916887036");
        java.lang.String str62 = order61.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
// flaky "120) test1352(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
// flaky "76) test1352(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str22, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916897292" + "'", str32, "ORD-1775916897292");
        org.junit.Assert.assertNotNull(cartItemArray44);
        org.junit.Assert.assertArrayEquals(cartItemArray44, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(order55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "ORD-1775916887611" + "'", str62, "ORD-1775916887611");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916931854");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getCountry();
        java.lang.String str8 = address6.getStreet();
        java.util.List<example.model.CartItem> cartItemList9 = example.service.CartService.getCart();
        example.model.Order order12 = new example.model.Order("ORD-1775916887934", address6, cartItemList9, (double) 97, "ORD-1775916889159");
        java.lang.String str13 = order12.getCustomerEmail();
        java.lang.String str14 = order12.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916887934" + "'", str13, "ORD-1775916887934");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916889159" + "'", str14, "ORD-1775916889159");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getOrderId();
        java.lang.String str12 = order7.getCustomerEmail();
        example.model.Address address13 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "121) test1355(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916969853" + "'", str8, "ORD-1775916969853");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "77) test1355(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916969853" + "'", str11, "ORD-1775916969853");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(address13);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        java.lang.String str23 = order22.getCreatedAt();
        example.service.OrderService.printReceipt(order22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "122) test1356(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916969881" + "'", str18, "ORD-1775916969881");
        org.junit.Assert.assertNotNull(cartItemList19);
        org.junit.Assert.assertNotNull(order22);
// flaky "78) test1356(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2026-04-11 17:16:09" + "'", str23, "2026-04-11 17:16:09");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        example.model.Address address5 = new example.model.Address("ORD-1775916891457", "ORD-1775916905596", "ORD-1775916891938", "ORD-1775916905829", "ORD-1775916920763");
        java.lang.String str6 = address5.getFullName();
        java.lang.String str7 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891457" + "'", str6, "ORD-1775916891457");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916905596" + "'", str7, "ORD-1775916905596");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        example.model.Product product4 = new example.model.Product("ORD-1775916936275", "[ORD-1775916891615] ORD-1775916890749    - $1.00  (ORD-1775916892828)", "ORD-1775916943010", (double) (short) 1);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = product4.getDescription();
        double double8 = product4.getPrice();
        java.lang.String str9 = product4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        java.lang.String str84 = order83.getPaymentIntentId();
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
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "ORD-1775916941170" + "'", str84, "ORD-1775916941170");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        java.lang.String str87 = address7.getStreet();
        java.lang.String str88 = address7.getCountry();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
// flaky "123) test1361(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
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
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "ORD-1775916886212" + "'", str88, "ORD-1775916886212");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        example.model.Address address5 = new example.model.Address("ORD-1775916907784", "ORD-1775916889515", "2026-04-11 17:15:37", "ORD-1775916900618", "");
        java.lang.String str6 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916907784" + "'", str6, "ORD-1775916907784");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        double double14 = order7.getTotalAmount();
        java.lang.String str15 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "124) test1363(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916970136" + "'", str8, "ORD-1775916970136");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "79) test1363(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:10" + "'", str11, "2026-04-11 17:16:10");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        example.model.Product product4 = new example.model.Product("PAID", "ORD-1775916912970", "", (double) (byte) -1);
        java.lang.String str5 = product4.getDescription();
        example.service.CartService.addProduct(product4, 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
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
        double double14 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "125) test1365(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916970199" + "'", str8, "ORD-1775916970199");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "80) test1365(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:10" + "'", str11, "2026-04-11 17:16:10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        example.model.Address address5 = new example.model.Address("ORD-1775916915305", "ORD-1775916957481", "ORD-1775916909254", "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", "ORD-1775916903519");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        java.lang.String str5 = product4.getId();
        example.model.CartItem cartItem7 = new example.model.CartItem(product4, (int) (byte) 10);
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getId();
        java.lang.String str10 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916891615" + "'", str5, "ORD-1775916891615");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916891615] ORD-1775916890749    - $1.00  (ORD-1775916892828)" + "'", str8, "[ORD-1775916891615] ORD-1775916890749    - $1.00  (ORD-1775916892828)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916891615" + "'", str9, "ORD-1775916891615");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749" + "'", str10, "ORD-1775916890749");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.toString();
        example.model.Address address28 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address30 = null;
        example.model.CartItem[] cartItemArray31 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList32 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList32, cartItemArray31);
        example.model.Order order36 = new example.model.Order("", address30, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "");
        example.model.Order order39 = new example.model.Order("2026-04-11 17:14:47", address28, (java.util.List<example.model.CartItem>) cartItemList32, (double) (-1.0f), "");
        example.model.Address address40 = order39.getAddress();
        example.model.Address address42 = null;
        example.model.Address address44 = null;
        example.model.CartItem[] cartItemArray45 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList46 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList46, cartItemArray45);
        example.model.Order order50 = new example.model.Order("", address44, (java.util.List<example.model.CartItem>) cartItemList46, 1.0d, "");
        example.model.Order order53 = new example.model.Order("ORD-1775916886212", address42, (java.util.List<example.model.CartItem>) cartItemList46, 1.0d, "ORD-1775916886040");
        example.model.Order order56 = new example.model.Order("ORD-1775916892053", address40, (java.util.List<example.model.CartItem>) cartItemList46, (double) 10, "ORD-1775916887494");
        example.model.Order order59 = example.service.OrderService.createOrder("ORD-1775916911907", address19, (java.util.List<example.model.CartItem>) cartItemList46, (double) (-1.0f), "ORD-1775916904860");
        java.lang.String str60 = address19.getCountry();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
// flaky "126) test1368(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(address40);
        org.junit.Assert.assertNotNull(cartItemArray45);
        org.junit.Assert.assertArrayEquals(cartItemArray45, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(order59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "ORD-1775916886212" + "'", str60, "ORD-1775916886212");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        example.model.Product product4 = new example.model.Product("ORD-1775916943324", "ORD-1775916894811", "ORD-1775916934454", (double) 10);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        int int9 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        double double11 = product4.getPrice();
        java.lang.String str12 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str12, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:48", "ORD-1775916901376", "ORD-1775916894079", (double) 1.0f);
        java.lang.String str5 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[2026-04-11 17:14:48] ORD-1775916901376    - $1.00  (ORD-1775916894079)" + "'", str5, "[2026-04-11 17:14:48] ORD-1775916901376    - $1.00  (ORD-1775916894079)");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) 10);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) '4');
        cartItem8.setQuantity(0);
        java.lang.String str11 = cartItem8.toString();
// flaky "127) test1373(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916891615    str11  = $0.00" + "'", str11, "ORD-1775916891615    str11  = $0.00");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        java.lang.String str22 = order17.getStatus();
        double double23 = order17.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PAID" + "'", str22, "PAID");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        java.lang.String str35 = order33.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "128) test1375(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916970487" + "'", str29, "ORD-1775916970487");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(address34);
// flaky "81) test1375(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "2026-04-11 17:16:10" + "'", str35, "2026-04-11 17:16:10");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        java.lang.String str87 = address7.getFullName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
// flaky "129) test1376(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
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
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        example.model.Address address5 = new example.model.Address("ORD-1775916891335", "ORD-1775916927345", "2026-04-11 17:14:52", "ORD-1775916911372", "ORD-1775916895446");
        java.lang.String str6 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916927345" + "'", str6, "ORD-1775916927345");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        example.model.Address address28 = null;
        example.model.Address address30 = null;
        example.model.CartItem[] cartItemArray31 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList32 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList32, cartItemArray31);
        example.model.Order order36 = new example.model.Order("", address30, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "");
        example.model.Order order39 = new example.model.Order("ORD-1775916886212", address28, (java.util.List<example.model.CartItem>) cartItemList32, 1.0d, "ORD-1775916886040");
        java.lang.String str40 = order39.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList41 = order39.getItems();
        example.model.Order order44 = example.service.OrderService.createOrder("ORD-1775916931611", address7, cartItemList41, (double) '#', "ORD-1775916901262");
        java.lang.String str45 = address7.getCity();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916886212" + "'", str26, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray31);
        org.junit.Assert.assertArrayEquals(cartItemArray31, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886040" + "'", str40, "ORD-1775916886040");
        org.junit.Assert.assertNotNull(cartItemList41);
        org.junit.Assert.assertNotNull(order44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        example.service.CartService.removeProduct("2026-04-11 17:15:15");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        double double7 = cartItem6.getSubtotal();
        cartItem6.setQuantity(52);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        java.lang.String str16 = order15.getOrderId();
        java.util.List<example.model.CartItem> cartItemList17 = order15.getItems();
        double double18 = order15.getTotalAmount();
        java.lang.String str19 = order15.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList20 = order15.getItems();
        example.model.Order order23 = new example.model.Order("ORD-1775916903896", address6, cartItemList20, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str24 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "130) test1381(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916970690" + "'", str16, "ORD-1775916970690");
        org.junit.Assert.assertNotNull(cartItemList17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916892121" + "'", str24, "ORD-1775916892121");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        java.lang.String str30 = order26.getStatus();
        java.lang.String str31 = order26.getCreatedAt();
        java.lang.String str32 = order26.getStatus();
        java.util.List<example.model.CartItem> cartItemList33 = order26.getItems();
        double double34 = order26.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "131) test1382(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "82) test1382(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916970723" + "'", str27, "ORD-1775916970723");
// flaky "37) test1382(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916970723" + "'", str28, "ORD-1775916970723");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PAID" + "'", str30, "PAID");
// flaky "12) test1382(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2026-04-11 17:16:10" + "'", str31, "2026-04-11 17:16:10");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
        org.junit.Assert.assertNotNull(cartItemList33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        double double37 = order35.getTotalAmount();
        java.lang.String str38 = order35.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
// flaky "132) test1383(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916887611" + "'", str36, "ORD-1775916887611");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-35.0d) + "'", double37 == (-35.0d));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PAID" + "'", str38, "PAID");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        java.lang.String str8 = product4.getId();
        example.service.CartService.addProduct(product4, (int) '#');
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str13 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916889515" + "'", str8, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916890749" + "'", str13, "ORD-1775916890749");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        double double8 = product4.getPrice();
        double double9 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916891335" + "'", str6, "ORD-1775916891335");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        java.lang.String str35 = order33.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "133) test1386(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916970858" + "'", str29, "ORD-1775916970858");
        org.junit.Assert.assertNotNull(cartItemList30);
// flaky "83) test1386(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916970858" + "'", str34, "ORD-1775916970858");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916890225" + "'", str35, "ORD-1775916890225");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        example.model.Address address17 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "134) test1387(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916970889" + "'", str8, "ORD-1775916970889");
        org.junit.Assert.assertNull(address9);
// flaky "84) test1387(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:16:10" + "'", str10, "2026-04-11 17:16:10");
// flaky "38) test1387(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:10" + "'", str11, "2026-04-11 17:16:10");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "13) test1387(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:16:10" + "'", str15, "2026-04-11 17:16:10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(address17);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) 10);
        double double11 = product4.getPrice();
        java.lang.String str12 = product4.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916888257" + "'", str12, "ORD-1775916888257");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.lang.String str13 = order7.getOrderId();
        java.lang.String str14 = order7.getCustomerEmail();
        java.lang.String str15 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "135) test1389(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916970951" + "'", str8, "ORD-1775916970951");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "85) test1389(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916970951" + "'", str11, "ORD-1775916970951");
        org.junit.Assert.assertNotNull(cartItemList12);
// flaky "39) test1389(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916970951" + "'", str13, "ORD-1775916970951");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "14) test1389(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:16:10" + "'", str15, "2026-04-11 17:16:10");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "136) test1390(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916970973" + "'", str8, "ORD-1775916970973");
// flaky "86) test1390(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916970973" + "'", str9, "ORD-1775916970973");
        org.junit.Assert.assertNull(address10);
// flaky "40) test1390(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916970973" + "'", str11, "ORD-1775916970973");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        java.lang.String str5 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916891615" + "'", str5, "ORD-1775916891615");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getStreet();
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        java.lang.String str18 = order17.getOrderId();
        java.lang.String str19 = order17.getOrderId();
        example.model.Address address20 = order17.getAddress();
        java.lang.String str21 = order17.getStatus();
        java.lang.String str22 = order17.getCustomerEmail();
        java.lang.String str23 = order17.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList24 = order17.getItems();
        java.util.List<example.model.CartItem> cartItemList25 = order17.getItems();
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916934860", address6, cartItemList25, (double) 97, "2026-04-11 17:15:19");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "137) test1392(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916971037" + "'", str18, "ORD-1775916971037");
// flaky "87) test1392(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916971037" + "'", str19, "ORD-1775916971037");
        org.junit.Assert.assertNull(address20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PAID" + "'", str21, "PAID");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
// flaky "41) test1392(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2026-04-11 17:16:11" + "'", str23, "2026-04-11 17:16:11");
        org.junit.Assert.assertNotNull(cartItemList24);
        org.junit.Assert.assertNotNull(cartItemList25);
        org.junit.Assert.assertNotNull(order28);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        example.model.Product product4 = new example.model.Product("ORD-1775916886040", "ORD-1775916896079", "ORD-1775916897099", (double) (short) -1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916897099" + "'", str5, "ORD-1775916897099");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916896079" + "'", str6, "ORD-1775916896079");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getPhone();
        java.lang.String str10 = address8.getFullName();
        java.lang.String str11 = address8.getPhone();
        example.model.Address address18 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str19 = address18.getCountry();
        java.lang.String str20 = address18.getStreet();
        example.model.Address address22 = null;
        example.model.CartItem[] cartItemArray23 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList24 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList24, cartItemArray23);
        example.model.Order order28 = new example.model.Order("", address22, (java.util.List<example.model.CartItem>) cartItemList24, 1.0d, "");
        example.model.Order order31 = example.service.OrderService.createOrder("ORD-1775916888151", address18, (java.util.List<example.model.CartItem>) cartItemList24, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order34 = example.service.OrderService.createOrder("ORD-1775916887228", address8, (java.util.List<example.model.CartItem>) cartItemList24, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address36 = null;
        example.model.CartItem[] cartItemArray37 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList38 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList38, cartItemArray37);
        example.model.Order order42 = new example.model.Order("", address36, (java.util.List<example.model.CartItem>) cartItemList38, 1.0d, "");
        java.lang.String str43 = order42.getOrderId();
        java.lang.String str44 = order42.getOrderId();
        java.util.List<example.model.CartItem> cartItemList45 = order42.getItems();
        example.model.Order order48 = example.service.OrderService.createOrder("ORD-1775916891135", address8, cartItemList45, (double) 0L, "ORD-1775916886040");
        example.model.Address address55 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str56 = address55.getStreet();
        java.lang.String str57 = address55.getFullName();
        java.lang.String str58 = address55.getStreet();
        example.model.Address address60 = null;
        example.model.Address address62 = null;
        example.model.CartItem[] cartItemArray63 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList64 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList64, cartItemArray63);
        example.model.Order order68 = new example.model.Order("", address62, (java.util.List<example.model.CartItem>) cartItemList64, 1.0d, "");
        example.model.Order order71 = new example.model.Order("ORD-1775916886212", address60, (java.util.List<example.model.CartItem>) cartItemList64, 1.0d, "ORD-1775916886040");
        example.model.Order order74 = new example.model.Order("ORD-1775916894811", address55, (java.util.List<example.model.CartItem>) cartItemList64, (double) 1.0f, "ORD-1775916894327");
        example.model.Order order77 = new example.model.Order("ORD-1775916924595", address8, (java.util.List<example.model.CartItem>) cartItemList64, (double) (byte) 0, "2026-04-11 17:14:50  x35  = $-35.00");
        java.lang.String str78 = address8.getFullName();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(order31);
        org.junit.Assert.assertNotNull(order34);
        org.junit.Assert.assertNotNull(cartItemArray37);
        org.junit.Assert.assertArrayEquals(cartItemArray37, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky "138) test1394(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916971122" + "'", str43, "ORD-1775916971122");
// flaky "88) test1394(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916971122" + "'", str44, "ORD-1775916971122");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886212" + "'", str56, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "ORD-1775916886212" + "'", str58, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray63);
        org.junit.Assert.assertArrayEquals(cartItemArray63, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        example.model.Product product4 = new example.model.Product("ORD-1775916911314", "ORD-1775916889693", "ORD-1775916905007", 100.0d);
        double double5 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:56", "ORD-1775916938275", "ORD-1775916956583", (-32.0d));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916895177", "2026-04-11 17:14:53", "ORD-1775916889159", "ORD-1775916894903");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916895177" + "'", str6, "ORD-1775916895177");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:53" + "'", str7, "2026-04-11 17:14:53");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        example.model.Address address5 = new example.model.Address("ORD-1775916936116", "2026-04-11 17:15:28", "ORD-1775916926649", "ORD-1775916949611", "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        example.model.Address address5 = new example.model.Address("ORD-1775916930220", "ORD-1775916911594", "ORD-1775916904299", "ORD-1775916911594", "2026-04-11 17:14:54");
        java.lang.String str6 = address5.getCity();
        java.lang.String str7 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916904299" + "'", str6, "ORD-1775916904299");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916904299" + "'", str7, "ORD-1775916904299");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        double double31 = order30.getTotalAmount();
        java.lang.String str32 = order30.getCustomerEmail();
        double double33 = order30.getTotalAmount();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916894327" + "'", str32, "ORD-1775916894327");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        java.lang.String str14 = order7.getCustomerEmail();
        double double15 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "139) test1401(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916971389" + "'", str8, "ORD-1775916971389");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "89) test1401(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:11" + "'", str11, "2026-04-11 17:16:11");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("2026-04-11 17:14:47", address8, (java.util.List<example.model.CartItem>) cartItemList12, (double) (-1.0f), "");
        example.model.Address address20 = order19.getAddress();
        example.model.Address address22 = null;
        example.model.Address address24 = null;
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = new example.model.Order("", address24, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "");
        example.model.Order order33 = new example.model.Order("ORD-1775916886212", address22, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "ORD-1775916886040");
        example.model.Order order36 = new example.model.Order("ORD-1775916892053", address20, (java.util.List<example.model.CartItem>) cartItemList26, (double) 10, "ORD-1775916887494");
        example.model.Address address38 = null;
        example.model.CartItem[] cartItemArray39 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList40 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList40, cartItemArray39);
        example.model.Order order44 = new example.model.Order("", address38, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "");
        example.model.Order order47 = example.service.OrderService.createOrder("ORD-1775916892053", address20, (java.util.List<example.model.CartItem>) cartItemList40, 0.0d, "2026-04-11 17:14:52");
        example.model.Address address48 = order47.getAddress();
        java.lang.String str49 = order47.getCreatedAt();
        java.lang.String str50 = order47.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cartItemArray39);
        org.junit.Assert.assertArrayEquals(cartItemArray39, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(order47);
        org.junit.Assert.assertNotNull(address48);
// flaky "140) test1402(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2026-04-11 17:16:11" + "'", str49, "2026-04-11 17:16:11");
// flaky "90) test1402(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ORD-1775916971432" + "'", str50, "ORD-1775916971432");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        java.lang.String str21 = order17.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2026-04-11 17:14:47" + "'", str21, "2026-04-11 17:14:47");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        example.model.Address address14 = order13.getAddress();
        java.lang.String str15 = order13.getOrderId();
        example.model.Address address16 = order13.getAddress();
        example.service.OrderService.printReceipt(order13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(address14);
// flaky "141) test1404(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916971506" + "'", str15, "ORD-1775916971506");
        org.junit.Assert.assertNotNull(address16);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getId();
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916888257" + "'", str8, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916888257" + "'", str9, "ORD-1775916888257");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        java.lang.String str55 = address8.toString();
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
// flaky "142) test1406(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str55, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getCity();
        java.lang.String str9 = address5.getCountry();
        java.lang.String str10 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, 1);
        double double10 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) (short) 0);
        double double13 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        java.lang.String str40 = address39.getCity();
        java.lang.String str41 = address39.getCity();
        java.lang.String str42 = address39.getCountry();
        java.lang.String str43 = address39.getFullName();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ORD-1775916886212" + "'", str42, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.getPhone();
        java.lang.String str20 = address18.getPhone();
        java.lang.String str21 = address18.getFullName();
        java.lang.String str22 = address18.getFullName();
        java.lang.String str23 = address18.getCountry();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916886212" + "'", str23, "ORD-1775916886212");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        example.model.Address address5 = new example.model.Address("[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)", "ORD-1775916905468", "2026-04-11 17:14:58", "ORD-1775916912970", "");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getPhone();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916905468" + "'", str6, "ORD-1775916905468");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "143) test1411(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ud83d\udcde " + "'", str9, "\ud83d\udcde ");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        java.lang.String str31 = order30.getPaymentIntentId();
        java.lang.String str32 = order30.getStatus();
        java.lang.String str33 = order30.getPaymentIntentId();
        example.service.OrderService.printReceipt(order30);
        java.lang.String str35 = order30.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916892828" + "'", str31, "ORD-1775916892828");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "PAID" + "'", str32, "PAID");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916892828" + "'", str33, "ORD-1775916892828");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PAID" + "'", str35, "PAID");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("2026-04-11 17:14:47", address8, (java.util.List<example.model.CartItem>) cartItemList12, (double) (-1.0f), "");
        example.model.Address address20 = order19.getAddress();
        example.model.Address address22 = null;
        example.model.Address address24 = null;
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = new example.model.Order("", address24, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "");
        example.model.Order order33 = new example.model.Order("ORD-1775916886212", address22, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "ORD-1775916886040");
        example.model.Order order36 = new example.model.Order("ORD-1775916892053", address20, (java.util.List<example.model.CartItem>) cartItemList26, (double) 10, "ORD-1775916887494");
        example.model.Address address38 = null;
        example.model.CartItem[] cartItemArray39 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList40 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList40, cartItemArray39);
        example.model.Order order44 = new example.model.Order("", address38, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "");
        example.model.Order order47 = example.service.OrderService.createOrder("ORD-1775916892053", address20, (java.util.List<example.model.CartItem>) cartItemList40, 0.0d, "2026-04-11 17:14:52");
        example.model.Address address48 = order47.getAddress();
        java.lang.String str49 = order47.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cartItemArray39);
        org.junit.Assert.assertArrayEquals(cartItemArray39, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(order47);
        org.junit.Assert.assertNotNull(address48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PAID" + "'", str49, "PAID");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = cartItem6.toString();
        int int8 = cartItem6.getQuantity();
        cartItem6.setQuantity(10);
        example.model.Product product11 = cartItem6.getProduct();
        example.service.CartService.addProduct(product11, (int) 'a');
        example.model.CartItem cartItem15 = new example.model.CartItem(product11, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749    x1  = $1.00" + "'", str7, "ORD-1775916890749    x1  = $1.00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(product11);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        double double11 = product4.getPrice();
        java.lang.String str12 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        java.lang.String str21 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        java.lang.String str5 = product4.getId();
        java.lang.String str6 = product4.getDescription();
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916891615" + "'", str5, "ORD-1775916891615");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892828" + "'", str6, "ORD-1775916892828");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916890749" + "'", str8, "ORD-1775916890749");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 10);
        double double7 = cartItem6.getSubtotal();
        cartItem6.setQuantity((int) '4');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 350.0d + "'", double7 == 350.0d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        java.lang.String str16 = order7.getCustomerEmail();
        java.lang.String str17 = order7.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "144) test1419(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916972007" + "'", str8, "ORD-1775916972007");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "91) test1419(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:12" + "'", str11, "2026-04-11 17:16:12");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PAID" + "'", str17, "PAID");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        example.service.OrderService.printReceipt(order60);
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
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        example.model.Address address5 = new example.model.Address("ORD-1775916914764", "ORD-1775916950427", "ORD-1775916969881", "ORD-1775916891414", "ORD-1775916970723");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, 35);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde ORD-1775916886212", "2026-04-11 17:14:50", "ORD-1775916889693", 1.0d);
        java.lang.String str5 = product4.getId();
        double double6 = product4.getPrice();
        java.lang.String str7 = product4.toString();
        double double8 = product4.getPrice();
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, 35);
        double double11 = cartItem10.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str5, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "145) test1424(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916886212] 2026-04-11 17:14:50  - $1.00  (ORD-1775916889693)" + "'", str7, "\ud83d\udcde ORD-1775916886212] 2026-04-11 17:14:50  - $1.00  (ORD-1775916889693)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("2026-04-11 17:14:47", address8, (java.util.List<example.model.CartItem>) cartItemList12, (double) (-1.0f), "");
        example.model.Address address20 = order19.getAddress();
        example.model.Address address22 = null;
        example.model.Address address24 = null;
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = new example.model.Order("", address24, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "");
        example.model.Order order33 = new example.model.Order("ORD-1775916886212", address22, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "ORD-1775916886040");
        example.model.Order order36 = new example.model.Order("ORD-1775916892053", address20, (java.util.List<example.model.CartItem>) cartItemList26, (double) 10, "ORD-1775916887494");
        example.model.Address address38 = null;
        example.model.CartItem[] cartItemArray39 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList40 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList40, cartItemArray39);
        example.model.Order order44 = new example.model.Order("", address38, (java.util.List<example.model.CartItem>) cartItemList40, 1.0d, "");
        example.model.Order order47 = example.service.OrderService.createOrder("ORD-1775916892053", address20, (java.util.List<example.model.CartItem>) cartItemList40, 0.0d, "2026-04-11 17:14:52");
        example.model.Address address48 = order47.getAddress();
        java.lang.String str49 = order47.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList50 = order47.getItems();
        java.util.List<example.model.CartItem> cartItemList51 = order47.getItems();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cartItemArray39);
        org.junit.Assert.assertArrayEquals(cartItemArray39, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(order47);
        org.junit.Assert.assertNotNull(address48);
// flaky "146) test1425(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "2026-04-11 17:16:12" + "'", str49, "2026-04-11 17:16:12");
        org.junit.Assert.assertNotNull(cartItemList50);
        org.junit.Assert.assertNotNull(cartItemList51);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        example.model.Product product10 = cartItem9.getProduct();
        example.model.CartItem cartItem12 = new example.model.CartItem(product10, (int) (byte) 100);
        example.model.Product product13 = cartItem12.getProduct();
        java.lang.Class<?> wildcardClass14 = product13.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertNotNull(product13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        cartItem6.setQuantity((int) 'a');
        java.lang.String str9 = cartItem6.toString();
        example.model.Product product10 = cartItem6.getProduct();
        example.model.Product product11 = cartItem6.getProduct();
        java.lang.String str12 = product11.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749    x97  = $97.00" + "'", str9, "ORD-1775916890749    x97  = $97.00");
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertNotNull(product11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916889515" + "'", str12, "ORD-1775916889515");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        example.model.Product product4 = new example.model.Product("ORD-1775916905596", "ORD-1775916894406", "ORD-1775916904664", (double) '#');
        example.service.CartService.addProduct(product4, (int) (short) 100);
        java.lang.String str7 = product4.toString();
        double double8 = product4.getPrice();
        java.lang.String str9 = product4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ORD-1775916905596] ORD-1775916894406    - $35.00  (ORD-1775916904664)" + "'", str7, "[ORD-1775916905596] ORD-1775916894406    - $35.00  (ORD-1775916904664)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916894406" + "'", str9, "ORD-1775916894406");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        java.lang.String str55 = address8.getStreet();
        java.lang.String str56 = address8.getCountry();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "ORD-1775916886212" + "'", str55, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "ORD-1775916886212" + "'", str56, "ORD-1775916886212");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        example.model.Address address5 = new example.model.Address("ORD-1775916920662", "ORD-1775916926466", "ORD-1775916930186", "ORD-1775916890749    x100  = $100.00", "ORD-1775916905284");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        java.util.List<example.model.CartItem> cartItemList35 = order33.getItems();
        double double36 = order33.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "147) test1431(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916972404" + "'", str29, "ORD-1775916972404");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916890225" + "'", str34, "ORD-1775916890225");
        org.junit.Assert.assertNotNull(cartItemList35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        example.model.Address address6 = new example.model.Address("ORD-1775916893477", "ORD-1775916893369", "ORD-1775916894406", "ORD-1775916890979", "ORD-1775916894811");
        java.lang.String str7 = address6.getStreet();
        example.model.Address address14 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str15 = address14.getStreet();
        java.lang.String str16 = address14.getCountry();
        example.model.Address address23 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address25 = null;
        example.model.CartItem[] cartItemArray26 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList27 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList27, cartItemArray26);
        example.model.Order order31 = new example.model.Order("", address25, (java.util.List<example.model.CartItem>) cartItemList27, 1.0d, "");
        example.model.Order order34 = new example.model.Order("2026-04-11 17:14:47", address23, (java.util.List<example.model.CartItem>) cartItemList27, (double) (-1.0f), "");
        example.model.Order order37 = example.service.OrderService.createOrder("ORD-1775916893211", address14, (java.util.List<example.model.CartItem>) cartItemList27, (double) (byte) -1, "ORD-1775916900332");
        java.util.List<example.model.CartItem> cartItemList38 = order37.getItems();
        example.service.OrderService.printReceipt(order37);
        java.util.List<example.model.CartItem> cartItemList40 = order37.getItems();
        example.model.Order order43 = example.service.OrderService.createOrder("ORD-1775916887557", address6, cartItemList40, 97.0d, "ORD-1775916915454");
        java.lang.String str44 = order43.getCreatedAt();
        java.lang.String str45 = order43.getOrderId();
        java.lang.String str46 = order43.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916893369" + "'", str7, "ORD-1775916893369");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916886212" + "'", str16, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray26);
        org.junit.Assert.assertArrayEquals(cartItemArray26, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(order37);
        org.junit.Assert.assertNotNull(cartItemList38);
        org.junit.Assert.assertNotNull(cartItemList40);
        org.junit.Assert.assertNotNull(order43);
// flaky "148) test1432(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "2026-04-11 17:16:12" + "'", str44, "2026-04-11 17:16:12");
// flaky "92) test1432(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916972492" + "'", str45, "ORD-1775916972492");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ORD-1775916887557" + "'", str46, "ORD-1775916887557");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getStreet();
        java.lang.String str21 = address19.getCity();
        example.model.Address address29 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address31 = null;
        example.model.CartItem[] cartItemArray32 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList33 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList33, cartItemArray32);
        example.model.Order order37 = new example.model.Order("", address31, (java.util.List<example.model.CartItem>) cartItemList33, 1.0d, "");
        example.model.Order order40 = new example.model.Order("2026-04-11 17:14:47", address29, (java.util.List<example.model.CartItem>) cartItemList33, (double) (-1.0f), "");
        example.model.Address address41 = order40.getAddress();
        example.model.Address address43 = null;
        example.model.Address address45 = null;
        example.model.CartItem[] cartItemArray46 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList47 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList47, cartItemArray46);
        example.model.Order order51 = new example.model.Order("", address45, (java.util.List<example.model.CartItem>) cartItemList47, 1.0d, "");
        example.model.Order order54 = new example.model.Order("ORD-1775916886212", address43, (java.util.List<example.model.CartItem>) cartItemList47, 1.0d, "ORD-1775916886040");
        example.model.Order order57 = new example.model.Order("ORD-1775916892053", address41, (java.util.List<example.model.CartItem>) cartItemList47, (double) 10, "ORD-1775916887494");
        example.model.Order order60 = example.service.OrderService.createOrder("ORD-1775916926920", address19, (java.util.List<example.model.CartItem>) cartItemList47, (double) (byte) -1, "ORD-1775916958584");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray32);
        org.junit.Assert.assertArrayEquals(cartItemArray32, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(address41);
        org.junit.Assert.assertNotNull(cartItemArray46);
        org.junit.Assert.assertArrayEquals(cartItemArray46, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(order60);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        example.model.Product product1 = example.service.ProductService.getProductById("[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        int int5 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
        java.lang.String str28 = address26.getCity();
        java.lang.String str29 = address26.getFullName();
        java.lang.String str30 = address26.getCity();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) 'a');
        java.lang.String str13 = cartItem12.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50  x97  = $-97.00" + "'", str13, "2026-04-11 17:14:50  x97  = $-97.00");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = cartItem9.toString();
        double double11 = cartItem9.getSubtotal();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:50  x100  = $-100.00" + "'", str10, "2026-04-11 17:14:50  x100  = $-100.00");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-100.0d) + "'", double11 == (-100.0d));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getOrderId();
        java.lang.String str11 = order7.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "149) test1439(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916972721" + "'", str8, "ORD-1775916972721");
        org.junit.Assert.assertNull(address9);
// flaky "93) test1439(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916972721" + "'", str10, "ORD-1775916972721");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(cartItemList12);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
// flaky "150) test1440(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916972742" + "'", str8, "ORD-1775916972742");
        org.junit.Assert.assertNull(address9);
// flaky "94) test1440(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:16:12" + "'", str10, "2026-04-11 17:16:12");
// flaky "42) test1440(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:12" + "'", str11, "2026-04-11 17:16:12");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916918928");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        example.service.CartService.addProduct(product4, (int) 'a');
        example.service.CartService.addProduct(product4, (int) (short) -1);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        example.model.Product product4 = new example.model.Product("ORD-1775916955446", "ORD-1775916930720", "ORD-1775916921496", (double) 1.0f);
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916921496" + "'", str5, "ORD-1775916921496");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        java.lang.String str18 = order13.getCreatedAt();
        example.service.OrderService.printReceipt(order13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PAID" + "'", str16, "PAID");
        org.junit.Assert.assertNotNull(address17);
// flaky "151) test1444(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2026-04-11 17:16:12" + "'", str18, "2026-04-11 17:16:12");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916911314");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
        double double32 = order30.getTotalAmount();
        java.lang.String str33 = order30.getCustomerEmail();
        java.lang.String str34 = order30.getCustomerEmail();
        java.lang.String str35 = order30.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(order14);
        org.junit.Assert.assertNotNull(cartItemArray19);
        org.junit.Assert.assertArrayEquals(cartItemArray19, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "152) test1446(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916972925" + "'", str31, "ORD-1775916972925");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916894079" + "'", str33, "ORD-1775916894079");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916894079" + "'", str34, "ORD-1775916894079");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916894079" + "'", str35, "ORD-1775916894079");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        example.model.Address address16 = order7.getAddress();
        java.lang.String str17 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "153) test1447(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916972958" + "'", str8, "ORD-1775916972958");
        org.junit.Assert.assertNull(address9);
// flaky "95) test1447(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:16:12" + "'", str10, "2026-04-11 17:16:12");
// flaky "43) test1447(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:12" + "'", str11, "2026-04-11 17:16:12");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertNull(address16);
// flaky "15) test1447(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ORD-1775916972958" + "'", str17, "ORD-1775916972958");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
        java.util.List<example.model.CartItem> cartItemList57 = order56.getItems();
        java.lang.Class<?> wildcardClass58 = order56.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(address27);
// flaky "154) test1448(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916886212" + "'", str36, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray42);
        org.junit.Assert.assertArrayEquals(cartItemArray42, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cartItemList57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
        java.lang.String str13 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "155) test1449(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916973025" + "'", str8, "ORD-1775916973025");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "96) test1449(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:16:13" + "'", str11, "2026-04-11 17:16:13");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
// flaky "44) test1449(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:16:13" + "'", str13, "2026-04-11 17:16:13");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        double double13 = order7.getTotalAmount();
        java.lang.String str14 = order7.getStatus();
        example.model.Address address15 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "156) test1450(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916973062" + "'", str8, "ORD-1775916973062");
// flaky "97) test1450(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916973062" + "'", str9, "ORD-1775916973062");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertNull(address15);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde ORD-1775916886212", "2026-04-11 17:14:50", "ORD-1775916889693", 1.0d);
        java.lang.String str5 = product4.getId();
        double double6 = product4.getPrice();
        java.lang.String str7 = product4.toString();
        java.lang.String str8 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str5, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
// flaky "157) test1451(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916886212] 2026-04-11 17:14:50  - $1.00  (ORD-1775916889693)" + "'", str7, "\ud83d\udcde ORD-1775916886212] 2026-04-11 17:14:50  - $1.00  (ORD-1775916889693)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-04-11 17:14:50" + "'", str8, "2026-04-11 17:14:50");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        example.model.Product product4 = new example.model.Product("ORD-1775916891335", "ORD-1775916893211", "ORD-1775916892121", (double) 100.0f);
        java.lang.String str5 = product4.getDescription();
        example.model.CartItem cartItem7 = new example.model.CartItem(product4, 10);
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 0);
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (byte) -1);
        example.model.Product product12 = cartItem11.getProduct();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916892121" + "'", str5, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(product12);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        java.lang.String str5 = product4.getName();
        example.model.CartItem cartItem7 = new example.model.CartItem(product4, 97);
        java.lang.String str8 = cartItem7.toString();
        example.model.Product product9 = cartItem7.getProduct();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!                  x97  = $3395.00" + "'", str8, "hi!                  x97  = $3395.00");
        org.junit.Assert.assertNotNull(product9);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getCountry();
        java.lang.String str9 = address5.getStreet();
        java.lang.String str10 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList11 = order7.getItems();
        java.lang.String str12 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "158) test1455(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916973210" + "'", str8, "ORD-1775916973210");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) 10);
        java.lang.String str7 = product4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)" + "'", str7, "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getOrderId();
        double double20 = order17.getTotalAmount();
        java.lang.String str21 = order17.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "159) test1457(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916973260" + "'", str19, "ORD-1775916973260");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str8 = address7.getStreet();
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = example.service.OrderService.createOrder("ORD-1775916887036", address7, (java.util.List<example.model.CartItem>) cartItemList10, (double) 10.0f, "ORD-1775916887166");
        example.model.Address address15 = order14.getAddress();
        java.lang.String str16 = order14.getOrderId();
        example.model.Address address17 = order14.getAddress();
        java.util.List<example.model.CartItem> cartItemList18 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order21 = example.service.OrderService.createOrder("2026-04-11 17:16:04", address17, cartItemList18, (double) (byte) 1, "2026-04-11 17:15:01");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because the return value of \"example.model.Order.getItems()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(order14);
        org.junit.Assert.assertNotNull(address15);
// flaky "160) test1458(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916973293" + "'", str16, "ORD-1775916973293");
        org.junit.Assert.assertNotNull(address17);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        example.model.Address address6 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str7 = address6.getFullName();
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        java.lang.String str16 = order15.getOrderId();
        java.util.List<example.model.CartItem> cartItemList17 = order15.getItems();
        double double18 = order15.getTotalAmount();
        java.lang.String str19 = order15.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList20 = order15.getItems();
        example.model.Order order23 = new example.model.Order("ORD-1775916903896", address6, cartItemList20, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str24 = address6.getCountry();
        java.lang.String str25 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916892121" + "'", str7, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky "161) test1459(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916973328" + "'", str16, "ORD-1775916973328");
        org.junit.Assert.assertNotNull(cartItemList17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2026-04-11 17:14:53" + "'", str24, "2026-04-11 17:14:53");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2026-04-11 17:14:53" + "'", str25, "2026-04-11 17:14:53");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("ORD-1775916886212", address8, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "ORD-1775916886040");
        example.model.Order order22 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) (short) 0, "ORD-1775916903429");
        java.util.List<example.model.CartItem> cartItemList23 = order22.getItems();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertNotNull(cartItemList23);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        example.model.Address address6 = new example.model.Address("ORD-1775916907784", "ORD-1775916887611", "ORD-1775916915800", "ORD-1775916886212", "ORD-1775916934258");
        example.model.Address address13 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str14 = address13.getFullName();
        example.model.Address address16 = null;
        example.model.CartItem[] cartItemArray17 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList18 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList18, cartItemArray17);
        example.model.Order order22 = new example.model.Order("", address16, (java.util.List<example.model.CartItem>) cartItemList18, 1.0d, "");
        java.lang.String str23 = order22.getOrderId();
        java.util.List<example.model.CartItem> cartItemList24 = order22.getItems();
        double double25 = order22.getTotalAmount();
        java.lang.String str26 = order22.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList27 = order22.getItems();
        example.model.Order order30 = new example.model.Order("ORD-1775916903896", address13, cartItemList27, (double) (byte) 0, "ORD-1775916888257");
        java.lang.String str31 = order30.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList32 = order30.getItems();
        example.model.Order order35 = new example.model.Order("ORD-1775916892121", address6, cartItemList32, (double) (byte) 0, "");
        java.lang.String str36 = order35.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916892121" + "'", str14, "ORD-1775916892121");
        org.junit.Assert.assertNotNull(cartItemArray17);
        org.junit.Assert.assertArrayEquals(cartItemArray17, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "162) test1462(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ORD-1775916973406" + "'", str23, "ORD-1775916973406");
        org.junit.Assert.assertNotNull(cartItemList24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(cartItemList27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916903896" + "'", str31, "ORD-1775916903896");
        org.junit.Assert.assertNotNull(cartItemList32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916892121" + "'", str36, "ORD-1775916892121");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        example.model.Address address5 = new example.model.Address("", "[ORD-1775916897371] ORD-1775916892568    - $10.00  (ORD-1775916893369)", "ORD-1775916948993", "ORD-1775916915941", "ORD-1775916917320");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        double double32 = order30.getTotalAmount();
        java.lang.String str33 = order30.getCustomerEmail();
        java.lang.String str34 = order30.getOrderId();
        java.lang.String str35 = order30.getOrderId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(order14);
        org.junit.Assert.assertNotNull(cartItemArray19);
        org.junit.Assert.assertArrayEquals(cartItemArray19, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "163) test1464(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916973469" + "'", str31, "ORD-1775916973469");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916894079" + "'", str33, "ORD-1775916894079");
// flaky "98) test1464(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916973469" + "'", str34, "ORD-1775916973469");
// flaky "45) test1464(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916973469" + "'", str35, "ORD-1775916973469");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        example.model.Address address11 = order7.getAddress();
        java.lang.String str12 = order7.getOrderId();
        java.lang.String str13 = order7.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "164) test1465(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916973505" + "'", str8, "ORD-1775916973505");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertNull(address11);
// flaky "99) test1465(RegressionTest2)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916973505" + "'", str12, "ORD-1775916973505");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getStreet();
        java.lang.String str8 = address5.getCountry();
        java.lang.String str9 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        example.model.Address address5 = new example.model.Address("", "2026-04-11 17:15:31", "ORD-1775916926920", "ORD-1775916953981", "ORD-1775916953512");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        example.model.Product product4 = new example.model.Product("PAID", "ORD-1775916912970", "", (double) (byte) -1);
        java.lang.String str5 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916912970" + "'", str5, "ORD-1775916912970");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:15:16", "ORD-1775916972721", "", "ORD-1775916898820", "ORD-1775916918747");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        java.lang.String str39 = order38.getCustomerEmail();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916895909" + "'", str39, "ORD-1775916895909");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.getId();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) '4');
        java.lang.String str13 = product4.getDescription();
        java.lang.String str14 = product4.getDescription();
        java.lang.String str15 = product4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:47" + "'", str13, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:14:47" + "'", str14, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916890749" + "'", str15, "ORD-1775916890749");
    }
}
