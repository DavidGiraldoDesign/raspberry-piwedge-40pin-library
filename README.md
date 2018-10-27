# raspberry-piwedge-40pin-library
A Java program for Raspeberry using Pi4J/WiringPi libraries, but implementing my own Enum class to map GPIO pins.

<h3>SparkFun Pi Wedge</h3>
"This is the SparkFun Pi Wedge, a small board that connects to the 40-pin GPIO connector on the Raspberry Pi and breaks the pins out to breadboard-friendly arrangement and spacing, and even adds a couple of decoupling capacitors on the power supply lines." 
<br>
From:https://www.sparkfun.com/products/13717
<br>
<img src="https://cdn.sparkfun.com/r/600-600/assets/learn_tutorials/4/3/2/wedge-n-pi.jpg" alt="PiWedge">
<br>
<h2>The PiWedge enum class</h2>

To use the  RaspiPin values from the Pi4J library use:
   
   PiWedge.G17.pin();
   
   *The G17 pin from the PiWedge 40-pin board

  <li>G17(RaspiPin.GPIO_00)</li> 
	<li>G16(RaspiPin.GPIO_27) </li>
	<li>G13(RaspiPin.GPIO_23) </li>
	<li>G12(RaspiPin.GPIO_26)</li>
	<li>G6(RaspiPin.GPIO_22)</li>
	<li>G5(RaspiPin.GPIO_21)</li>
	<li>G4(RaspiPin.GPIO_07)</li>
	<li>G18(RaspiPin.GPIO_01)</li>
	<li>G19(RaspiPin.GPIO_24)</li>
	<li>G20(RaspiPin.GPIO_28) </li>
	<li>G21(RaspiPin.GPIO_29) </li>
	<li>G22(RaspiPin.GPIO_03)</li>
	<li>G23(RaspiPin.GPIO_04) </li>
	<li>G24(RaspiPin.GPIO_05) </li>
	<li>G25(RaspiPin.GPIO_06) </li>
	<li>G26(RaspiPin.GPIO_25) </li>
	<li>G27(RaspiPin.GPIO_02)</li>
	<li>SCK(RaspiPin.GPIO_14) </li>
	<li>SCL(RaspiPin.GPIO_09) </li>
	<li>SDA(RaspiPin.GPIO_08) </li>
	<li>IDSC(RaspiPin.GPIO_31) </li>
	<li>IDSD(RaspiPin.GPIO_30) </li>
	<li>CE1(RaspiPin.GPIO_11) </li>
	<li>CE0(RaspiPin.GPIO_10) </li>
	<li>MOSI(RaspiPin.GPIO_12) </li>
	<li>MISO(RaspiPin.GPIO_12) </li>
	<li>RXI(RaspiPin.GPIO_16) </li>
	<li>TXO(RaspiPin.GPIO_15)</li>
<br>
<br>
