window.addEventListener("DOMContentLoaded", (event) => {
  console.log("Something got clicked");
  console.log(event.target.id);
  // Retrieving data:
  let text = localStorage.getItem("testJSON");
  let obj = JSON.parse(text);
  let numberOfItemsInCart = 0;
  if (obj == null) {
    numberOfItemsInCart = 0;
  } else {
    console.log("obj.length : " + obj.length);
    numberOfItemsInCart = obj.length;
  }
  document.getElementById("nav-no-of-items-cart").textContent =
    "(" + numberOfItemsInCart + ")";
  let i = 0;
  let totalPrice = 0;
  if (obj == null) {
    document.getElementById("cart-title").textContent =
      "Your shopping cart is empty!";
    document.getElementById("cart-button-title").textContent =
      "Check out our offerings!";
    var cartButtonLink = document.getElementById("cart-button-link");
    cartButtonLink.href = "index.html";
  } else {
    document.getElementById("cart-title").textContent = "Shopping cart";
    document.getElementById("cart-button-title").textContent = "Place order";
    for (let orderItems = 0; orderItems < obj.length; orderItems++) {
      document.getElementById("dorders").innerHTML +=
        `<section class="row">
    <div class="menu-item-tile col-md-12">
      
      <div class="row">
        <div class="col-lg-3 col-sm-4 col-xs-6 col-xxs-12">
          <div class="shop-item-photo hidden-xs hidden-xxs">
            <div>
              <a href=""
                ><span id="nav-no-of-items-cart" class="glyphicon glyphicon-shopping-cart"></span
              ></a>
            </div>
            <img
              class="img-responsive"
              width="250"
              height="150"
              src="` +
        obj[orderItems].image +
        `"
              alt="Item"
            />
          </div>
          </div>
         
        
        <div class="menu-item-description col-lg-5 col-sm-4 col-xs-12 col-xxs-12">
          <h3 class="menu-item-title">` +
        obj[orderItems].name +
        " - " +
        obj[orderItems].sizeOfPack +
        `
          <span class="menu-item-details"> - ` +
        obj[orderItems].quantity +
        `</span></h3>
        </div>
        <div class="menu-item-price col-lg-3 col-sm-4 col-xs-6 col-xxs-12">₹` +
        obj[orderItems].price +
        `</div>
      </div>
      
    </div>
    </section>`;
      if (i % 2 === 1 && i > 0) {
        document.getElementById(
          "dorders"
        ).innerHTML += `<div class="clearfix visible-lg-block visible-md-block"></div>`;
      }
      i++;
      totalPrice =
        totalPrice + obj[orderItems].price * obj[orderItems].quantity;
    }
  }
  document.getElementById("dorders").innerHTML +=
    `<div class="menu-item-tile col-md-12">
  <div class="row">
  <hr class="visible-xs visible-md visible-lg" />
    <div class="col-sm-5 col-xs-12 col-xxs-12">
    
      <div class="shop-item-total">
        <h3 class="menu-item-title">Subtotal (` +
    obj.length +
    ` items)</h3>
      </div>
    </div>
    <div class="menu-item-description col-sm-7 col-xs-12 col-xxs-12">
      <h3 class="menu-item-title">₹` +
    totalPrice +
    `</h3>
      
    </div>
  </div>
  <hr class="visible-xs visible-md visible-lg" />
</div>`;
});

function clearCache() {
  localStorage.clear();
}
