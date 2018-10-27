/**
 * 
 */
package app;

/**
 * @author github.com/josedavidgm1995
 * This a java program to control the RaspberryPI's GPIO
 * Remember to update to Pi4J 1.2 SNAPSHOT, where no loger includes
 * a statically linked wiringPi lib for the Raspberry Pi Platform.
 * The new default linking should always be "dynamic"
 * 
 * Also download the lastest vertion of WiringPi usuing GIT:
 * $ git clone git://git.drogon.net/wiringPi
 * $ cd wiringPI
 * $ ./buil
 * 
 * When using the 40-pin Pi Wedge take the next considerations:
 * - The pins assignments:
 *G17 --> GPIO_00
 *G16 --> GPIO_27
 * 
 */
import com.pi4j.io.gpio.*;

public class Main {

	// Remember to copy the library files and add the build path
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		final GpioController gpio = GpioFactory.getInstance();// get singleton
																// instance
		System.out.println(PiWedge.G16.pin());

		//Provisioning pin as OUT or INPUT
		final GpioPinDigitalOutput ledPin = gpio.provisionDigitalOutputPin(
				PiWedge.G16.pin(), "led", PinState.LOW);
		ledPin.setShutdownOptions(true, PinState.LOW);
		
		final GpioPinDigitalInput touchPin = gpio.provisionDigitalInputPin(
				PiWedge.G17.pin(), "toch");
		

		
		
		new Thread(new Runnable() {

			public void run() {
				while (true) {

					ledPin.toggle();
					System.out.println("Touch State: "+ touchPin.getState());
					
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						gpio.shutdown();
					}
				}
			}
		}).start();

	}
}