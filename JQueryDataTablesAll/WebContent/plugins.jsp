<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="jquery.datatables.model.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Applying JQuery DataTables plugin in the Java Server application</title>
        <link href="media/dataTables/demo_page.css" rel="stylesheet" type="text/css" />
        <link href="media/dataTables/demo_table.css" rel="stylesheet" type="text/css" />
        <link href="media/dataTables/demo_table_jui.css" rel="stylesheet" type="text/css" />
        <link href="media/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" media="all" />
        <link href="media/themes/smoothness/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css" media="all" />
        <link href="media/dataTables/ColumnFilterWidgets.css" rel="stylesheet" type="text/css" />
        <script src="scripts/jquery.js" type="text/javascript"></script>
        <script src="scripts/jquery.dataTables.min.js" type="text/javascript"></script>
        <script src="scripts/ColumnFilterWidgets.js" type="text/javascript"></script>
        <script src="scripts/jquery.dataTables.rowGrouping.js" type="text/javascript"></script>
        <script type="text/javascript">
        $(document).ready(function () {
            $("#companies").dataTable({
                "sPaginationType": "full_numbers",
                "bJQueryUI": true,
                "sDom": 'W<"clear">lfrtip'
            })
            .rowGrouping({sGroupBy: "letter", bHideGroupingColumn: false})
        });
        </script>
    </head>
    <body id="dt_example" >
    
     <div align="center">
    <table align="center">
    <tbody align="center">
    <h3>Batch Monitoring System</h3>
    </tbody>
    </table>
    
    </div>
        <div id="container">
        	<div id="links">
        	    <a href="index.jsp">Basic View</a> | Advanced View<br/>
        		<!-- <a href="index.html">Server-side processing with matrix source</a>| <a href="objects.html">Server-side processing with object source</a>-->
        	
        	</div>
            <div id="demo_jui">
		        <table id="companies" class="display">
		            <thead>
		                <tr>
		                    <th>SubTower</th>
		                     <th>ApplName</th>
		                     <th>EventName </th>
		                    <th>BatchID</th>
		                    <th>Status</th>
		                    <th>Startdate</th>
		                    <th>Enddate</th>
		                </tr>
		            </thead>
		            <tbody>
		          		<% for(Company c: DataRepository.GetCompanies()){ %>
						  <tr>
						   <td><%=c.getTower()%></td>
						    <td><%=c.getName()%></td>
						       <td><%=c.getEvent()%></td>
						    
						    <td><%=c.getAddress()%></td>
						    
						    <% if (c.getTown().equals("Failed")){%>
						    <td><font color="red"><%=c.getTown()%></font></td>
						    <%} else{ %>
						        <td><%=c.getTown()%></td>
						        <%} %>
						    
						
						    <td><%=c.getStartdate()%></td>
						    <td><%=c.getEnddate()%></td>
						  </tr>
						<% } %>
		            </tbody>
		            <tfoot>
		                <tr>
		                    <!-- <th>Application Name</th>
		                    <th>Batch ID</th>
		                    <th>Status</th>
		                    <th>Startdate</th>
		                    <th>Enddate</th>-->
		                </tr>
		            </tfoot>
		        </table>
		    </div>
        </div>
    </body>
</html>
