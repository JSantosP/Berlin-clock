class ClockTest extends  UnitSpec{

  "Yellow lamp" should "blink on/off every two seconds" in {
    BerlinClock.seconds(0) should be ("Y")
    BerlinClock.seconds(1) should be ("O")
  }

 "Top hours" should "have 4 lamps" in {
    BerlinClock.topHours(7).length should be (4)
  }

  }
