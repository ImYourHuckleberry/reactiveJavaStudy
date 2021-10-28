package io.pivotal.literx;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	// TODO Return an empty Flux
	Flux<String> emptyFlux() {
		return Flux.just();
	}

//========================================================================================

	// TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
	Flux<String> fooBarFluxFromValues() {
		Flux<String> flux =  Flux.just("foo", "bar");
		return flux;
	}

//========================================================================================

	// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
	Flux<String> fooBarFluxFromList() {
		List<String> list = new ArrayList<>();
		list.add("foo");
		list.add("bar");
		Flux<String> flux = Flux.fromIterable(list);
		return flux;
	}

//========================================================================================

	// TODO Create a Flux that emits an IllegalStateException
	Flux<String> errorFlux() {
		Flux flux = Flux.error(new IllegalStateException("this is illegal state"));
		return flux;
	}

//========================================================================================

		// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Long> counter() {
		Flux<Long> flux = Flux.interval(Duration.ofMillis(100)).take(10);
		return flux;
	}

}
