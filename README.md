# Aztlan Technologies
## Your One-Stop Computer Shop

Aztlan Technologies is a locally-owned, family-run tech boutique specializing in high-performance custom-built computers, essential components, and cutting-edge peripherals. Whether you’re a gamer, developer, or creative professional, Aztlan Technologies is committed to delivering top-tier systems and expert service tailored to your needs. With our growing online platform, customers can browse, customize, and purchase the latest hardware from the comfort of their home.

---

## Deliverables

### D. About Page
> - Add an “About” page describing Aztlan Technologies to viewers.
> - Include navigation to and from the “About” page and the main screen.

### E. Sample Inventory
> - Add five parts and five products to the database **only if** both lists are initially empty.
> - Avoid duplicate items; if duplicates arise, add a “multi-pack” part variant.

### F. Buy Now Button
> - Add “Buy Now” next to update/delete buttons in the product list.
> - Decrease inventory by 1 (product only; parts remain unchanged).
> - Show a success or failure message based on stock availability.

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