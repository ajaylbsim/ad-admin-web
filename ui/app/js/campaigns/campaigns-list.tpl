<style>
	
	nav ul li .campaigns{
		color: #dd4c3b !important;
		border-bottom: 3px solid #dd4c3b !important;
	}
	.table {
		margin:0px;padding:0px;
		width:100%;
		border:1px solid #d8d8d8;

		-moz-border-radius-bottomleft:0px;
		-webkit-border-bottom-left-radius:0px;
		border-bottom-left-radius:0px;

		-moz-border-radius-bottomright:0px;
		-webkit-border-bottom-right-radius:0px;
		border-bottom-right-radius:0px;

		-moz-border-radius-topright:0px;
		-webkit-border-top-right-radius:0px;
		border-top-right-radius:0px;

		-moz-border-radius-topleft:0px;
		-webkit-border-top-left-radius:0px;
		border-top-left-radius:0px;
	}.table table{
		border-collapse: collapse;
		border-spacing: 0;
		width:100%;
		height:100%;
		margin:0px;padding:0px;
	}.table tr:last-child td:last-child {
		-moz-border-radius-bottomright:0px;
		-webkit-border-bottom-right-radius:0px;
		border-bottom-right-radius:0px;
	}
	.table table tr:first-child td:first-child {
		-moz-border-radius-topleft:0px;
		-webkit-border-top-left-radius:0px;
		border-top-left-radius:0px;
	}
	.table table tr:first-child td:last-child {
		-moz-border-radius-topright:0px;
		-webkit-border-top-right-radius:0px;
		border-top-right-radius:0px;
	}.table tr:last-child td:first-child{
		-moz-border-radius-bottomleft:0px;
		-webkit-border-bottom-left-radius:0px;
		border-bottom-left-radius:0px;
	}.table tr:hover td{

	}
	.table tr:nth-child(odd){ background-color:#F0F0F0; }
	.table tr:nth-child(even)    { background-color:#ffffff; }.table td{
		vertical-align:middle;
		border: 1px solid rgba(105, 191, 178, 0.23);
		border-width:0px 1px 1px 0px;
		text-align:left;
		padding:7px;
		font-size:12px;
		font-weight:normal;
		color:#000000;
	}.table tr:last-child td{
		border-width:0px 1px 0px 0px;
	}.table tr td:last-child{
		border-width:0px 0px 1px 0px;
	}.table tr:last-child td:last-child{
		border-width:0px 0px 0px 0px;
	}
	.table tr:first-child td{
		background:-o-linear-gradient(bottom, #69BFB2 5%, #69BFB2 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #69BFB2), color-stop(1, #69BFB2) );
		background:-moz-linear-gradient( center top, #69BFB2 5%, #69BFB2 100% );
		filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#69BFB2", endColorstr="#69BFB2");	background: -o-linear-gradient(top,#69BFB2);

		background-color:#69BFB2;
		border:0px solid #d8d8d8;
		text-align:left;
		border-width:0px 0px 1px 1px;
		font-size:14px;
		color:#fff;
	}
/*	.table tr:first-child:hover td{
		background:-o-linear-gradient(bottom, #cccccc 5%, #cccccc 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #cccccc), color-stop(1, #cccccc) );
		background:-moz-linear-gradient( center top, #cccccc 5%, #cccccc 100% );
		filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#cccccc", endColorstr="#cccccc");	background: -o-linear-gradient(top,#cccccc,cccccc);

		background-color:#cccccc;
	}*/
	.table tr:first-child td:first-child{
		border-width:0px 0px 1px 0px;
	}
	.table tr:first-child td:last-child{
		border-width:0px 0px 1px 1px;
	}

	/**/

	.breadcrumb {
  background-color: rgb(226, 225, 225);
  border: 1px solid #e8e8e8;
  padding-left: 10px;
  font-size: 12px;
  margin-bottom: 10px;
}
.breadcrumb {
  padding: 8px 15px;
  margin-bottom: 20px;
  list-style: none;
  background-color: #f5f5f5;
  border-radius: 4px;
}
.b-light {
  border-color: #e4e4e4;
}
.b-b {
  border-bottom: 1px solid #cfcfcf;
}
.pull-in {
  margin-left: -32px;
  margin-right: -32px;
}
.no-radius {
  border-radius: 0;
}
.no-border, .no-borders {
  border-color: transparent;
  border-width: 0;
}
.breadcrumb>li {
  display: inline-block;
}
* {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}
li {
  display: list-item;
  text-align: -webkit-match-parent;
}
ul, ol {
  margin-top: 0;
  margin-bottom: 10px;
}
.breadcrumb a {
  color: #999;
	text-decoration: none;
}
</style>
<ul class="breadcrumb no-border no-radius b-b b-light pull-in">
<!--    <li><a ><i class="fa fa-home"></i> Dashboard</a> <i class="fa fa-long-arrow-right"></i></li>
   <li><a href="#">UI kit</a><i class="fa fa-long-arrow-right"></i></li>
   <li><a href="#">Table</a></li>
   <li class="active">Datagrid</li> -->
</ul>
<h2>LIST OF CAMPAIGNS</h2>

<div class="table" >
	<table >
		<tr>
			<td>
				Title 1
			</td>
			<td >
				Title 2
			</td>
			<td>
				Title 3
			</td>
		</tr>
		<tr>
			<td >
				Row 1
			</td>
			<td>
				Row 1
			</td>
			<td>
				Row 1
			</td>
		</tr>
		<tr>
			<td >
				Row 2
			</td>
			<td>
				Row 2
			</td>
			<td>
				Row 2
			</td>
		</tr>
		<tr>
			<td >
				Row 2
			</td>
			<td>
				Row 2
			</td>
			<td>
				Row 2
			</td>
		</tr>
		<tr>
			<td >
				Row 3
			</td>
			<td>
				Row 3
			</td>
			<td>
				Row 3
			</td>
		</tr>
	</table>
</div>