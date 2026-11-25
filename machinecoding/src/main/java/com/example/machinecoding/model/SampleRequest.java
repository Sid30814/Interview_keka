package com.example.machinecoding.model;

import java.util.ArrayList;
import java.util.HashMap;

public record SampleRequest(HashMap<Integer, Record>menu, HashMap<String ,Integer>wallets) {}