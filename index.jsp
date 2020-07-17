<html>
<body>
	<h2>Info Of Natural Calamities</h2>
	<div>
		<form action="submit.odc">
			<table>

				<tr>
					<td>Place</td>
					<td><input name="place" type="text" class="form-control"
						placeholder="Placename" id="PLACENAME"></td>
				</tr>
				<tr>
					<td>Date</td>
					<td><input name="date" type="text" class="form-control"
						placeholder="Date" id="DATE"></td>
				</tr>
				<tr>
					<td>Captured By</td>
					<td><input name="capturedBy" type="text" class="form-control"
						placeholder="CapturedBy" id="CAPTUREDBY"></td>
				</tr>
				<tr>
					<td>calamityType</td>
					<td><select class="form-control" name="calamityType" required>
							<option>--Select--</option>
							<option>Flood</option>
							<option>Rain</option>
							<option>Cyclone</option>
							<option>Earth Quake</option>
					</select></td>
				</tr>
				<tr>
					<td>Area</td>
					<td><input name="area" type="text" class="form-control"
						placeholder="area" id="AREA">></td>
				</tr>
				<tr>
					<td>Avg.Loss</td>
					<td><input name="avgLoss" type="text" class="form-control"
						placeholder="avgLoss" id="AVGLOSS"></td>
				</tr>

				<tr>
					<td>No. Of Deaths</td>
					<td><input name="deaths" type="text" class="form-control"
						placeholder="deaths" id="DEATHS"></td>
				</tr>

				<tr>
					<td>No. Of Injured</td>
					<td><input name="injured" type="text" class="form-control"
						placeholder="injured" id="INJURED"></td>
				</tr>

			</table>
			<button type="Register" class="btn btn-success">register</button>
		</form>
	</div>


</body>
</html>
