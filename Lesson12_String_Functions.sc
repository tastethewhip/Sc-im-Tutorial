# This data file was generated by the Spreadsheet Calculator Improvised (sc-im)
# You almost certainly shouldn't edit it.

newsheet "Sheet1"
movetosheet "Sheet1"
format A 67 2 0
format B 37 2 0
leftstring A0 = "1. Go to B2. Type \\"@upper(B0)"
leftstring B0 = "this Is an sc-im tutorial"
let C0 = 3829.272942
leftstring A1 = "2. Go to B3. Type \\"@lower(B0)"
leftstring A2 = "3. Go to B4. Type \\"@capital(B0)"
leftstring A3 = "4. Go to B5. Type \\"@replace(B0, \"brown\", \"black\")"
leftstring A4 = "5. Go to B6. Type \\"@substr(B0, 5, 15)"
leftstring A5 = "6. Go to B7. Type \\"@coltoa(@mycol) to return current column name"
leftstring A8 = "7. Go to B9. Type \\"fmt(\"###%3.3f**\", C0)"
goto A0
