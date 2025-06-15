# Aztlan Technologies
## Your One-Stop Computer Shop

Aztlan Technologies is a locally-owned, family-run tech boutique specializing in high-performance custom-built computers, essential components, and cutting-edge peripherals. Whether you’re a gamer, developer, or creative professional, Aztlan Technologies is committed to delivering top-tier systems and expert service tailored to your needs. With our growing online platform, customers can browse, customize, and purchase the latest hardware from the comfort of their home.

---

## Deliverables

### C. User Interface Customization
> - **File:** `mainscreen.html`
>   - **Line 13:** Changed `<title>` from `"My Bicycle Shop"` to `"Aztlan Technologies – Inventory System"`
>   - **Line 17:** Updated main header `<h1>` from `"Shop"` to `"Aztlan Technologies – Your One-Stop Computer Shop"`
>   - **Line 19:** Changed `<h2>` from `"Parts"` to `"Component Inventory"`
>   - **Line ~50:** Changed `<h2>` from `"Products"` to `"Computer Systems"`

### D. About Page Implementation
> - **File:** `mainscreen.html`
>   - **Line 20:** Added `<a>` button linking to the About page using `th:href="@{/about}"` styled with Bootstrap
>
> - **File:** `MainScreenControllerr.java`
>   **Line 56:** Added `@GetMapping("/about")` to handle navigation to the About page
>   - **Line 57–58:** Created `showAboutPage()` method to return the `about` view
>
> - **File:** `about.html`
>   - Created new page HTML page to host about

### E. Sample Inventory Implementation
> - **File:** `BootStrapData.java`
    >   - **Line 4:** Added import for `InhousePart`
>   - **Line 6:** Added import for `InhousePartRepository`
>   - **Line 32:** Declared `private final InhousePartRepository inhousePartRepository;`
>   - **Line 34:** Modified constructor to include `InhousePartRepository`
>   - **Line 37:** Assigned `this.inhousePartRepository = inhousePartRepository;`
>   - **Line 41:** Added `if (partRepository.count() == 0 && productRepository.count() == 0)` block
>   - **Lines 43–53:** Created and saved `OutsourcedPart` – "Wireless Network Card" from "TechNova Solutions"
>   - **Lines 55–65:** Created and saved three `InhousePart` items – "RAM 16GB", "1TB SSD", and "Power Supply 650W"
>   - **Lines 67–73:** Created and saved `OutsourcedPart` – "CPU Cooler" from "CoolerTech Inc."
>   - **Lines 76–85:** Created and saved five products – "Desktop PC", "Gaming Laptop", "Workstation Tower", "Mini PC", and "All-in-One PC"
>   - **Lines 89–94:** Removed old sample inventory code and commented-out part/product testing blocks

### F. Buy Now Button Implementation
> - **File:** `mainscreen.html`
  >   - **Line ~86:** Added a “Buy Now” button next to each product to route the product ID into the controller

> - **File:** `BuyNowController.java`
>   - **Created new controller** to handle `/orderConfirmationPage` route
>   - **Checks** if product inventory is less than 1; shows purchase failed message
>   - **If inventory is available**, decrements product inventory and saves changes
>   - Adds message (`"Purchase successful!"` or `"Purchase failed: Product out of stock."`) to the model for display in the confirmation page
> - **File:** `orderConfirmationPage.html`
>   - Created new Thymeleaf view to confirm purchase result
>   - Displays product info, success/failure message, and “Return to Main” button


### G. Inventory Max/Min Tracking
> - Add `maxInventory` and `minInventory` fields to the part entity.
> - Modify sample inventory to include max/min values.
> - Update InhousePartForm and OutsourcedPartForm to support max/min input.
> - Rename the file storing persistent data.
> - Enforce that inventory must fall within max/min range.

### H. Inventory Validation
> - Show error if part inventory is below min or above max when adding/updating.
> - Show error if updating a product causes associated part inventory to fall below min.

### I. Unit Tests
> - Add at least **two unit tests** for max/min field validation in `PartTest`.

### J. Code Cleanup
> - Remove any unused validator class files to clean up your codebase.

### K. Professionalism
> - Ensure professional formatting, clear documentation, and clean presentation of code and README.

---