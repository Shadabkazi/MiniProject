
<%@ include file="header.jsp"%>		
	<!-- Home -->

	

	<!-- Product Details -->

	<div class="product_details">
		<div class="container">
			<div class="row details_row">

				<!-- Product Image -->
				<div class="col-lg-6">
					<div class="details_image">
						<div class="details_image_large"><img src="data:image/jpeg;base64,${productImage }" alt=""><div class="product_extra product_new"><a href="">New</a></div></div>
						<%-- <div class="details_image_thumbnails d-flex flex-row align-items-start justify-content-between">
							<div class="details_image_thumbnail active" data-image="<c:url value="/resources/images/details_1.jpg"/>"><img src="<c:url value="/resources/images/details_1.jpg"/>" alt=""></div>
							<div class="details_image_thumbnail" data-image="<c:url value="/resources/images/details_2.jpg"/>"><img src="<c:url value="/resources/images/details_2.jpg"/>" alt=""></div>
							<div class="details_image_thumbnail" data-image="<c:url value="/resources/images/details_3.jpg"/>"><img src="<c:url value="/resources/images/details_3.jpg"/>" alt=""></div>
							<div class="details_image_thumbnail" data-image="<c:url value="/resources/images/details_4.jpg"/>"><img src="<c:url value="/resources/images/details_4.jpg"/>" alt=""></div>
						</div> --%>
					</div>
				</div>

				<!-- Product Content -->
				<div class="col-lg-6">
					<div class="details_content">
						<div class="details_name">${product.name }</div>
						<div class="details_discount">Rs. ${product.price+((20/100)*product.price) }</div>
						<div class="details_price">Rs. ${product.price } </div>

						<!-- In Stock -->
						<div class="in_stock_container">
							<div class="availability">Availability:</div>
							<span>In Stock</span>
						</div>
						<div class="details_text">
							<p>${product.description }</p>
						</div>

						<!-- Product Quantity -->
						<div class="product_quantity_container">
						<form action="${pageContext.request.contextPath}/cart/add" method="post">
							<div class="product_quantity clearfix">
								<span>Qty</span>
								<input type="hidden" name="productId" value="${product.id }">
								<input id="quantity_input" type="text" pattern="[0-9]*" value="1" name="qty">
								<div class="quantity_buttons">
									<div id="quantity_inc_button" class="quantity_inc quantity_control"><i class="fa fa-chevron-up" aria-hidden="true"></i></div>
									<div id="quantity_dec_button" class="quantity_dec quantity_control"><i class="fa fa-chevron-down" aria-hidden="true"></i></div>
								</div>
							</div>
							<div><button type="submit">Add to cart</button></div>
								</form>
						</div>

						<!-- Share -->
						<div class="details_share">
							<span>Share:</span>
							<ul>
								<li><a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
								<li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
								<li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
								<li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<div class="row description_row">
				<div class="col">
					<div class="description_title_container">
						<div class="description_title">${product.name } Description</div>
						<!-- <div class="reviews_title"><a href="#">Reviews <span>(1)</span></a></div> -->
					</div>
					<div class="description_text">
						<p>${product.description }</p>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Products -->

	<div class="products">
		<div class="container">
			<div class="row">
				<div class="col text-center">
					<div class="products_title">Related Products</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					
					<div class="product_grid">

						<!-- Product -->
						<c:forEach var="pimage" items="${pimages}" varStatus="loop">
						<div class="product">
							<div class="product_image"><img src="data:image/jpeg;base64,${pimage}" alt=""></div>
							<div class="product_extra product_new"><a href="">New</a></div>
							
							<div class="product_content">
							<c:forEach items="${products}" var="pr" begin="${loop.index }" end="${loop.index }">
								<div class="product_title"><a href="product.html">${pr.name }</a></div>
								<div class="product_price">${pr.price }</div>
							</c:forEach>
							</div>
							
						</div>
						</c:forEach>
						<%-- <!-- Product -->
						<div class="product">
							<div class="product_image"><img src="<c:url value="/resources/images/product_2.jpg"/>" alt=""></div>
							<div class="product_extra product_sale"><a href="categories.html">Sale</a></div>
							<div class="product_content">
								<div class="product_title"><a href="product.html">Smart Phone</a></div>
								<div class="product_price">$520</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="<c:url value="/resources/images/product_3.jpg"/>" alt=""></div>
							<div class="product_content">
								<div class="product_title"><a href="product.html">Smart Phone</a></div>
								<div class="product_price">$710</div>
							</div>
						</div>

						<!-- Product -->
						<div class="product">
							<div class="product_image"><img src="<c:url value="/resources/images/product_4.jpg"/>" alt=""></div>
							<div class="product_content">
								<div class="product_title"><a href="product.html">Smart Phone</a></div>
								<div class="product_price">$330</div>
							</div>
						</div>
 --%>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Newsletter -->

	<!-- Footer -->
	
<%@ include file="footer.jsp" %>
<script src="<c:url value="/resources/js/product.js"/>"></script>
</body>
</html>