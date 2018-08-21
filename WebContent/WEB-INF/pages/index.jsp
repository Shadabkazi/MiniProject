<%@ include file="header.jsp"%>	
	<!-- Home -->

	<div class="home">
		<div class="home_slider_container">
			
			<!-- Home Slider -->
			<div class="owl-carousel owl-theme home_slider">
				<c:forEach var="image" items="${images}" varStatus="loop">
				<!-- Slider Item -->
				<div class="owl-item home_slider_item">
					<div class="home_slider_background" style="background-image:url(data:image/jpeg;base64,${image})"></div>
					<div class="home_slider_content_container">
						<div class="container">
							<div class="row">
								<div class="col">
									<div class="home_slider_content"  data-animation-in="fadeIn" data-animation-out="animate-out fadeOut">
										<c:forEach var="category" items="${categories}" begin="${loop.index }" end="${loop.index }">
										<div class="home_slider_title" style="color: red;">${category.cName }</div>	
										<div class="home_slider_subtitle" style="color: red;">${category.cDescription }</div>
										<div class="button button_light home_button" style="color: red;"><a href="${pageContext.request.contextPath}/categories/${category.id}" style="color:red;">Shop Now</a></div>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				</c:forEach>
				
				<%-- <!-- Slider Item -->
				<div class="owl-item home_slider_item">
					<div class="home_slider_background" style="background-image:url(<c:url value="/resources/images/home_slider_1.jpg)"/>"></div>
					<div class="home_slider_content_container">
						<div class="container">
							<div class="row">
								<div class="col">
									<div class="home_slider_content"  data-animation-in="fadeIn" data-animation-out="animate-out fadeOut">
										<div class="home_slider_title">A new Online Shop experience.</div>
										<div class="home_slider_subtitle">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam a ultricies metus. Sed nec molestie eros. Sed viverra velit venenatis fermentum luctus.</div>
										<div class="button button_light home_button"><a href="#">Shop Now</a></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

				<!-- Slider Item -->
				<div class="owl-item home_slider_item">
					<div class="home_slider_background" style="background-image:url(<c:url value="/resources/images/home_slider_1.jpg"/>)"></div>
					<div class="home_slider_content_container">
						<div class="container">
							<div class="row">
								<div class="col">
									<div class="home_slider_content"  data-animation-in="fadeIn" data-animation-out="animate-out fadeOut">
										<div class="home_slider_title">A new Online Shop experience.</div>
										<div class="home_slider_subtitle">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam a ultricies metus. Sed nec molestie eros. Sed viverra velit venenatis fermentum luctus.</div>
										<div class="button button_light home_button"><a href="#">Shop Now</a></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
 --%>
			</div>

			<!-- Home Slider Dots -->
			
			<div class="home_slider_dots_container">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="home_slider_dots">
								<ul id="home_slider_custom_dots" class="home_slider_custom_dots">
									<li class="home_slider_custom_dot active">01.</li>
									<li class="home_slider_custom_dot">02.</li>
									<li class="home_slider_custom_dot">03.</li>
								</ul>
							</div>
						</div>
					</div>
				</div>	
			</div>

		</div>
	</div>

	<!-- Ads -->

	<div class="avds">
		<div class="avds_container d-flex flex-lg-row flex-column align-items-start justify-content-between">
			<div class="avds_small">
				<div class="avds_background" style="background-image:url(<c:url value="/resources/images/avds_small.jpg)"/>"></div>
				<div class="avds_small_inner">
					<div class="avds_discount_container">
						<img src="<c:url value="/resources/images/discount.png"/>" alt="">
						<div>
							<div class="avds_discount">
								<div>20<span>%</span></div>
								<div>Discount</div>
							</div>
						</div>
					</div>
					<div class="avds_small_content">
						<div class="avds_title">Smart Phones</div>
						<div class="avds_link"><a href="categories.html">See More</a></div>
					</div>
				</div>
			</div>
			<div class="avds_large">
				<div class="avds_background" style="background-image:url(<c:url value="/resources/images/avds_large.jpg)"/>"></div>
				<div class="avds_large_container">
					<div class="avds_large_content">
						<div class="avds_title">Professional Cameras</div>
						<div class="avds_text">I AM LIFE IN EVERY NEW FRAME. Visit our Professional Camera Page.</div>
						<div class="avds_link avds_link_large"><a href="categories.html">See More</a></div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Products -->

	<div class="products">
		
	</div>

	<!-- Ad -->

	<div class="avds_xl">
		<div class="container">
			<div class="row">
				<div class="col">
					<div class="avds_xl_container clearfix">
						<div class="avds_xl_background" style="background-image:url(<c:url value="/resources/images/avds_xl.jpg)"/>"></div>
						<div class="avds_xl_content">
							<div class="avds_title">Amazing Devices</div>
							<div class="avds_text">Devices you need to enhance life experience.</div>
							<div class="avds_link avds_xl_link"><a href="categories.html">See More</a></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Icon Boxes -->

	<div class="icon_boxes">
		<div class="container">
			<div class="row icon_box_row">
				
				<!-- Icon Box -->
				<div class="col-lg-4 icon_box_col">
					<div class="icon_box">
						<div class="icon_box_image"><img src="<c:url value="/resources/images/icon_1.svg"/>" alt=""></div>
						<div class="icon_box_title">Free Shipping Worldwide</div>
						<div class="icon_box_text">
							<p>The delivery speeds available are between 2-4 Business Days or 4-7 Business Days or 5-14 Business Days.</p>
						</div>
					</div>
				</div>

				<!-- Icon Box -->
				<div class="col-lg-4 icon_box_col">
					<div class="icon_box">
						<div class="icon_box_image"><img src="<c:url value="/resources/images/icon_2.svg"/>" alt=""></div>
						<div class="icon_box_title">Free Returns</div>
						<div class="icon_box_text">
							<p>You may request returns for most items you buy, except those that are explicitly identified as not returnable.</p>
						</div>
					</div>
				</div>

				<!-- Icon Box -->
				<div class="col-lg-4 icon_box_col">
					<div class="icon_box">
						<div class="icon_box_image"><img src="<c:url value="/resources/images/icon_3.svg"/>" alt=""></div>
						<div class="icon_box_title">24h Fast Support</div>
						<div class="icon_box_text">
							<p>We are available 24/7 for the satisfaction of our Customers. For more details, checkout our contact page.</p>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<!-- Newsletter -->

	
	<!-- Footer -->
	
<%@ include file="footer.jsp" %>
<script src="<c:url value="/resources/js/custom.js"/>"></script>
</body>
</html>