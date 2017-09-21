			<ul class="nav nav-tabs">
				<li><a href="index.jsp">Home</a></li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Movie List<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="ViewAllMovies">Unsorted Movie List</a></li>
						<li><a href="ViewAllMovies?sortType=title">By Title</a></li>
						<li><a href="ViewAllMovies?sortType=director">By Director</a></li>
					</ul>
				</li>
				<li class="dropdown">
					<a href="#" class="dropdown-toggle" data-toggle="dropdown">Search Movies<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="searchTitle.jsp?search=title">Search By Title</a></li>
						<li><a href="searchDirector.jsp?search=director">Search By Director</a></li>
					</ul>
				</li>
				<li><a href="addMovie.jsp">Add Movie</a></li>
				<li><a href="populateMovieDatabase.jsp">Populate Database</a></li>
			</ul>