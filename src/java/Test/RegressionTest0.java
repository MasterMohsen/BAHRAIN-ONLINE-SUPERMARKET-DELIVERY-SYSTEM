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
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order7 = example.service.OrderService.createOrder("hi!", address1, (java.util.List<example.model.CartItem>) cartItemList3, (double) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        example.Config.StripeConfig stripeConfig0 = new example.Config.StripeConfig();
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        boolean boolean0 = example.service.CartService.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        example.service.OrderService orderService0 = new example.service.OrderService();
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double double0 = example.service.CartService.getTotal();
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        example.model.Product product0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.service.CartService.addProduct(product0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order7 = example.service.OrderService.createOrder("hi!", address1, (java.util.List<example.model.CartItem>) cartItemList3, (-1.0d), "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        example.service.ProductService productService0 = new example.service.ProductService();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order7 = example.service.OrderService.createOrder("ORD-1775916886040", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        example.service.ProductService.displayProducts();
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        example.service.AddressService addressService0 = new example.service.AddressService();
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.util.Scanner scanner0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.model.Address address1 = example.service.AddressService.collectAddress(scanner0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            example.Config.StripeConfig.init();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: STRIPE_SECRET_KEY environment variable not set!");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        example.service.CheckoutService checkoutService0 = new example.service.CheckoutService();
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916886687");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        example.service.CartService.clearCart();
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.Map<java.lang.String, example.model.Product> strMap0 = example.service.ProductService.getAllProducts();
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        example.service.CartService.removeProduct("ORD-1775916886687");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916887611");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        example.service.CartService.removeProduct("ORD-1775916887767");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
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
// flaky "1) test0021(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916888090" + "'", str8, "ORD-1775916888090");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "1) test0021(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916888090" + "'", str11, "ORD-1775916888090");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
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
// flaky "2) test0022(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916888741" + "'", str8, "ORD-1775916888741");
// flaky "2) test0022(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916888741" + "'", str9, "ORD-1775916888741");
        org.junit.Assert.assertNotNull(cartItemList10);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        example.service.CartService.removeProduct("ORD-1775916888257");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = product3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        example.service.CartService cartService0 = new example.service.CartService();
        java.lang.Class<?> wildcardClass1 = cartService0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        example.model.Product product1 = example.service.ProductService.getProductById("");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        example.service.CartService.removeProduct("ORD-1775916886040");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        int int5 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        example.service.CartService.removeProduct("ORD-1775916890665");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916890225");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        cartItem2.setQuantity((int) (short) 10);
        int int7 = cartItem2.getQuantity();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.Class<?> wildcardClass18 = order17.getClass();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        example.service.CartService.removeProduct("ORD-1775916891457");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:14:50");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
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
// flaky "3) test0036(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916892349" + "'", str8, "ORD-1775916892349");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "3) test0036(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:52" + "'", str11, "2026-04-11 17:14:52");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = address12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "4) test0037(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916892647" + "'", str8, "ORD-1775916892647");
        org.junit.Assert.assertNull(address9);
// flaky "4) test0037(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:52" + "'", str10, "2026-04-11 17:14:52");
// flaky "1) test0037(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:52" + "'", str11, "2026-04-11 17:14:52");
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double3 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
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
// flaky "5) test0040(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916893964" + "'", str8, "ORD-1775916893964");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "5) test0040(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:53" + "'", str11, "2026-04-11 17:14:53");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916893323");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:14:47");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        example.model.Address address11 = order7.getAddress();
        java.lang.Class<?> wildcardClass12 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "6) test0044(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916894521" + "'", str8, "ORD-1775916894521");
        org.junit.Assert.assertNull(address9);
// flaky "6) test0044(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:54" + "'", str10, "2026-04-11 17:14:54");
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916893477");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getStreet();
        java.lang.String str8 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        cartItem2.setQuantity((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double7 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        java.lang.Class<?> wildcardClass5 = cartItem2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getOrderId();
        java.lang.Class<?> wildcardClass11 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "7) test0050(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916895177" + "'", str8, "ORD-1775916895177");
        org.junit.Assert.assertNull(address9);
// flaky "7) test0050(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916895177" + "'", str10, "ORD-1775916895177");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        example.service.CartService.removeProduct("ORD-1775916894903");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        example.service.CartService.removeProduct("ORD-1775916891722");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        double double6 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        example.service.CartService.removeProduct("ORD-1775916886212");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
// flaky "8) test0055(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916896010" + "'", str8, "ORD-1775916896010");
        org.junit.Assert.assertNull(address9);
// flaky "8) test0055(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:56" + "'", str10, "2026-04-11 17:14:56");
// flaky "2) test0055(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:56" + "'", str11, "2026-04-11 17:14:56");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        example.model.Product product5 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = product5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:50" + "'", str10, "2026-04-11 17:14:50");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 1);
        example.model.Product product6 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916892904");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        example.model.Address address1 = null;
        example.model.Address address8 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str9 = address8.getPhone();
        java.lang.String str10 = address8.getFullName();
        java.lang.String str11 = address8.getPhone();
        java.lang.String str12 = address8.toString();
        example.model.Address address14 = null;
        example.model.Address address16 = null;
        example.model.CartItem[] cartItemArray17 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList18 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList18, cartItemArray17);
        example.model.Order order22 = new example.model.Order("", address16, (java.util.List<example.model.CartItem>) cartItemList18, 1.0d, "");
        example.model.Order order25 = new example.model.Order("ORD-1775916886212", address14, (java.util.List<example.model.CartItem>) cartItemList18, 1.0d, "ORD-1775916886040");
        example.model.Order order28 = example.service.OrderService.createOrder("ORD-1775916889159", address8, (java.util.List<example.model.CartItem>) cartItemList18, (double) 100L, "ORD-1775916887611");
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order31 = example.service.OrderService.createOrder("2026-04-11 17:14:55", address1, (java.util.List<example.model.CartItem>) cartItemList18, (double) 1.0f, "ORD-1775916894557");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
// flaky "9) test0061(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str12, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray17);
        org.junit.Assert.assertArrayEquals(cartItemArray17, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(order28);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        example.service.CartService.removeProduct("");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        example.service.CartService.removeProduct("ORD-1775916889159");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        int int3 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        example.service.CartService.removeProduct("ORD-1775916896079");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        example.service.CartService.removeProduct("ORD-1775916894557");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        double double35 = order33.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "10) test0067(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916897099" + "'", str29, "ORD-1775916897099");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916890225" + "'", str34, "ORD-1775916890225");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        int int3 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.lang.String str14 = order12.getOrderId();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
// flaky "11) test0069(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916897253" + "'", str14, "ORD-1775916897253");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        example.service.CartService.removeProduct("ORD-1775916893369");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
        java.util.List<example.model.CartItem> cartItemList14 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "12) test0071(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916897371" + "'", str8, "ORD-1775916897371");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "9) test0071(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:57" + "'", str11, "2026-04-11 17:14:57");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList14);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        example.model.Address address5 = new example.model.Address("ORD-1775916888578", "ORD-1775916891722", "hi!", "ORD-1775916886687", "ORD-1775916888151");
        java.lang.Class<?> wildcardClass6 = address5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:14:51");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        example.model.Product product5 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.lang.String str14 = order12.getOrderId();
        double double15 = order12.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
// flaky "13) test0075(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916897794" + "'", str14, "ORD-1775916897794");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        example.service.CartService.removeProduct("2026-04-11 17:14:52");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        example.service.CartService.removeProduct("ORD-1775916890979");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        example.model.Product product4 = new example.model.Product("ORD-1775916887557", "2026-04-11 17:14:57", "ORD-1775916892827", 100.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916895316");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        example.model.Product product1 = example.service.ProductService.getProductById("[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        example.model.Product product20 = null;
        example.model.CartItem cartItem22 = new example.model.CartItem(product20, (int) (short) 1);
        example.model.Product product23 = cartItem22.getProduct();
        example.model.CartItem[] cartItemArray24 = new example.model.CartItem[] { cartItem22 };
        java.util.ArrayList<example.model.CartItem> cartItemList25 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList25, cartItemArray24);
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order29 = example.service.OrderService.createOrder("ORD-1775916886212", address19, (java.util.List<example.model.CartItem>) cartItemList25, (double) (byte) 10, "2026-04-11 17:14:54");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNull(product23);
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        java.util.List<example.model.CartItem> cartItemList14 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "14) test0082(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916898639" + "'", str8, "ORD-1775916898639");
        org.junit.Assert.assertNull(address9);
// flaky "10) test0082(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:58" + "'", str10, "2026-04-11 17:14:58");
// flaky "3) test0082(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:58" + "'", str11, "2026-04-11 17:14:58");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList14);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916887934");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        example.model.Address address5 = new example.model.Address("ORD-1775916887934", "ORD-1775916893369", "2026-04-11 17:14:52", "2026-04-11 17:14:54", "2026-04-11 17:14:54");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getOrderId();
        java.lang.Class<?> wildcardClass20 = order17.getClass();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "15) test0086(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916899079" + "'", str19, "ORD-1775916899079");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        example.service.CartService.removeProduct("ORD-1775916890225");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        java.lang.String str8 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916890749" + "'", str8, "ORD-1775916890749");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916895964");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.Class<?> wildcardClass10 = product4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        java.lang.String str72 = address6.getFullName();
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
        java.lang.String str56 = address9.getFullName();
        example.model.Address address63 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str64 = address63.getCountry();
        java.lang.String str65 = address63.getStreet();
        example.model.Address address67 = null;
        example.model.CartItem[] cartItemArray68 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList69 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList69, cartItemArray68);
        example.model.Order order73 = new example.model.Order("", address67, (java.util.List<example.model.CartItem>) cartItemList69, 1.0d, "");
        example.model.Order order76 = example.service.OrderService.createOrder("ORD-1775916888151", address63, (java.util.List<example.model.CartItem>) cartItemList69, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order79 = new example.model.Order("ORD-1775916891414", address9, (java.util.List<example.model.CartItem>) cartItemList69, (double) '#', "ORD-1775916896761");
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "ORD-1775916886212" + "'", str64, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ORD-1775916886212" + "'", str65, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray68);
        org.junit.Assert.assertArrayEquals(cartItemArray68, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(order76);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:51", "", "ORD-1775916890142", (double) 100L);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.toString();
        java.lang.String str7 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916890142" + "'", str5, "ORD-1775916890142");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)" + "'", str6, "[2026-04-11 17:14:51]                      - $100.00  (ORD-1775916890142)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890142" + "'", str7, "ORD-1775916890142");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        java.lang.String str11 = order7.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
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
// flaky "16) test0094(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916900193" + "'", str8, "ORD-1775916900193");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(cartItemList12);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:50" + "'", str7, "2026-04-11 17:14:50");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        example.service.CartService.removeProduct("ORD-1775916891135");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        example.model.Address address13 = order12.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(address13);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        example.service.CartService.removeProduct("ORD-1775916897099");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
// flaky "17) test0099(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str7, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        example.model.Address address56 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address58 = null;
        example.model.CartItem[] cartItemArray59 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList60 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList60, cartItemArray59);
        example.model.Order order64 = new example.model.Order("", address58, (java.util.List<example.model.CartItem>) cartItemList60, 1.0d, "");
        example.model.Order order67 = new example.model.Order("2026-04-11 17:14:47", address56, (java.util.List<example.model.CartItem>) cartItemList60, (double) (-1.0f), "");
        example.model.Address address68 = order67.getAddress();
        java.lang.String str69 = address68.getStreet();
        example.model.Address address71 = null;
        example.model.CartItem[] cartItemArray72 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList73 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList73, cartItemArray72);
        example.model.Order order77 = new example.model.Order("", address71, (java.util.List<example.model.CartItem>) cartItemList73, 1.0d, "");
        java.lang.String str78 = order77.getOrderId();
        java.util.List<example.model.CartItem> cartItemList79 = order77.getItems();
        example.model.Order order82 = new example.model.Order("ORD-1775916890225", address68, cartItemList79, (double) (byte) -1, "");
        example.model.Order order85 = new example.model.Order("", address8, cartItemList79, (double) 0L, "ORD-1775916887494");
        java.lang.Class<?> wildcardClass86 = order85.getClass();
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
// flaky "18) test0100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916901033" + "'", str43, "ORD-1775916901033");
// flaky "11) test0100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916901033" + "'", str44, "ORD-1775916901033");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertNotNull(cartItemArray59);
        org.junit.Assert.assertArrayEquals(cartItemArray59, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(address68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ORD-1775916886212" + "'", str69, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray72);
        org.junit.Assert.assertArrayEquals(cartItemArray72, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky "4) test0100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ORD-1775916901034" + "'", str78, "ORD-1775916901034");
        org.junit.Assert.assertNotNull(cartItemList79);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        example.model.Product product5 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916896888");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        example.service.CartService.removeProduct("ORD-1775916901311");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        example.model.Product product4 = new example.model.Product("ORD-1775916890142", "ORD-1775916894327", "ORD-1775916892121", (double) 0.0f);
        example.service.CartService.addProduct(product4, (int) '4');
        java.lang.String str7 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890142" + "'", str7, "ORD-1775916890142");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getCountry();
        java.lang.String str7 = address5.getStreet();
        java.lang.Class<?> wildcardClass8 = address5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        example.model.Address address5 = new example.model.Address("ORD-1775916901034", "ORD-1775916900618", "ORD-1775916887036", "ORD-1775916894246", "ORD-1775916899981");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.String str99 = order97.getPaymentIntentId();
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
// flaky "19) test0107(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916902070" + "'", str44, "ORD-1775916902070");
// flaky "12) test0107(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916902070" + "'", str45, "ORD-1775916902070");
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
// flaky "5) test0107(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916902074" + "'", str79, "ORD-1775916902074");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(address98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "ORD-1775916895316" + "'", str99, "ORD-1775916895316");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
// flaky "20) test0108(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str8, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) '4');
        int int3 = cartItem2.getQuantity();
        int int4 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getDescription();
        double double10 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        example.service.CartService.addProduct(product4, 97);
        java.lang.String str9 = product4.getDescription();
        java.lang.Class<?> wildcardClass10 = product4.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:47" + "'", str9, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        example.model.Product product0 = null;
        // The following exception was thrown during execution in test generation
        try {
            example.service.CartService.addProduct(product0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getId()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        example.service.CartService.addProduct(product4, 1);
        java.lang.Class<?> wildcardClass9 = product4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916888257" + "'", str6, "ORD-1775916888257");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getPhone();
        java.lang.String str10 = address5.getCity();
        java.lang.String str11 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916890979");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.lang.String str27 = order25.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916894811" + "'", str26, "ORD-1775916894811");
// flaky "21) test0117(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2026-04-11 17:15:02" + "'", str27, "2026-04-11 17:15:02");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getOrderId();
        double double11 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "22) test0118(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916902964" + "'", str8, "ORD-1775916902964");
        org.junit.Assert.assertNull(address9);
// flaky "13) test0118(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916902964" + "'", str10, "ORD-1775916902964");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
// flaky "23) test0119(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916902997" + "'", str8, "ORD-1775916902997");
        org.junit.Assert.assertNull(address9);
// flaky "14) test0119(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:02" + "'", str10, "2026-04-11 17:15:02");
// flaky "6) test0119(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:02" + "'", str11, "2026-04-11 17:15:02");
        org.junit.Assert.assertNull(address12);
// flaky "1) test0119(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:02" + "'", str13, "2026-04-11 17:15:02");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        java.lang.Class<?> wildcardClass48 = address20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        java.lang.String str5 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)" + "'", str5, "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 1);
        example.model.Product product6 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        java.lang.String str11 = order7.getCreatedAt();
        double double12 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "24) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916903299" + "'", str8, "ORD-1775916903299");
        org.junit.Assert.assertNull(address9);
// flaky "15) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:03" + "'", str10, "2026-04-11 17:15:03");
// flaky "7) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:03" + "'", str11, "2026-04-11 17:15:03");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        double double11 = order7.getTotalAmount();
        java.lang.String str12 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "25) test0126(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916903429" + "'", str8, "ORD-1775916903429");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
        java.lang.String str63 = address6.getCity();
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
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        example.model.Product product4 = new example.model.Product("", "ORD-1775916890749", "ORD-1775916896717", (double) (byte) 1);
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916896717" + "'", str5, "ORD-1775916896717");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde PAID", "ORD-1775916886687", "\ud83d\udcde PAID", (-1.0d));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        cartItem2.setQuantity((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:15:02");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        java.lang.String str15 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "26) test0132(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916903830" + "'", str8, "ORD-1775916903830");
// flaky "16) test0132(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916903830" + "'", str9, "ORD-1775916903830");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(address13);
// flaky "8) test0132(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916903830" + "'", str14, "ORD-1775916903830");
// flaky "2) test0132(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916903830" + "'", str15, "ORD-1775916903830");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        java.lang.String str14 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "27) test0133(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916903979" + "'", str8, "ORD-1775916903979");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "17) test0133(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:03" + "'", str11, "2026-04-11 17:15:03");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
// flaky "9) test0133(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:03" + "'", str14, "2026-04-11 17:15:03");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        java.lang.Class<?> wildcardClass36 = order35.getClass();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
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
// flaky "28) test0135(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916904214" + "'", str8, "ORD-1775916904214");
        org.junit.Assert.assertNull(address9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        java.lang.String str37 = address19.getCity();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916886212" + "'", str36, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916888257" + "'", str9, "ORD-1775916888257");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        java.lang.String str13 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "29) test0138(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916904499" + "'", str8, "ORD-1775916904499");
        org.junit.Assert.assertNull(address9);
// flaky "18) test0138(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:04" + "'", str10, "2026-04-11 17:15:04");
// flaky "10) test0138(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:04" + "'", str11, "2026-04-11 17:15:04");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        example.service.CartService.removeProduct("ORD-1775916895909");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
// flaky "30) test0140(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916904574" + "'", str8, "ORD-1775916904574");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "19) test0140(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:04" + "'", str11, "2026-04-11 17:15:04");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        example.model.Product product5 = cartItem2.getProduct();
        example.model.Product product6 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product5);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        example.model.Address address5 = new example.model.Address("ORD-1775916887611", "ORD-1775916887828", "ORD-1775916902814", "ORD-1775916902814", "");
        java.lang.String str6 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916887611" + "'", str6, "ORD-1775916887611");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        example.model.Product product4 = new example.model.Product("ORD-1775916891335", "ORD-1775916893211", "ORD-1775916892121", (double) 100.0f);
        java.lang.String str5 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916891335] ORD-1775916893211    - $100.00  (ORD-1775916892121)" + "'", str5, "[ORD-1775916891335] ORD-1775916893211    - $100.00  (ORD-1775916892121)");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        java.util.List<example.model.CartItem> cartItemList15 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "31) test0146(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916905284" + "'", str8, "ORD-1775916905284");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "20) test0146(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:05" + "'", str11, "2026-04-11 17:15:05");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNotNull(cartItemList15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916903299");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) '#');
        double double13 = cartItem12.getSubtotal();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-35.0d) + "'", double13 == (-35.0d));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        example.service.CartService.removeProduct("ORD-1775916899079");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        example.model.Address address1 = null;
        java.util.List<example.model.CartItem> cartItemList2 = example.service.CartService.getCart();
        // The following exception was thrown during execution in test generation
        try {
            example.model.Order order5 = example.service.OrderService.createOrder("2026-04-11 17:14:56", address1, cartItemList2, (double) 10.0f, "ORD-1775916904159");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Address.getFullName()\" because the return value of \"example.model.Order.getAddress()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cartItemList2);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        java.lang.Class<?> wildcardClass55 = address8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        example.model.Product product4 = new example.model.Product("ORD-1775916897371", "ORD-1775916892568", "ORD-1775916893369", (double) 10);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916897371" + "'", str6, "ORD-1775916897371");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.getName();
        java.lang.String str9 = product4.toString();
        java.lang.String str10 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-04-11 17:14:50" + "'", str8, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str9, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        double double14 = order12.getTotalAmount();
        java.lang.String str15 = order12.getOrderId();
        java.lang.String str16 = order12.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
// flaky "32) test0155(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916906412" + "'", str15, "ORD-1775916906412");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PAID" + "'", str16, "PAID");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        double double9 = cartItem8.getSubtotal();
        cartItem8.setQuantity((int) '#');
        java.lang.String str12 = cartItem8.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916890749    x35  = $35.00" + "'", str12, "ORD-1775916890749    x35  = $35.00");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        java.lang.String str33 = order30.getPaymentIntentId();
        example.service.OrderService.printReceipt(order30);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PAID" + "'", str31, "PAID");
// flaky "33) test0157(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916906710" + "'", str32, "ORD-1775916906710");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916892828" + "'", str33, "ORD-1775916892828");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
        java.lang.String str32 = order30.getCustomerEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PAID" + "'", str31, "PAID");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916894327" + "'", str32, "ORD-1775916894327");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
// flaky "34) test0159(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916906944" + "'", str8, "ORD-1775916906944");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "21) test0159(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:06" + "'", str11, "2026-04-11 17:15:06");
        org.junit.Assert.assertNotNull(cartItemList12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        java.lang.String str35 = order33.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "35) test0160(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916906984" + "'", str29, "ORD-1775916906984");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(address34);
// flaky "22) test0160(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916906984" + "'", str35, "ORD-1775916906984");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        double double10 = order7.getTotalAmount();
        java.lang.String str11 = order7.getStatus();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        java.lang.String str13 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "36) test0161(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916907024" + "'", str8, "ORD-1775916907024");
// flaky "23) test0161(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916907024" + "'", str9, "ORD-1775916907024");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertNotNull(cartItemList12);
// flaky "11) test0161(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916907024" + "'", str13, "ORD-1775916907024");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        example.model.Product product4 = new example.model.Product("ORD-1775916906826", "ORD-1775916894521", "ORD-1775916895446", (double) 0);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        example.model.Product product4 = new example.model.Product("ORD-1775916890225", "ORD-1775916907024", "ORD-1775916903429", (double) 1.0f);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        example.model.Address address35 = null;
        example.model.CartItem[] cartItemArray36 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList37 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList37, cartItemArray36);
        example.model.Order order41 = new example.model.Order("", address35, (java.util.List<example.model.CartItem>) cartItemList37, 1.0d, "");
        java.lang.String str42 = order41.getOrderId();
        java.lang.String str43 = order41.getOrderId();
        java.util.List<example.model.CartItem> cartItemList44 = order41.getItems();
        example.model.Order order47 = example.service.OrderService.createOrder("ORD-1775916891135", address7, cartItemList44, (double) 0L, "ORD-1775916886040");
        double double48 = order47.getTotalAmount();
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
        org.junit.Assert.assertNotNull(cartItemArray36);
        org.junit.Assert.assertArrayEquals(cartItemArray36, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "37) test0164(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ORD-1775916907604" + "'", str42, "ORD-1775916907604");
// flaky "24) test0164(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916907604" + "'", str43, "ORD-1775916907604");
        org.junit.Assert.assertNotNull(cartItemList44);
        org.junit.Assert.assertNotNull(order47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        double double11 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "38) test0165(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916907784" + "'", str8, "ORD-1775916907784");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        int int10 = cartItem9.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getId();
        java.lang.String str11 = product4.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916888257" + "'", str11, "ORD-1775916888257");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        example.model.Address address5 = new example.model.Address("ORD-1775916892121", "ORD-1775916891938", "ORD-1775916894246", "2026-04-11 17:14:53", "");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916894246" + "'", str7, "ORD-1775916894246");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        example.model.Product product4 = new example.model.Product("ORD-1775916889693", "ORD-1775916903896", "ORD-1775916889515", (double) (short) -1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = product4.getPrice();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) '#');
        java.lang.String str13 = cartItem12.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50  x35  = $-35.00" + "'", str13, "2026-04-11 17:14:50  x35  = $-35.00");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity(97);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        example.model.Address address5 = new example.model.Address("ORD-1775916892121", "ORD-1775916906984", "ORD-1775916898459", "ORD-1775916893211", "ORD-1775916906984");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        example.service.CartService.addProduct(product4, 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.util.List<example.model.CartItem> cartItemList14 = order13.getItems();
        java.lang.Class<?> wildcardClass15 = order13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertNotNull(cartItemList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        example.model.Product product1 = example.service.ProductService.getProductById("hi!");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916905829");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) -1);
        int int7 = cartItem2.getQuantity();
        cartItem2.setQuantity(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        example.service.CartService.removeProduct("ORD-1775916894811");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        example.service.CartService.removeProduct("2026-04-11 17:15:07");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getCreatedAt();
        example.model.Address address14 = order12.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "39) test0181(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:09" + "'", str13, "2026-04-11 17:15:09");
        org.junit.Assert.assertNull(address14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        java.lang.Class<?> wildcardClass12 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "40) test0182(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916909184" + "'", str8, "ORD-1775916909184");
// flaky "25) test0182(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916909184" + "'", str9, "ORD-1775916909184");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        java.lang.String str14 = order7.getOrderId();
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
// flaky "41) test0184(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916910060" + "'", str8, "ORD-1775916910060");
// flaky "26) test0184(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916910060" + "'", str9, "ORD-1775916910060");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
// flaky "12) test0184(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916910060" + "'", str14, "ORD-1775916910060");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address13 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str14 = address13.getStreet();
        example.model.CartItem[] cartItemArray15 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList16 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList16, cartItemArray15);
        example.model.Order order20 = example.service.OrderService.createOrder("ORD-1775916887036", address13, (java.util.List<example.model.CartItem>) cartItemList16, (double) 10.0f, "ORD-1775916887166");
        example.model.Order order23 = new example.model.Order("2026-04-11 17:14:48", address6, (java.util.List<example.model.CartItem>) cartItemList16, 0.0d, "ORD-1775916900332");
        java.lang.String str24 = order23.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886212" + "'", str14, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ORD-1775916900332" + "'", str24, "ORD-1775916900332");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        example.service.CartService.removeProduct("ORD-1775916902074");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.String str21 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        example.model.Product product5 = cartItem2.getProduct();
        cartItem2.setQuantity(10);
        cartItem2.setQuantity(97);
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getPhone();
        java.lang.String str10 = address6.getFullName();
        example.model.Address address12 = null;
        example.model.CartItem[] cartItemArray13 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList14 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList14, cartItemArray13);
        example.model.Order order18 = new example.model.Order("", address12, (java.util.List<example.model.CartItem>) cartItemList14, 1.0d, "");
        java.lang.String str19 = order18.getOrderId();
        java.util.List<example.model.CartItem> cartItemList20 = order18.getItems();
        example.model.Address address21 = order18.getAddress();
        java.lang.String str22 = order18.getOrderId();
        java.util.List<example.model.CartItem> cartItemList23 = order18.getItems();
        example.model.Order order26 = example.service.OrderService.createOrder("ORD-1775916906901", address6, cartItemList23, (double) '4', "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "42) test0189(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916910414" + "'", str19, "ORD-1775916910414");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertNull(address21);
// flaky "27) test0189(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916910414" + "'", str22, "ORD-1775916910414");
        org.junit.Assert.assertNotNull(cartItemList23);
        org.junit.Assert.assertNotNull(order26);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        example.model.Product product4 = new example.model.Product("ORD-1775916891335", "ORD-1775916893211", "ORD-1775916892121", (double) 100.0f);
        double double5 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        java.lang.String str98 = order97.getCreatedAt();
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
// flaky "43) test0191(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916910496" + "'", str44, "ORD-1775916910496");
// flaky "28) test0191(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916910496" + "'", str45, "ORD-1775916910496");
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
// flaky "13) test0191(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916910496" + "'", str79, "ORD-1775916910496");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
// flaky "3) test0191(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str98 + "' != '" + "2026-04-11 17:15:10" + "'", str98, "2026-04-11 17:15:10");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getFullName();
        java.lang.String str10 = address5.toString();
        java.lang.String str11 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky "44) test0192(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        example.model.Address address5 = new example.model.Address("ORD-1775916906473", "ORD-1775916897371", "ORD-1775916888578", "ORD-1775916898989", "2026-04-11 17:15:03");
        java.lang.Class<?> wildcardClass6 = address5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) -1);
        example.model.Product product7 = cartItem2.getProduct();
        int int8 = cartItem2.getQuantity();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        cartItem9.setQuantity((int) '#');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        java.lang.String str14 = order7.getCreatedAt();
        java.lang.String str15 = order7.getPaymentIntentId();
        java.lang.String str16 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "45) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916911090" + "'", str8, "ORD-1775916911090");
        org.junit.Assert.assertNull(address9);
// flaky "29) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:11" + "'", str10, "2026-04-11 17:15:11");
// flaky "14) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:11" + "'", str11, "2026-04-11 17:15:11");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
// flaky "4) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:11" + "'", str14, "2026-04-11 17:15:11");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        cartItem2.setQuantity(100);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        example.model.Address address56 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address58 = null;
        example.model.CartItem[] cartItemArray59 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList60 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList60, cartItemArray59);
        example.model.Order order64 = new example.model.Order("", address58, (java.util.List<example.model.CartItem>) cartItemList60, 1.0d, "");
        example.model.Order order67 = new example.model.Order("2026-04-11 17:14:47", address56, (java.util.List<example.model.CartItem>) cartItemList60, (double) (-1.0f), "");
        example.model.Address address68 = order67.getAddress();
        java.lang.String str69 = address68.getStreet();
        example.model.Address address71 = null;
        example.model.CartItem[] cartItemArray72 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList73 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList73, cartItemArray72);
        example.model.Order order77 = new example.model.Order("", address71, (java.util.List<example.model.CartItem>) cartItemList73, 1.0d, "");
        java.lang.String str78 = order77.getOrderId();
        java.util.List<example.model.CartItem> cartItemList79 = order77.getItems();
        example.model.Order order82 = new example.model.Order("ORD-1775916890225", address68, cartItemList79, (double) (byte) -1, "");
        example.model.Order order85 = new example.model.Order("", address8, cartItemList79, (double) 0L, "ORD-1775916887494");
        java.lang.String str86 = address8.getCity();
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
// flaky "46) test0199(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916911314" + "'", str43, "ORD-1775916911314");
// flaky "30) test0199(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916911314" + "'", str44, "ORD-1775916911314");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertNotNull(cartItemArray59);
        org.junit.Assert.assertArrayEquals(cartItemArray59, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(address68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ORD-1775916886212" + "'", str69, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray72);
        org.junit.Assert.assertArrayEquals(cartItemArray72, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky "15) test0199(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ORD-1775916911314" + "'", str78, "ORD-1775916911314");
        org.junit.Assert.assertNotNull(cartItemList79);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        example.model.Product product11 = cartItem2.getProduct();
        example.model.Product product12 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product11);
        org.junit.Assert.assertNull(product12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        java.lang.String str27 = address6.getCity();
        java.lang.String str28 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
// flaky "47) test0201(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str28, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        java.lang.String str14 = order7.getCreatedAt();
        java.lang.String str15 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "48) test0202(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916911624" + "'", str8, "ORD-1775916911624");
        org.junit.Assert.assertNull(address9);
// flaky "31) test0202(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:11" + "'", str10, "2026-04-11 17:15:11");
// flaky "16) test0202(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:11" + "'", str11, "2026-04-11 17:15:11");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
// flaky "5) test0202(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:11" + "'", str14, "2026-04-11 17:15:11");
// flaky "1) test0202(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:15:11" + "'", str15, "2026-04-11 17:15:11");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        example.service.CartService.removeProduct("2026-04-11 17:15:10");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("ORD-1775916886212", address8, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "ORD-1775916886040");
        example.model.Order order22 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) (short) 0, "ORD-1775916903429");
        java.lang.String str23 = order22.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)" + "'", str23, "[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        java.lang.Class<?> wildcardClass76 = address7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        java.lang.String str31 = address7.getPhone();
        java.lang.String str32 = address7.toString();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
// flaky "49) test0206(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str32, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        java.lang.String str11 = order7.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        java.lang.String str13 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "50) test0208(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916912361" + "'", str8, "ORD-1775916912361");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(cartItemList12);
// flaky "32) test0208(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:12" + "'", str13, "2026-04-11 17:15:12");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916895177", "2026-04-11 17:14:53", "ORD-1775916889159", "ORD-1775916894903");
        java.lang.Class<?> wildcardClass6 = address5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 1);
        example.model.Product product6 = cartItem2.getProduct();
        int int7 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        java.lang.Class<?> wildcardClass14 = cartItemList13.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "51) test0211(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916912778" + "'", str8, "ORD-1775916912778");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "33) test0211(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:12" + "'", str11, "2026-04-11 17:15:12");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        example.model.Product product4 = new example.model.Product("ORD-1775916888578", "2026-04-11 17:14:55", "ORD-1775916891772", 35.0d);
        java.lang.String str5 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:55" + "'", str5, "2026-04-11 17:14:55");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.String str14 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "52) test0213(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916912855" + "'", str8, "ORD-1775916912855");
// flaky "34) test0213(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916912855" + "'", str9, "ORD-1775916912855");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        example.model.Address address56 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address58 = null;
        example.model.CartItem[] cartItemArray59 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList60 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList60, cartItemArray59);
        example.model.Order order64 = new example.model.Order("", address58, (java.util.List<example.model.CartItem>) cartItemList60, 1.0d, "");
        example.model.Order order67 = new example.model.Order("2026-04-11 17:14:47", address56, (java.util.List<example.model.CartItem>) cartItemList60, (double) (-1.0f), "");
        example.model.Address address68 = order67.getAddress();
        java.lang.String str69 = address68.getStreet();
        example.model.Address address71 = null;
        example.model.CartItem[] cartItemArray72 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList73 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList73, cartItemArray72);
        example.model.Order order77 = new example.model.Order("", address71, (java.util.List<example.model.CartItem>) cartItemList73, 1.0d, "");
        java.lang.String str78 = order77.getOrderId();
        java.util.List<example.model.CartItem> cartItemList79 = order77.getItems();
        example.model.Order order82 = new example.model.Order("ORD-1775916890225", address68, cartItemList79, (double) (byte) -1, "");
        example.model.Order order85 = new example.model.Order("", address8, cartItemList79, (double) 0L, "ORD-1775916887494");
        java.lang.String str86 = address8.getFullName();
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
// flaky "53) test0214(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916912970" + "'", str43, "ORD-1775916912970");
// flaky "35) test0214(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916912970" + "'", str44, "ORD-1775916912970");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertNotNull(cartItemArray59);
        org.junit.Assert.assertArrayEquals(cartItemArray59, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(address68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ORD-1775916886212" + "'", str69, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray72);
        org.junit.Assert.assertArrayEquals(cartItemArray72, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky "17) test0214(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ORD-1775916912970" + "'", str78, "ORD-1775916912970");
        org.junit.Assert.assertNotNull(cartItemList79);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916896717");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getFullName();
        java.lang.String str10 = address5.getFullName();
        java.lang.String str11 = address5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "54) test0216(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str11, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        example.model.Address address5 = new example.model.Address("ORD-1775916887611", "ORD-1775916887828", "ORD-1775916902814", "ORD-1775916902814", "");
        java.lang.Class<?> wildcardClass6 = address5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) (byte) 1);
        java.lang.String str13 = cartItem12.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:50  x1  = $-1.00" + "'", str13, "2026-04-11 17:14:50  x1  = $-1.00");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.String str40 = address39.getPhone();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ORD-1775916886212" + "'", str40, "ORD-1775916886212");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) '4');
        int int3 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.toString();
        java.lang.String str11 = product4.getId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916888257" + "'", str11, "ORD-1775916888257");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        double double5 = product4.getPrice();
        java.lang.Class<?> wildcardClass6 = product4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getName();
        double double10 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916888257" + "'", str8, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.lang.String str27 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        example.service.CartService.removeProduct("ORD-1775916907064");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        java.lang.String str11 = product4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str11, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        double double13 = product4.getPrice();
        java.lang.String str14 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        example.model.Product product4 = new example.model.Product("ORD-1775916892904", "ORD-1775916905654", "2026-04-11 17:14:53", (double) 1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getId();
        java.lang.String str11 = product4.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:50" + "'", str11, "2026-04-11 17:14:50");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        example.model.Product product4 = new example.model.Product("ORD-1775916890749    x97  = $97.00", "ORD-1775916894668", "ORD-1775916909947", (-1.0d));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        example.model.Product product10 = cartItem9.getProduct();
        java.lang.String str11 = product10.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str11, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        example.model.Product product4 = new example.model.Product("\ud83d\udcde ORD-1775916886212", "2026-04-11 17:14:50", "ORD-1775916889693", 1.0d);
        java.lang.String str5 = product4.getName();
        java.lang.String str6 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:50" + "'", str5, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str6, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        java.lang.String str27 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
// flaky "55) test0234(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str27, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.lang.Class<?> wildcardClass21 = order19.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
// flaky "56) test0235(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916914723" + "'", str20, "ORD-1775916914723");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        example.service.CartService.addProduct(product4, 52);
        java.lang.String str9 = product4.getId();
        java.lang.String str10 = product4.toString();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 100);
        java.lang.String str13 = product4.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916889515" + "'", str9, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str13, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        example.model.Product product4 = new example.model.Product("", "ORD-1775916897292", "ORD-1775916893211", (double) '#');
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)" + "'", str5, "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916897292" + "'", str6, "ORD-1775916897292");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)" + "'", str7, "[] ORD-1775916897292    - $35.00  (ORD-1775916893211)");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:48", "ORD-1775916901376", "ORD-1775916894079", (double) 1.0f);
        java.lang.String str5 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916901376" + "'", str5, "ORD-1775916901376");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        double double13 = product4.getPrice();
        java.lang.String str14 = product4.getId();
        java.lang.String str15 = product4.getId();
        java.lang.String str16 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916888257" + "'", str15, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str16, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.String str28 = order25.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertNotNull(cartItemList27);
// flaky "57) test0240(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2026-04-11 17:15:15" + "'", str28, "2026-04-11 17:15:15");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        example.model.Address address5 = new example.model.Address("ORD-1775916903896", "ORD-1775916895177", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916887228", "ORD-1775916897794");
        java.lang.String str6 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916903896" + "'", str6, "ORD-1775916903896");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        example.model.Product product4 = new example.model.Product("", "ORD-1775916897292", "ORD-1775916893211", (double) '#');
        java.lang.String str5 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 10);
        double double7 = cartItem6.getSubtotal();
        java.lang.String str8 = cartItem6.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 350.0d + "'", double7 == 350.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!                  x10  = $350.00" + "'", str8, "hi!                  x10  = $350.00");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        example.service.CartService.removeProduct("2026-04-11 17:14:47");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        double double13 = product4.getPrice();
        java.lang.String str14 = product4.getId();
        java.lang.String str15 = product4.getId();
        java.lang.Class<?> wildcardClass16 = product4.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916888257" + "'", str14, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916888257" + "'", str15, "ORD-1775916888257");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        double double14 = order7.getTotalAmount();
        double double15 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "58) test0246(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916916131" + "'", str8, "ORD-1775916916131");
// flaky "36) test0246(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916916131" + "'", str9, "ORD-1775916916131");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "18) test0246(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:16" + "'", str13, "2026-04-11 17:15:16");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        example.service.CartService.removeProduct("ORD-1775916887494");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.String str30 = address6.getCity();
        java.lang.String str31 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        java.lang.String str10 = product4.getId();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 100);
        example.model.Product product9 = cartItem8.getProduct();
        double double10 = product9.getPrice();
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        java.util.List<example.model.CartItem> cartItemList31 = order30.getItems();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(order14);
        org.junit.Assert.assertNotNull(cartItemArray19);
        org.junit.Assert.assertArrayEquals(cartItemArray19, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cartItemList31);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916898820");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        java.lang.String str11 = order7.getCreatedAt();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "59) test0253(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916916553" + "'", str8, "ORD-1775916916553");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "37) test0253(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:16" + "'", str11, "2026-04-11 17:15:16");
        org.junit.Assert.assertNotNull(cartItemList12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        example.model.Product product4 = new example.model.Product("ORD-1775916888578", "2026-04-11 17:14:55", "ORD-1775916891772", 35.0d);
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)" + "'", str5, "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916888578" + "'", str6, "ORD-1775916888578");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getOrderId();
        example.model.Address address20 = order17.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "60) test0255(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916917032" + "'", str19, "ORD-1775916917032");
        org.junit.Assert.assertNotNull(address20);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        java.lang.String str11 = product4.getName();
        java.lang.String str12 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:50" + "'", str11, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str12, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        example.model.Product product11 = cartItem2.getProduct();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product11);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "61) test0258(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916917643" + "'", str8, "ORD-1775916917643");
// flaky "38) test0258(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916917643" + "'", str9, "ORD-1775916917643");
        org.junit.Assert.assertNotNull(cartItemList10);
// flaky "19) test0258(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:17" + "'", str11, "2026-04-11 17:15:17");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) 0);
        java.lang.String str11 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:52", "ORD-1775916897292", "ORD-1775916894246", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916894246" + "'", str5, "ORD-1775916894246");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916894246" + "'", str6, "ORD-1775916894246");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.lang.Class<?> wildcardClass23 = order22.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "62) test0261(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916918123" + "'", str18, "ORD-1775916918123");
        org.junit.Assert.assertNotNull(cartItemList19);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 100);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.lang.String str17 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "63) test0263(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916918368" + "'", str8, "ORD-1775916918368");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "39) test0263(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:18" + "'", str11, "2026-04-11 17:15:18");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        java.lang.String str72 = order71.getCreatedAt();
        example.model.Address address73 = order71.getAddress();
        example.model.Address address74 = order71.getAddress();
        java.lang.String str75 = order71.getCustomerEmail();
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
// flaky "64) test0264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2026-04-11 17:15:18" + "'", str72, "2026-04-11 17:15:18");
        org.junit.Assert.assertNotNull(address73);
        org.junit.Assert.assertNotNull(address74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "ORD-1775916893477" + "'", str75, "ORD-1775916893477");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        example.model.Product product10 = cartItem8.getProduct();
        java.lang.String str11 = product10.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916889515" + "'", str11, "ORD-1775916889515");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getStatus();
        example.model.Address address12 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "65) test0266(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916918550" + "'", str8, "ORD-1775916918550");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        example.service.OrderService.printReceipt(order43);
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
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.lang.String str33 = order32.getCustomerEmail();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916887228" + "'", str33, "ORD-1775916887228");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        double double16 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "66) test0269(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916918747" + "'", str8, "ORD-1775916918747");
        org.junit.Assert.assertNull(address9);
// flaky "40) test0269(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:18" + "'", str10, "2026-04-11 17:15:18");
// flaky "20) test0269(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:18" + "'", str11, "2026-04-11 17:15:18");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNull(address14);
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        example.model.Product product4 = new example.model.Product("ORD-1775916894811", "", "ORD-1775916893323", (double) (byte) -1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        example.model.Address address5 = new example.model.Address("ORD-1775916907064", "ORD-1775916901034", "ORD-1775916905596", "ORD-1775916907784", "ORD-1775916896848");
        java.lang.String str6 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916907064" + "'", str6, "ORD-1775916907064");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        double double8 = order7.getTotalAmount();
        java.lang.String str9 = order7.getStatus();
        double double10 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PAID" + "'", str9, "PAID");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        example.service.CartService.removeProduct("ORD-1775916907189");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890749" + "'", str6, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916889515" + "'", str8, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916889515" + "'", str9, "ORD-1775916889515");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        cartItem2.setQuantity(97);
        cartItem2.setQuantity((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.Class<?> wildcardClass34 = cartItemList30.getClass();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "67) test0277(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916919069" + "'", str29, "ORD-1775916919069");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.lang.String str26 = address6.getStreet();
        java.lang.String str27 = address6.getPhone();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916886212" + "'", str26, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.Class<?> wildcardClass13 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "68) test0279(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916919220" + "'", str8, "ORD-1775916919220");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "41) test0279(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916919220" + "'", str11, "ORD-1775916919220");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        double double49 = order47.getTotalAmount();
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
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        example.model.Address address5 = new example.model.Address("ORD-1775916906473", "ORD-1775916897371", "ORD-1775916888578", "ORD-1775916898989", "2026-04-11 17:15:03");
        java.lang.String str6 = address5.getCity();
        java.lang.String str7 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916888578" + "'", str6, "ORD-1775916888578");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916897371" + "'", str7, "ORD-1775916897371");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
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
// flaky "69) test0282(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916919403" + "'", str8, "ORD-1775916919403");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.service.CartService.addProduct(product4, 0);
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, 52);
        java.lang.String str12 = product4.getId();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916889515" + "'", str12, "ORD-1775916889515");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        java.lang.String str30 = address26.getStreet();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
// flaky "70) test0284(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str31, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        java.lang.String str21 = order17.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2026-04-11 17:14:47" + "'", str21, "2026-04-11 17:14:47");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.lang.String str33 = order30.getCreatedAt();
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
// flaky "71) test0286(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2026-04-11 17:15:19" + "'", str33, "2026-04-11 17:15:19");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        example.model.Product product4 = new example.model.Product("ORD-1775916890142", "ORD-1775916894327", "ORD-1775916892121", (double) 0.0f);
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916892121" + "'", str5, "ORD-1775916892121");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        java.lang.String str65 = address6.getStreet();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ORD-1775916891938" + "'", str65, "ORD-1775916891938");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        example.service.OrderService.printReceipt(order17);
        java.lang.String str20 = order17.getCreatedAt();
        example.service.OrderService.printReceipt(order17);
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
// flaky "72) test0289(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2026-04-11 17:15:19" + "'", str20, "2026-04-11 17:15:19");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        java.lang.String str5 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)" + "'", str5, "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        example.model.Address address40 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str41 = address40.getStreet();
        java.lang.String str42 = address40.getFullName();
        java.lang.String str43 = address40.getStreet();
        example.model.Address address45 = null;
        example.model.Address address47 = null;
        example.model.CartItem[] cartItemArray48 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList49 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList49, cartItemArray48);
        example.model.Order order53 = new example.model.Order("", address47, (java.util.List<example.model.CartItem>) cartItemList49, 1.0d, "");
        example.model.Order order56 = new example.model.Order("ORD-1775916886212", address45, (java.util.List<example.model.CartItem>) cartItemList49, 1.0d, "ORD-1775916886040");
        example.model.Order order59 = new example.model.Order("ORD-1775916894811", address40, (java.util.List<example.model.CartItem>) cartItemList49, (double) 1.0f, "ORD-1775916894327");
        example.model.Order order62 = new example.model.Order("2026-04-11 17:14:53", address8, (java.util.List<example.model.CartItem>) cartItemList49, (double) (short) -1, "ORD-1775916906649");
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "ORD-1775916886212" + "'", str41, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916886212" + "'", str43, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray48);
        org.junit.Assert.assertArrayEquals(cartItemArray48, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        example.service.CartService.removeProduct("ORD-1775916892828");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        example.service.CartService.removeProduct("2026-04-11 17:14:56");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) '4');
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 10);
        org.junit.Assert.assertNull(product3);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        java.lang.String str9 = product8.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getFullName();
        java.lang.String str10 = address5.getFullName();
        java.lang.String str11 = address5.getPhone();
        java.lang.Class<?> wildcardClass12 = address5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.lang.String str21 = address18.getPhone();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        double double9 = cartItem8.getSubtotal();
        double double10 = cartItem8.getSubtotal();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.lang.String str22 = address21.getPhone();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(address21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.String str72 = order71.getCreatedAt();
        example.model.Address address73 = order71.getAddress();
        java.lang.String str74 = order71.getPaymentIntentId();
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
// flaky "73) test0300(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2026-04-11 17:15:20" + "'", str72, "2026-04-11 17:15:20");
        org.junit.Assert.assertNotNull(address73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "ORD-1775916888257" + "'", str74, "ORD-1775916888257");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        example.model.Product product4 = new example.model.Product("", "ORD-1775916886212", "ORD-1775916887166", (double) 1L);
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916887166" + "'", str5, "ORD-1775916887166");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity(97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        example.model.Product product4 = new example.model.Product("ORD-1775916912855", "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)", "ORD-1775916902394", (double) (short) -1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        java.lang.String str34 = address6.getFullName();
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
// flaky "74) test0304(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str33, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        example.model.Address address5 = new example.model.Address("ORD-1775916906412", "ORD-1775916896848", "", "ORD-1775916893211", "2026-04-11 17:14:48");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
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
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getPaymentIntentId();
        java.lang.String str20 = order17.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:52", "ORD-1775916897292", "ORD-1775916894246", (double) (short) 1);
        double double5 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        cartItem2.setQuantity((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        example.service.CartService.removeProduct("ORD-1775916897794");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.String str13 = order7.getPaymentIntentId();
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
// flaky "75) test0312(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916921213" + "'", str8, "ORD-1775916921213");
        org.junit.Assert.assertNull(address9);
// flaky "42) test0312(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:21" + "'", str10, "2026-04-11 17:15:21");
        org.junit.Assert.assertNotNull(cartItemList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        double double7 = cartItem6.getSubtotal();
        example.model.Product product8 = cartItem6.getProduct();
        example.model.CartItem cartItem10 = new example.model.CartItem(product8, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(product8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.lang.String str30 = address26.getStreet();
        java.lang.String str31 = address26.getFullName();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916886212" + "'", str30, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        java.lang.String str11 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str11, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        double double15 = order13.getTotalAmount();
        java.lang.String str16 = order13.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916887166" + "'", str16, "ORD-1775916887166");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        example.service.CartService.addProduct(product4, 52);
        java.lang.String str9 = product4.getId();
        java.lang.String str10 = product4.toString();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 100);
        java.lang.String str13 = cartItem12.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916889515" + "'", str9, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916890749    x100  = $100.00" + "'", str13, "ORD-1775916890749    x100  = $100.00");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:14:56", "2026-04-11 17:15:20", "ORD-1775916911314", "ORD-1775916896761", "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        double double11 = order7.getTotalAmount();
        example.model.Address address12 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "76) test0319(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916921496" + "'", str8, "ORD-1775916921496");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNull(address12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.lang.String str14 = order7.getCreatedAt();
        java.lang.String str15 = order7.getPaymentIntentId();
        java.lang.String str16 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "77) test0320(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916921579" + "'", str8, "ORD-1775916921579");
        org.junit.Assert.assertNull(address9);
// flaky "43) test0320(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:21" + "'", str10, "2026-04-11 17:15:21");
// flaky "21) test0320(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:21" + "'", str11, "2026-04-11 17:15:21");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
// flaky "6) test0320(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:21" + "'", str14, "2026-04-11 17:15:21");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "2) test0320(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916921579" + "'", str16, "ORD-1775916921579");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        example.model.Product product4 = new example.model.Product("ORD-1775916897371", "ORD-1775916892568", "ORD-1775916893369", (double) 10);
        example.service.CartService.addProduct(product4, (-1));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) -1);
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        example.service.CartService.removeProduct("ORD-1775916921769");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        java.lang.String str10 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916920328");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getCity();
        java.lang.String str9 = address5.getCountry();
        java.lang.Class<?> wildcardClass10 = address5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        java.lang.String str36 = order33.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "78) test0328(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916922112" + "'", str29, "ORD-1775916922112");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916890225" + "'", str34, "ORD-1775916890225");
// flaky "44) test0328(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916922112" + "'", str36, "ORD-1775916922112");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getCreatedAt();
        example.model.Address address11 = order7.getAddress();
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
// flaky "79) test0329(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916922362" + "'", str8, "ORD-1775916922362");
        org.junit.Assert.assertNull(address9);
// flaky "45) test0329(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:22" + "'", str10, "2026-04-11 17:15:22");
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
// flaky "80) test0330(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916922468" + "'", str8, "ORD-1775916922468");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = cartItem9.getSubtotal();
        cartItem9.setQuantity((int) (byte) 10);
        cartItem9.setQuantity((int) (short) -1);
        cartItem9.setQuantity((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        java.lang.String str64 = address6.getFullName();
        java.lang.String str65 = address6.getStreet();
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "ORD-1775916886212" + "'", str65, "ORD-1775916886212");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 10);
        double double7 = cartItem6.getSubtotal();
        int int8 = cartItem6.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 350.0d + "'", double7 == 350.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        java.lang.String str26 = address6.getStreet();
        java.lang.String str27 = address6.getStreet();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ORD-1775916886212" + "'", str26, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getFullName();
        java.lang.String str8 = address5.getPhone();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916922221");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        double double10 = order7.getTotalAmount();
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
// flaky "81) test0337(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916922922" + "'", str8, "ORD-1775916922922");
// flaky "46) test0337(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916922922" + "'", str9, "ORD-1775916922922");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (byte) 0);
        cartItem2.setQuantity((int) ' ');
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        java.lang.String str14 = order7.getPaymentIntentId();
        double double15 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "82) test0339(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916922997" + "'", str8, "ORD-1775916922997");
// flaky "47) test0339(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916922997" + "'", str9, "ORD-1775916922997");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getStatus();
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
// flaky "83) test0340(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916923030" + "'", str8, "ORD-1775916923030");
// flaky "48) test0340(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916923030" + "'", str9, "ORD-1775916923030");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        java.lang.String str33 = order30.getPaymentIntentId();
        java.lang.String str34 = order30.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList35 = order30.getItems();
        java.lang.String str36 = order30.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PAID" + "'", str31, "PAID");
// flaky "84) test0341(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916923120" + "'", str32, "ORD-1775916923120");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916892828" + "'", str33, "ORD-1775916892828");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916894327" + "'", str34, "ORD-1775916894327");
        org.junit.Assert.assertNotNull(cartItemList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PAID" + "'", str36, "PAID");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) 10);
        example.service.CartService.addProduct(product4, 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        double double10 = order7.getTotalAmount();
        java.lang.Class<?> wildcardClass11 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "85) test0343(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916923179" + "'", str8, "ORD-1775916923179");
// flaky "49) test0343(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916923179" + "'", str9, "ORD-1775916923179");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        java.lang.String str72 = order71.getCreatedAt();
        example.model.Address address73 = order71.getAddress();
        example.model.Address address74 = order71.getAddress();
        java.lang.String str75 = address74.getPhone();
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
// flaky "86) test0344(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2026-04-11 17:15:23" + "'", str72, "2026-04-11 17:15:23");
        org.junit.Assert.assertNotNull(address73);
        org.junit.Assert.assertNotNull(address74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "ORD-1775916886212" + "'", str75, "ORD-1775916886212");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        example.model.Address address5 = new example.model.Address("ORD-1775916903664", "ORD-1775916886212", "ORD-1775916894521", "2026-04-11 17:14:56", "ORD-1775916901262");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        double double11 = product4.getPrice();
        java.lang.String str12 = product4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:14:50" + "'", str12, "2026-04-11 17:14:50");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        example.model.Address address5 = new example.model.Address("ORD-1775916893477", "ORD-1775916893369", "ORD-1775916894406", "ORD-1775916890979", "ORD-1775916894811");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916893369" + "'", str6, "ORD-1775916893369");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916894406" + "'", str7, "ORD-1775916894406");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        double double10 = cartItem9.getSubtotal();
        cartItem9.setQuantity((int) (byte) 10);
        cartItem9.setQuantity((int) (short) -1);
        double double15 = cartItem9.getSubtotal();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-100.0d) + "'", double10 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916914931");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) -1);
        java.lang.String str13 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:14:47" + "'", str13, "2026-04-11 17:14:47");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        cartItem2.setQuantity(100);
        int int5 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        example.model.Address address15 = order13.getAddress();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertNotNull(address15);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.getDescription();
        java.lang.String str9 = product4.getDescription();
        example.service.CartService.addProduct(product4, 0);
        java.lang.String str12 = product4.getName();
        java.lang.String str13 = product4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890749" + "'", str6, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-04-11 17:14:47" + "'", str8, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:47" + "'", str9, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916890749" + "'", str12, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916890749" + "'", str13, "ORD-1775916890749");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916896079");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        example.model.Product product4 = new example.model.Product("ORD-1775916886687", "ORD-1775916891615", "2026-04-11 17:14:47", (double) 100);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) 100);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        example.model.Address address5 = new example.model.Address("ORD-1775916903896", "ORD-1775916895177", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916887228", "ORD-1775916897794");
        java.lang.String str6 = address5.getStreet();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916895177" + "'", str6, "ORD-1775916895177");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.String str54 = address35.getPhone();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(address20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "87) test0357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916924278" + "'", str30, "ORD-1775916924278");
        org.junit.Assert.assertNotNull(cartItemList31);
        org.junit.Assert.assertNotNull(address35);
        org.junit.Assert.assertNotNull(cartItemArray38);
        org.junit.Assert.assertArrayEquals(cartItemArray38, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "50) test0357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916924278" + "'", str44, "ORD-1775916924278");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNull(address46);
// flaky "22) test0357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "2026-04-11 17:15:24" + "'", str47, "2026-04-11 17:15:24");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "PAID" + "'", str49, "PAID");
        org.junit.Assert.assertNotNull(cartItemList50);
        org.junit.Assert.assertNotNull(order53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ORD-1775916886212" + "'", str54, "ORD-1775916886212");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        example.model.Product product4 = new example.model.Product("ORD-1775916911314", "ORD-1775916889693", "ORD-1775916905007", 100.0d);
        java.lang.String str5 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916889693" + "'", str5, "ORD-1775916889693");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        example.model.Product product4 = new example.model.Product("[ORD-1775916891335] ORD-1775916893211    - $100.00  (ORD-1775916892121)", "2026-04-11 17:15:00", "ORD-1775916916006", (double) 100L);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        example.service.CartService.removeProduct("ORD-1775916906793");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.getDescription();
        java.lang.String str9 = product4.getDescription();
        double double10 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890749" + "'", str6, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2026-04-11 17:14:47" + "'", str8, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:47" + "'", str9, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getPhone();
        java.lang.String str7 = address5.getStreet();
        java.lang.String str8 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        example.model.Address address5 = new example.model.Address("ORD-1775916889515", "ORD-1775916886687", "2026-04-11 17:14:48", "PAID", "ORD-1775916887036");
        java.lang.String str6 = address5.getCity();
        java.lang.String str7 = address5.toString();
        java.lang.String str8 = address5.getStreet();
        java.lang.String str9 = address5.getStreet();
        java.lang.String str10 = address5.getCity();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:48" + "'", str6, "2026-04-11 17:14:48");
// flaky "88) test0363(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ud83d\udcde ORD-1775916887036" + "'", str7, "\ud83d\udcde ORD-1775916887036");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886687" + "'", str8, "ORD-1775916886687");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886687" + "'", str9, "ORD-1775916886687");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:14:48" + "'", str10, "2026-04-11 17:14:48");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        example.service.CartService.removeProduct("ORD-1775916890749    x97  = $97.00");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getStatus();
        java.lang.String str13 = order7.getOrderId();
        java.lang.String str14 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "89) test0365(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916924945" + "'", str8, "ORD-1775916924945");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "51) test0365(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:24" + "'", str11, "2026-04-11 17:15:24");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
// flaky "23) test0365(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916924945" + "'", str13, "ORD-1775916924945");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        java.util.List<example.model.CartItem> cartItemList10 = order7.getItems();
        java.lang.Class<?> wildcardClass11 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "90) test0366(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916925054" + "'", str8, "ORD-1775916925054");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = address6.getCity();
        java.lang.String str19 = address6.getFullName();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916886040");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        example.model.Address address5 = new example.model.Address("ORD-1775916906473", "ORD-1775916907024", "ORD-1775916899079", "ORD-1775916886040", "ORD-1775916903979");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str6 = address5.getStreet();
        java.lang.String str7 = address5.getCountry();
        java.lang.String str8 = address5.getPhone();
        java.lang.String str9 = address5.getPhone();
        java.lang.String str10 = address5.getCity();
        java.lang.String str11 = address5.getCountry();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916886212" + "'", str6, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916886212" + "'", str11, "ORD-1775916886212");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        java.lang.String str72 = order71.getCreatedAt();
        example.model.Address address73 = order71.getAddress();
        example.model.Address address74 = order71.getAddress();
        java.lang.String str75 = address74.getCity();
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
// flaky "91) test0371(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "2026-04-11 17:15:25" + "'", str72, "2026-04-11 17:15:25");
        org.junit.Assert.assertNotNull(address73);
        org.junit.Assert.assertNotNull(address74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 10);
        example.model.Product product12 = cartItem11.getProduct();
        double double13 = cartItem11.getSubtotal();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(product12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-10.0d) + "'", double13 == (-10.0d));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916916718");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        example.service.CartService.removeProduct("ORD-1775916889515");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916921496");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        example.service.CartService.removeProduct("ORD-1775916907784");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        example.model.Address address5 = new example.model.Address("[ORD-1775916891615] ORD-1775916890749    - $1.00  (ORD-1775916892828)", "ORD-1775916916553", "2026-04-11 17:14:50  x1  = $-1.00", "ORD-1775916888578", "ORD-1775916887228");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        java.lang.String str37 = address34.getStreet();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "92) test0378(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916925720" + "'", str29, "ORD-1775916925720");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(address34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916890749" + "'", str8, "ORD-1775916890749");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        java.lang.String str5 = product4.getId();
        java.lang.String str6 = product4.toString();
        example.service.CartService.addProduct(product4, (int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = product4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916892568" + "'", str5, "ORD-1775916892568");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)" + "'", str6, "[ORD-1775916892568] hi!                  - $35.00  (ORD-1775916891335)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        example.model.Product product4 = new example.model.Product("ORD-1775916891615", "ORD-1775916890749", "ORD-1775916892828", 1.0d);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890749" + "'", str6, "ORD-1775916890749");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        example.service.OrderService.printReceipt(order30);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        java.lang.String str99 = address98.getCountry();
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
// flaky "93) test0383(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916926155" + "'", str44, "ORD-1775916926155");
// flaky "52) test0383(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916926155" + "'", str45, "ORD-1775916926155");
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
// flaky "24) test0383(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916926155" + "'", str79, "ORD-1775916926155");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(address98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "ORD-1775916886212" + "'", str99, "ORD-1775916886212");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity(97);
        int int6 = cartItem2.getQuantity();
        example.model.Product product7 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNull(product7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        java.lang.String str13 = order7.getStatus();
        java.lang.String str14 = order7.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "94) test0386(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916926346" + "'", str8, "ORD-1775916926346");
        org.junit.Assert.assertNull(address9);
// flaky "53) test0386(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:26" + "'", str10, "2026-04-11 17:15:26");
        org.junit.Assert.assertNull(address11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PAID" + "'", str13, "PAID");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 10);
        example.model.Product product12 = cartItem11.getProduct();
        double double13 = product12.getPrice();
        java.lang.String str14 = product12.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(product12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.toString();
        java.lang.String str20 = address18.getCountry();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "95) test0388(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str19, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.String str99 = order97.getCustomerEmail();
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
// flaky "96) test0389(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916926466" + "'", str44, "ORD-1775916926466");
// flaky "54) test0389(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916926466" + "'", str45, "ORD-1775916926466");
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
// flaky "25) test0389(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916926466" + "'", str79, "ORD-1775916926466");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(address98);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "ORD-1775916894246" + "'", str99, "ORD-1775916894246");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        java.lang.String str27 = address6.getStreet();
        java.lang.String str28 = address6.getCountry();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916886212" + "'", str27, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        java.lang.Class<?> wildcardClass16 = order7.getClass();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "97) test0391(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916926582" + "'", str8, "ORD-1775916926582");
// flaky "55) test0391(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916926582" + "'", str9, "ORD-1775916926582");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
// flaky "26) test0391(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:15:26" + "'", str15, "2026-04-11 17:15:26");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        java.lang.String str15 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "98) test0392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916926618" + "'", str8, "ORD-1775916926618");
        org.junit.Assert.assertNull(address9);
// flaky "56) test0392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:26" + "'", str10, "2026-04-11 17:15:26");
// flaky "27) test0392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:26" + "'", str11, "2026-04-11 17:15:26");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "7) test0392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916926618" + "'", str15, "ORD-1775916926618");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        example.model.Address address15 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "99) test0393(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916926649" + "'", str8, "ORD-1775916926649");
// flaky "57) test0393(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916926649" + "'", str9, "ORD-1775916926649");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(address13);
// flaky "28) test0393(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2026-04-11 17:15:26" + "'", str14, "2026-04-11 17:15:26");
        org.junit.Assert.assertNull(address15);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        example.model.Product product4 = new example.model.Product("ORD-1775916898186", "ORD-1775916893477", "ORD-1775916905829", 35.0d);
        java.lang.String str5 = product4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916898186] ORD-1775916893477    - $35.00  (ORD-1775916905829)" + "'", str5, "[ORD-1775916898186] ORD-1775916893477    - $35.00  (ORD-1775916905829)");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916899397", "\ud83d\udcde ORD-1775916894079", "ORD-1775916901311", "ORD-1775916907189");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        example.model.Product product4 = new example.model.Product("ORD-1775916888578", "2026-04-11 17:14:55", "ORD-1775916891772", 35.0d);
        java.lang.String str5 = product4.toString();
        java.lang.String str6 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)" + "'", str5, "[ORD-1775916888578] 2026-04-11 17:14:55  - $35.00  (ORD-1775916891772)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:55" + "'", str6, "2026-04-11 17:14:55");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.lang.String str14 = order12.getOrderId();
        java.lang.String str15 = order12.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
// flaky "100) test0397(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916926815" + "'", str14, "ORD-1775916926815");
// flaky "58) test0397(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:15:26" + "'", str15, "2026-04-11 17:15:26");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (-1));
        double double10 = product4.getPrice();
        double double11 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        example.model.Address address5 = new example.model.Address("", "ORD-1775916891135", "ORD-1775916899155", "2026-04-11 17:14:47", "ORD-1775916892568");
        java.lang.String str6 = address5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        example.model.Address address5 = new example.model.Address("ORD-1775916910496", "ORD-1775916907467", "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()", "ORD-1775916907189", "");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        example.service.CartService.addProduct(product4, 1);
        example.service.CartService.addProduct(product4, 100);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.lang.String str16 = order7.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "101) test0402(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916927602" + "'", str8, "ORD-1775916927602");
        org.junit.Assert.assertNull(address9);
// flaky "59) test0402(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:27" + "'", str10, "2026-04-11 17:15:27");
// flaky "29) test0402(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:27" + "'", str11, "2026-04-11 17:15:27");
        org.junit.Assert.assertNull(address12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(address15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PAID" + "'", str16, "PAID");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        example.service.CartService.removeProduct("ORD-1775916916040");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        example.model.Product product4 = new example.model.Product("ORD-1775916902486", "ORD-1775916890749    x97  = $97.00", "ORD-1775916920662", (double) 10L);
        java.lang.Class<?> wildcardClass5 = product4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        example.service.CartService.addProduct(product4, 97);
        java.lang.String str9 = product4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str9, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        java.lang.String str23 = address18.getFullName();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
// flaky "102) test0406(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
// flaky "60) test0406(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        java.lang.String str11 = product4.getId();
        java.lang.String str12 = product4.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916888257" + "'", str11, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str12, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getStatus();
        example.model.Address address11 = order7.getAddress();
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
// flaky "103) test0408(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916928133" + "'", str8, "ORD-1775916928133");
// flaky "61) test0408(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916928133" + "'", str9, "ORD-1775916928133");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertNull(address11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916911372");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        example.service.OrderService.printReceipt(order25);
        java.lang.String str28 = order25.getPaymentIntentId();
        java.lang.String str29 = order25.getOrderId();
        java.lang.String str30 = order25.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916894327" + "'", str28, "ORD-1775916894327");
// flaky "104) test0410(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916928225" + "'", str29, "ORD-1775916928225");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ORD-1775916894327" + "'", str30, "ORD-1775916894327");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        example.model.Order order20 = new example.model.Order("ORD-1775916886212", address9, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "ORD-1775916886040");
        example.model.Order order23 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address7, (java.util.List<example.model.CartItem>) cartItemList13, (double) (short) 0, "ORD-1775916903429");
        example.model.Address address30 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str31 = address30.getStreet();
        java.lang.String str32 = address30.getCountry();
        java.lang.String str33 = address30.getPhone();
        example.model.Address address42 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address44 = null;
        example.model.CartItem[] cartItemArray45 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList46 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList46, cartItemArray45);
        example.model.Order order50 = new example.model.Order("", address44, (java.util.List<example.model.CartItem>) cartItemList46, 1.0d, "");
        example.model.Order order53 = new example.model.Order("2026-04-11 17:14:47", address42, (java.util.List<example.model.CartItem>) cartItemList46, (double) (-1.0f), "");
        example.model.Address address54 = order53.getAddress();
        example.model.Address address56 = null;
        example.model.Address address58 = null;
        example.model.CartItem[] cartItemArray59 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList60 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList60, cartItemArray59);
        example.model.Order order64 = new example.model.Order("", address58, (java.util.List<example.model.CartItem>) cartItemList60, 1.0d, "");
        example.model.Order order67 = new example.model.Order("ORD-1775916886212", address56, (java.util.List<example.model.CartItem>) cartItemList60, 1.0d, "ORD-1775916886040");
        example.model.Order order70 = new example.model.Order("ORD-1775916892053", address54, (java.util.List<example.model.CartItem>) cartItemList60, (double) 10, "ORD-1775916887494");
        example.model.Address address72 = null;
        example.model.CartItem[] cartItemArray73 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList74 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList74, cartItemArray73);
        example.model.Order order78 = new example.model.Order("", address72, (java.util.List<example.model.CartItem>) cartItemList74, 1.0d, "");
        example.model.Order order81 = example.service.OrderService.createOrder("ORD-1775916892053", address54, (java.util.List<example.model.CartItem>) cartItemList74, 0.0d, "2026-04-11 17:14:52");
        example.model.Order order84 = example.service.OrderService.createOrder("ORD-1775916894406", address30, (java.util.List<example.model.CartItem>) cartItemList74, 35.0d, "ORD-1775916888578");
        example.model.Order order87 = example.service.OrderService.createOrder("ORD-1775916904499", address7, (java.util.List<example.model.CartItem>) cartItemList74, (double) (byte) 0, "ORD-1775916900813");
        java.lang.String str88 = address7.getCity();
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(order23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916886212" + "'", str31, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916886212" + "'", str32, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "ORD-1775916886212" + "'", str33, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray45);
        org.junit.Assert.assertArrayEquals(cartItemArray45, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(address54);
        org.junit.Assert.assertNotNull(cartItemArray59);
        org.junit.Assert.assertArrayEquals(cartItemArray59, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(cartItemArray73);
        org.junit.Assert.assertArrayEquals(cartItemArray73, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(order81);
        org.junit.Assert.assertNotNull(order84);
        org.junit.Assert.assertNotNull(order87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "hi!" + "'", str88, "hi!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        example.model.Product product5 = cartItem2.getProduct();
        cartItem2.setQuantity(10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product5);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        example.service.CartService.removeProduct("2026-04-11 17:15:21");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        example.service.OrderService.printReceipt(order17);
        java.lang.String str20 = order17.getCreatedAt();
        java.lang.String str21 = order17.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
// flaky "105) test0414(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2026-04-11 17:15:28" + "'", str20, "2026-04-11 17:15:28");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PAID" + "'", str21, "PAID");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        double double11 = product4.getPrice();
        double double12 = product4.getPrice();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str10, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        example.model.Address address35 = null;
        example.model.CartItem[] cartItemArray36 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList37 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList37, cartItemArray36);
        example.model.Order order41 = new example.model.Order("", address35, (java.util.List<example.model.CartItem>) cartItemList37, 1.0d, "");
        java.lang.String str42 = order41.getOrderId();
        java.lang.String str43 = order41.getOrderId();
        java.util.List<example.model.CartItem> cartItemList44 = order41.getItems();
        example.model.Order order47 = example.service.OrderService.createOrder("ORD-1775916891135", address7, cartItemList44, (double) 0L, "ORD-1775916886040");
        java.lang.Class<?> wildcardClass48 = cartItemList44.getClass();
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
        org.junit.Assert.assertNotNull(cartItemArray36);
        org.junit.Assert.assertArrayEquals(cartItemArray36, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky "106) test0416(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ORD-1775916928550" + "'", str42, "ORD-1775916928550");
// flaky "62) test0416(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916928550" + "'", str43, "ORD-1775916928550");
        org.junit.Assert.assertNotNull(cartItemList44);
        org.junit.Assert.assertNotNull(order47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        java.lang.String str16 = order7.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "107) test0417(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916928800" + "'", str8, "ORD-1775916928800");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "63) test0417(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:28" + "'", str11, "2026-04-11 17:15:28");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "30) test0417(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ORD-1775916928800" + "'", str16, "ORD-1775916928800");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        double double15 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "108) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916928912" + "'", str8, "ORD-1775916928912");
// flaky "64) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916928912" + "'", str9, "ORD-1775916928912");
        org.junit.Assert.assertNull(address10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PAID" + "'", str11, "PAID");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(address13);
// flaky "31) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916928912" + "'", str14, "ORD-1775916928912");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity(97);
        int int6 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
// flaky "109) test0420(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916929041" + "'", str8, "ORD-1775916929041");
        org.junit.Assert.assertNull(address9);
// flaky "65) test0420(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2026-04-11 17:15:29" + "'", str10, "2026-04-11 17:15:29");
// flaky "32) test0420(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:29" + "'", str11, "2026-04-11 17:15:29");
        org.junit.Assert.assertNull(address12);
// flaky "8) test0420(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:29" + "'", str13, "2026-04-11 17:15:29");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PAID" + "'", str15, "PAID");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) 'a');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        example.model.Address address10 = order7.getAddress();
        java.lang.String str11 = order7.getCreatedAt();
        java.lang.String str12 = order7.getStatus();
        double double13 = order7.getTotalAmount();
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
// flaky "110) test0422(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916929320" + "'", str8, "ORD-1775916929320");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "66) test0422(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:29" + "'", str11, "2026-04-11 17:15:29");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        example.model.Product product4 = new example.model.Product("ORD-1775916891772", "ORD-1775916916999", "ORD-1775916894811", 35.0d);
        java.lang.String str5 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916891772" + "'", str5, "ORD-1775916891772");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = address18.getCity();
        java.lang.String str20 = address18.getPhone();
        java.lang.String str21 = address18.getFullName();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        example.model.Product product1 = example.service.ProductService.getProductById("ORD-1775916892828");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        example.model.Address address5 = new example.model.Address("ORD-1775916904976", "ORD-1775916890749    x97  = $97.00", "", "ORD-1775916895964", "2026-04-11 17:15:22");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.String str35 = address34.toString();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "111) test0427(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916929571" + "'", str29, "ORD-1775916929571");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertNotNull(address34);
// flaky "67) test0427(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str35, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        example.model.Product product4 = new example.model.Product("ORD-1775916909254", "ORD-1775916914931", "ORD-1775916907850", (double) (short) 1);
        example.service.CartService.addProduct(product4, (int) (short) 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        int int5 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = cartItem2.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getName()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        example.model.Product product4 = new example.model.Product("ORD-1775916903896", "ORD-1775916906649", "2026-04-11 17:15:19", (double) (byte) 1);
        java.lang.String str5 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:15:19" + "'", str5, "2026-04-11 17:15:19");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        example.model.Product product1 = example.service.ProductService.getProductById("2026-04-11 17:15:11");
        org.junit.Assert.assertNull(product1);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.lang.String str27 = address6.getCity();
        java.lang.String str28 = address6.getFullName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray13);
        org.junit.Assert.assertArrayEquals(cartItemArray13, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ORD-1775916886212" + "'", str25, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.lang.String str60 = address19.getStreet();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
// flaky "112) test0433(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        example.model.Address address15 = order7.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "113) test0434(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916930220" + "'", str8, "ORD-1775916930220");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "68) test0434(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:30" + "'", str11, "2026-04-11 17:15:30");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(address15);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        java.lang.String str5 = product4.getName();
        java.lang.String str6 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916892568" + "'", str6, "ORD-1775916892568");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getId();
        java.lang.String str11 = product4.toString();
        java.lang.String str12 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str11, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getStreet();
        example.model.CartItem[] cartItemArray8 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList9 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList9, cartItemArray8);
        example.model.Order order13 = example.service.OrderService.createOrder("ORD-1775916887036", address6, (java.util.List<example.model.CartItem>) cartItemList9, (double) 10.0f, "ORD-1775916887166");
        java.lang.String str14 = order13.getStatus();
        java.lang.String str15 = order13.getOrderId();
        example.model.Address address16 = order13.getAddress();
        java.lang.String str17 = order13.getStatus();
        java.lang.String str18 = order13.getCreatedAt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray8);
        org.junit.Assert.assertArrayEquals(cartItemArray8, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(order13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
// flaky "114) test0437(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916930353" + "'", str15, "ORD-1775916930353");
        org.junit.Assert.assertNotNull(address16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PAID" + "'", str17, "PAID");
// flaky "69) test0437(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2026-04-11 17:15:30" + "'", str18, "2026-04-11 17:15:30");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        example.model.Product product4 = new example.model.Product("ORD-1775916892568", "hi!", "ORD-1775916891335", (double) '#');
        example.service.CartService.addProduct(product4, (int) (byte) 0);
        example.service.CartService.addProduct(product4, 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        example.model.Address address27 = null;
        example.model.CartItem[] cartItemArray28 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList29 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList29, cartItemArray28);
        example.model.Order order33 = new example.model.Order("", address27, (java.util.List<example.model.CartItem>) cartItemList29, 1.0d, "");
        java.lang.String str34 = order33.getOrderId();
        example.model.Address address35 = order33.getAddress();
        java.lang.String str36 = order33.getCreatedAt();
        java.lang.String str37 = order33.getCreatedAt();
        example.model.Address address38 = order33.getAddress();
        java.util.List<example.model.CartItem> cartItemList39 = order33.getItems();
        example.model.Order order42 = new example.model.Order("ORD-1775916903519", address7, cartItemList39, 35.0d, "ORD-1775916891938");
        java.lang.String str43 = address7.getFullName();
        java.lang.String str44 = address7.getCountry();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cartItemArray28);
        org.junit.Assert.assertArrayEquals(cartItemArray28, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky "115) test0439(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916930529" + "'", str34, "ORD-1775916930529");
        org.junit.Assert.assertNull(address35);
// flaky "70) test0439(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "2026-04-11 17:15:30" + "'", str36, "2026-04-11 17:15:30");
// flaky "33) test0439(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2026-04-11 17:15:30" + "'", str37, "2026-04-11 17:15:30");
        org.junit.Assert.assertNull(address38);
        org.junit.Assert.assertNotNull(cartItemList39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916886212" + "'", str44, "ORD-1775916886212");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.Class<?> wildcardClass28 = address6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList20);
        org.junit.Assert.assertNotNull(order26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        java.util.List<example.model.CartItem> cartItemList14 = order12.getItems();
        java.lang.String str15 = order12.getCustomerEmail();
        example.model.Address address16 = order12.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
        org.junit.Assert.assertNotNull(cartItemList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ORD-1775916886212" + "'", str15, "ORD-1775916886212");
        org.junit.Assert.assertNull(address16);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        cartItem2.setQuantity((int) (short) 1);
        example.model.Product product6 = cartItem2.getProduct();
        cartItem2.setQuantity(0);
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        java.lang.Class<?> wildcardClass28 = order26.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "116) test0443(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "71) test0443(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916930804" + "'", str27, "ORD-1775916930804");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.Class<?> wildcardClass21 = address6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order19);
// flaky "117) test0444(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str20, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getPaymentIntentId();
        double double14 = order12.getTotalAmount();
        java.lang.String str15 = order12.getCreatedAt();
        java.lang.String str16 = order12.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916886040" + "'", str13, "ORD-1775916886040");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
// flaky "118) test0445(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2026-04-11 17:15:31" + "'", str15, "2026-04-11 17:15:31");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PAID" + "'", str16, "PAID");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.toString();
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.getId();
        java.lang.String str11 = product4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()" + "'", str8, "[ORD-1775916888257] 2026-04-11 17:14:50  - $-1.00  ()");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916888257" + "'", str10, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:50" + "'", str11, "2026-04-11 17:14:50");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, 1);
        example.model.CartItem cartItem14 = new example.model.CartItem(product4, (int) (short) -1);
        java.lang.String str15 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916890749" + "'", str10, "ORD-1775916890749");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        example.model.Product product4 = new example.model.Product("2026-04-11 17:14:51", "", "ORD-1775916890142", (double) 100L);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getName();
        double double7 = product4.getPrice();
        java.lang.Class<?> wildcardClass8 = product4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ORD-1775916890142" + "'", str5, "ORD-1775916890142");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str7 = product4.getDescription();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, 1);
        double double10 = product4.getPrice();
        example.service.CartService.addProduct(product4, 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.service.CartService.addProduct(product4, (int) ' ');
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, (int) (short) 10);
        cartItem11.setQuantity((int) (short) 10);
        int int14 = cartItem11.getQuantity();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getId();
        java.lang.String str7 = product4.getName();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) -1);
        java.lang.String str10 = product4.getId();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = cartItem12.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916889515" + "'", str6, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916890749" + "'", str7, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916889515" + "'", str10, "ORD-1775916889515");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        example.model.Product product3 = cartItem2.getProduct();
        int int4 = cartItem2.getQuantity();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = cartItem2.getSubtotal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"example.model.Product.getPrice()\" because \"this.product\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        example.model.CartItem cartItem9 = new example.model.CartItem(product4, (int) (byte) 100);
        java.lang.String str10 = product4.getDescription();
        example.model.CartItem cartItem12 = new example.model.CartItem(product4, (int) (byte) 1);
        cartItem12.setQuantity((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        java.lang.String str18 = order17.getStatus();
        example.service.OrderService.printReceipt(order17);
        java.lang.String str20 = order17.getOrderId();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PAID" + "'", str18, "PAID");
// flaky "119) test0455(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916931435" + "'", str20, "ORD-1775916931435");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
        example.service.OrderService.printReceipt(order32);
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
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.String str31 = address7.getFullName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemList10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        double double10 = order7.getTotalAmount();
        double double11 = order7.getTotalAmount();
        java.lang.String str12 = order7.getCustomerEmail();
        java.lang.String str13 = order7.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "120) test0458(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916931584" + "'", str8, "ORD-1775916931584");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.util.List<example.model.CartItem> cartItemList9 = order7.getItems();
        java.lang.String str10 = order7.getPaymentIntentId();
        double double11 = order7.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList12 = order7.getItems();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "121) test0459(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916931611" + "'", str8, "ORD-1775916931611");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        double double8 = order7.getTotalAmount();
        java.lang.String str9 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
// flaky "122) test0460(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:15:31" + "'", str9, "2026-04-11 17:15:31");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        example.service.CartService.removeProduct("ORD-1775916927602");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        example.model.Product product4 = new example.model.Product("ORD-1775916909254", "ORD-1775916914931", "ORD-1775916907850", (double) (short) 1);
        double double5 = product4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.String str31 = order26.getStatus();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
// flaky "123) test0463(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str10, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(order26);
// flaky "72) test0463(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ORD-1775916931854" + "'", str27, "ORD-1775916931854");
// flaky "34) test0463(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916931854" + "'", str28, "ORD-1775916931854");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PAID" + "'", str30, "PAID");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "PAID" + "'", str31, "PAID");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getPaymentIntentId();
        double double20 = order17.getTotalAmount();
        java.lang.String str21 = order17.getStatus();
        example.service.OrderService.printReceipt(order17);
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PAID" + "'", str21, "PAID");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        int int3 = cartItem2.getQuantity();
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        java.lang.Class<?> wildcardClass10 = product9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.lang.String str31 = order29.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray18);
        org.junit.Assert.assertArrayEquals(cartItemArray18, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(order29);
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916900332" + "'", str31, "ORD-1775916900332");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
// flaky "124) test0468(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916932029" + "'", str8, "ORD-1775916932029");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertNull(address10);
// flaky "73) test0468(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:32" + "'", str11, "2026-04-11 17:15:32");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PAID" + "'", str14, "PAID");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        java.lang.String str9 = product4.getName();
        java.lang.String str10 = product4.toString();
        java.lang.String str11 = product4.getId();
        java.lang.String str12 = product4.getName();
        java.lang.String str13 = product4.getId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916890749" + "'", str9, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)" + "'", str10, "[ORD-1775916889515] ORD-1775916890749    - $1.00  (2026-04-11 17:14:47)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916889515" + "'", str11, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916890749" + "'", str12, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ORD-1775916889515" + "'", str13, "ORD-1775916889515");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        example.model.Product product4 = new example.model.Product("ORD-1775916888257", "2026-04-11 17:14:50", "", (double) (byte) -1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (byte) -1);
        double double7 = product4.getPrice();
        java.lang.String str8 = product4.getId();
        java.lang.String str9 = product4.getName();
        example.model.CartItem cartItem11 = new example.model.CartItem(product4, 97);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916888257" + "'", str8, "ORD-1775916888257");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:50" + "'", str9, "2026-04-11 17:14:50");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getOrderId();
        example.service.OrderService.printReceipt(order17);
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
// flaky "125) test0471(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916932104" + "'", str19, "ORD-1775916932104");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str7 = address6.getPhone();
        java.lang.String str8 = address6.getFullName();
        java.lang.String str9 = address6.getCity();
        example.model.Address address11 = null;
        example.model.CartItem[] cartItemArray12 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList13 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList13, cartItemArray12);
        example.model.Order order17 = new example.model.Order("", address11, (java.util.List<example.model.CartItem>) cartItemList13, 1.0d, "");
        java.lang.String str18 = order17.getOrderId();
        java.lang.String str19 = order17.getOrderId();
        double double20 = order17.getTotalAmount();
        java.lang.String str21 = order17.getStatus();
        java.util.List<example.model.CartItem> cartItemList22 = order17.getItems();
        example.model.Order order25 = example.service.OrderService.createOrder("ORD-1775916920522", address6, cartItemList22, (double) 1.0f, "2026-04-11 17:15:05");
        java.lang.String str26 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(cartItemArray12);
        org.junit.Assert.assertArrayEquals(cartItemArray12, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky "126) test0472(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916932205" + "'", str18, "ORD-1775916932205");
// flaky "74) test0472(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916932205" + "'", str19, "ORD-1775916932205");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "PAID" + "'", str21, "PAID");
        org.junit.Assert.assertNotNull(cartItemList22);
        org.junit.Assert.assertNotNull(order25);
// flaky "35) test0472(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str26, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        example.service.CartService.removeProduct("ORD-1775916902814");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.Address address10 = null;
        example.model.CartItem[] cartItemArray11 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList12 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList12, cartItemArray11);
        example.model.Order order16 = new example.model.Order("", address10, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "");
        example.model.Order order19 = new example.model.Order("ORD-1775916886212", address8, (java.util.List<example.model.CartItem>) cartItemList12, 1.0d, "ORD-1775916886040");
        example.model.Order order22 = example.service.OrderService.createOrder("[ORD-1775916886687] ORD-1775916891615    - $100.00  (2026-04-11 17:14:47)", address6, (java.util.List<example.model.CartItem>) cartItemList12, (double) (short) 0, "ORD-1775916903429");
        example.model.Address address23 = order22.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray11);
        org.junit.Assert.assertArrayEquals(cartItemArray11, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(order22);
        org.junit.Assert.assertNotNull(address23);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        java.lang.String str5 = product4.getDescription();
        java.lang.String str6 = product4.getDescription();
        example.model.CartItem cartItem8 = new example.model.CartItem(product4, (int) (short) 0);
        example.model.Product product9 = cartItem8.getProduct();
        example.model.Product product10 = cartItem8.getProduct();
        int int11 = cartItem8.getQuantity();
        int int12 = cartItem8.getQuantity();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2026-04-11 17:14:47" + "'", str5, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2026-04-11 17:14:47" + "'", str6, "2026-04-11 17:14:47");
        org.junit.Assert.assertNotNull(product9);
        org.junit.Assert.assertNotNull(product10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        example.model.Address address7 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address9 = null;
        example.model.CartItem[] cartItemArray10 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList11 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList11, cartItemArray10);
        example.model.Order order15 = new example.model.Order("", address9, (java.util.List<example.model.CartItem>) cartItemList11, 1.0d, "");
        example.model.Order order18 = new example.model.Order("2026-04-11 17:14:47", address7, (java.util.List<example.model.CartItem>) cartItemList11, (double) (-1.0f), "");
        example.model.Address address19 = order18.getAddress();
        java.lang.String str20 = address19.getCity();
        java.lang.String str21 = address19.getPhone();
        java.lang.String str22 = address19.getCountry();
        example.model.Address address24 = null;
        example.model.CartItem[] cartItemArray25 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList26 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList26, cartItemArray25);
        example.model.Order order30 = new example.model.Order("", address24, (java.util.List<example.model.CartItem>) cartItemList26, 1.0d, "");
        java.lang.String str31 = order30.getOrderId();
        java.lang.String str32 = order30.getOrderId();
        example.model.Address address33 = order30.getAddress();
        java.lang.String str34 = order30.getStatus();
        java.lang.String str35 = order30.getCustomerEmail();
        java.util.List<example.model.CartItem> cartItemList36 = order30.getItems();
        double double37 = order30.getTotalAmount();
        java.util.List<example.model.CartItem> cartItemList38 = order30.getItems();
        example.model.Order order41 = example.service.OrderService.createOrder("ORD-1775916896888", address19, cartItemList38, (double) (-1.0f), "2026-04-11 17:14:50  x1  = $-1.00");
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ORD-1775916886212" + "'", str21, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ORD-1775916886212" + "'", str22, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray25);
        org.junit.Assert.assertArrayEquals(cartItemArray25, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "127) test0476(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ORD-1775916932519" + "'", str31, "ORD-1775916932519");
// flaky "75) test0476(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ORD-1775916932519" + "'", str32, "ORD-1775916932519");
        org.junit.Assert.assertNull(address33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "PAID" + "'", str34, "PAID");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(cartItemList36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 1.0d + "'", double37 == 1.0d);
        org.junit.Assert.assertNotNull(cartItemList38);
        org.junit.Assert.assertNotNull(order41);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) (short) 1);
        example.model.Product product3 = cartItem2.getProduct();
        example.model.Product product4 = cartItem2.getProduct();
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity(1);
        cartItem2.setQuantity((int) (byte) 1);
        cartItem2.setQuantity((int) '4');
        cartItem2.setQuantity((int) (short) -1);
        example.model.Product product15 = cartItem2.getProduct();
        org.junit.Assert.assertNull(product3);
        org.junit.Assert.assertNull(product4);
        org.junit.Assert.assertNull(product15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        example.model.Address address36 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str37 = address36.getPhone();
        java.lang.String str38 = address36.getFullName();
        java.lang.String str39 = address36.getPhone();
        example.model.Address address46 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        java.lang.String str47 = address46.getCountry();
        java.lang.String str48 = address46.getStreet();
        example.model.Address address50 = null;
        example.model.CartItem[] cartItemArray51 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList52 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList52, cartItemArray51);
        example.model.Order order56 = new example.model.Order("", address50, (java.util.List<example.model.CartItem>) cartItemList52, 1.0d, "");
        example.model.Order order59 = example.service.OrderService.createOrder("ORD-1775916888151", address46, (java.util.List<example.model.CartItem>) cartItemList52, (double) ' ', "2026-04-11 17:14:48");
        example.model.Order order62 = example.service.OrderService.createOrder("ORD-1775916887228", address36, (java.util.List<example.model.CartItem>) cartItemList52, (double) (byte) 1, "2026-04-11 17:14:49");
        example.model.Address address64 = null;
        example.model.CartItem[] cartItemArray65 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList66 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList66, cartItemArray65);
        example.model.Order order70 = new example.model.Order("", address64, (java.util.List<example.model.CartItem>) cartItemList66, 1.0d, "");
        java.lang.String str71 = order70.getOrderId();
        java.lang.String str72 = order70.getOrderId();
        java.util.List<example.model.CartItem> cartItemList73 = order70.getItems();
        example.model.Order order76 = example.service.OrderService.createOrder("ORD-1775916891135", address36, cartItemList73, (double) 0L, "ORD-1775916886040");
        example.model.Order order79 = new example.model.Order("ORD-1775916894406", address27, cartItemList73, (double) 'a', "ORD-1775916905114");
        java.lang.String str80 = address27.getStreet();
        java.lang.String str81 = address27.getCountry();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916886212" + "'", str8, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray15);
        org.junit.Assert.assertArrayEquals(cartItemArray15, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(address27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ORD-1775916886212" + "'", str28, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "ORD-1775916886212" + "'", str37, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ORD-1775916886212" + "'", str39, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "ORD-1775916886212" + "'", str47, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ORD-1775916886212" + "'", str48, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray51);
        org.junit.Assert.assertArrayEquals(cartItemArray51, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(order59);
        org.junit.Assert.assertNotNull(order62);
        org.junit.Assert.assertNotNull(cartItemArray65);
        org.junit.Assert.assertArrayEquals(cartItemArray65, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
// flaky "128) test0478(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ORD-1775916932618" + "'", str71, "ORD-1775916932618");
// flaky "76) test0478(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ORD-1775916932618" + "'", str72, "ORD-1775916932618");
        org.junit.Assert.assertNotNull(cartItemList73);
        org.junit.Assert.assertNotNull(order76);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "ORD-1775916886212" + "'", str80, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "ORD-1775916886212" + "'", str81, "ORD-1775916886212");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, 1);
        java.lang.String str7 = product4.getDescription();
        double double8 = product4.getPrice();
        java.lang.String str9 = product4.getDescription();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:47" + "'", str9, "2026-04-11 17:14:47");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        example.service.OrderService.printReceipt(order25);
        example.service.OrderService.printReceipt(order25);
        java.lang.String str29 = order25.getPaymentIntentId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray14);
        org.junit.Assert.assertArrayEquals(cartItemArray14, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(address26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916894327" + "'", str29, "ORD-1775916894327");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        example.model.Product product4 = new example.model.Product("ORD-1775916890749    x97  = $97.00", "ORD-1775916900020", "2026-04-11 17:14:50  x10  = $-10.00", 0.0d);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        example.model.Address address6 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address8 = null;
        example.model.CartItem[] cartItemArray9 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList10 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList10, cartItemArray9);
        example.model.Order order14 = new example.model.Order("", address8, (java.util.List<example.model.CartItem>) cartItemList10, 1.0d, "");
        example.model.Order order17 = new example.model.Order("2026-04-11 17:14:47", address6, (java.util.List<example.model.CartItem>) cartItemList10, (double) (-1.0f), "");
        example.model.Address address18 = order17.getAddress();
        java.lang.String str19 = order17.getCustomerEmail();
        org.junit.Assert.assertNotNull(cartItemArray9);
        org.junit.Assert.assertArrayEquals(cartItemArray9, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(address18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2026-04-11 17:14:47" + "'", str19, "2026-04-11 17:14:47");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        example.model.Address address1 = null;
        example.model.Address address3 = null;
        example.model.CartItem[] cartItemArray4 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList5 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList5, cartItemArray4);
        example.model.Order order9 = new example.model.Order("", address3, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "");
        example.model.Order order12 = new example.model.Order("ORD-1775916886212", address1, (java.util.List<example.model.CartItem>) cartItemList5, 1.0d, "ORD-1775916886040");
        java.lang.String str13 = order12.getCreatedAt();
        java.lang.String str14 = order12.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray4);
        org.junit.Assert.assertArrayEquals(cartItemArray4, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky "129) test0483(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2026-04-11 17:15:33" + "'", str13, "2026-04-11 17:15:33");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ORD-1775916886040" + "'", str14, "ORD-1775916886040");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        example.model.Address address9 = order7.getAddress();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getOrderId();
        java.lang.String str12 = order7.getStatus();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "130) test0484(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916933088" + "'", str8, "ORD-1775916933088");
        org.junit.Assert.assertNull(address9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "77) test0484(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916933088" + "'", str11, "ORD-1775916933088");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "PAID" + "'", str12, "PAID");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        example.model.Product product0 = null;
        example.model.CartItem cartItem2 = new example.model.CartItem(product0, (int) 'a');
        cartItem2.setQuantity((-1));
        cartItem2.setQuantity((int) (byte) 10);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        java.lang.String str99 = order97.getOrderId();
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
// flaky "131) test0486(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916933148" + "'", str44, "ORD-1775916933148");
// flaky "78) test0486(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ORD-1775916933148" + "'", str45, "ORD-1775916933148");
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
// flaky "36) test0486(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str79 + "' != '" + "ORD-1775916933152" + "'", str79, "ORD-1775916933152");
        org.junit.Assert.assertNotNull(cartItemList80);
        org.junit.Assert.assertNotNull(cartItemArray89);
        org.junit.Assert.assertArrayEquals(cartItemArray89, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(address98);
// flaky "9) test0486(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str99 + "' != '" + "ORD-1775916933152" + "'", str99, "ORD-1775916933152");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.String str31 = order30.getPaymentIntentId();
        double double32 = order30.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ORD-1775916886212" + "'", str19, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray22);
        org.junit.Assert.assertArrayEquals(cartItemArray22, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(order30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "2026-04-11 17:14:52" + "'", str31, "2026-04-11 17:14:52");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.lang.String str36 = address6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ORD-1775916886212" + "'", str7, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916886212" + "'", str9, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ORD-1775916886212" + "'", str10, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ORD-1775916886212" + "'", str18, "ORD-1775916886212");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
// flaky "132) test0488(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str21, "\ud83d\udcde ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray24);
        org.junit.Assert.assertArrayEquals(cartItemArray24, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky "79) test0488(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\ud83d\udcde ORD-1775916886212" + "'", str36, "\ud83d\udcde ORD-1775916886212");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        java.lang.String str13 = order7.getPaymentIntentId();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "133) test0489(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916933268" + "'", str8, "ORD-1775916933268");
        org.junit.Assert.assertNotNull(cartItemList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
// flaky "80) test0489(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:15:33" + "'", str11, "2026-04-11 17:15:33");
// flaky "37) test0489(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:15:33" + "'", str12, "2026-04-11 17:15:33");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.String str72 = order71.getOrderId();
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
// flaky "134) test0490(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str72 + "' != '" + "ORD-1775916933302" + "'", str72, "ORD-1775916933302");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        example.service.CartService.removeProduct("ORD-1775916894079");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        java.lang.String str48 = address20.getStreet();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ORD-1775916886212" + "'", str48, "ORD-1775916886212");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        example.model.Address address56 = new example.model.Address("", "ORD-1775916886212", "hi!", "ORD-1775916886212", "ORD-1775916886212");
        example.model.Address address58 = null;
        example.model.CartItem[] cartItemArray59 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList60 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList60, cartItemArray59);
        example.model.Order order64 = new example.model.Order("", address58, (java.util.List<example.model.CartItem>) cartItemList60, 1.0d, "");
        example.model.Order order67 = new example.model.Order("2026-04-11 17:14:47", address56, (java.util.List<example.model.CartItem>) cartItemList60, (double) (-1.0f), "");
        example.model.Address address68 = order67.getAddress();
        java.lang.String str69 = address68.getStreet();
        example.model.Address address71 = null;
        example.model.CartItem[] cartItemArray72 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList73 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList73, cartItemArray72);
        example.model.Order order77 = new example.model.Order("", address71, (java.util.List<example.model.CartItem>) cartItemList73, 1.0d, "");
        java.lang.String str78 = order77.getOrderId();
        java.util.List<example.model.CartItem> cartItemList79 = order77.getItems();
        example.model.Order order82 = new example.model.Order("ORD-1775916890225", address68, cartItemList79, (double) (byte) -1, "");
        example.model.Order order85 = new example.model.Order("", address8, cartItemList79, (double) 0L, "ORD-1775916887494");
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
// flaky "135) test0493(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916933452" + "'", str43, "ORD-1775916933452");
// flaky "81) test0493(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916933452" + "'", str44, "ORD-1775916933452");
        org.junit.Assert.assertNotNull(cartItemList45);
        org.junit.Assert.assertNotNull(order48);
        org.junit.Assert.assertNotNull(cartItemArray59);
        org.junit.Assert.assertArrayEquals(cartItemArray59, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(address68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "ORD-1775916886212" + "'", str69, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray72);
        org.junit.Assert.assertArrayEquals(cartItemArray72, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
// flaky "38) test0493(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "ORD-1775916933452" + "'", str78, "ORD-1775916933452");
        org.junit.Assert.assertNotNull(cartItemList79);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "ORD-1775916886212" + "'", str86, "ORD-1775916886212");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        double double5 = product4.getPrice();
        java.lang.String str6 = product4.getName();
        java.lang.String str7 = product4.getDescription();
        java.lang.String str8 = product4.getId();
        example.model.CartItem cartItem10 = new example.model.CartItem(product4, 52);
        java.lang.String str11 = product4.getDescription();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ORD-1775916890749" + "'", str6, "ORD-1775916890749");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:14:47" + "'", str7, "2026-04-11 17:14:47");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916889515" + "'", str8, "ORD-1775916889515");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2026-04-11 17:14:47" + "'", str11, "2026-04-11 17:14:47");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        example.model.Product product4 = new example.model.Product("ORD-1775916889515", "ORD-1775916890749", "2026-04-11 17:14:47", (double) (short) 1);
        example.model.CartItem cartItem6 = new example.model.CartItem(product4, (int) (short) -1);
        int int7 = cartItem6.getQuantity();
        example.model.Product product8 = cartItem6.getProduct();
        java.lang.String str9 = product8.getDescription();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(product8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026-04-11 17:14:47" + "'", str9, "2026-04-11 17:14:47");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        example.model.Address address1 = null;
        example.model.CartItem[] cartItemArray2 = new example.model.CartItem[] {};
        java.util.ArrayList<example.model.CartItem> cartItemList3 = new java.util.ArrayList<example.model.CartItem>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<example.model.CartItem>) cartItemList3, cartItemArray2);
        example.model.Order order7 = new example.model.Order("", address1, (java.util.List<example.model.CartItem>) cartItemList3, 1.0d, "");
        java.lang.String str8 = order7.getOrderId();
        java.lang.String str9 = order7.getOrderId();
        java.lang.String str10 = order7.getStatus();
        java.lang.String str11 = order7.getOrderId();
        java.lang.String str12 = order7.getCreatedAt();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "136) test0496(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916933652" + "'", str8, "ORD-1775916933652");
// flaky "82) test0496(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916933652" + "'", str9, "ORD-1775916933652");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
// flaky "39) test0496(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ORD-1775916933652" + "'", str11, "ORD-1775916933652");
// flaky "10) test0496(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2026-04-11 17:15:33" + "'", str12, "2026-04-11 17:15:33");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        java.lang.String str36 = order33.getOrderId();
        java.util.List<example.model.CartItem> cartItemList37 = order33.getItems();
        java.lang.String str38 = order33.getPaymentIntentId();
        example.model.Address address39 = order33.getAddress();
        org.junit.Assert.assertNotNull(cartItemArray10);
        org.junit.Assert.assertArrayEquals(cartItemArray10, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(address19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ORD-1775916886212" + "'", str20, "ORD-1775916886212");
        org.junit.Assert.assertNotNull(cartItemArray23);
        org.junit.Assert.assertArrayEquals(cartItemArray23, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky "137) test0497(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ORD-1775916933671" + "'", str29, "ORD-1775916933671");
        org.junit.Assert.assertNotNull(cartItemList30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ORD-1775916890225" + "'", str34, "ORD-1775916890225");
// flaky "83) test0497(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ORD-1775916933671" + "'", str35, "ORD-1775916933671");
// flaky "40) test0497(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "ORD-1775916933671" + "'", str36, "ORD-1775916933671");
        org.junit.Assert.assertNotNull(cartItemList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(address39);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        double double13 = order7.getTotalAmount();
        org.junit.Assert.assertNotNull(cartItemArray2);
        org.junit.Assert.assertArrayEquals(cartItemArray2, new example.model.CartItem[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky "138) test0498(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ORD-1775916933715" + "'", str8, "ORD-1775916933715");
// flaky "84) test0498(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ORD-1775916933715" + "'", str9, "ORD-1775916933715");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PAID" + "'", str10, "PAID");
        org.junit.Assert.assertNull(address11);
// flaky "41) test0498(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ORD-1775916933715" + "'", str12, "ORD-1775916933715");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        example.model.Address address5 = new example.model.Address("2026-04-11 17:15:11", "2026-04-11 17:15:04", "ORD-1775916908674", "ORD-1775916892904", "ORD-1775916894079");
        java.lang.String str6 = address5.toString();
        java.lang.String str7 = address5.getStreet();
// flaky "139) test0499(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ud83d\udcde ORD-1775916894079" + "'", str6, "\ud83d\udcde ORD-1775916894079");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2026-04-11 17:15:04" + "'", str7, "2026-04-11 17:15:04");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        double double86 = order85.getTotalAmount();
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
// flaky "140) test0500(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "ORD-1775916933758" + "'", str43, "ORD-1775916933758");
// flaky "85) test0500(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ORD-1775916933758" + "'", str44, "ORD-1775916933758");
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
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
    }
}
