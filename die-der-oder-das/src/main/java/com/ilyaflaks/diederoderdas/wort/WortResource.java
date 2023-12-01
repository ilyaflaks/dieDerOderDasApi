package com.ilyaflaks.diederoderdas.wort;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ilyaflaks.diederoderdas.repository.WortRepository;

@RestController
public class WortResource {


	private WortRepository wortRepository;

	public WortResource(WortRepository wortRepository) {
		this.wortRepository = wortRepository;
	}

	@GetMapping(path = "/")
	public String returnSomethingAtRootUrl() {
		return "Success!";
	}

	@GetMapping(path = "/hello-wort")
	public String helloWort() {
		return "Hello Wort";
	}

	@GetMapping(path = "/wordcount")
	public long countWords() {
		return wortRepository.count();

	}

	@GetMapping("/words/{id}")
	public Optional<Wort> retrieveWort(@PathVariable Integer id) {
		return wortRepository.findById(id);
	}

}
